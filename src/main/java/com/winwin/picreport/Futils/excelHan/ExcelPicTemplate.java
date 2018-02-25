package com.winwin.picreport.Futils.excelHan;

import org.apache.poi.ss.usermodel.PictureData;

/**
 *储存每张图片的属性,
 * @ picSheetNum 在那个工作薄
 * picRowNum 图片
 * */
public class ExcelPicTemplate {
        //工作薄号,一般是会有一个
        private int picSheetNum;
        //行号
        private int picRowNum;
        //列号
        private int picColumnNum;
        //列的最上面一个单元格的内容//列对应表头
        private String picColumnNameOfTableHead;

        //存图片
        private PictureData pictureData;


        public PictureData getPictureData() {
                return pictureData;
        }

        public ExcelPicTemplate setPictureData(PictureData pictureData) {
                this.pictureData = pictureData;
                return this;
        }

        public int getPicSheetNum() {
                return picSheetNum;
        }

        public ExcelPicTemplate setPicSheetNum(int picSheetNum) {
                this.picSheetNum = picSheetNum;
                return this;
        }

        public int getPicRowNum() {
                return picRowNum;
        }

        public ExcelPicTemplate setPicRowNum(int picRowNum) {
                this.picRowNum = picRowNum;
                return this;
        }

        public int getPicColumnNum() {
                return picColumnNum;
        }

        public ExcelPicTemplate setPicColumnNum(int picColumnNum) {
                this.picColumnNum = picColumnNum;
                return this;
        }

        public String getPicColumnNameOfTableHead() {
                return picColumnNameOfTableHead;
        }

        public ExcelPicTemplate setPicColumnNameOfTableHead(String picColumnNameOfTableHead) {
                this.picColumnNameOfTableHead = picColumnNameOfTableHead;
                return this;
        }

        @Override
        public String toString() {
                final StringBuffer sb = new StringBuffer("com.winwin.picreport.Futils.excelHan.ExcelPicTemplate{");
                sb.append("picSheetNum=").append(picSheetNum);
                sb.append(", picRowNum=").append(picRowNum);
                sb.append(", picColumnNum=").append(picColumnNum);
                sb.append(", picColumnNameOfTableHead='").append(picColumnNameOfTableHead).append('\'');
                sb.append(", pictureData=").append(pictureData);
                sb.append('}');
                return sb.toString();
        }
}
