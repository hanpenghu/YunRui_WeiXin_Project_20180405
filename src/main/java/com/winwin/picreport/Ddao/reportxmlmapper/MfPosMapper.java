package com.winwin.picreport.Ddao.reportxmlmapper;

import java.util.List;
import com.winwin.picreport.Edto.MfPos;
import com.winwin.picreport.Edto.MfPosExample;
import com.winwin.picreport.Edto.MfPosKey;
import com.winwin.picreport.Edto.MfPosWithBLOBs;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface MfPosMapper {
    long countByExample(MfPosExample example);

    int deleteByExample(MfPosExample example);

    int deleteByPrimaryKey(MfPosKey key);

    int insert(MfPosWithBLOBs record);

    int insertSelective(MfPosWithBLOBs record);

    List<MfPosWithBLOBs> selectByExampleWithBLOBs(MfPosExample example);

    List<MfPos> selectByExample(MfPosExample example);

    MfPosWithBLOBs selectByPrimaryKey(MfPosKey key);

    int updateByExampleSelective(@Param("record") MfPosWithBLOBs record, @Param("example") MfPosExample example);

    int updateByExampleWithBLOBs(@Param("record") MfPosWithBLOBs record, @Param("example") MfPosExample example);

    int updateByExample(@Param("record") MfPos record, @Param("example") MfPosExample example);

    int updateByPrimaryKeySelective(MfPosWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(MfPosWithBLOBs record);

    int updateByPrimaryKey(MfPos record);
}