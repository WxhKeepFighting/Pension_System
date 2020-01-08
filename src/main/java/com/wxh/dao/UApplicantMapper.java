package com.wxh.dao;

import com.wxh.model.UApplicant;
import com.wxh.model.UApplicantExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UApplicantMapper {
    long countByExample(UApplicantExample example);

    int deleteByExample(UApplicantExample example);

    int deleteByPrimaryKey(String aId);

    int insert(UApplicant record);

    int insertSelective(UApplicant record);

    List<UApplicant> selectByExample(UApplicantExample example);

    UApplicant selectByPrimaryKey(String aId);

    int updateByExampleSelective(@Param("record") UApplicant record, @Param("example") UApplicantExample example);

    int updateByExample(@Param("record") UApplicant record, @Param("example") UApplicantExample example);

    int updateByPrimaryKeySelective(UApplicant record);

    int updateByPrimaryKey(UApplicant record);
}