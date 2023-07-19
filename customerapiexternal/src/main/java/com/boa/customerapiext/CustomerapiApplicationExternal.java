package com.boa.customerapiext;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import com.boa.customerapiext.configurations.MessageConfiguration;

@SpringBootApplication
@EnableEurekaClient
@EnableConfigurationProperties(MessageConfiguration.class)
public class CustomerapiApplicationExternal {

	public static void main(String[] args) {
		SpringApplication.run(CustomerapiApplicationExternal.class, args);
	}

}
