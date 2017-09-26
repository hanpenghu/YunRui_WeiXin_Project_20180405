package cn.productai.api.example;
import cn.productai.api.core.DefaultProductAIClient;
import cn.productai.api.core.DefaultProfile;
import cn.productai.api.core.IProfile;
import cn.productai.api.core.IWebClient;
import cn.productai.api.core.enums.LanguageType;
import cn.productai.api.core.exceptions.ClientException;
import cn.productai.api.pai.entity.search.ImageSearchByImageUrlRequest;
import cn.productai.api.pai.entity.search.ImageSearchResponse;
import cn.productai.api.pai.response.SearchResult;
import com.winwin.picreport.Futils.ConstantOfMaLong;
import com.winwin.picreport.Futils.GetIWebClientOfMaLong;

import java.util.Date;
public class TestExample {

    public static void main(String[]args){
        Date date1=new Date();
       long time1= date1.getTime();
        new TestExample().fullFlowExample("http://116.62.224.172:8070/lzpic/1/WW-VSUP5950-858.jpeg","yppse9v1",10);
        Date date2=new Date();
        long time2 = date2.getTime();
        long time3=time2-time1;
        long time4=time3/1000;
        System.out.println("-------------耗时间"+time4+"秒---------------");
    }


    public  ImageSearchResponse fullFlowExample(String url,String serviceId,int count) {
        /**
         * step 1 - setup your account profile
         * get your accessKeyId & secretKey at https://console.productai.cn/main#/21/service_category_id=1
         */

     /*   IProfile profile = new DefaultProfile();
        //为了公司安全,写死在枚举enum里面
        profile.setAccessKeyId((String)ConstantOfMaLong.accessKeyId.getValue());
        profile.setSecretKey((String)ConstantOfMaLong.secretKey.getValue());
        profile.setVersion((String)ConstantOfMaLong.version.getValue());
        profile.setGlobalLanguage(LanguageType.Chinese);
*/
        /**
         * step 2 - initialize your ProductAI client
         *
         */

        IWebClient client = GetIWebClientOfMaLong.getIWebClient();

        /**
         * step 3 - build your request
         * take image search as example
         */

//        ImageSearchByImageUrlRequest request = new ImageSearchByImageUrlRequest("yppse9v1");
        ImageSearchByImageUrlRequest request = new ImageSearchByImageUrlRequest(serviceId);
//        request.setUrl("http://116.62.224.172/lzpic/1/WW-VSUP5950-858.jpeg");
        request.setUrl(url);
        //返回结果个数
        request.setCount(count);

        // this value will be override because you had set the IProfile.GlobalLanguage = LanguageType.Chinese
        request.setLanguage(LanguageType.English);

        // you can pass the extra paras to the request
        request.getOptions().put("para1", "1");
        request.getOptions().put("para2", "中文");
        request.getOptions().put("para3", "value3");

        /**
         * step 4 - send out the request、receive the response、catch the exceptions
         */
        ImageSearchResponse response=null;
        try {
             response = client.getResponse(request);

            System.out.println("=============================Result==============================");

            for (SearchResult r : response.getResults()) {
//                System.out.println();
                // access the response directly
                System.out.println(String.format("%s - %s", r.getUrl(), r.getScore()));
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

        /**
         *  Congrats! Now you can build your smart AI service using ProductAI.
         */
        return response;
    }
}
