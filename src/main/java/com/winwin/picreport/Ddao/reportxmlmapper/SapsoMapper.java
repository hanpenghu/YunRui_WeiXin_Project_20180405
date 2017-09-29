package com.winwin.picreport.Ddao.reportxmlmapper;

import java.util.List;
import com.winwin.picreport.Edto.Sapso;
import com.winwin.picreport.Edto.SapsoExample;
import org.apache.ibatis.annotations.Param;

public interface SapsoMapper {
    long countByExample(SapsoExample example);

    int deleteByExample(SapsoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Sapso record);

    int insertSelective(Sapso record);

    List<Sapso> selectByExample(SapsoExample example);

    Sapso selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Sapso record, @Param("example") SapsoExample example);

    int updateByExample(@Param("record") Sapso record, @Param("example") SapsoExample example);

    int updateByPrimaryKeySelective(Sapso record);

    int updateByPrimaryKey(Sapso record);
}