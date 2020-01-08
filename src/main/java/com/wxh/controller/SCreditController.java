package com.wxh.controller;

import com.wxh.MyEntity.TotalInfo;
import com.wxh.model.UVolunteerCredit;
import com.wxh.service.SCreditService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Auther: AwesomeHu
 * @Date: 2020/1/8 12:05
 * @Description:
 */
@RestController
public class SCreditController {

    @Resource
    SCreditService sCreditService;

//    @GetMapping(value = "/volunteers/creditrank")
//    public TotalInfo getRankInfo(){
//        List<UVolunteerCredit> rankInfo = sCreditService.getRankInfo();
//
//    }
}
