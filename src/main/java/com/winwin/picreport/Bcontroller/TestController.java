package com.winwin.picreport.Bcontroller;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.http.HttpServletRequest;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.List;

@RestController
@CrossOrigin
public class TestController {

    @RequestMapping("/test")
    public String test(){
        return "~~~~~~~~~~TongLe~~~~~~~~~~~~";
    }

    @RequestMapping("/test1")
    public String test1(){
        return "~~~~~~~~~~TongLe~~~1~~~~~~~~~";
    }
    @RequestMapping("/test2")
    public String test2(){
        return "~~~~~~~~~~TongLe~~~2~~~~~~~~~";
    }
    @RequestMapping("/test3")
    public String 测试3(){
        return "~~~~~~~~~~通过了~~~3~~~~~~~~~";
    }



    /**
     **************测试多文件上传**************************************************************************
     http://blog.csdn.net/coding13/article/details/54577076
     * */

    @RequestMapping(value = "/batch/upload", method = RequestMethod.POST)
    @ResponseBody
    public String  testManyFileUpload(HttpServletRequest request){
        List<MultipartFile> files =
                ((MultipartHttpServletRequest) request).getFiles("file");

        /**
         *这个files其实就是一堆  file了,可以拿来直接用了,下面的就是多此一举
         * file.getOriginalFilename()就是某个文件的带后缀的名字了
         * */
        MultipartFile file = null;
        BufferedOutputStream stream = null;
        for (int i = 0; i < files.size(); ++i) {
            file = files.get(i);
            if (!file.isEmpty()) {
                System.out.println("~~~~~~~~~~~~~"+file.getOriginalFilename()+"~~~~~~~~~~~~~~~~~~~~~~~~");

                try {
                    byte[] bytes = file.getBytes();
                    stream = new BufferedOutputStream(
                            new FileOutputStream(
                                    new File(file.getOriginalFilename())
                            )
                    );
                    stream.write(bytes);
                    stream.close();

                } catch (Exception e) {
                    stream = null;
                    return "You failed to upload " + i + " => "
                            + e.getMessage();
                }
            } else {
                return "You failed to upload " + i
                        + " because the file was empty.";
            }
        }
        return "upload successful";




    }


    /**
     ****************************************************************************************
     * */
}
