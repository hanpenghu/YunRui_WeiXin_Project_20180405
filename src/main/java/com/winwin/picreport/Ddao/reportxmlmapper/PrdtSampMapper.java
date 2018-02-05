package com.winwin.picreport.Ddao.reportxmlmapper;

import com.winwin.picreport.Edto.PrdtSamp;
import com.winwin.picreport.Edto.PrdtSampExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PrdtSampMapper {
    long countByExample(PrdtSampExample example);

    int deleteByExample(PrdtSampExample example);

    int deleteByPrimaryKey(String id);

    int insert(PrdtSamp record);

    int insertSelective(PrdtSamp record);

    List<PrdtSamp> selectByExample(PrdtSampExample example);

    PrdtSamp selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") PrdtSamp record, @Param("example") PrdtSampExample example);

    int updateByExample(@Param("record") PrdtSamp record, @Param("example") PrdtSampExample example);

    int updateByPrimaryKeySelective(PrdtSamp record);

    int updateByPrimaryKey(PrdtSamp record);
}