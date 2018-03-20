package com.leysoft.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients("com.leysoft.app")
@EnableDiscoveryClient
@SpringBootApplication
public class MicroserviceThreeApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceThreeApplication.class, args);
	}
}
