package com.winwin.picreport.Edto;
public class CurrentType {
    //币别
    private String curId;
    //币名
    private String name;

    public static CurrentType gc(){
        return new CurrentType();
    }
    public String getCurId() {
        return curId;
    }

    public CurrentType setCurId(String curId) {
        this.curId = curId;
        return this;
    }

    public String getName() {
        return name;
    }

    public CurrentType setName(String name) {
        this.name = name;
        return this;
    }
}
