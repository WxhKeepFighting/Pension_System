package com.wxh.controller;

import com.wxh.Exception.AjaxResponse;
import com.wxh.utils.TotalInfo;
import com.wxh.model.UVolunteerCredit;
import com.wxh.service.SCreditService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Auther: AwesomeHu
 * @Date: 2020/1/8 12:05
 * @Description: 处理志愿者排名信息
 */
@RestController
@CrossOrigin("*")
public class VCreditController {

    @Resource
    SCreditService sCreditService;

    @GetMapping(value = "/volunteers/creditrank")
    public TotalInfo getRankInfo(@RequestParam Integer year){
        List<UVolunteerCredit> rankInfo = sCreditService.getRankInfo(year);
        List<AjaxResponse> alist = TotalInfo.encapsulation(rankInfo);
        return new TotalInfo(alist);
    }
}
