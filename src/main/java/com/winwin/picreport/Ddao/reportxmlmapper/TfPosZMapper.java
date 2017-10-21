package com.winwin.picreport.Ddao.reportxmlmapper;


import com.winwin.picreport.Edto.TfPosZ;
import com.winwin.picreport.Edto.TfPosZExample;
import com.winwin.picreport.Edto.TfPosZKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TfPosZMapper {
    long countByExample(TfPosZExample example);

    int deleteByExample(TfPosZExample example);

    int deleteByPrimaryKey(TfPosZKey key);

    int insert(TfPosZ record);

    int insertSelective(TfPosZ record);

    List<TfPosZ> selectByExampleWithBLOBs(TfPosZExample example);

    List<TfPosZ> selectByExample(TfPosZExample example);

    TfPosZ selectByPrimaryKey(TfPosZKey key);

    int updateByExampleSelective(@Param("record") TfPosZ record, @Param("example") TfPosZExample example);

    int updateByExampleWithBLOBs(@Param("record") TfPosZ record, @Param("example") TfPosZExample example);

    int updateByExample(@Param("record") TfPosZ record, @Param("example") TfPosZExample example);

    int updateByPrimaryKeySelective(TfPosZ record);

    int updateByPrimaryKeyWithBLOBs(TfPosZ record);

    int updateByPrimaryKey(TfPosZ record);
}