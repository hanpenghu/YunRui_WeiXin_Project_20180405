package com.winwin.picreport.Futils.excelHan;
import org.apache.poi.POIXMLDocumentPart;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.*;
import org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTMarker;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;
/**
 *注意整个工具的核心框架是 excel的要求:
 * 1  sheet必须只有一个,即sheet的索引只有0
 * 2  必须有表头,就是第一行是表头,计算是从第二行(索引是1)算有效数据的
 * 3  以每一行为一个单位,就是说把Excel的一行看成一条将要入数据库的一条数据来看待
 * */
public class Excel2007 {

    public static void main(String[]args) throws IOException {
        File file=new File("E:/1/000/云平台问题/A片标批量上传打样模板.xlsx");
//        List<ExcelPicTemplate> excelPic = Excel2007.getExcelPic(file);
//        System.out.println(excelPic);
//        List<List<ExcelTxtTemplate>> excelTxt = Excel2007.getExcelTxt(file);
//        System.out.println(excelTxt);
        List<ExcelPicTxtTemplate> excelPicTxt = Excel2007.getExcelPicTxt(file);
        System.out.println(excelPicTxt);

    }

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //建造者
    public static Excel2007 g(){
        return new Excel2007();
    }
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //得到所有行的文本和图片的list
    public static List<ExcelPicTxtTemplate> getExcelPicTxt(File excelFile)
            throws IOException {
        //得到所有的文本行
        List<List<ExcelTxtTemplate>> excelTxt = Excel2007.getExcelTxt(excelFile);
        //得到所有的带属性的图片
        List<ExcelPicTemplate> excelPic = Excel2007.getExcelPic(excelFile);
        List<ExcelPicTxtTemplate> list=new LinkedList<>();
        for(List<ExcelTxtTemplate> list1:excelTxt){
            //注意一个list1代表excel中的一行数据
            ExcelPicTxtTemplate eptt=new ExcelPicTxtTemplate();
            eptt.setTxtRowList(list1);
            ExcelTxtTemplate excelTxtTemplate = list1.get(0);
            int txtSheetNum = excelTxtTemplate.getTxtSheetNum();
            int txtRowNum = excelTxtTemplate.getTxtRowNum();
            List<ExcelPicTemplate> txtRowPicDataList=new LinkedList<>();
            for(ExcelPicTemplate ept:excelPic){
                int picRowNum = ept.getPicRowNum();
                int picSheetNum = ept.getPicSheetNum();
                if(txtSheetNum==picSheetNum&&txtRowNum==picRowNum){
                    txtRowPicDataList.add(ept);
                }
            }
            eptt.setTxtRowPicDataList(txtRowPicDataList);
            list.add(eptt);
        }
        return list;
    }

    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //注意内层的List<ExcelTxtTemplate>代表了一行,外层的List<List<ExcelTxtTemplate>>代表所有行,就是整个sheet内容
    //其实是从索引为1的行开始存入,因为第一行为表头
    public static List<List<ExcelTxtTemplate>>
        getExcelTxt(File excelFile)
                throws IOException {
        // 创建流
        InputStream input = new FileInputStream(excelFile);
        // 获取文件后缀名(不带点)
        String fileExt =  excelFile.getName()
                .substring(excelFile.getName().lastIndexOf(".") + 1);
        if ("xlsx".equals(fileExt)) {
            //继续,不做任何处理
            System.out.println("-------文件名字是："+excelFile.getName()+"---------");
        }else{
            System.out.println("------你的Excel不是2007以上版本或者根本不是excel-----");
            throw new RuntimeException("你的xlsx不是2007以上版本或者根本不是excel");
        }
        // 创建Workbook,就是整个excel
        Workbook wb  = new XSSFWorkbook(input);
        // 创建sheet,默认只有一个sheet
        Sheet sheet0  = wb.getSheetAt(0);
        //变成2007以上版本的Sheet
        XSSFSheet sheet=(XSSFSheet)sheet0;
        //////////////通过表头找到总列数////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //得到第一行表头,为将来判断有几列做准备
        XSSFRow row0 = sheet.getRow(0);
        int zongLieShu=0;
        while(true){
            String str = null;
            try {
                str = row0.getCell(zongLieShu).getRichStringCellValue().getString();
            } catch (Exception e) {}
            if(null!=str&&!"".equals(str)){
                zongLieShu++;
            }else {
                zongLieShu=zongLieShu;//注意zongLieShu是从1开始数的总列数
                break;
            }
        }
        System.out.println("------总列数是: "+zongLieShu+"-----------------");
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        // 得到总行数//包括表头的,从0开始的索引
        int rowNum = sheet.getLastRowNum();
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //下面的循环是为了去除空行,以从0开始所有列为准,如果不都是空的,代表本行有数据
        int ak47=0;//ak47代表某一行//最后ak47++后代表的是行数的所有索引
        while(true){
            String str = null;
            //将来用来判断某一行是否都是空的内容集合
            List<String>strs=new ArrayList<>();
            try {
                for(int i=0;i<zongLieShu;i++){
                    str = sheet.getRow(ak47).getCell(i).getRichStringCellValue().getString();
                    strs.add(str);
                }
            } catch (Exception e) {}
            if(notAllEmpty(strs.toArray())){//不是所有的都为空的,意思是只要有不是空的
                ak47++;
            }else {
                rowNum=ak47;////注意rowNum是从1开始数的总行数
                break;
            }
        }
        System.out.println("---该sheet有文字的行数是:"+rowNum+"----");
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //创建存储文本及其属性的list//存储所有列
        List<List<ExcelTxtTemplate>> txtss=new LinkedList<>();
        // 正文内容应该从第二行(索引为1)开始,第一行为表头的标题
        for (int i = 1; i < rowNum; i++) {
            XSSFRow row = sheet.getRow(i);
            //存储某一列
            List<ExcelTxtTemplate>txts=new LinkedList<>();
            //注意zongLieShu其实是总列数,所以我们列的索引是从0开始
            for(int j=0;j<zongLieShu;j++){
                ExcelTxtTemplate ett=new ExcelTxtTemplate();
                XSSFCell cell = row.getCell(j);
                String txt ="";

                if (cell != null) {
                    // 判断当前Cell的Type
                    switch (cell.getCellType()) {
                        case Cell.CELL_TYPE_NUMERIC:// 如果当前Cell的Type为NUMERIC//如果case中没有break,那么下面继续执行case但是不再判断条件
                        case Cell.CELL_TYPE_FORMULA: {
                            // 判断当前的cell是否为Date
                            if (DateUtil.isCellDateFormatted(cell)) {
                                // 如果是Date类型则，转化为Data格式
                                // data格式是带时分秒的：2013-7-10 0:00:00
                                // cellvalue = cell.getDateCellValue().toLocaleString();
                                // data格式是不带带时分秒的：2013-7-10
                                Date date = cell.getDateCellValue();
                                txt = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(date);
                            } else {// 如果是纯数字

                                // 取得当前Cell的数值
                                txt = String.valueOf(cell.getNumericCellValue());
                            }
                            break;
                        }
                        case Cell.CELL_TYPE_STRING:// 如果当前Cell的Type为STRING
                            // 取得当前的Cell字符串
                            txt = cell.getRichStringCellValue().getString();
                            break;
                        default:// 默认的Cell值
                            txt = "";
                    }
                } else {
                    txt = "";
                }

                ett.setTxt(txt);
                ett.setTxtRowNum(i);
                ett.setTxtColumnNum(j);
                //sheet固定是第0个索引
                ett.setTxtSheetNum(0);
                //下面是找该单元格对应的表头
                XSSFRow row1 = sheet.getRow(0);
                String txtColumnNameOfTableHead = row1.getCell(j).getRichStringCellValue().getString();
                ett.setTxtColumnNameOfTableHead(txtColumnNameOfTableHead);
                txts.add(ett);
            }
            //将某一列放入整个sheet的list里面,一行一放
            txtss.add(txts);
        }
        input.close();
        return txtss;
    }


//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


