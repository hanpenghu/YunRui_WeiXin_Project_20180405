package com.winwin.picreport.Futils.excel.huoQuTuPianWenZhiHeWenZiNengYongDe;

import java.io.*;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import com.winwin.picreport.Futils.NotEmpty;
import com.winwin.picreport.Futils.hanhan.p;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 读取Excel
 *
 * @author zengwendong
 */
public class ReadExcelCotent {
    private Logger logger = LoggerFactory.getLogger(ReadExcelCotent.class);
    private Workbook wb;
    private Sheet sheet;
    private Row row;
    /**
     *建造者
     * */

    public static ReadExcelCotent g(File file){

        return new ReadExcelCotent(file);
    }

    public ReadExcelCotent(String filepath) {
        if(filepath==null){
            return;
        }
        String ext = filepath.substring(filepath.lastIndexOf("."));
        try {
            InputStream is = new FileInputStream(filepath);
            if(".xls".equals(ext)){
                wb = new HSSFWorkbook(is);
            }else if(".xlsx".equals(ext)){
                wb = new XSSFWorkbook(is);
            }else{
                wb=null;
            }
        } catch (FileNotFoundException e) {
            logger.error("FileNotFoundException", e);
        } catch (IOException e) {
            logger.error("IOException", e);
        }
    }





    public ReadExcelCotent(File file) {
        if(file==null){
            return;
        }
        String filepath=file.getName();
        String ext = filepath.substring(filepath.lastIndexOf("."));
        try {
            InputStream is = new FileInputStream(file);
            if(".xls".equals(ext)){
                wb = new HSSFWorkbook(is);
            }else if(".xlsx".equals(ext)){
                wb = new XSSFWorkbook(is);
            }else{
                wb=null;
            }
        } catch (FileNotFoundException e) {
            logger.error("FileNotFoundException", e);
        } catch (IOException e) {
            logger.error("IOException", e);
        }
    }

    /**
     * 读取Excel表格表头的内容
     *
     * @paramInputStream
     * @return String 表头内容的数组
     * @author zengwendong
     */
    public String[] readExcelTitle() throws Exception{
        if(wb==null){
            throw new Exception("Workbook对象为空！");
        }
        sheet = wb.getSheetAt(0);
        row = sheet.getRow(0);
        // 标题总列数
        int colNum = row.getPhysicalNumberOfCells();
        System.out.println("colNum:" + colNum);
        String[] title = new String[colNum];
        for (int i = 0; i < colNum; i++) {
            // title[i] = getStringCellValue(row.getCell((short) i));
            title[i] = row.getCell(i).getCellFormula();
        }
        return title;
    }

    /**
     * 读取Excel数据内容
     *
     * @paramInputStream
     * @return Map 包含单元格数据内容的Map对象
     * @author zengwendong
     */
    public Map<Integer, Map<Integer,Object>> readExcelContent() throws Exception{
        if(wb==null){
            throw new Exception("Workbook对象为空！");
        }
        Map<Integer, Map<Integer,Object>> content = new HashMap<Integer, Map<Integer,Object>>();

        //暂时只支持第一个sheet//暂时只支持一个sheet
        sheet = wb.getSheetAt(0);
        // 得到总行数
        int rowNum = sheet.getLastRowNum();
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        //下面的循环是为了去除空行,以从0开始第六列为准,如果是空的,代表本行都是空的
        //第六列
        int ak47=0;
        while(true){
            String str = null;
            try {
                str = sheet.getRow(ak47).getCell(6).getRichStringCellValue().getString();
            } catch (Exception e) {}
            if(NotEmpty.notEmpty(str)){
                ak47++;
            }else {
                rowNum=ak47-1;//注意rowNum是从0开始的
                break;
            }
        }
        p.p(p.gp().sad(p.dexhx).sad("ak47=").sad(p.strValeOf(ak47)).sad(p.dexhx).gad());
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////



        row = sheet.getRow(0);
        int colNum = row.getPhysicalNumberOfCells();



//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //暂时列数固定为12列2018_1_12   weekday(5)   11:21:39//因为老郑说后面多出来东西要没事情才行
        //后来表头加了两个英文后如下
        //品牌	客户	产品分类	产品名称	产品负责人	图片	编号	颜色	尺寸	打样时间	Category	Team	产品要求	产品描述
        colNum=14;
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////




        // 正文内容应该从第二行开始,第一行为表头的标题
        for (int i = 1; i <= rowNum; i++) {
            row = sheet.getRow(i);
            int j = 0;
            Map<Integer,Object> cellValue = new HashMap<Integer, Object>();
            while (j < colNum) {
                Object obj = getCellFormatValue(row.getCell(j));
                cellValue.put(j, obj);
                j++;
            }
            content.put(i, cellValue);
        }
        return content;
    }

    /**
     *
     * 根据Cell类型设置数据
     *
     * @param cell
     * @return
     * @author zengwendong
     */
    private Object getCellFormatValue(Cell cell) {
        Object cellvalue = "";
        if (cell != null) {
            // 判断当前Cell的Type
            switch (cell.getCellType()) {
                case Cell.CELL_TYPE_NUMERIC:// 如果当前Cell的Type为NUMERIC
                case Cell.CELL_TYPE_FORMULA: {
                    // 判断当前的cell是否为Date
                    if (DateUtil.isCellDateFormatted(cell)) {
                        // 如果是Date类型则，转化为Data格式
                        // data格式是带时分秒的：2013-7-10 0:00:00
                        // cellvalue = cell.getDateCellValue().toLocaleString();
                        // data格式是不带带时分秒的：2013-7-10
                        Date date = cell.getDateCellValue();
                        cellvalue = date;
                    } else {// 如果是纯数字

                        // 取得当前Cell的数值
                        cellvalue = String.valueOf(cell.getNumericCellValue());
                    }
                    break;
                }
                case Cell.CELL_TYPE_STRING:// 如果当前Cell的Type为STRING
                    // 取得当前的Cell字符串
                    cellvalue = cell.getRichStringCellValue().getString();
                    break;
                default:// 默认的Cell值
                    cellvalue = "";
            }
        } else {
            cellvalue = "";
        }
        return cellvalue;
    }

    public static void main(String[] args) {
        try {
            String filepath = "E:\\1\\000\\云平台问题\\A片标批量上传模板.xlsx";
            File file=new File(filepath);
            ReadExcelCotent excelReader = new ReadExcelCotent(file);
            // 对读取Excel表格标题测试
//          String[] title = excelReader.readExcelTitle();
//          System.out.println("获得Excel表格的标题:");
//          for (String s : title) {
//              System.out.print(s + " ");
//          }

            // 对读取Excel表格内容测试
            Map<Integer, Map<Integer,Object>> map = excelReader.readExcelContent();
            System.out.println("获得Excel表格的内容:");
            for (int i = 1; i <= map.size(); i++) {
                System.out.println(map.get(i));
            }
        } catch (FileNotFoundException e) {
            System.out.println("未找到指定路径的文件!");
            e.printStackTrace();
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}