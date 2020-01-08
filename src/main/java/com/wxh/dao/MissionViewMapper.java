package com.wxh.dao;

import com.wxh.model.MissionView;
import com.wxh.model.MissionViewExample;
import java.util.List;

import com.wxh.model.UVolunteerCredit;
import org.apache.ibatis.annotations.Param;

public interface MissionViewMapper {
    long countByExample(MissionViewExample example);

    int deleteByExample(MissionViewExample example);

    int insert(MissionView record);

    int insertSelective(MissionView record);

    List<MissionView> selectByExample(MissionViewExample example);

    int updateByExampleSelective(@Param("record") MissionView record, @Param("example") MissionViewExample example);

    int updateByExample(@Param("record") MissionView record, @Param("example") MissionViewExample example);

    //自定义查询积分排名
    List<UVolunteerCredit> calTotalCreditRank(MissionViewExample example);

    //只查积分其他信息都不查
    int calTotalCredit(MissionViewExample example);
}