package com.winwin.picreport.Futils.excel.test;

import com.winwin.picreport.AllConstant.Cnst;
import com.winwin.picreport.Futils.p;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.jupiter.api.Test;

import java.io.FileOutputStream;
import java.util.UUID;

public class CreateANewExcel {
    @Test
    public void f(){
        try {
            Workbook workbook = new XSSFWorkbook();
            workbook.createSheet("Sheet1");

            String uuid= UUID.randomUUID().toString();
            FileOutputStream fileOut= new FileOutputStream(p.gp()
                    .sad(Cnst.deskPath)
                    .sad("tongyong")
                    .sad(Cnst.javaXieGang)
                    .sad(uuid)
                    .sad(Cnst.xlsxHouZhui).gad());
            workbook.write(fileOut);
            fileOut.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
