package com.winwin.picreport.Ddao.reportxmlmapper;

import com.winwin.picreport.Edto.CurId;
import com.winwin.picreport.Edto.CurIdExample;
import com.winwin.picreport.Edto.CurIdKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CurIdMapper {
    long countByExample(CurIdExample example);

    int deleteByExample(CurIdExample example);

    int deleteByPrimaryKey(CurIdKey key);

    int insert(CurId record);

    int insertSelective(CurId record);

    List<CurId> selectByExampleWithBLOBs(CurIdExample example);

    List<CurId> selectByExample(CurIdExample example);

    CurId selectByPrimaryKey(CurIdKey key);

    int updateByExampleSelective(@Param("record") CurId record, @Param("example") CurIdExample example);

    int updateByExampleWithBLOBs(@Param("record") CurId record, @Param("example") CurIdExample example);

    int updateByExample(@Param("record") CurId record, @Param("example") CurIdExample example);

    int updateByPrimaryKeySelective(CurId record);

    int updateByPrimaryKeyWithBLOBs(CurId record);

    int updateByPrimaryKey(CurId record);
}