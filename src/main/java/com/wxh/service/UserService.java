package com.wxh.service;


import com.wxh.Exception.CustomException;
import com.wxh.Exception.CustomExceptionType;
import com.wxh.MyEntity.TransJson;
import com.wxh.dao.MissionMapper;
import com.wxh.dao.ServiceMapper;
import com.wxh.dao.USystemMapper;
import com.wxh.model.Mission;
import com.wxh.model.MissionExample;
import com.wxh.model.USystem;
import com.wxh.model.USystemExample;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;


@Service
@Transactional
public class UserService {

    @Resource
    USystemMapper uSystemMapper;

    @Resource
    MissionMapper missionMapper;

    @Resource
    ServiceMapper serviceMapper;

    public TransJson loginVerification(USystem uSystem) throws CustomException {
        //用户查询
        TransJson transJson = new TransJson();
        USystemExample uSystemExample = new USystemExample();
        USystemExample.Criteria criteria = uSystemExample.createCriteria();
        criteria.andSIdEqualTo(uSystem.getsId());
        criteria.andSPasswordEqualTo(uSystem.getsPassword());
        List<USystem> users = uSystemMapper.selectByExample(uSystemExample);
        if (users.size() <= 0){
            //如果没查询到则抛出异常
            throw new CustomException(CustomExceptionType.USER_INPUT_ERROR, "请输入正确的用户名和密码");
        }
        else {
            //查询成功，在验证是否存在未完成的服务
//            Mission mission = missionRepository.findByStatusAndVid("1", user.getUsername());
            MissionExample missionExample = new MissionExample();
            MissionExample.Criteria criteria1 = missionExample.createCriteria();
            criteria1.andMissionStatusEqualTo("1");
            criteria1.andMissionVolunteerIdEqualTo(uSystem.getsId());
            List<Mission> missions = missionMapper.selectByExample(missionExample);
            missions.forEach(System.out::println);
            if (missions.size() <= 0){
                //查询失败，不存在未完成任务
                return null;
            }else {
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
                });
                return transJson;
            }
        }
    }
}
