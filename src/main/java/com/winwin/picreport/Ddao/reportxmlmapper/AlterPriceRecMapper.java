package com.winwin.picreport.Ddao.reportxmlmapper;

import com.winwin.picreport.Edto.AlterPriceRec;
import com.winwin.picreport.Edto.AlterPriceRecExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AlterPriceRecMapper {
    long countByExample(AlterPriceRecExample example);

    int deleteByExample(AlterPriceRecExample example);

    int insert(AlterPriceRec record);

    int insertSelective(AlterPriceRec record);

    List<AlterPriceRec> selectByExample(AlterPriceRecExample example);

    int updateByExampleSelective(@Param("record") AlterPriceRec record, @Param("example") AlterPriceRecExample example);

    int updateByExample(@Param("record") AlterPriceRec record, @Param("example") AlterPriceRecExample example);
}