package com.winwin.picreport.AllConstant.Constant;
public enum msgCnst {
    failSave("保存失败",1),
    failSaveStatus("50",2),
    failGetExcelData("获取EXCEL数据失败",3),
    failOfDbMistake("数据库系统级别错误",4),
    excelHaveNoPicInThisRow("excel该行没有图片数据",5),
    excelHaveOnePicInThisRow("excel该行有一个图片数据需要保存",6);
    public Object value ;
    public int index ;



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
