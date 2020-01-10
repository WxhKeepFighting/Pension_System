package com.wxh.controller;

import com.wxh.Exception.AjaxResponse;
import com.wxh.model.Event;
import com.wxh.service.EventService;
import com.wxh.utils.TotalInfo;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Auther: AwesomeHu
 * @Date: 2020/1/10 17:37
 * @Description:
 */
@RestController
@CrossOrigin("*")
public class EventsController {
    @Resource
    private EventService eventService;

    //查询所有事件
    @GetMapping(value = "/events")
    public TotalInfo findAllEvents(){
        List<Event> elist = eventService.findAll();
        List<AjaxResponse> alist = TotalInfo.encapsulation(elist);
        return new TotalInfo(alist);
    }
}
