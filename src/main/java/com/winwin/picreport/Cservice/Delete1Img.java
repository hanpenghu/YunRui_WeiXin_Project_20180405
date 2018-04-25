package com.winwin.picreport.Cservice;


import com.winwin.picreport.AllConstant.Cnst;
import com.winwin.picreport.Edto.DeleteImgWx;
import com.winwin.picreport.Edto.MfIcZ;
import com.winwin.picreport.Edto.MfIcZExample;
import com.winwin.picreport.Edto.MfIcZWithBLOBs;
import com.winwin.picreport.Futils.hanhan.p;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.File;
import java.util.List;


@Service
@Transactional
public class Delete1Img {
    @Autowired
    public Cnst cnst;
    @Transactional
    public void f(DeleteImgWx deleteImgWx,List<String>  list){
        if(p.empty(deleteImgWx)){
            p.throwEAddToList("前端什么也没传过来",list);
        }
        String osNo = deleteImgWx.getOsNo();
        String url = deleteImgWx.getUrl();
        p.p("------------------------前端传过来的url是:-------------------------------");
        p.p("《"+url+"》");
        p.p("-------------------------------------------------------");
        if(p.empty(osNo)){
            p.throwEAddToList("前端没有传过来单据号osNo",list);
        }

        if(p.empty(url)){
            p.throwEAddToList("前端没有传过来单据图片网址url",list);
        }
        url=url.trim();
        p.p("------------------------前端传过来的url去除前后空格后是:-------------------------------");
        p.p("《"+url+"》");
        p.p("-------------------------------------------------------");
        //首先update 图片字段
        //查找数据库最大的那个url的后缀  maxSufix
        MfIcZExample mfIcZExample1=new MfIcZExample();
        mfIcZExample1.createCriteria().andIcNoEqualTo(osNo);
        List<MfIcZ> mfIcZS1 = cnst.mfIcZMapper.selectByExample(mfIcZExample1);
        if(p.empty(mfIcZS1)){
            p.throwEAddToList("数据库中没有该单据号",list);
        }
        String shqrpz = mfIcZS1.get(0).getShqrpz();
        if(p.empty(shqrpz)){
            p.throwEAddToList("数据库中对应该单号没有任何图片网址,不必再删除",list);
        }

        if(p.opp(shqrpz.contains(url))){
            //不包含
            p.throwEAddToList("数据库中对应该单号没有记录您的图片网址,不用再删除",list);
        }
        //注意原来设计的urls的间隔是后置分隔符,2个空格间隔
        String newShqrpzUrls = shqrpz.replace(url, "").replace("    ", "  ").trim() + "  ";

        MfIcZWithBLOBs mfIcZWithBLOBs=new MfIcZWithBLOBs();
        mfIcZWithBLOBs.setShqrpz(newShqrpzUrls);
        int i = cnst.mfIcZMapper.updateByExampleSelective(mfIcZWithBLOBs, mfIcZExample1);
        if(i<1) {
            p.throwEAddToList("您的网址删除后无法更新到数据库,请联系管理员",list);
        }
        //下面可以删除图片了
        //得到客户传过来的url对应的图片名字
        //http://yr.api.cloudhere.cn:8080/IO011801010001_2.jpeg这种
        String imgName=url.substring(url.lastIndexOf("/")+1);
        //得到图片文件夹
        File picFile = p.getFile("pic");
        if(p.notExists(picFile)){
            p.throwEAddToList("图片所在文件夹无法得到,请联系管理员",list);
        }

        //组装图片绝对路径
        File fileImg = p.getFileByFileNameAndAbsolutePath(picFile, imgName);
        if(p.notExists(fileImg)){
            p.throwEAddToList("删除之前创建的图片绝对路径有问题,导致删除失败",list);
        }

        p.Del(fileImg);

//        if(p.exists(fileImg)){
//            p.throwEAddToList("无法删除该图片,请联系管理员",list);
//        }



    }



}
