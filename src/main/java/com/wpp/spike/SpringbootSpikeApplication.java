package com.wpp.spike;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.wpp.spike.mapper")
public class SpringbootSpikeApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootSpikeApplication.class, args);
	}
}
