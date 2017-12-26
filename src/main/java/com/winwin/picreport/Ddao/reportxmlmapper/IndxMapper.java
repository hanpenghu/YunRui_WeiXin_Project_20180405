package com.winwin.picreport.Ddao.reportxmlmapper;

import com.winwin.picreport.Edto.Indx;
import com.winwin.picreport.Edto.IndxExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IndxMapper {
    long countByExample(IndxExample example);

    int deleteByExample(IndxExample example);

    int deleteByPrimaryKey(String idxNo);

    int insert(Indx record);

    int insertSelective(Indx record);

    List<Indx> selectByExampleWithBLOBs(IndxExample example);

    List<Indx> selectByExample(IndxExample example);

    Indx selectByPrimaryKey(String idxNo);

    int updateByExampleSelective(@Param("record") Indx record, @Param("example") IndxExample example);

    int updateByExampleWithBLOBs(@Param("record") Indx record, @Param("example") IndxExample example);

    int updateByExample(@Param("record") Indx record, @Param("example") IndxExample example);

    int updateByPrimaryKeySelective(Indx record);

    int updateByPrimaryKeyWithBLOBs(Indx record);

    int updateByPrimaryKey(Indx record);
}