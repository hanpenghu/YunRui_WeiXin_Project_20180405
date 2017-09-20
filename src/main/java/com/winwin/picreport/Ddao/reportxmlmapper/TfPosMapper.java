package com.winwin.picreport.Ddao.reportxmlmapper;

import java.util.List;
import com.winwin.picreport.Edto.TfPos;
import com.winwin.picreport.Edto.TfPosExample;
import com.winwin.picreport.Edto.TfPosKey;
import com.winwin.picreport.Edto.TfPosWithBLOBs;
import org.apache.ibatis.annotations.Param;

public interface TfPosMapper {
    long countByExample(TfPosExample example);

    int deleteByExample(TfPosExample example);

    int deleteByPrimaryKey(TfPosKey key);

    int insert(TfPosWithBLOBs record);

    int insertSelective(TfPosWithBLOBs record);

    List<TfPosWithBLOBs> selectByExampleWithBLOBs(TfPosExample example);

    List<TfPos> selectByExample(TfPosExample example);

    TfPosWithBLOBs selectByPrimaryKey(TfPosKey key);

    int updateByExampleSelective(@Param("record") TfPosWithBLOBs record, @Param("example") TfPosExample example);

    int updateByExampleWithBLOBs(@Param("record") TfPosWithBLOBs record, @Param("example") TfPosExample example);

    int updateByExample(@Param("record") TfPos record, @Param("example") TfPosExample example);

    int updateByPrimaryKeySelective(TfPosWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(TfPosWithBLOBs record);

    int updateByPrimaryKey(TfPos record);
}