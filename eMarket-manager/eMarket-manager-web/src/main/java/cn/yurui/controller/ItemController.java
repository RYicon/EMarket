package cn.yurui.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.yurui.pojo.TbItem;
import cn.yurui.service.ItemService;

@Controller
public class ItemController {

	@Autowired 
	private ItemService itemService;
	
	@RequestMapping(value="/item/{id}")
	@ResponseBody
	public TbItem item(@PathVariable long id) {
		System.out.println("hello");
		 TbItem itemById = itemService.getItemById(id);
		 return itemById;
	}
}
