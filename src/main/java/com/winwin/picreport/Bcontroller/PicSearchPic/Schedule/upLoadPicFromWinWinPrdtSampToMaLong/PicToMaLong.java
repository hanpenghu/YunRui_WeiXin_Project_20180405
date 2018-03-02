package com.winwin.picreport.Bcontroller.PicSearchPic.Schedule.upLoadPicFromWinWinPrdtSampToMaLong;

import cn.productai.api.core.IWebClient;
import com.winwin.picreport.Bcontroller.PicSearchPic.utils.CnstO;
import com.winwin.picreport.Bcontroller.PicSearchPic.utils.DataSetSingleModifyExample1;
import com.winwin.picreport.Bcontroller.PicSearchPic.utils.GetIWebClientOfMaLong;
import com.winwin.picreport.Futils.p;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class PicToMaLong {

    @Autowired
    private CnstO cnstO;

    //每天18点运行
    @Scheduled(cron="0 0 18 * * ?")
    public void startTask(){

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

        //得到连接码隆索引库的连接类,这个类中主要设置了key和密码等
        IWebClient client = GetIWebClientOfMaLong.getIWebClient();
        //得到上传图片到码隆索引库的主类
        DataSetSingleModifyExample1 g = DataSetSingleModifyExample1.g();

        //上传单条数据的例子
//      DataSetModifyResponse res= g.run(client,Cnst.image_set_idOfWinWinPrdtSamp,Cnst.testPicUrl);
        //下面是上传多条数数据,首先要拿到某个文件夹里面的多条数据










    }


}
