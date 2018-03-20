package com.winwin.picreport.Futils.excel;

import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.xssf.usermodel.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.List;

/**
 * Created by Administrator on 2017/6/4.
 */
public class ReadExcel002UsePoi {
    public static void main(String[]args)throws Exception{
        test001();

    }
    public static void test() throws Exception {
        FileInputStream fis= new FileInputStream
                ("C:\\Users\\Administrator\\Desktop\\1\\linzhan.xls");
        POIFSFileSystem fs=new POIFSFileSystem(fis);
        //得到Excel对象
        HSSFWorkbook wb = new HSSFWorkbook(fs);
        //得到Excel的sheet对象//从0开始索引
        HSSFSheet sheet = wb.getSheetAt(0);
        //得到Excel工作表的行//从0开始索引
        HSSFRow row = sheet.getRow(3);
        //得到Excel工作表指定行的单元格//从0开始索引
        HSSFCell cell = row.getCell((short) 2);
        //打印cell里面的String,如果是Stringn的话
//        System.out.println(cell.getRichStringCellValue());
        HSSFCell cell001 = row.getCell((short) 1);
        //得到单元格样式
        HSSFCellStyle cellStyle = cell001.getCellStyle();
        //
//        System.out.println(cell001);
    }
    public static void test001() throws Exception {

        // 创建文件
        File file = new File("E:\\1\\000\\云平台问题\\A片标批量上传模板.xlsx");

        // 创建流
        InputStream input = new FileInputStream(file);
        //得到Excel对象
        XSSFWorkbook wb =  new XSSFWorkbook(input);

        //得到Excel的sheet对象//从0开始索引
        XSSFSheet sheet = wb.getSheetAt(0);
        XSSFDrawing drawing = sheet.getDrawingPatriarch();
        List<XSSFShape> xShapeList = drawing.getShapes();
        XSSFPicture xPicture = (XSSFPicture) xShapeList.get(0);
        int i=1;
        for(XSSFShape xs :xShapeList){
            XSSFPicture xsp = (XSSFPicture) xs;

//            System.out.println(xsp.getPictureData().getPackagePart().getPartName().getName());
            XSSFPictureData pictureData = xsp.getPictureData();
            // 获取图片索引
            String  picName=pictureData.toString();
//            System.out.println(picName);
            // 获取图片格式
            String ext = pictureData.suggestFileExtension();
//            System.out.println(ext);
//            System.out.println("D:\\pic" + picName + "." + ext);
            byte[] data = pictureData.getData();
            FileOutputStream out = new FileOutputStream("E:\\1\\00000\\"+i+".png");
            out.write(data);
            out.close();
            i++;
        }
    }
}