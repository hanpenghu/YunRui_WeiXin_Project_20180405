package com.winwin.picreport.Bcontroller.loginRegistModul.auth.dto;

public class ModelUsers {
    /**
     *模型用户关系表的字段
     * */
    //模型id
    private String modelUuid="";
    //用户id
    private String usersUuid="";
    //是否能够查看 T是可以,F是不可以
    private String canUse="";
    //对应的模块
   private Model model;

    public Model getModel() {
        return model;
    }

    public ModelUsers setModel(Model model) {
        this.model = model;
        return this;
    }

    public String getModelUuid() {
        return modelUuid;
    }

    public ModelUsers setModelUuid(String modelUuid) {
        this.modelUuid = modelUuid;
        return this;
    }

    public String getUsersUuid() {
        return usersUuid;
    }

    public ModelUsers setUsersUuid(String usersUuid) {
        this.usersUuid = usersUuid;
        return this;
    }

    public String getCanUse() {
        return canUse;
    }

    public ModelUsers setCanUse(String canUse) {
        this.canUse = canUse;
        return this;
    }
}
