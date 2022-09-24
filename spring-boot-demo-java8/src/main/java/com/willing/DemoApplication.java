package com.willing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 1.Spring Boot应用 <BR/>
 * 2.MyBatis Plus Mapper接口包路径配置 <BR/>
 *
 */
@SpringBootApplication
@EnableFeignClients
@EnableDiscoveryClient
public class DemoApplication {
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}
