package com.sharding;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
@MapperScan(basePackages = "com.sharding.dao")
public class SpringBootShardingJdbcExamplesApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootShardingJdbcExamplesApplication.class, args);
	}

}
