package com.winwin.picreport.Bcontroller.loginRegistModul.auth.dto.AuthJsonObj;

public class Auth {
  private  Logistics logistics=new Logistics();

    public Logistics getLogistics() {
        return logistics;
    }

    public Auth setLogistics(Logistics logistics) {
        this.logistics = logistics;
        return this;
    }
}
