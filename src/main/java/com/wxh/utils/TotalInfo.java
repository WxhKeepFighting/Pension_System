package com.wxh.utils;


import com.wxh.Exception.AjaxResponse;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
public class TotalInfo {

	private List<AjaxResponse> totalInfo;

	//写一个封装数据的方法
	public static List<AjaxResponse> encapsulation(List list){
		/**
		 *
		 * 功能描述:
		 *
		 * @param: [list] 传过来的date数据已经用一个List封装了一次，这里主要对AjaxResponse进行一个封装，最后对Total进行封装
		 * @return: com.wxh.utils.TotalInfo
		 * @author: AwesomeHu
		 * @date: 2020/1/10 20:12
		 */
		List<AjaxResponse> Mylist = new ArrayList<>();
		Mylist.add(AjaxResponse.success(list));
		return Mylist;
	}
}
