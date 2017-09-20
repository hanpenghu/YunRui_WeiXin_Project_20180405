package com.winwin.picreport.Ddao.reportxmlmapper;

import java.util.List;
import com.winwin.picreport.Edto.Prdt;
import com.winwin.picreport.Edto.PrdtExample;
import com.winwin.picreport.Edto.PrdtWithBLOBs;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface PrdtMapper {
    long countByExample(PrdtExample example);

    int deleteByExample(PrdtExample example);

    int deleteByPrimaryKey(String prdNo);

    int insert(PrdtWithBLOBs record);

    int insertSelective(PrdtWithBLOBs record);

    List<PrdtWithBLOBs> selectByExampleWithBLOBs(PrdtExample example);

    List<Prdt> selectByExample(PrdtExample example);

    PrdtWithBLOBs selectByPrimaryKey(String prdNo);

    int updateByExampleSelective(@Param("record") PrdtWithBLOBs record, @Param("example") PrdtExample example);

    int updateByExampleWithBLOBs(@Param("record") PrdtWithBLOBs record, @Param("example") PrdtExample example);

    int updateByExample(@Param("record") Prdt record, @Param("example") PrdtExample example);

    int updateByPrimaryKeySelective(PrdtWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(PrdtWithBLOBs record);

    int updateByPrimaryKey(Prdt record);
}