    //得到图片及其属性,本方法只适用于只有一个sheet的excel,并且适用于必须有表头的Excel
    //注意写死了sheet索引是0,只支持只有一个sheet的excel
    //注意row行从0开始索引
    //注意column列也是从0开始索引
    public static List<ExcelPicTemplate>
        getExcelPic(File excelFile)
            throws IOException {
        // 创建流
        InputStream input = new FileInputStream(excelFile);
        // 获取文件后缀名(不带点)
        String fileExt =  excelFile.getName()
                .substring(excelFile.getName().lastIndexOf(".") + 1);
        if ("xlsx".equals(fileExt)) {
            //继续,不做任何处理
            System.out.println("-------文件名字是："+fileExt+"---------");
        }else{
            System.out.println("------你的Excel不是2007以上版本或者根本不是excel-----");
            throw new RuntimeException("你的xlsx不是2007以上版本或者根本不是excel");
        }
        // 创建Workbook,就是整个excel
        Workbook wb  = new XSSFWorkbook(input);
        // 创建sheet,默认只有一个sheet
        Sheet sheet0  = wb.getSheetAt(0);
        //变成2007以上版本的Sheet
        XSSFSheet sheet=(XSSFSheet)sheet0;
        //创建存储图片及其属性的list
        List<ExcelPicTemplate> pics=new ArrayList();
        for (POIXMLDocumentPart dr : sheet.getRelations()) {
            //循环sheet里面的所有图片
            if (dr instanceof XSSFDrawing) {
                //如果是图片继续执行
                //得到所有的图像
                XSSFDrawing drawing = (XSSFDrawing) dr;
                //得到所有图片
                List<XSSFShape> shapes = drawing.getShapes();
                for (XSSFShape shape : shapes) {
                    //循环所有图像
                    //得到xlsx图片
                    XSSFPicture pic = (XSSFPicture) shape;
                    //得到图片作者
                    XSSFClientAnchor anchor = pic.getPreferredSize();
                    //得到图片的标志
                    CTMarker ctMarker = anchor.getFrom();
                    //得到图片二进制数据
                    PictureData pictureData = pic.getPictureData();
                    //得到图片所在行
                    int row = ctMarker.getRow();
                    //得到图片所在列
                    int col = ctMarker.getCol();
                    ExcelPicTemplate ept=new ExcelPicTemplate();
                    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
                    //下面是找到picColumnName(该图片所在的表头内容)
                    //表头是第0行
                    int biaoTouRow=0;
                    //当前图片所在的表头列
                    int biaoTouCol=col;
                    //得到图片所在的表头的行数据
                    Row rowTxtData = sheet.getRow(biaoTouRow);
                    //得到图片所在的表头的单元格数据
                    Cell cell = rowTxtData.getCell(biaoTouCol);
                    // 取得当前的Cell字符串//图片对应的表头内容
                    String cellvalue = cell.getRichStringCellValue().getString();
                    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
                    //设置图片所在表头的内容
                    ept.setPicColumnNameOfTableHead(cellvalue);
                    //设置图片二进制数据
                    ept.setPictureData(pictureData);
                    //第0个sheet索引
                    ept.setPicSheetNum(0);
                    //设置列号
                    ept.setPicColumnNum(col);
                    //设置行号
                    ept.setPicRowNum(row);
                    //将当前的图片及其属性放到list集合
                    pics.add(ept);
                }
            }else{
                //如果不是图片就抛出异常
                System.out.println("------这个图像不是图片,继续寻找下一个-------");
            }

        }
        input.close();
        return pics;
    }




//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    /**
     *以下是空判断和非空判断以及所有非空判断和所有空的判断,如果是包含空的
     * 判断请用   !allNotEmpty
     * */

