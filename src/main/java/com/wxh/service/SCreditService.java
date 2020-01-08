package com.wxh.service;

import com.wxh.dao.MissionViewMapper;
import com.wxh.model.UVolunteerCredit;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Auther: AwesomeHu
 * @Date: 2020/1/8 11:58
 * @Description:
 */
@Service
public class SCreditService {

    @Resource
    MissionViewMapper missionViewMapper;

    public List<UVolunteerCredit> getRankInfo(){
        return missionViewMapper.calTotalCreditRank(null);
    }
}
