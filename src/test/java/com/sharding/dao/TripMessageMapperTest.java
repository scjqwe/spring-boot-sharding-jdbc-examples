package com.sharding.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * {@link TripMessageMapper}测试
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class TripMessageMapperTest {
	private static final Logger logger = LoggerFactory.getLogger(TripMessageMapperTest.class);

	@Autowired
	private TripMessageMapper mapper;

	@Test
	public void test() throws Exception {
		String tripKey = "flight:2019-10-01:NGO:CTS:NH701";
		logger.info("{}", mapper.findByTripkey(tripKey));
	}

	@Test
	public void test1() throws Exception {
		logger.info("test1()");
	}

}
