package com.wxh.service;


import com.wxh.Exception.CustomException;
import com.wxh.Exception.CustomExceptionType;
import com.wxh.dao.USystemMapper;
import com.wxh.model.USystem;
import com.wxh.model.USystemExample;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;


@Service
@Transactional
public class UserService {

    @Resource
    USystemMapper uSystemMapper;

    public List loginVerification(USystem uSystem) throws CustomException {
        USystemExample uSystemExample = new USystemExample();
        USystemExample.Criteria criteria = uSystemExample.createCriteria();
        criteria.andSIdEqualTo(uSystem.getsId());
        criteria.andSPasswordEqualTo(uSystem.getsPassword());
        List<USystem> users = uSystemMapper.selectByExample(uSystemExample);
        if (users.size() <= 0){
            //如果没查询到则抛出异常
            throw new CustomException(CustomExceptionType.USER_INPUT_ERROR, "请输入正确的用户名和密码");
        }
        return new ArrayList<>();//由于前端不需要，所以返回一个空集合即可
    }
}
