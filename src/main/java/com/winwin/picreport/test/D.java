package com.winwin.picreport.test;

import java.math.BigDecimal;
import java.util.Date;

public class D{
    private BigDecimal bd;
    private Date date;

    public Date getDate() {
        return date;
    }

    public D setDate(Date date) {
        this.date = date;
        return this;
    }

    public BigDecimal getBd() {
        return bd;
    }

    public D setBd(BigDecimal bd) {
        this.bd = bd;
        return this;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("com.winwin.picreport.test.D{");
        sb.append("bd=").append(bd);
        sb.append(", date=").append(date);
        sb.append('}');
        return sb.toString();
    }
}