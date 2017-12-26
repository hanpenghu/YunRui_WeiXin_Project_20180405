package com.winwin.picreport.Ddao.reportxmlmapper;

import com.winwin.picreport.Edto.PrdtSamp;
import com.winwin.picreport.Edto.PrdtSampExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

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
    @Update("update prdt_samp set thum=#{newthums} where thum like #{thumInDataBase}")
    int updateThumColumn(@Param("thumInDataBase") String thumInDataBase, @Param("newthums") String newthums);

    @Update("update prdt_samp set attach=#{newattachs} where attach like #{attachInDataBase}")
    int updateAttachColumn(@Param("attachInDataBase") String attachInDataBase, @Param("newattachs") String newattachs);
    //test PageBean
    @Select("Select count(id) from prdt_Samp")
    int countItem();
    //testPageBean
    @Select("Select * from prdt_Samp order by id DESC")
    List<PrdtSamp> findAll();
}