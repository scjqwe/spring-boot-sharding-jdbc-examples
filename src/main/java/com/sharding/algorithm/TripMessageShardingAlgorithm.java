package com.sharding.algorithm;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Collection;

import org.apache.commons.lang3.StringUtils;
import org.apache.shardingsphere.api.sharding.standard.PreciseShardingAlgorithm;
import org.apache.shardingsphere.api.sharding.standard.PreciseShardingValue;

/**
 * 
 * 分片算法<br>
 * 版权: Copyright (c) 2011-2019<br>
 * 
 * @author: 孙常军<br>
 * @date: 2019年9月10日<br>
 */
public class TripMessageShardingAlgorithm implements PreciseShardingAlgorithm<String> {

	/** 表后缀格式 ，按月分表 */
	private static final String TABLE_SUFFIX = "yyyyMM";

	/** 表后缀格式，第二版，按天分表 */
	private static final String TABLE_SUFFIX_V2 = "yyyyMMdd";

	/** 重分表时间阈值 */
	private static final String RESHARD_THRESHOLD = "201910";

	@Override
	public String doSharding(Collection<String> availableTargetNames, PreciseShardingValue<String> shardingValue) {
		String shard = calculateShard(shardingValue.getValue());
		for (String tableName : availableTargetNames) {
			if (tableName.endsWith("_" + shard)) {
				return tableName;
			}
		}

		throw new IllegalArgumentException("未找到该表：trip_message_" + shard);
	}

	/**
	 * 计算分片
	 * 
	 * @param args
	 * @return
	 */
	public String calculateShard(Object... args) {
		String tripkey = (String) args[0];
		LocalDate localDate = LocalDate.parse(tripkey.split(":")[1]);
		String oldShard = localDate.format(DateTimeFormatter.ofPattern(TABLE_SUFFIX));
		if (StringUtils.compare(oldShard, RESHARD_THRESHOLD) < 0) {
			return oldShard;
		} else {
			return localDate.format(DateTimeFormatter.ofPattern(TABLE_SUFFIX_V2));
		}
	}

}
