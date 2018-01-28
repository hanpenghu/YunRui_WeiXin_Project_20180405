package com.winwin.picreport.Futils.excel.huoQuTuPianWenZhiHeWenZiNengYongDe;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.*;

import com.winwin.picreport.AllConstant.Cnst;
import com.winwin.picreport.Futils.p;
import org.apache.poi.POIXMLDocumentPart;
import org.apache.poi.hssf.usermodel.HSSFClientAnchor;
import org.apache.poi.hssf.usermodel.HSSFPicture;
import org.apache.poi.hssf.usermodel.HSSFPictureData;
import org.apache.poi.hssf.usermodel.HSSFShape;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.PictureData;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFClientAnchor;
import org.apache.poi.xssf.usermodel.XSSFDrawing;
import org.apache.poi.xssf.usermodel.XSSFPicture;
import org.apache.poi.xssf.usermodel.XSSFShape;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.jupiter.api.Test;
import org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTMarker;

/**
 * @since 2013-04-22

 * @author Gerrard

 * 获取excel中 图片，并得到图片位置，支持03 07 多sheet

 */
public class GetImgFromExcel {

    /**
     *建造者
     * */

    public static GetImgFromExcel g(){
        return new GetImgFromExcel();
    }

    /**
     *得到图片数据和图片的单元格坐标(该坐标第一位是sheet号(从0)
     * ,第二位是行号(从0))
     * 第三位是列号(从0)
     * */
    public  List<Map<String, PictureData>> gPicZb(File file,List<Map<String, PictureData>> sheetList) throws IOException, InvalidFormatException {
        // 创建流
        InputStream input = new FileInputStream(file);

        // 获取文件后缀名
        String fileExt =  file.getName().substring(file.getName().lastIndexOf(Cnst.dian) + 1);

        // 创建Workbook
        Workbook wb = null;

        // 创建sheet
        Sheet sheet = null;

        //根据后缀判断excel 2003 or 2007+
        if (fileExt.equals(Cnst.xlsHouZhuiWuDian)) {
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~xls~~~~~~~~~~~~~~~~~~~~~~~~");
            wb = (HSSFWorkbook) WorkbookFactory.create(input);
        } else {
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~xlsx~~~~~~~~~~~~~~~~~~~~~~~~");
            wb = new XSSFWorkbook(input);
        }

        //获取excel sheet总数
        int sheetNumbers = wb.getNumberOfSheets();
System.out.println("~~~~~~~~~~sheetNumbers="+sheetNumbers+"~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        // sheet list
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        //2018_1_12   weekday(5)   11:03:42
        //暂时只支持一个sheet
        sheetNumbers=1;

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        // 循环sheet
        for (int i = 0; i < sheetNumbers; i++) {
System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~实验sheet~~~~~~~~~~~~~~~~~~~~~~~~");
            sheet = wb.getSheetAt(i);
            // map等待存储excel图片
            Map<String, PictureData> sheetIndexPicMap;

            // 判断用07还是03的方法获取图片
            if (fileExt.equals(Cnst.xlsHouZhuiWuDian)) {
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~实验xls~~~~~~~~~~~~~~~~~~~~~~~~");
                sheetIndexPicMap = this.getSheetPictrues03(i, (HSSFSheet) sheet, (HSSFWorkbook) wb);
            } else {
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~实验xlsx~~~~~~~~~~~~~~~~~~~~~~~~");
                sheetIndexPicMap = getSheetPictrues07(i, (XSSFSheet) sheet, (XSSFWorkbook) wb);
            }
            // 将当前sheet图片map存入list
            sheetList.add(sheetIndexPicMap);
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~实验sheetList.size="+sheetList.size()+"~~~~~~~~~~~~~~~~~~~~~~~~");
        return sheetList;
    }







    /**
     * @param-  args
     * @throws IOException
     * @throws InvalidFormatException
     */
    @Test
    public  void m1() throws InvalidFormatException, IOException {

        // 创建文件
        File file = new File("E:\\1\\000\\云平台问题\\A片标批量上传模板.xlsx");

        List<Map<String, PictureData>> list=new LinkedList<>();


        List<Map<String, PictureData>> sheetList=gPicZb(file,list);

        /**
         *0_1_5
         0_2_5
         0_3_5
         0_4_5
         0_5_5
         * */
        sheetList.forEach(v->{
            v.keySet().forEach(vv-> p.p(vv));
        });

          //将img写入文件夹中
//        printImg(sheetList);

    }

    /**
     * 获取Excel2003图片
     * @param sheetNum 当前sheet编号
     * @param sheet 当前sheet对象
     * @param workbook 工作簿对象
     * @return Map key:图片单元格索引（0_1_1）String，value:图片流PictureData
     * @throws IOException
     */
    public  Map<String, PictureData> getSheetPictrues03(int sheetNum,
                                                              HSSFSheet sheet, HSSFWorkbook workbook) {

        Map<String, PictureData> sheetIndexPicMap = new HashMap<String, PictureData>();
        List<HSSFPictureData> pictures = workbook.getAllPictures();
        if (pictures.size() != 0) {
            for (HSSFShape shape : sheet.getDrawingPatriarch().getChildren()) {
                HSSFClientAnchor anchor = (HSSFClientAnchor) shape.getAnchor();
                if (shape instanceof HSSFPicture) {
                    HSSFPicture pic = (HSSFPicture) shape;
                    int pictureIndex = pic.getPictureIndex() - 1;
                    HSSFPictureData picData = pictures.get(pictureIndex);
                    String picIndex = String.valueOf(sheetNum) + "_"
                            + String.valueOf(anchor.getRow1()) + "_"
                            + String.valueOf(anchor.getCol1());
                    sheetIndexPicMap.put(picIndex, picData);
                }
            }
            return sheetIndexPicMap;
        } else {
            return null;
        }
    }

    /**
     * 获取Excel2007图片
     * @param sheetNum 当前sheet编号
     * @param sheet 当前sheet对象
     * @param workbook 工作簿对象
     * @return Map key:图片单元格索引（0_1_1）String，value:图片流PictureData
     */
    public  Map<String, PictureData> getSheetPictrues07(int sheetNum,
                                                              XSSFSheet sheet,
                                                        XSSFWorkbook workbook) {
        Map<String, PictureData> sheetIndexPicMap = new HashMap<String, PictureData>();

        for (POIXMLDocumentPart dr : sheet.getRelations()) {
            if (dr instanceof XSSFDrawing) {
                XSSFDrawing drawing = (XSSFDrawing) dr;
                List<XSSFShape> shapes = drawing.getShapes();
                for (XSSFShape shape : shapes) {
                    XSSFPicture pic = (XSSFPicture) shape;
                    XSSFClientAnchor anchor = pic.getPreferredSize();
                    CTMarker ctMarker = anchor.getFrom();
                    String picIndex = String.valueOf(sheetNum) + "_"
                            + ctMarker.getRow() + "_" + ctMarker.getCol();
                    sheetIndexPicMap.put(picIndex, pic.getPictureData());
                }
            }
        }

        return sheetIndexPicMap;
    }

    public  void printImg(List<Map<String, PictureData>> sheetList) throws IOException {

        for (Map<String, PictureData> map : sheetList) {
            Object key[] = map.keySet().toArray();
            for (int i = 0; i < map.size(); i++) {
                // 获取图片流
                PictureData pic = map.get(key[i]);
                // 获取图片索引
                String picName = key[i].toString();
                // 获取图片格式
                String ext = pic.suggestFileExtension();

                byte[] data = pic.getData();

                FileOutputStream out = new FileOutputStream("D:\\pic" + picName + "." + ext);
                out.write(data);
                out.close();
            }
        }

    }

}