package com.wxh.service;

import com.wxh.Exception.CustomException;
import com.wxh.Exception.CustomExceptionType;
import com.wxh.dao.ServiceMapper;
import com.wxh.model.ServiceExample;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


@Service
@Transactional
public class FWService {

    @Resource
    ServiceMapper serviceMapper;

    public void update(com.wxh.model.Service service) throws CustomException {

        /*
        *
        * question01:不能简单的使用这个方法，需要更新指定的列
        * solve01:使用插入操作，插入指定的列即可
        *
        * question02:如果使用插入方法，那么主键重复了，并且有些项存在，无法插入
        * solve02:还是采用更新方法
        * */

        ServiceExample serviceExample = new ServiceExample();
        ServiceExample.Criteria criteria = serviceExample.createCriteria();
        criteria.andMissionIdEqualTo(service.getMissionId());
        int i = serviceMapper.updateByExampleSelective(service, serviceExample);
        if (i <= 0){
            throw new CustomException(CustomExceptionType.USER_INPUT_ERROR,"结束签到失败");
        }
    }

    public void save(com.wxh.model.Service service) throws CustomException {
        int n = serviceMapper.insertSelective(service);
        if (n <= 0){
            throw new CustomException(CustomExceptionType.USER_INPUT_ERROR, "开始签到失败");
        }
    }

}
