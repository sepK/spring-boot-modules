package com.ecjtu.kongtao;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author t.k
 */
@SpringBootApplication
@MapperScan(value = "com.ecjtu.kongtao.dao")
public class HotelWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(HotelWebApplication.class, args);
	}
}
