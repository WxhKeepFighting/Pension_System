package com.wxh.service;

import com.alibaba.fastjson.JSONObject;
import com.wxh.model.TransJson;
import com.wxh.dao.MissionMapper;
import com.wxh.dao.MissionViewMapper;
import com.wxh.dao.ServiceMapper;
import com.wxh.model.Mission;
import com.wxh.model.MissionExample;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;


@Service
@Transactional
public class AllService {

    @Resource
    private FWService fwService;
    @Resource
    private MissionService missionService;
    @Resource
    private MissionMapper missionMapper;
    @Resource
    private ServiceMapper serviceMapper;

    //开始服务
    public List startService(TransJson transJson){
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

        String volunteer_id = transJson.getVolunteer_id();
        String service_stime = transJson.getService_stime();
        String event_id = transJson.getEvent_id();
        String applicant_id = transJson.getApplicant_id();
        String service_spic = transJson.getService_spic();
        String mission_id = transJson.getMission_id();
        String status = transJson.getStatus();

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
        return new ArrayList();
    }

    //结束服务
    public List endService(TransJson transJson){
        /**
         *
         * 功能描述:只需要更新service表里面的信息，mission表里的信息已经开始服务的时候插入了，结束服务不需要更新表
         * 在完成结束服务同时，需要更新视图
         * @param: [jsonObject]
         * @return: void
         * @author: AwesomeHu
         * @date: 2020/1/7 21:29
         */
        com.wxh.model.Service service = new com.wxh.model.Service();

        String service_etime = transJson.getService_etime();
        String service_epic = transJson.getService_epic();
        String mission_id = transJson.getMission_id();
        String status = transJson.getStatus();

        service.setMissionId(mission_id);
        service.setServiceEpic(service_epic);
        service.setServiceEtime(service_etime);
        service.setServiceStatus(status);

        fwService.update(service);
        return new ArrayList();
    }

    //统计志愿者信息
    public List<TransJson> ifComplete(String volunteerId) {
        //查询成功，在验证是否存在未完成的服务
        List<TransJson> list = new ArrayList<>();
        TransJson transJson = new TransJson();
        MissionExample missionExample = new MissionExample();
        MissionExample.Criteria criteria1 = missionExample.createCriteria();
        criteria1.andMissionStatusEqualTo("1");
        criteria1.andMissionVolunteerIdEqualTo(volunteerId);
        List<Mission> missions = missionMapper.selectByExample(missionExample);
        missions.forEach(System.out::println);
        if (missions.size() <= 0) {
            //查询失败，不存在未完成任务，返回一个空的集合
            return list;
        } else {
            System.out.println("存在未完成的任务");
            //存在未完成的任务，可能有多条未完成的任务，将开始服务的信息给传过去
            missions.forEach(mission -> {
                String mid = mission.getMissionId();
                String vid = mission.getMissionVolunteerId();
                String eid = mission.getMissionEventId();
                String status = mission.getMissionStatus();
                String aid = mission.getMissionApplicantId();
                com.wxh.model.Service service = serviceMapper.selectByPrimaryKey(mid);
                String stime = service.getServiceStime();
                String spic = service.getServiceSpic();
                transJson.setApplicant_id(aid);
                transJson.setEvent_id(eid);
                transJson.setMission_id(mid);
                transJson.setVolunteer_id(vid);
                transJson.setStatus(status);
                transJson.setService_stime(stime);
                transJson.setService_spic(spic);
                list.add(transJson);
            });
            return list;
        }
    }
}
