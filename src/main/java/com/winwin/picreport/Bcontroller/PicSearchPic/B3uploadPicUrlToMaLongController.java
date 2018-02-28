package com.winwin.picreport.Bcontroller.PicSearchPic;
import cn.productai.api.pai.entity.dataset.DataSetModifyResponse;
import com.winwin.picreport.Edto.Base64Image;
import com.winwin.picreport.Edto.PicUploadStatus;
import com.winwin.picreport.Futils.DataSetSingleModifyExample1;
import com.winwin.picreport.Bcontroller.PicSearchPic.utils.GetIWebClientOfMaLong;
import com.winwin.picreport.Futils.ImageAndBase64;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/b3")
public class B3uploadPicUrlToMaLongController{

    //前端传过来的图片还用base64来传
    @Value("${image_set_idOfWinWin}")
     private String image_set_idOfWinWin;
    @Value("${tuPianShangChuanDaoMaLongDeURL}")
    private String tuPianShangChuanDaoMaLongDeURL;
    @Value("${tuPianShangChuanDaoMaLongDeBenJiMuLu}")
    private String tuPianShangChuanDaoMaLongDeBenJiMuLu;
    @RequestMapping(value="uploadPicUrlToMaLong",method = RequestMethod.POST,produces = {"application/json;charset=utf-8"})
    public @ResponseBody List<PicUploadStatus> uploadPicUrlToMaLong(@RequestBody Base64Image base64Image){
        PicUploadStatus p=new PicUploadStatus();
        List<PicUploadStatus> list =new ArrayList<>();
        String imageName = base64Image.getImageName();
        //注意,这里的imageName必须是前端传过来带后缀名字的才行
        //得到要写入本地的图片路径
        String filePath=tuPianShangChuanDaoMaLongDeBenJiMuLu+imageName;
        //在本地服务器由base64字符串生成一个image(图片)
        ImageAndBase64.GenerateImage(base64Image.getBase64str(),filePath);
        //确定图片已经存在于本地,才给码隆传递url
        if(new File(filePath).exists()){
            //得到要传给码隆的url
            String fileUrl=tuPianShangChuanDaoMaLongDeURL+imageName;
            DataSetModifyResponse response = new DataSetSingleModifyExample1().run(GetIWebClientOfMaLong.getIWebClient(), image_set_idOfWinWin, fileUrl);
            Integer statusCode = response.getStatusCode();
            String status = response.getStatus();
            p.setStatus(status);
            p.setStatusCode(String.valueOf(statusCode));
            p.setImageName(imageName);
            list.add(p);
            return list;
        }
        return list;
    }



}
