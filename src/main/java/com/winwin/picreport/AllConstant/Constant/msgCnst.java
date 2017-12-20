package com.winwin.picreport.AllConstant.Constant;

import com.winwin.picreport.Futils.MsgGenerate.MessageGenerate;

public enum msgCnst {
    fgf("============================================",0)
    ,failSave("保存失败",1)
    ,failSaveStatus("50",2)
    ,failGetExcelData("获取EXCEL文本数据失败",3)
    ,failGetExcelImg("获取excel图片失败",3-1)
    ,failOfDbMistake("数据库系统级别错误",4)
    ,excelHaveNoPicInThisRow("excel该行没有图片数据",5)
    ,excelHaveOnePicInThisRow("excel该行有一个图片数据需要保存",6)
    ,yourPicNameCanNotHaveIgll("您的图片名字不能包含有!符号或者;符号",7)
    ,yourPicNameCanNotHaveIgllStatus("34",8)

    ,picFailSaveOtherMsg("缩略图没有保存成功导致所有数据没保存",9)
    ,picFailSaveStatus("35",11)



    ,juTiQingKuangChaYueStatusDuiYingDeQingKuang("具体情况请查阅该status对应的信息",12)


    ,chanPinDaYangInsertOneDataSuccChMsg("编辑更新一条打样数据成功",13)
    ,chanPinDaYangInsertOneDataSuccMsg("保存成功",14)
    //excel导入打样成功我用了这个状态
    ,chanPinDaYangInsertOneDataSuccStatus("37",15)


    ,excelSaveFail("excel保存失败",16)
    //38产品打样失败,数据库系统级别错误
    ,excelSaveFailOfDbMistakeStatus("38",17)

    //用于excel导入打样异常返回后再解析成对象//打样成功 37  失败50   只有2种状态
    ,picFailSaveJson("{\"status\":\"50\",\"msg\":\"缩略图没有保存成功导致所有数据没保存\"}",11-1)
    //用于excel导入打样异常返回后再解析成对象//打样成功 37  失败50   只有2种状态
    ,excelSaveFailOfDbMistakeJson("{\"status\":\"50\",\"msg\":\"插入数据库数据的时候失败\",\"chMsg\":\"插入数据库数据的时候失败\"}",17-1)

    ;

    public Object value ;
    public int index ;



    msgCnst(Object value, int index) {
        this.value = value;
        this.index = index;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String  getValue() {

        return value.toString();
    }

    public int getIndex() {
        return index;
    }


}
