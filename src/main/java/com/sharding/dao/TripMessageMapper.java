package com.sharding.dao;

import java.util.List;

import com.sharding.entity.TripMessage;

/**
 * 
 * Mapper接口实现<br>
 * 版权: Copyright (c) 2011-2019<br>
 * 
 * @author: 孙常军<br>
 * @date: 2019年9月10日<br>
 */
public interface TripMessageMapper {

	/**
	 * 根据tkey查询
	 * 
	 * @param tripKey
	 * @return
	 */
	public List<TripMessage> findByTripkey(String tripKey);

}
