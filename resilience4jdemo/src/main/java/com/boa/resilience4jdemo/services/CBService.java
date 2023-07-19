package com.boa.resilience4jdemo.services;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.retry.annotation.Retry;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class CBService {
	@Autowired
	private RestTemplate restTemplate;
	@Value("${serviceUrl}")
    private String serviceUrl;
	@Value("${alternativeServiceUrl}")
    private String alternativeServiceUrl;
	
	

    @CircuitBreaker(name = "gatewayCircuitBreaker", fallbackMethod = "fallbackResponse")
    @Retry(name = "gatewayRetry")
    public String fetchData() {
        log.info(" Making a request to " + serviceUrl + " at :" 
    + LocalDateTime.now());

       
        return restTemplate.getForObject(serviceUrl, String.class);
    }

    public String fallbackResponse(Exception e) {
         return restTemplate.getForObject(alternativeServiceUrl, String.class);
    }

}
