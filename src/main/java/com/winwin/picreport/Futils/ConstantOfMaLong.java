package com.winwin.picreport.Futils;

public enum ConstantOfMaLong {
    //下面2个key和secret是艾班士公司在码隆的基础信息
    accessKeyId("b9c6156c60b5776b7547d46475f670b3",1),
    secretKey("b2e44e5b6b1590c3a67526c4bfd16b72", 2),
    //当前的sdk版本
    version("1",3);

    private Object value ;
    private int index ;

    ConstantOfMaLong(Object value, int index) {
        this.value = value;
        this.index = index;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public Object getValue() {

        return value;
    }

    public int getIndex() {
        return index;
    }
}
