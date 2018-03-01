package com.winwin.picreport.Bcontroller.PicSearchPic.utils;

import cn.productai.api.core.DefaultProductAIClient;
import cn.productai.api.core.DefaultProfile;
import cn.productai.api.core.IProfile;
import cn.productai.api.core.IWebClient;
import cn.productai.api.core.enums.LanguageType;

public class GetIWebClientOfMaLong {

    public static IWebClient getIWebClient(){
        IProfile profile = new DefaultProfile();
        //为了公司安全,写死在枚举enum里面
        profile.setAccessKeyId(Cnst.accessKeyId);
        profile.setSecretKey(Cnst.secretKey);
        profile.setVersion(Cnst.maLongSdkVersion);
        profile.setGlobalLanguage(LanguageType.Chinese);

        /**
         * step 2 - initialize your ProductAI client
         *
         */

        IWebClient client = new DefaultProductAIClient(profile);
        return client;
    }
}
