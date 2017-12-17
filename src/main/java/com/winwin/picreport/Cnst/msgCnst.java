package com.winwin.picreport.Cnst;

public enum msgCnst {
    failSave("保存失败",1),
    failSaveStatus("50",2),
    failGetExcelData("获取EXCEL数据失败",3);

    private Object value ;
    private int index ;

    msgCnst(Object value, int index) {
        this.value = value;
        this.index = index;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String  getValue() {

        return value.toString();
    }

    public int getIndex() {
        return index;
    }
}
