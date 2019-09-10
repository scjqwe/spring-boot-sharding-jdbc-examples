package com.sharding.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sharding.dao.TripMessageMapper;

/**
 * 
 * 查询控制器<br>
 * 版权: Copyright (c) 2011-2019<br>
 * 
 * @author: 孙常军<br>
 * @date: 2019年9月10日<br>
 */
@RestController
public class TripMessageController {

	@Autowired
	private TripMessageMapper tripMessageMapper;

	@RequestMapping("/message/query")
	public Object query(String tripKey) {
		return tripMessageMapper.findByTripkey(tripKey);
	}
}
