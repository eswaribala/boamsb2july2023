package com.boa.customerapiext;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class CustomerapiApplicationExternal {

	public static void main(String[] args) {
		SpringApplication.run(CustomerapiApplicationExternal.class, args);
	}

}
