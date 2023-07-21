package com.boa.customerapi.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;

import com.boa.customerapi.models.Individual;

public interface IndividualRepo extends MongoRepository<Individual,Long> {

	
	
}
