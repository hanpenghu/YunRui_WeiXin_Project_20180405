package com.winwin.picreport.Edto;

public class FuZeRen {
    private String salNo="";
    private String salName="";

    public String getSalNo() {
        return salNo;
    }

    public FuZeRen setSalNo(String salNo) {
        this.salNo = salNo;
        return this;
    }

    public String getSalName() {
        return salName;
    }

    public FuZeRen setSalName(String salName) {
        this.salName = salName;
        return this;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("com.winwin.picreport.Edto.FuZeRen{");
        sb.append("salNo='").append(salNo).append('\'');
        sb.append(", salName='").append(salName).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
