package com.winwin.picreport.Bcontroller.PicSearchPic.Schedule.upLoadPicFromWinWinPrdtSampToMaLong;

import cn.productai.api.core.IWebClient;
import cn.productai.api.pai.entity.dataset.DataSetModifyResponse;
import com.alibaba.fastjson.JSON;
import com.winwin.picreport.Bcontroller.PicSearchPic.utils.Cnst;
import com.winwin.picreport.Bcontroller.PicSearchPic.utils.CnstO;
import com.winwin.picreport.Bcontroller.PicSearchPic.utils.DataSetSingleModifyExample1;
import com.winwin.picreport.Bcontroller.PicSearchPic.utils.GetIWebClientOfMaLong;
import com.winwin.picreport.Futils.hanhan.p;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

@Component
public class PicToMaLong {

    @Autowired
    private CnstO cnstO;

    //每天18点运行
    @Scheduled(cron="0 0 18 * * ?")
    public void startTask(){


        try {
            //得到图片路径前半身 比如:http://61.177.44.218:8070/suoLueTuWenJianJia/
            //注意这个半身路径最后是有一个斜杠的
            String picUrlBefore = cnstO.tuPianShangChuanDaoMaLongDeURL;

            //得到打包后的工程jar所在的路径
            //        *得到类似路径
            //        * E:/1/000/LinZhan
            String jarPath= p.jarPath();

            //得到打样和缩略图总文件夹路径
            //daYangSuoLueTuAndFuJianZongPath=./daYangSuoLueTuAndFuJianZongPath/
            String daYangSuoLueTuAndFuJianZongPath = cnstO.daYangSuoLueTuAndFuJianZongPath;
            //得到缩略图文件夹
//        suoLueTuWenJianJia=suoLueTuWenJianJia/
            String suoLueTuWenJianJia = cnstO.suoLueTuWenJianJia;
            //得到缩略图文件夹路径   ./daYangSuoLueTuAndFuJianZongPath/suoLueTuWenJianJia/
            String suoLueTuWenJianJiaPath=daYangSuoLueTuAndFuJianZongPath+suoLueTuWenJianJia;
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

            //下面是得到所有图片集的模块
            File thumDic=new File(suoLueTuWenJianJiaPath);
            if(thumDic.isDirectory()){
            }else{
                //不是文件
                p.p("---------您要找的缩略图文件夹不是个文件夹----------"+suoLueTuWenJianJiaPath+"----------------");
                return;//该return是为了不再执行该方法return 以后的代码
            }

            //得到所有的带后缀名字的文件名字(其实是图片名字)
            List<String> fileNames = Arrays.asList(thumDic.list());


//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
            //循环上传所有图片url
            for(String fileName:fileNames){
                //得到记录已经上传图片名字的文本
                String havenUpRecPath = daYangSuoLueTuAndFuJianZongPath+"havenUpRec.json";
                /**
                 *判断当前图片名字是否在文本中,在的话就不用上传了
                 * */
                try {
                    File havenUpFile=new File(havenUpRecPath);
                    if(p.notExists(havenUpFile)){
                        //不存在,就创建
                        havenUpFile.createNewFile();
                    }
                    havenUpFile=new File(havenUpRecPath);
                    if(p.exists(havenUpFile)){
                        List<String>fileNamess;
                        //存在,就判断当前文件名字在这个文件没有
                        String havaUpFileNameJson = p.readAllTxt(havenUpRecPath);
                        if(p.empty(havaUpFileNameJson)){
                            fileNamess=new LinkedList<>();
                        }else{
                            fileNamess=JSON.parseArray(havaUpFileNameJson,String.class);
                        }
                       if(fileNamess.contains(fileName)){
                            break;//打断当前循环,不再执行下面代码,进行下一个
                       }
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }


                /**
                 *下面是url上传码隆的模块
                 * */
                //得到url
                String url=picUrlBefore+fileName;
                //得到连接码隆索引库的连接类,这个类中主要设置了key和密码等
                IWebClient client = GetIWebClientOfMaLong.getIWebClient();
                //得到上传图片到码隆索引库的主类
                DataSetSingleModifyExample1 g = DataSetSingleModifyExample1.g();
                //上传单条数据的例子
                DataSetModifyResponse res= g.run(client, Cnst.image_set_idOfWinWinPrdtSamp,url);




                /**
                 *下面是记录已经上传过的文件名到文件中的模块
                 * */
                try {
                    File havenUpFile=new File(havenUpRecPath);
                    if(p.notExists(havenUpFile)){
                        //不存在,就创建
                        havenUpFile.createNewFile();
                    }
                    havenUpFile=new File(havenUpRecPath);
                    if(p.exists(havenUpFile)){
                        List<String>fileNamess;
                        //存在,就向里面添加已经上传过的图片数据
                        String havaUpFileNameJson = p.readAllTxt(havenUpRecPath);
                        if(p.empty(havaUpFileNameJson)){
                            fileNamess=new LinkedList<>();
                        }else{
                            fileNamess=JSON.parseArray(havaUpFileNameJson,String.class);
                        }
                        fileNamess.add(fileName);
                        //得到添加内容后的json
                        String jsonAlreadyAdd = JSON.toJSONString(fileNamess);
                        //将 jsonAlreadyAdd 放入记录文本中
                        p.writeToTxt(jsonAlreadyAdd,havenUpRecPath);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        } catch (Exception e) {
            e.printStackTrace();
        }


    }




}