    public static boolean empty(Object ob){

        if(notEmpty(ob)){
            return false;
        }else{
            return true;
        }

    }




    public static boolean notEmpty(Object ob){
        if(ob==null){
            return false;
        }else{
            if(ob instanceof String){
                if("".equals(ob)){return false;}else{return true;}
            }else if(ob instanceof Collection){
                if(((Collection) ob).size()>0){return true;}else{return false;}
            }else if(ob instanceof Map){
                if(((Map) ob).size()>0){return true;}else{return false;}
            }/*else if(ob instanceof JSONObject){
                if(((JSONObject) ob).isEmpty()){return false;}else{
                    if(((JSONObject) ob).size()==0){return false;}else{return true;}
                }
            }else if(ob instanceof JSONArray){
                if(((JSONArray) ob).isEmpty()){return false;}else{
                    if(((JSONArray) ob).size()==0){return false;}else{return true;}
                }
            }*/else{return true;}
        }
    }

    //所有的非空
    public static boolean allNotEmpty(Object[ ]obs){
        for(Object ob:obs){
            if(!notEmpty(ob)){return false;}
        }
        return true;
    }

    //不是所有的是空的,有不为空的
    public static boolean notAllEmpty(Object[ ]obs){
        int i=0;
        for(Object ob:obs){
            if(notEmpty(ob)){i++;}
        }
        if(i>0){
            return true;
        }else{
            return false;
        }

    }
    //测试notAllEmpty
//    public static void main(String[]args){
//           p.p(notAllEmpty(p.gp().setArl("1").setArl(null).getArl().toArray()));
//    }

    public static boolean allEmpty(Object[ ]obs){
        for(int i=1;i<=obs.length;i++){
            /**
             *循环所有,如果有一个不是空的,就代表有不是空的,不是所有是空的,返回false
             * */
            if(notEmpty(obs[i])){
                return false;
            }
            /**
             *如果到了最后一个,也是空的,就返回true,代表所有的都空了
             * */
            if(empty(obs[i])&&i==obs.length){
                return true;
            }
        }
        return false;
    }


//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

}
