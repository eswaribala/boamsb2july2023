package com.boa.customerapi.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

import com.boa.customerapi.facades.CustomerFacade;
import com.boa.customerapi.models.Individual;
import com.boa.customerapi.repositories.IndividualRepo;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class IndividualService {
	
	@Autowired
	private CustomerFacade customerFacade;
	@Autowired
	private IndividualRepo individualRepo;


    @StreamListener(target = CustomerFacade.inChannelName)
	public void getData(@Payload Individual individual) {
		log.info("Message received as"+individual.getCustomerId());
    	this.individualRepo.save(individual);

	}
	
	
}
