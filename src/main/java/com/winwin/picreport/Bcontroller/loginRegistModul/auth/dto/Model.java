package com.winwin.picreport.Bcontroller.loginRegistModul.auth.dto;

public class Model {
    //模块id
    private String modelUuid;
    //模块名字
    private String modelName;
    //模块内容
    private String rem;

    public String getModelUuid() {
        return modelUuid;
    }

    public Model setModelUuid(String modelUuid) {
        this.modelUuid = modelUuid;
        return this;
    }

    public String getModelName() {
        return modelName;
    }

    public Model setModelName(String modelName) {
        this.modelName = modelName;
        return this;
    }

    public String getRem() {
        return rem;
    }

    public Model setRem(String rem) {
        this.rem = rem;
        return this;
    }


}
