package com.winwin.picreport.Bcontroller.PicSearchPic;

import cn.productai.api.example.TestExample;
import cn.productai.api.pai.entity.search.ImageSearchResponse;
import cn.productai.api.pai.response.SearchResult;
import org.apache.tomcat.util.http.fileupload.FileUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;


import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
//import org.apache.commons.lang.StringUtils;

@CrossOrigin
@RestController
@RequestMapping("/b")
public class B1JieShouQianDuanTuPianController {
    @Value("${tupianserviceId}")
    private String  tupianserviceId;
    @Value("${tupianFanHuiCount}")
    private int tupianFanHuiCount;
    @Value("${filePath}")//./1234567/
    private String filePath;
    @Value("${dirUrl}")
    private String dirUrl;
    //                             116.62.224.17253258:8070/b/jieShouQianduanChuanGuoLaiDeYiZhangTuPian
////////////////////////////////////////////////consumes是请求类型,/////produces是返回类型//////////////////////////
    @RequestMapping(value="jieShouQianduanChuanGuoLaiDeYiZhangTuPian",method= RequestMethod.POST,consumes = MediaType.MULTIPART_FORM_DATA_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
//    @PostMapping(value = "/jieShouQianduanChuanGuoLaiDeYiZhangTuPian", consumes = MediaType.MULTIPART_FORM_DATA_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
//@RequestMapping(value="jieShouQianduanChuanGuoLaiDeYiZhangTuPian", consumes = MediaType.MULTIPART_FORM_DATA_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody List<SearchResult> jieShouQianduanChuanGuoLaiDeYiZhangTuPian(@RequestParam("file")MultipartFile file){//@RequestParam("file")
        List<SearchResult> list=new ArrayList<>();
//        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~实验~~~~~~~~~~~~~~~~~~~~~~~~");
//        System.out.println(file.getOriginalFilename());
//        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~实验~~~~~~~~~~~~~~~~~~~~~~~~");
        if (!file.isEmpty()) {
            if (file.getContentType().contains("image")) {
                File dest=null;
                try {
                    // 获取图片的文件名
                    String fileName = file.getOriginalFilename();
                    System.out.println(fileName);
                    String fileUrl=dirUrl+fileName;
                    System.out.println(fileUrl);
                    //   ./1234567/
                    //E:\CloudPlatformBackstage\winwin\.\1234567\WW-VSUP5950-778.jpg
                    dest = new File(filePath, fileName);
                    System.out.println(dest.getAbsolutePath());
                    //上传到指定目录
                    file.transferTo(dest);

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
        }
        return list;
    }
///////////////////////////////////////////////////////////////////////////////
}
////////////////////////////////////////////////////////////////////////////////