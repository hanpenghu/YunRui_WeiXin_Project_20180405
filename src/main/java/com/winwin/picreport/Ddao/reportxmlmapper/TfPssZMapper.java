package com.winwin.picreport.Ddao.reportxmlmapper;

import com.winwin.picreport.Edto.TfPssZ;
import com.winwin.picreport.Edto.TfPssZExample;
import com.winwin.picreport.Edto.TfPssZKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TfPssZMapper {
    long countByExample(TfPssZExample example);

    int deleteByExample(TfPssZExample example);

    int deleteByPrimaryKey(TfPssZKey key);

    int insert(TfPssZ record);

    int insertSelective(TfPssZ record);

    List<TfPssZ> selectByExampleWithBLOBs(TfPssZExample example);

    List<TfPssZ> selectByExample(TfPssZExample example);

    TfPssZ selectByPrimaryKey(TfPssZKey key);

    int updateByExampleSelective(@Param("record") TfPssZ record, @Param("example") TfPssZExample example);

    int updateByExampleWithBLOBs(@Param("record") TfPssZ record, @Param("example") TfPssZExample example);

    int updateByExample(@Param("record") TfPssZ record, @Param("example") TfPssZExample example);

    int updateByPrimaryKeySelective(TfPssZ record);

    int updateByPrimaryKeyWithBLOBs(TfPssZ record);

    int updateByPrimaryKey(TfPssZ record);
}