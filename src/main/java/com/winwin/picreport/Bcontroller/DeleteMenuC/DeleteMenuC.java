package com.winwin.picreport.Bcontroller.DeleteMenuC;

import com.winwin.picreport.Bcontroller.sheZhiCaiDan1.DeleteCaiDan;
import com.winwin.picreport.Futils.MsgGenerate.Msg;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
public class DeleteMenuC {


    @RequestMapping(value="deleteMenuC001",method = RequestMethod.GET)
    public @ResponseBody Msg f(){
        String s = new DeleteCaiDan().f1();
        return Msg.gmg().setData(new com.winwin.picreport.Edto.Data().setObj(s));
    }




}
