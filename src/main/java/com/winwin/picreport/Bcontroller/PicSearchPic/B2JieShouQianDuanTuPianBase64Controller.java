package com.winwin.picreport.Bcontroller.PicSearchPic;

import cn.productai.api.example.TestExample;
import cn.productai.api.pai.entity.search.ImageSearchResponse;
import cn.productai.api.pai.response.SearchResult;
import com.winwin.picreport.Edto.Base64Image;
import com.winwin.picreport.Futils.ImageAndBase64;
import com.winwin.picreport.Futils.NotEmpty;
import org.apache.tomcat.util.http.fileupload.FileUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
//import org.apache.commons.lang.StringUtils;

@CrossOrigin
@RestController
@RequestMapping("/b2")
public class B2JieShouQianDuanTuPianBase64Controller {
    @Value("${tupianserviceId}")
    private String  tupianserviceId;
    @Value("${tupianFanHuiCount}")
    private int tupianFanHuiCount;
    @Value("${filePath}")//./1234567/
    private String filePath;
    @Value("${dirUrl}")
    private String dirUrl;
////////////////////////////////////////////////consumes是请求类型,/////produces是返回类型//////////////////////////
    @RequestMapping(value="jieShouQianduanChuanGuoLaiDeYiZhangTuPian",method= RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
//    @PostMapping(value = "/jieShouQianduanChuanGuoLaiDeYiZhangTuPian", consumes = MediaType.MULTIPART_FORM_DATA_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
//@RequestMapping(value="jieShouQianduanChuanGuoLaiDeYiZhangTuPian", consumes = MediaType.MULTIPART_FORM_DATA_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody List<SearchResult> jieShouQianduanChuanGuoLaiDeYiZhangTuPian(@RequestBody Base64Image base64Image){//@RequestParam("file")
        List<SearchResult> list=new ArrayList<>();
        if (NotEmpty.notEmpty(base64Image)) {
                File dest=null;
                try {
                    String fileName= UUID.randomUUID().toString().replace("-","");
//                    public static boolean GenerateImage(String imgStr,String pathToGenerateImg)
                    ImageAndBase64.GenerateImage(base64Image.getBase64str(),"");
                    String fileUrl=dirUrl+fileName+".jpeg";
                    System.out.println(fileUrl);
                    //   ./1234567/
                    //E:\CloudPlatformBackstage\winwin\.\1234567\WW-VSUP5950-778.jpg
                    dest = new File(filePath, fileName+".jpeg");
                    System.out.println(dest.getAbsolutePath());
                    //上传到指定目录
                    ImageAndBase64.GenerateImage(base64Image.getBase64str(),dest);
                    ImageSearchResponse imageSearchResponse =
                            new TestExample().fullFlowExample
                                    (fileUrl, tupianserviceId, tupianFanHuiCount);
                    for(SearchResult searchResult:imageSearchResponse.getResults()){
                        list.add(searchResult);
                    }
                    System.out.println("===================================");
                    //删除指定目录的图片(用完就删掉)
                    FileUtils.forceDelete(dest);
                } catch (Exception e) {System.out.println(""); }finally{
                    try { FileUtils.forceDelete(dest) ;} catch (IOException e) { }
                }

        }
        return list;
    }
///////////////////////////////////////////////////////////////////////////////
}
////////////////////////////////////////////////////////////////////////////////