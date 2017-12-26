package com.winwin.picreport.Edto;

import java.util.Date;

public class CurIdKey {
    private String curId;

    private Date ijDd;

    public String getCurId() {
        return curId;
    }

    public void setCurId(String curId) {
        this.curId = curId == null ? null : curId.trim();
    }

    public Date getIjDd() {
        return ijDd;
    }

    public void setIjDd(Date ijDd) {
        this.ijDd = ijDd;
    }
}