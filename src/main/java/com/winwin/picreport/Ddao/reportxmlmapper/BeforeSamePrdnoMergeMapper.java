package com.winwin.picreport.Ddao.reportxmlmapper;

import java.util.List;
import com.winwin.picreport.Edto.BeforeSamePrdnoMerge;
import com.winwin.picreport.Edto.BeforeSamePrdnoMergeExample;
import org.apache.ibatis.annotations.Param;

public interface BeforeSamePrdnoMergeMapper {
    long countByExample(BeforeSamePrdnoMergeExample example);

    int deleteByExample(BeforeSamePrdnoMergeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BeforeSamePrdnoMerge record);

    int insertSelective(BeforeSamePrdnoMerge record);

    List<BeforeSamePrdnoMerge> selectByExample(BeforeSamePrdnoMergeExample example);

    BeforeSamePrdnoMerge selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BeforeSamePrdnoMerge record, @Param("example") BeforeSamePrdnoMergeExample example);

    int updateByExample(@Param("record") BeforeSamePrdnoMerge record, @Param("example") BeforeSamePrdnoMergeExample example);

    int updateByPrimaryKeySelective(BeforeSamePrdnoMerge record);

    int updateByPrimaryKey(BeforeSamePrdnoMerge record);
}