package com.wxh.dao;

import com.wxh.model.UVolunteer;
import com.wxh.model.UVolunteerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UVolunteerMapper {
    long countByExample(UVolunteerExample example);

    int deleteByExample(UVolunteerExample example);

    int deleteByPrimaryKey(String vId);

    int insert(UVolunteer record);

    int insertSelective(UVolunteer record);

    List<UVolunteer> selectByExample(UVolunteerExample example);

    UVolunteer selectByPrimaryKey(String vId);

    int updateByExampleSelective(@Param("record") UVolunteer record, @Param("example") UVolunteerExample example);

    int updateByExample(@Param("record") UVolunteer record, @Param("example") UVolunteerExample example);

    int updateByPrimaryKeySelective(UVolunteer record);

    int updateByPrimaryKey(UVolunteer record);
}