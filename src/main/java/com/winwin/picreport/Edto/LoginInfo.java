package com.winwin.picreport.Edto;

public class LoginInfo {
    private String tenantId="";//公司id,一般是英文,不能一样
    private String tenantName="";//公司名字
    private String userEmail="";//公司里面该用户的用户名//前端手机号,email和会员名其一都可以用这个字段传过来,传过来后我自动判断(login的时候,如果是注册,用下面2个字段)
    private String newUserEamil="";
    private String userName="";//会员名,可以用来联合tenantid在tenant表中唯一来登录
    private String newUserName="";
    private String phoneNo="";//电话号码,可以用来联合tenantid在tenant表中唯一来登录
    private String newPhoneNo="";
    private String userPswd="";//公司里面该用户的密码
    private String newUserPswd="";
    private String confirmPswd=" ";//让用户再输一次密码,用来让用户记住
    private String newConfirmPswd=" ";//
    private String lockBill="CK;TK;EXT;";//默认锁单的单据类别
    private String timetoken="";
    private String msg="输入信息有误";//编辑用户信息的时候用的
    private String statu="0";//编辑用户信息的时候用  0代表用户输入的信息不正确,不能得到要编辑的信息,其他任何数字代表得到了信息

    public String getStatu() {
        return statu;
    }

    public LoginInfo setStatu(String statu) {
        this.statu = statu;
        return this;
    }

    public String getNewUserEamil() {
        return newUserEamil;
    }

    public LoginInfo setNewUserEamil(String newUserEamil) {
        this.newUserEamil = newUserEamil;
        return this;
    }

    public String getNewUserName() {
        return newUserName;
    }

    public LoginInfo setNewUserName(String newUserName) {
        this.newUserName = newUserName;
        return this;
    }

    public String getNewPhoneNo() {
        return newPhoneNo;
    }

    public LoginInfo setNewPhoneNo(String newPhoneNo) {
        this.newPhoneNo = newPhoneNo;
        return this;
    }

    public String getNewUserPswd() {
        return newUserPswd;
    }

    public LoginInfo setNewUserPswd(String newUserPswd) {
        this.newUserPswd = newUserPswd;
        return this;
    }

    public String getNewConfirmPswd() {
        return newConfirmPswd;
    }

    public LoginInfo setNewConfirmPswd(String newConfirmPswd) {
        this.newConfirmPswd = newConfirmPswd;
        return this;
    }

    public String getMsg() {
        return msg;
    }

    public LoginInfo setMsg(String msg) {
        this.msg = msg;
        return this;
    }

    public String getUserName() {
        return userName;
    }

    public LoginInfo setUserName(String userName) {
        this.userName = userName;
        return this;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public LoginInfo setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
        return this;
    }

    public String getTenantId() {
        return tenantId;
    }

    public LoginInfo setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }

    public String getTenantName() {
        return tenantName;
    }

    public LoginInfo setTenantName(String tenantName) {
        this.tenantName = tenantName;
        return this;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public LoginInfo setUserEmail(String userEmail) {
        this.userEmail = userEmail;
        return this;
    }

    public String getUserPswd() {
        return userPswd;
    }

    public LoginInfo setUserPswd(String userPswd) {
        this.userPswd = userPswd;
        return this;
    }

    public String getConfirmPswd() {
        return confirmPswd;
    }

    public LoginInfo setConfirmPswd(String confirmPswd) {
        this.confirmPswd = confirmPswd;
        return this;
    }

    public String getLockBill() {
        return lockBill;
    }

    public LoginInfo setLockBill(String lockBill) {
        this.lockBill = lockBill;
        return this;
    }

    public String getTimetoken() {
        return timetoken;
    }

    public LoginInfo setTimetoken(String timetoken) {
        this.timetoken = timetoken;
        return this;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("com.ipacedev.tcode.dto.LoginInfo{");
        sb.append("tenantId='").append(tenantId).append('\'');
        sb.append(", tenantName='").append(tenantName).append('\'');
        sb.append(", userEmail='").append(userEmail).append('\'');
        sb.append(", newUserEamil='").append(newUserEamil).append('\'');
        sb.append(", userName='").append(userName).append('\'');
        sb.append(", newUserName='").append(newUserName).append('\'');
        sb.append(", phoneNo='").append(phoneNo).append('\'');
        sb.append(", newPhoneNo='").append(newPhoneNo).append('\'');
        sb.append(", userPswd='").append(userPswd).append('\'');
        sb.append(", newUserPswd='").append(newUserPswd).append('\'');
        sb.append(", confirmPswd='").append(confirmPswd).append('\'');
        sb.append(", newConfirmPswd='").append(newConfirmPswd).append('\'');
        sb.append(", lockBill='").append(lockBill).append('\'');
        sb.append(", timetoken='").append(timetoken).append('\'');
        sb.append(", msg='").append(msg).append('\'');
        sb.append(", statu='").append(statu).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
