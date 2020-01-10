package com.wxh.service;

import com.wxh.dao.MissionViewMapper;
import com.wxh.model.MissionViewExample;
import com.wxh.model.UVolunteerCredit;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

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

    public List<UVolunteerCredit> getRankInfo(Integer year){
        MissionViewExample example = new MissionViewExample();
        MissionViewExample.Criteria criteria1 = example.createCriteria();
        criteria1.andServiceEtimeBetween(year+"-10-01 00:00",year+"-10-28 00:00");
        return missionViewMapper.calTotalCreditRank(example);
    }
}
