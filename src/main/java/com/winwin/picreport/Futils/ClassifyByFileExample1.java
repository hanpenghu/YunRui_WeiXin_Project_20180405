package com.winwin.picreport.Futils;

import cn.productai.api.core.DefaultProductAIClient;
import cn.productai.api.core.DefaultProfile;
import cn.productai.api.core.IProfile;
import cn.productai.api.core.IWebClient;
import cn.productai.api.core.enums.LanguageType;
import cn.productai.api.core.enums.ServiceType;
import cn.productai.api.core.exceptions.ClientException;
import cn.productai.api.example.TestExample;
import cn.productai.api.pai.entity.classify.ClassifyByImageFileRequest;
import cn.productai.api.pai.entity.classify.ClassifyResponse;
import cn.productai.api.pai.response.ClassifyResult;

import java.io.File;
import java.util.Date;

/**
 * Created by Zhong Wang on 2017/7/5.
 * 场景分析与标注
 * https://api-doc.productai.cn/doc/pai.html#场景分析与标注
 */
public class ClassifyByFileExample1{
    public static void main(String[]args){
        Date date1=new Date();
        long time1= date1.getTime();
        new ClassifyByFileExample1().run1(new File("E:/WW-NEMT-2884.jpg"));
        Date date2=new Date();
        long time2 = date2.getTime();
        long time3=time2-time1;
        long time4=time3/1000;
        System.out.println("-------------耗时间"+time4+"秒---------------");
    }

    public void run1(File file) {
System.out.println("========草草草================");
        IProfile profile = new DefaultProfile();
        profile.setAccessKeyId("b9c6156c60b5776b7547d46475f670b3");
        profile.setSecretKey("b2e44e5b6b1590c3a67526c4bfd16b72");
        profile.setVersion("1");
        profile.setGlobalLanguage(LanguageType.Chinese);

        /**
         * step 2 - initialize your ProductAI client
         *
         */

        IWebClient client = new DefaultProductAIClient(profile);
        ClassifyByImageFileRequest request = new ClassifyByImageFileRequest(ServiceType.Classify, "yppse9v1");
        request.setImageFile(file);
        request.setLanguage(LanguageType.Chinese);

        // you can pass the extra paras to the request
        request.getOptions().put("para1", "1");
        request.getOptions().put("para2", "中文");
        request.getOptions().put("para3", "value3");

        try {
            ClassifyResponse response = client.getResponse(request);

            System.out.println("==============================Result==============================");

            for (ClassifyResult r : response.getResults()) {
                // access the response directly
                System.out.println(String.format("%s - %s", r.getCategory(), r.getScore()));
            }

            System.out.println("==============================Result==============================");
        } catch (cn.productai.api.core.exceptions.ServerException e) {
            System.out.println(String.format("ServerException occurred. ErrorCode: %s \r\n ErrorMessage: %s",
                    e.getErrorCode(),
                    e.getErrorMessage()));
            e.printStackTrace();

        } catch (ClientException e) {
            System.out.println(String.format("ClientException occurred. ErrorCode: %s \r\n ErrorMessage: %s \r\n RequestId: %s",
                    e.getErrorCode(),
                    e.getErrorMessage(),
                    e.getRequestId()));
            e.printStackTrace();

        } catch (Exception e) {
            System.out.println(String.format("%s occurred. ErrorMessage: %s", e.getClass().getName(), e.getMessage()));
            e.printStackTrace();
        }
    }
}
