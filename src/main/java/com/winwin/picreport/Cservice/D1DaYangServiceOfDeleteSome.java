package com.winwin.picreport.Cservice;

import com.winwin.picreport.Ddao.reportxmlmapper.PrdtSampMapper;
import com.winwin.picreport.Edto.PrdtSamp;
import com.winwin.picreport.Futils.MessageGenerate;
import com.winwin.picreport.Futils.Msg;
import com.winwin.picreport.Futils.SpringbootJarPath;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.File;
import java.util.Arrays;
import java.util.List;

@Service("deleteSome")
public class D1DaYangServiceOfDeleteSome {

    @Autowired
    private PrdtSampMapper prdtSampMapper;

    @Value("${daYangSuoLueTuAndFuJianZongPath}")//./1234567/
    private String daYangSuoLueTuAndFuJianZongPath;


    @Transactional
    public List<Msg> deleteSomeRecode(List<String> uuidList){
        String qunQuPanDuanID="";
        int jiShuQi=0;
        String qunJuSuoLueTu="";
        String quanJuFuJian="";
 /////////////////////////////~~~~~~~~~~for开始~~~~~~~~~~~~~////////////////////////////////////////////
        try {
            for(String  id:uuidList){
                qunQuPanDuanID=id;
                try {
                    PrdtSamp prdtSamp = prdtSampMapper.selectByPrimaryKey(id);
/**
 *数据库得到的路径是下面这种‘
 * fuJianWenJianJia/b9f7307f-ee68-44d0-bd91-1aa488281586!75533.xls;
 * */
                    String attach = prdtSamp.getAttach();
                    //避免切割字符串失败
                    if(attach==null){ attach=""; }
                    String thum = prdtSamp.getThum();
                    if(thum==null){thum="";}

                    List<String> attachList = Arrays.asList(attach.split(";"));

                    List<String> thumList = Arrays.asList(thum.split(";"));

                    //删除所有附件
                    if(attachList.size()>0){
                        for(String att:attachList){
                            quanJuFuJian=att;
                            deleteThumOrAttach(att);
                        }
                    }
                    //删除所有缩略图
                    if(thumList.size()>0){
                        for(String thu:thumList){
                            qunJuSuoLueTu=thu;//在catch里有用
                            deleteThumOrAttach(thu);
                        }
                    }
                } catch (Exception e) {
                    System.out.println("删除图片或者附件失败");
                    System.out.println("删除图片失败的是"+qunJuSuoLueTu+"");
                    System.out.println("删除附件失败的是"+quanJuFuJian+"");
                }


                prdtSampMapper.deleteByPrimaryKey(id);
                jiShuQi++;
            }
        } catch (Exception e) {
            return MessageGenerate.generateMessage
                    ("删除失败", "删除失败",
                            "输出id为"+qunQuPanDuanID+"的记录失败,导致一条都没有删除", "", "42");

        }

/////////////////////////////~~~~~~~~~~for结束~~~~~~~~~~~~~////////////////////////////////////////////
        return MessageGenerate.generateMessage
                ("删除成功", "删除成功",
                        "共删除"+jiShuQi+"条记录", "", "43");


///////////////deleteSomeRecode方法结束///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    }

/////////////D1DaYangServiceOfDeleteSome类结束////////////////////////////////////////////////////////////


//    public static void main(String[]args){
//            System.out.println(Arrays.asList("123".split(";")));
//    }

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
public void deleteThumOrAttach(String thumOrAttach){
    File file=new File(SpringbootJarPath.JarLuJingGet()+daYangSuoLueTuAndFuJianZongPath.replace(".","")+thumOrAttach);
    if(file.exists()){
        file.delete();
    }
}
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


}
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////