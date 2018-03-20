package com.winwin.picreport.Bcontroller.PicSearchPic;

import cn.productai.api.example.TestExample;
import cn.productai.api.pai.entity.search.ImageSearchResponse;
import cn.productai.api.pai.response.SearchResult;
import com.alibaba.fastjson.JSON;
import com.winwin.picreport.Bcontroller.PicSearchPic.dto.SimplePrdtSamp;
import com.winwin.picreport.Bcontroller.PicSearchPic.utils.Cnst;
import com.winwin.picreport.Ddao.reportxmlmapper.A001TongYongMapper;
import com.winwin.picreport.Futils.hanhan.p;
import org.apache.tomcat.util.http.fileupload.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
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
public class PicSearchPicUseMultipartFileC {
    @Autowired
    private A001TongYongMapper a001TongYongMapper;
//    @Value("${tupianserviceId}")
    private String  tupianserviceId= Cnst.serviceIdOfWinWinPrdtSamp;
    @Value("${tupianFanHuiCount}")
    private int tupianFanHuiCount;
//    ##用于当客户上传一张图片找相似图片的时候的缓存目录
//            filePath=C:/1234567/
    @Value("${filePath}")
    private String filePath;
//    #接口服务器url
//            url=http://${server.IP}:${server.port}
    @Value("${dirUrl}")
    private String dirUrl;
    //                             116.62.224.17253258:8070/b/jieShouQianduanChuanGuoLaiDeYiZhangTuPian
////////////////////////////////////////////////consumes是请求类型,/////produces是返回类型//////////////////////////
    /**
     *接受前端传过来的一张图片传给码隆,然后返回给前端所有相似的图片的信息,参数是MultipartFile
     * 后来应该用的这个
     * */
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
//                    System.out.println(fileName);



 //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
                   //将图片存到临时目录
                    //   ./1234567/
                    //E:\CloudPlatformBackstage\winwin\.\1234567\WW-VSUP5950-778.jpg
                    dest = new File(filePath, fileName);
//                    System.out.println(dest.getAbsolutePath());
                    //上传到指定目录
                    file.transferTo(dest);
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
                    //得到网址,因为网址在配置文件配置过,所以必须这么
                    //其实就是得到上面存的文件的网址
                    String fileUrl=dirUrl+fileName;
//                    System.out.println(fileUrl);
                    ImageSearchResponse imageSearchResponse =
                            new TestExample().fullFlowExample
                                    (fileUrl, tupianserviceId, tupianFanHuiCount);

                    for(SearchResult searchResult:imageSearchResponse.getResults()){
                        /////////////////////////////////////////////////
                        //添加简单的prdtSamp打样字段
                        String url = searchResult.getUrl();
                        String urlAfter=url.substring(url.indexOf("suoLueTuWenJianJia/")+1);
                         List<SimplePrdtSamp>simplePrdtSamps=a001TongYongMapper.getSimplePrdtSamps(urlAfter);
                        searchResult.setSimplePrdtSamp(simplePrdtSamps);
                        ////////////////////////////////////////////////
                        list.add(searchResult);
                    }
//                    System.out.println("===================================");
                    //删除指定目录的图片(用完就删掉)
                    FileUtils.forceDelete(dest);
                } catch (Exception e) {System.out.println(""); }finally{
                    try { FileUtils.forceDelete(dest) ;} catch (IOException e) { }
                }
            }
        }
//        p.p("-------------------------------------------------------");
//        p.p(JSON.toJSONString(list));
//        p.p("-------------------------------------------------------");
        return list;
    }
///////////////////////////////////////////////////////////////////////////////
}
////////////////////////////////////////////////////////////////////////////////