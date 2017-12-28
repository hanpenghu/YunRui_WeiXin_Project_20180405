package com.winwin.picreport.Edto;

//我的定价表

import com.winwin.picreport.Futils.p;

import java.math.BigDecimal;

public class UpDefMy01 extends UpDefMy {

    //根据实际bil_type来分配价格

    public BigDecimal getNoTransUp(){
        //此时是不含运费价格的
        if(p.dy(this.bilType,"01")){
            return up;
        }else{
            //此时是含运费价格的
            return null;
        }

    }


    public BigDecimal getHaveTransUp(){
        //此时是不含运费价格的
        if(p.dy(this.bilType,"01")){
            return null;
        }else{
            //此时是含运费价格的
            return up;
        }

    }


}