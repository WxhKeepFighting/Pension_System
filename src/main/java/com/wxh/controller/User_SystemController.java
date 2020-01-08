package com.wxh.controller;

import com.wxh.Exception.AjaxResponse;
import com.wxh.MyEntity.TotalInfo;
import com.wxh.MyEntity.TransJson;
import com.wxh.model.USystem;
import com.wxh.service.UserService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin("*")
public class User_SystemController {

    @Resource
    private UserService service;

    //登录验证
    @GetMapping(value = "/login")
    public TotalInfo loginVerify(@RequestParam String username, @RequestParam String password){
        USystem user_system = new USystem();
        user_system.setsId(username);
        user_system.setsPassword(password);
        TransJson transJson = service.loginVerification(user_system);
        List<Object> list=new ArrayList<>();
        list.add(transJson);
        List<AjaxResponse> infoList=new ArrayList<>();
        infoList.add(AjaxResponse.success(list));
        return new TotalInfo(infoList);
    }

}
