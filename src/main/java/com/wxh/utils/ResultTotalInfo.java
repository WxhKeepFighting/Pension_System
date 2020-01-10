package com.wxh.utils;

import com.wxh.Exception.AjaxResponse;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: AwesomeHu
 * @Date: 2020/1/10 19:41
 * @Description:
 */
public class ResultTotalInfo {
    public TotalInfo asTotalInfo(Boolean bool,int code,String message,List lists) {

        List<Object> objectList=new ArrayList<>();
        for(int i=0;i<lists.size();i++) {
            Object object=lists.get(i);
            objectList.add(object);
        }
//        AjaxResponse info=new AjaxResponse(bool,code,message,objectList);
        List<AjaxResponse> infoList=new ArrayList<>();
        infoList.add(AjaxResponse.success());
        TotalInfo totalInfo=new TotalInfo(infoList);
        return totalInfo;
    }
}
