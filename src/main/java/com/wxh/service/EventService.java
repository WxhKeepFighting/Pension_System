package com.wxh.service;

import com.wxh.dao.EventMapper;
import com.wxh.model.Event;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional
public class EventService {

    @Resource
    private EventMapper eventMapper;
//
//    //保存事件
//    public void save(Event event){
//        repository.save(event);
//    }
//
    //查询所有事件
    public List<Event> findAll(){
        List<Event> list = eventMapper.selectByExample(null);
        return list;
    }
    
}
