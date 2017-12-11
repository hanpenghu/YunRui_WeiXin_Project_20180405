package com.winwin.picreport.Edto;

public class TokenYuanMa {
    private String timestr = "";
   private String tenantId = "";
    private String userEmail = "";

    public String getTimestr() {
        return timestr;
    }

    public TokenYuanMa setTimestr(String timestr) {
        this.timestr = timestr;
        return this;
    }

    public String getTenantId() {
        return tenantId;
    }

    public TokenYuanMa setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public TokenYuanMa setUserEmail(String userEmail) {
        this.userEmail = userEmail;
        return this;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("com.ipacedev.tcode.dto.TokenYuanMa{");
        sb.append("timestr='").append(timestr).append('\'');
        sb.append(", tenantId='").append(tenantId).append('\'');
        sb.append(", userEmail='").append(userEmail).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
