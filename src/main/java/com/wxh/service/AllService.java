package com.wxh.service;

import com.alibaba.fastjson.JSONObject;
import com.wxh.dao.MissionViewMapper;
import com.wxh.model.Mission;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


@Service
@Transactional
public class AllService {

    @Resource
    private FWService fwService;
    @Resource
    private MissionService missionService;
    @Resource
    private MissionViewMapper missionViewMapper;

    //开始服务
    public void startService(JSONObject jsonObject){
        /**
         * 功能描述:
         *
         * @param: [jsonObject]
         * @return: void
         * @author: AwesomeHu
         * @date: 2020/1/7 20:52
         */

        Mission mission = new Mission();
        com.wxh.model.Service service = new com.wxh.model.Service();

        String volunteer_id = jsonObject.getString("volunteer_id");
        String service_stime = jsonObject.getString("service_stime");
        String event_id = jsonObject.getString("event_id");
        String applicant_id = jsonObject.getString("applicant_id");
        String service_spic = jsonObject.getString("service_spic");
        String mission_id = jsonObject.getString("mission_id");
        String status = jsonObject.getString("status");

        mission.setMissionId(mission_id);
        mission.setMissionStatus(status);
        mission.setMissionApplicantId(applicant_id);
        mission.setMissionVolunteerId(volunteer_id);
        mission.setMissionEventId(event_id);

        service.setMissionId(mission_id);
        service.setServiceSpic(service_spic);
        service.setServiceStime(service_stime);
        service.setServiceStatus(status);

        missionService.save(mission);
        fwService.save(service);
    }

    //结束服务
    public void endService(JSONObject jsonObject){
        /**
         *
         * 功能描述:只需要更新service表里面的信息，mission表里的信息已经开始服务的时候插入了，结束服务不需要更新表
         * 在完成结束服务同时，需要更新视图
         * @param: [jsonObject]
         * @return: void
         * @author: AwesomeHu
         * @date: 2020/1/7 21:29
         */
//        Mission mission = new Mission();
        com.wxh.model.Service service = new com.wxh.model.Service();

//        String volunteer_id = jsonObject.getString("volunteer_id");
        String service_etime = jsonObject.getString("service_etime");
//        String event_id = jsonObject.getString("event_id");
//        String applicant_id = jsonObject.getString("applicant_id");
        String service_epic = jsonObject.getString("service_epic");
        String mission_id = jsonObject.getString("mission_id");
        String status = jsonObject.getString("status");

//        mission.setMissionId(mission_id);
//        mission.setMissionStatus(status);
//        mission.setMissionApplicantId(applicant_id);
//        mission.setMissionVolunteerId(volunteer_id);
//        mission.setMissionEventId(event_id);

        service.setMissionId(mission_id);
        service.setServiceEpic(service_epic);
        service.setServiceEtime(service_etime);
        service.setServiceStatus(status);

        fwService.update(service);
//        missionService.update(mission);
    }

    //统计志愿者信息
    public void Statistics(){

    }

}
