package cn.yurui.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.yurui.mapper.TbItemMapper;
import cn.yurui.pojo.TbItem;
import cn.yurui.service.ItemService;

@Service
public class ItemServiceImpl implements ItemService {
	@Autowired
	private TbItemMapper itemMapper;

	@Override
	public TbItem getItemById(long id) {
		System.out.println("world");
		return itemMapper.selectByPrimaryKey(id);

	}

}
