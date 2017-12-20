package com.winwin.picreport.Futils.fileUtil;
import java.io.File;
public class hanhanFileUtil {
    /**
     *不会抛出不必要的异常
     * */
    public static void Del(File file){
        if(file!=null&&file.exists()){
            file.delete();
        }
    }

    public static boolean exists(File file){
        if(file==null){
            return false;
        }else{
            if(file.exists()){
                return true;
            }else{
                return false;
            }
        }
    }


    public static boolean exists(String filePath){
        if(null==filePath||"".equals(filePath)){
            return false;
        }else{
            File file=new File(filePath);
            if(file==null){
                return false;
            }else{
                if(file.exists()){
                    return true;
                }else{
                    return false;
                }
            }
        }
    }



}
