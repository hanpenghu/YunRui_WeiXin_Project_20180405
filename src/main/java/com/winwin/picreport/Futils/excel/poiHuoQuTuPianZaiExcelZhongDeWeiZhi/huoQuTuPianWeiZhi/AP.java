package com.winwin.picreport.Futils.excel.poiHuoQuTuPianZaiExcelZhongDeWeiZhi.huoQuTuPianWeiZhi;

import com.winwin.picreport.Futils.excel.poiHuoQuTuPianZaiExcelZhongDeWeiZhi.jiSuanZhongXinWeiZhi.MyPictureData;
import org.apache.poi.ddf.EscherClientAnchorRecord;
import org.apache.poi.ddf.EscherRecord;
import org.apache.poi.hssf.record.EscherAggregate;
import org.apache.poi.hssf.usermodel.HSSFPictureData;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Workbook;
import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AP {

    private HSSFSheet sheet;
    private EscherRecord escherRecord;
    private int level;
    private List<ClientAnchorInfo> list;

    /**
     ****************************************************************************************
     * */
    /**
     *建造者
     * */
    public static AP  g(){
        return new AP();
    }
    /**
     ****************************************************************************************
     * */
//    @Test
//    public void  f() throws IOException {
//        InputStream is = new FileInputStream(filepath);
//        HSSFWorkbook wb = new HSSFWorkbook(is);
//        AP.g().getAllPictures(wb);
//    }
    /**
     ****************************************************************************************
     * */
    public HSSFSheet getSheet() {
        return sheet;
    }

    public AP setSheet(HSSFSheet sheet) {
        this.sheet = sheet;
        return this;
    }

    public EscherRecord getEscherRecord() {
        return escherRecord;
    }

    public AP setEscherRecord(EscherRecord escherRecord) {
        this.escherRecord = escherRecord;
        return this;
    }

    public int getLevel() {
        return level;
    }

    public AP setLevel(int level) {
        this.level = level;
        return this;
    }

    public List<ClientAnchorInfo> getList() {
        return list;
    }

    public AP setList(List<ClientAnchorInfo> list) {
        this.list = list;
        return this;
    }

    /**
     ****************************************************************************************
     * */
    public static List<MyPictureData> getAllPictures(HSSFWorkbook workbook) {
        List<MyPictureData> list = new ArrayList<>();

        List<HSSFPictureData> pictureList = workbook.getAllPictures();
        List<ClientAnchorInfo> clientAnchorRecords = getClientAnchorRecords(workbook);

        if (pictureList.size() != clientAnchorRecords.size()) {
            throw new RuntimeException("解析文件中的图片信息出错，找到的图片数量和图片位置信息数量不匹配");
        }

        for (int i = 0; i < pictureList.size(); i++) {
            HSSFPictureData pictureData = pictureList.get(i);
            ClientAnchorInfo anchor = clientAnchorRecords.get(i);
            HSSFSheet sheet = anchor.sheet;
            EscherClientAnchorRecord clientAnchorRecord = anchor.clientAnchorRecord;
            list.add(new MyPictureData(workbook, sheet, pictureData, clientAnchorRecord));
        }

        return list ;
    }

    private static class ClientAnchorInfo {
        public HSSFSheet sheet;
        public EscherClientAnchorRecord clientAnchorRecord;

        public ClientAnchorInfo(HSSFSheet sheet, EscherClientAnchorRecord clientAnchorRecord) {
            super();
            this.sheet = sheet;
            this.clientAnchorRecord = clientAnchorRecord;
        }
    }
    private static List<ClientAnchorInfo> getClientAnchorRecords(HSSFWorkbook workbook) {
        List<ClientAnchorInfo> list1 = new ArrayList<ClientAnchorInfo>();

        EscherAggregate drawingAggregate = null;
        HSSFSheet sheet1 = null;
        List<EscherRecord> recordList = null;
        Iterator<EscherRecord> recordIter = null;
        int numSheets = workbook.getNumberOfSheets();
        for(int i = 0; i < numSheets; i++) {
            sheet1 = workbook.getSheetAt(i);
            drawingAggregate = sheet1.getDrawingEscherAggregate();
            if(drawingAggregate != null) {
                recordList = drawingAggregate.getEscherRecords();
                recordIter = recordList.iterator();
                while(recordIter.hasNext()) {
                    AP ap = AP.g().setSheet(sheet1).setEscherRecord(recordIter.next()).setLevel(1).setList(list1);
                    getClientAnchorRecords(ap);
                }
            }
        }

        return list1;
    }

    private static void getClientAnchorRecords(AP ap) {
        List<EscherRecord> recordList = null;
        Iterator<EscherRecord> recordIter = null;
        EscherRecord childRecord = null;
        recordList = ap.getEscherRecord().getChildRecords();
        recordIter = recordList.iterator();
        while(recordIter.hasNext()) {
            childRecord = recordIter.next();
            if(childRecord instanceof EscherClientAnchorRecord) {
                ClientAnchorInfo e = new ClientAnchorInfo(ap.getSheet(), (EscherClientAnchorRecord) childRecord);
                ap.getList().add(e);
            }
            if(childRecord.getChildRecords().size() > 0) {
                getClientAnchorRecords(ap);
            }
        }
    }











}
