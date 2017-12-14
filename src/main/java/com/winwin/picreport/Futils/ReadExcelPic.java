package com.winwin.picreport.Futils;

import org.apache.poi.xssf.usermodel.*;

import java.io.*;
import java.util.LinkedList;
import java.util.List;

public class ReadExcelPic {

    public List<byte[]>ExceByteData(File file) throws IOException {
        // 创建流
        InputStream input = new FileInputStream(file);
        //得到Excel对象
        XSSFWorkbook wb =  new XSSFWorkbook(input);

        //得到Excel的sheet对象//从0开始索引
        XSSFSheet sheet = wb.getSheetAt(0);
        XSSFDrawing drawing = sheet.getDrawingPatriarch();
        List<XSSFShape> xShapeList = drawing.getShapes();
        List<byte[]>list =new LinkedList<>();
       for(int i=0;i<xShapeList.size();i++){
           XSSFPicture xsp = (XSSFPicture)xShapeList.get(i);
           list.add(xsp.getPictureData().getData());
       }
       return list;
    }

}
