package com.winwin.picreport.Futils.excelHan;


import java.util.LinkedList;
import java.util.List;

public class ExcelPicTxtTemplate {

    //某一行的所有文本组成的list
    private List<ExcelTxtTemplate>txtRowList=new LinkedList<>();
    //该行的所有图片
    private List<ExcelPicTemplate> txtRowPicDataList=new LinkedList<>();//存图片

    public List<ExcelTxtTemplate> getTxtRowList() {
        return txtRowList;
    }

    public ExcelPicTxtTemplate setTxtRowList(List<ExcelTxtTemplate> txtRowList) {
        this.txtRowList = txtRowList;
        return this;
    }

    public List<ExcelPicTemplate> getTxtRowPicDataList() {
        return txtRowPicDataList;
    }

    public ExcelPicTxtTemplate setTxtRowPicDataList(List<ExcelPicTemplate> txtRowPicDataList) {
        this.txtRowPicDataList = txtRowPicDataList;
        return this;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("com.winwin.picreport.Futils.excelHan.ExcelPicTxtTemplate{");
        sb.append("txtRowList=").append(txtRowList);
        sb.append(", txtRowPicDataList=").append(txtRowPicDataList);
        sb.append('}');
        return sb.toString();
    }
}
