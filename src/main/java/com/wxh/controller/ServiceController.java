package com.wxh.controller;

import com.wxh.Exception.AjaxResponse;
import com.wxh.model.TransJson;
import com.wxh.service.AllService;
import com.wxh.utils.TotalInfo;
import com.wxh.utils.UploadImage;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.List;


@RestController
@CrossOrigin("*")
public class ServiceController {
    //用来处理签到的信息
    @Resource
    private AllService service;

    //开始服务
    @PostMapping(value = "/serve/startService")
    public TotalInfo startService(@Valid TransJson transJson){
        List list = service.startService(transJson);
        List<AjaxResponse> alist = TotalInfo.encapsulation(list);
        return new TotalInfo(alist);
    }

    //结束服务
    @PutMapping(value = "/serve/endService")
    public TotalInfo endService(@Valid TransJson transJson){
        List list = service.endService(transJson);
        List<AjaxResponse> alist = TotalInfo.encapsulation(list);
        return new TotalInfo(alist);
    }

    //图片上传
    @PostMapping(value = "/serve/images")
    public ResponseEntity<String> convertStringtoImage(@RequestParam String filename, @RequestParam String image) {
//        System.out.println("filename:【 "+ filename+"】");
//        System.out.println("image: 【"+ image+"】");

        if(image != null){
            UploadImage.convertStringtoImage(image, filename);
            System.out.print("图片上传完成,请选择你的文件夹");
            return ResponseEntity.status(HttpStatus.OK).body("200");
        } else{
            System.out.print("图片为空！");
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("500");
        }
    }

    //判断服务是否完成
    @GetMapping(value = "/serve/complete")
    public TotalInfo ifComplete(@RequestParam String username){
        List<TransJson> tlist  = service.ifComplete(username);
        List<AjaxResponse> alist = TotalInfo.encapsulation(tlist);
        return new TotalInfo(alist);
    }



}
