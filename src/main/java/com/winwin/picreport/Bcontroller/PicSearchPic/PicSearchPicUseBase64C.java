package com.winwin.picreport.Bcontroller.PicSearchPic;

import cn.productai.api.example.TestExample;
import cn.productai.api.pai.entity.search.ImageSearchResponse;
import cn.productai.api.pai.response.SearchResult;
import com.alibaba.fastjson.JSON;
import com.winwin.picreport.Bcontroller.PicSearchPic.dto.SimplePrdtSamp;
import com.winwin.picreport.Bcontroller.PicSearchPic.utils.Cnst;
import com.winwin.picreport.Ddao.reportxmlmapper.A001TongYongMapper;
import com.winwin.picreport.Edto.Base64Image;
import com.winwin.picreport.Futils.ImageAndBase64;
import com.winwin.picreport.Futils.NotEmpty;
import com.winwin.picreport.Futils.p;
import org.apache.tomcat.util.http.fileupload.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
//import org.apache.commons.lang.StringUtils;

@CrossOrigin
@RestController
@RequestMapping("/b2")
public class PicSearchPicUseBase64C {
    @Autowired
    private A001TongYongMapper a001TongYongMapper;
//    @Value("${tupianserviceId}")
    private String  tupianserviceId= Cnst.serviceIdOfWinWinPrdtSamp;
    @Value("${tupianFanHuiCount}")
    private int tupianFanHuiCount;
    @Value("${filePath}")//./1234567/
    private String filePath;
    @Value("${dirUrl}")
    private String dirUrl;
////////////////////////////////////////////////consumes是请求类型,/////produces是返回类型//////////////////////////

    /**
     *接受前端传过来的一张图片传给码隆,然后返回给前端所有相似的图片的信息,参数是Base64字符串
     * 这个后来应该不用了
     * */

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
                    //创造给码隆临时搜索的林展服务器图片的url
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
                        /////////////////////////////////////////////////
                        //添加简单的prdtSamp打样字段
                        String url = searchResult.getUrl();
                        String urlAfter=url.substring(url.indexOf("suoLueTuWenJianJia/")+19,url.indexOf("!"));
                        p.p("----------------urlAfter---------------------------------------");
                        p.p(urlAfter);
                        p.p("-------------------------------------------------------");
                        List<SimplePrdtSamp>simplePrdtSamps=a001TongYongMapper.getSimplePrdtSamps("%"+urlAfter+"%");
                        p.p("------------------simplePrdtSamps-------------------------------------");
                        p.p(JSON.toJSONString(simplePrdtSamps));
                        p.p("-------------------------------------------------------");
                        if(p.empty(simplePrdtSamps)){
                            simplePrdtSamps.add(new SimplePrdtSamp());
                        }
                        searchResult.setSimplePrdtSamp(simplePrdtSamps);
                        ////////////////////////////////////////////////
                        list.add(searchResult);
                    }
                    System.out.println("===================================");
                    //删除指定目录的图片(用完就删掉)
                    FileUtils.forceDelete(dest);
                } catch (Exception e) {System.out.println("");e.printStackTrace(); }finally{
                    try { FileUtils.forceDelete(dest) ;} catch (IOException e) { }
                }

        }
        p.p("--------------------list-----------------------------------");
        p.p(JSON.toJSONString(list));
        p.p("-------------------------------------------------------");
        return list;
    }
///////////////////////////////////////////////////////////////////////////////
}
////////////////////////////////////////////////////////////////////////////////