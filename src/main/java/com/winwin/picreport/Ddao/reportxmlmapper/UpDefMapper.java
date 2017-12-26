package com.winwin.picreport.Ddao.reportxmlmapper;

import com.winwin.picreport.Edto.UpDef;
import com.winwin.picreport.Edto.UpDefExample;
import com.winwin.picreport.Edto.UpDefKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UpDefMapper {
    long countByExample(UpDefExample example);

    int deleteByExample(UpDefExample example);

    int deleteByPrimaryKey(UpDefKey key);

    int insert(UpDef record);

    int insertSelective(UpDef record);

    List<UpDef> selectByExample(UpDefExample example);

    UpDef selectByPrimaryKey(UpDefKey key);

    int updateByExampleSelective(@Param("record") UpDef record, @Param("example") UpDefExample example);

    int updateByExample(@Param("record") UpDef record, @Param("example") UpDefExample example);

    int updateByPrimaryKeySelective(UpDef record);

    int updateByPrimaryKey(UpDef record);
}