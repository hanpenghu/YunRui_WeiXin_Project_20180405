package com.winwin.picreport.Futils.excelHan;

public class ExcelTxtTemplate {
    //工作薄号,一般是会有一个
    private int txtSheetNum;
    //行号
    private int txtRowNum;
    //列号
    private int txtColumnNum;
    //列的最上面一个单元格的内容//列对应表头
    private String txtColumnNameOfTableHead;
    //该单元格的内容,注意这里不会读取图片,即使有图片那一列,读取出来的也是空
    private String txt;

    public int getTxtSheetNum() {
        return txtSheetNum;
    }

    public ExcelTxtTemplate setTxtSheetNum(int txtSheetNum) {
        this.txtSheetNum = txtSheetNum;
        return this;
    }

    public int getTxtRowNum() {
        return txtRowNum;
    }

    public ExcelTxtTemplate setTxtRowNum(int txtRowNum) {
        this.txtRowNum = txtRowNum;
        return this;
    }

    public int getTxtColumnNum() {
        return txtColumnNum;
    }

    public ExcelTxtTemplate setTxtColumnNum(int txtColumnNum) {
        this.txtColumnNum = txtColumnNum;
        return this;
    }

    public String getTxtColumnNameOfTableHead() {
        return txtColumnNameOfTableHead;
    }

    public ExcelTxtTemplate setTxtColumnNameOfTableHead(String txtColumnNameOfTableHead) {
        this.txtColumnNameOfTableHead = txtColumnNameOfTableHead;
        return this;
    }

    public String getTxt() {
        return txt;
    }

    public ExcelTxtTemplate setTxt(String txt) {
        this.txt = txt;
        return this;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("com.winwin.picreport.Futils.excelHan.ExcelTxtTemplate{");
        sb.append("txtSheetNum=").append(txtSheetNum);
        sb.append(", txtRowNum=").append(txtRowNum);
        sb.append(", txtColumnNum=").append(txtColumnNum);
        sb.append(", txtColumnNameOfTableHead='").append(txtColumnNameOfTableHead).append('\'');
        sb.append(", txt='").append(txt).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
