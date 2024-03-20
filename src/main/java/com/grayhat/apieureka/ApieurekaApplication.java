package com.grayhat.apieureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ApieurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApieurekaApplication.class, args);
	}

}
