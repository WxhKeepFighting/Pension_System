package com.wxh.service;

import com.wxh.Exception.CustomException;
import com.wxh.Exception.CustomExceptionType;
import com.wxh.dao.MissionMapper;
import com.wxh.dao.MissionViewMapper;
import com.wxh.model.Mission;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
@Transactional
public class MissionService {

    @Resource
    MissionMapper missionMapper;
    @Resource
    MissionViewMapper missionViewMapper;

    public void save(Mission mission) throws CustomException {
        int n = missionMapper.insertSelective(mission);
        if (n <= 0){
            throw new CustomException(CustomExceptionType.USER_INPUT_ERROR, "开始签到失败");
        }
    }

    public void update(Mission mission) throws CustomException {
        int i = missionMapper.updateByPrimaryKey(mission);
        if (i <= 0){
            throw new CustomException(CustomExceptionType.USER_INPUT_ERROR, "结束签到失败");
        }
    }

}
