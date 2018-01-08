package com.winwin.picreport.Futils;

import com.winwin.picreport.AllConstant.Cnst;

public class SpringbootJarPath {

    public static String JarLuJingGet() {
        /**
         *得到类似路径
         * E:/1/000/LinZhan
         * 我们打包后的springboot 的jar包就在LinZhan文件夹里面
         * */
        String path = SpringbootJarPath.class.getProtectionDomain().getCodeSource().getLocation().getPath();
        synchronized (SpringbootJarPath.class) {
            path = path.replace("file:/", "");
            int i = path.lastIndexOf("!");
            i = i - 18;
            path = path.substring(0, i);
            path = path.substring(0, path.lastIndexOf("/"));
        }
        //处理路径中的%20为 " "
        if(path!=null&&path.contains(Cnst.enCodeSpace)){
            path=path.replace(Cnst.enCodeSpace,Cnst.spaceStr);
        }
//       String path="E:/";
        return path;
    }
}
