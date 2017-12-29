package com.winwin.picreport.Edto;

//我的定价表

import com.winwin.picreport.Futils.p;

import java.math.BigDecimal;

public class UpDefMy01 extends UpDefMy {

    //不含运费单价的采购价格//up_def中bil_type=01
    BigDecimal noTransUpBuy;//
    //含运费单价采购价格//up_def中bil_type!=01
    BigDecimal haveTransUpBuy;//


    //不含运费单价的销售价格//up_def中bil_type=01
    BigDecimal noTransUpSale;//
    //含运费单价销售价格//up_def中bil_type!=01
    BigDecimal haveTransUpSale;//





    //根据实际bil_type和priceId来分配价格


    public BigDecimal getNoTransUpBuy() {
        if(p.dy(this.bilType,"01")&&p.dy(this.priceId,"2")){
            return this.up;
        }
        return noTransUpBuy;
    }

    public UpDefMy01 setNoTransUpBuy(BigDecimal noTransUpBuy) {
        this.noTransUpBuy = noTransUpBuy;
        return this;
    }

    public BigDecimal getHaveTransUpBuy() {
        if(p.bdy(this.bilType,"01")&&p.dy(this.priceId,"2")){
            return this.up;
        }
        return haveTransUpBuy;
    }

    public UpDefMy01 setHaveTransUpBuy(BigDecimal haveTransUpBuy) {
        this.haveTransUpBuy = haveTransUpBuy;
        return this;
    }

    public BigDecimal getNoTransUpSale() {
        if(p.dy(this.bilType,"01")&&p.dy(this.priceId,"1")){
            return this.up;
        }
        return noTransUpSale;
    }

    public UpDefMy01 setNoTransUpSale(BigDecimal noTransUpSale) {
        this.noTransUpSale = noTransUpSale;
        return this;
    }

    public BigDecimal getHaveTransUpSale() {
        if(p.bdy(this.bilType,"01")&&p.dy(this.priceId,"1")){
            return this.up;
        }
        return haveTransUpSale;
    }

    public UpDefMy01 setHaveTransUpSale(BigDecimal haveTransUpSale) {
        this.haveTransUpSale = haveTransUpSale;
        return this;
    }
}