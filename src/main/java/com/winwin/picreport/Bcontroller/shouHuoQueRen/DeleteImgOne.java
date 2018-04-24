package com.winwin.picreport.Bcontroller.shouHuoQueRen;

import com.winwin.picreport.Cservice.Delete1Img;
import com.winwin.picreport.Edto.DeleteImgWx;
import com.winwin.picreport.Futils.MsgGenerate.Msg;
import com.winwin.picreport.Futils.hanhan.linklistT;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class DeleteImgOne {

    @Autowired
    private Delete1Img delete1Img;
    /**
     *参数:
     * {"osNo":"","url":""}
     * */
    @RequestMapping(value="deleteImgWeChat",method=RequestMethod.POST)
    public @ResponseBody Msg f(@RequestBody DeleteImgWx deleteImgWx) {
        List<String>  list= new linklistT<String>().g();
        try {
            delete1Img.f(deleteImgWx,list);
        } catch (Exception e) {
            String message = e.getMessage();
            e.printStackTrace();
            if(list.contains(message)){
                //已知异常
                return Msg.gmg().setStatus("0").setMsg(message);
            }else{
                //未知异常
                return Msg.gmg().setStatus("0").setMsg("未知异常: "+message);
            }

        }

        return Msg.gmg().setStatus("1").setMsg("删除图片成功");

    }






}
