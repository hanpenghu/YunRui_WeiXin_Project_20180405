package com.winwin.picreport.Edto;

public class PinPai {
    private String markNo="";
    private String name="";

    public String getMarkNo() {
        return markNo;
    }

    public PinPai setMarkNo(String markNo) {
        this.markNo = markNo;
        return this;
    }

    public String getName() {
        return name;
    }

    public PinPai setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("com.winwin.picreport.Edto.PinPai{");
        sb.append("markNo='").append(markNo).append('\'');
        sb.append(", name='").append(name).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
