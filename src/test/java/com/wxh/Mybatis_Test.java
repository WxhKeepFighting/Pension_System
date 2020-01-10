package com.wxh;

import com.wxh.dao.EventMapper;
import com.wxh.dao.MissionMapper;
import com.wxh.dao.MissionViewMapper;
import com.wxh.dao.USystemMapper;
import com.wxh.model.*;
import com.wxh.service.SCreditService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
public class Mybatis_Test {

    @Resource
    MissionMapper missionMapper;

    @Resource
    USystemMapper uSystemMapper;

    @Resource
    EventMapper eventMapper;
    
    @Resource
    MissionViewMapper missionViewMapper;

    @Resource
    SCreditService sCreditService;

    @Test
    public void missionTest(){
        List<Mission> missions = missionMapper.selectByExample(null);
        missions.forEach(mission -> System.out.println(mission.getId()));
    }

    @Test
    public void loginVerify(){
        USystem uSystem = new USystem();
        uSystem.setsId("2");
        uSystem.setsPassword("1");
        USystemExample example = new USystemExample();
        USystemExample.Criteria criteria = example.createCriteria();
        criteria.andSIdEqualTo(uSystem.getsId());
        criteria.andSPasswordEqualTo(uSystem.getsPassword());
        List<USystem> users = uSystemMapper.selectByExample(example);
        users.forEach(uSystem1 -> System.out.println("用户名"+uSystem1.getsId()+"密码为"+uSystem1.getsPassword()));
    }

    @Test
    public void findAllEvent(){
        List<Event> list = eventMapper.selectByExample(null);
        list.forEach(System.out::println);
    }
    
    @Test
    public void TotalCredit(){

//        MissionViewExample example= new MissionViewExample();
//        MissionViewExample.Criteria criteria = example.createCriteria();
//        criteria.andMissionVolunteerIdEqualTo("371311199010101111");//服务人
//        criteria.andMissionStatusEqualTo("2");
//        int i = missionViewMapper.calTotalCredit(example);
//        System.out.println("总积分为"+i);
        MissionViewExample example1 = new MissionViewExample();
        MissionViewExample.Criteria criteria1 = example1.createCriteria();
        criteria1.andServiceEtimeBetween(2019+"-10-23 00:00",2019+"-10-28 00:00");
        List<UVolunteerCredit> rankInfo = missionViewMapper.calTotalCreditRank(example1);
        rankInfo.forEach(System.out::print);

//        MissionViewExample example = new MissionViewExample();
//        MissionViewExample.Criteria criteria2 = example.createCriteria();
//        criteria2.andServiceEtimeBetween(2019+"-09-01 00:00",year+"-10-01 00:00");
//        missionViewMapper.calTotalCreditRank(example);

//        MissionExample example1 = new MissionExample();
//        MissionExample.Criteria criteria1 = example1.createCriteria();
//        List<UVolunteerCredit> uVolunteerCredits = missionViewMapper.calTotalCreditRank(null);
//        uVolunteerCredits.forEach(System.out::print);

    }

    @Test
    public void test01(){
        List<UVolunteerCredit> rankInfo = sCreditService.getRankInfo(2019);
        rankInfo.forEach(System.out::print);
    }


}
