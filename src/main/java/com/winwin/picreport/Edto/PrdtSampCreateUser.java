package com.winwin.picreport.Edto;

public class PrdtSampCreateUser {
    private String userName;
    private String tenantId;

    public String getUserName() {
        return userName;
    }

    public PrdtSampCreateUser setUserName(String userName) {
        this.userName = userName;
        return this;
    }

    public String getTenantId() {
        return tenantId;
    }

    public PrdtSampCreateUser setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
}
