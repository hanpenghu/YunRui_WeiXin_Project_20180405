package com.winwin.picreport.Ddao.reportxmlmapper;

import com.winwin.picreport.Edto.TfPss;
import com.winwin.picreport.Edto.TfPssExample;
import com.winwin.picreport.Edto.TfPssKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TfPssMapper {
    long countByExample(TfPssExample example);

    int deleteByExample(TfPssExample example);

    int deleteByPrimaryKey(TfPssKey key);

    int insert(TfPss record);

    int insertSelective(TfPss record);

    List<TfPss> selectByExampleWithBLOBs(TfPssExample example);

    List<TfPss> selectByExample(TfPssExample example);

    TfPss selectByPrimaryKey(TfPssKey key);

    int updateByExampleSelective(@Param("record") TfPss record, @Param("example") TfPssExample example);

    int updateByExampleWithBLOBs(@Param("record") TfPss record, @Param("example") TfPssExample example);

    int updateByExample(@Param("record") TfPss record, @Param("example") TfPssExample example);

    int updateByPrimaryKeySelective(TfPss record);

    int updateByPrimaryKeyWithBLOBs(TfPss record);

    int updateByPrimaryKey(TfPss record);
}