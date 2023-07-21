package com.boa.jwt.queries;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.boa.jwt.models.Individual;
import com.boa.jwt.services.IndividualService;

import graphql.kickstart.tools.GraphQLQueryResolver;

@Component
public class IndividualQuery implements GraphQLQueryResolver {
	@Autowired
	private IndividualService individualService;
	

	public List<Individual> findAllIndividuals(){
		return this.individualService.getAllIndividuals();
		
	}
	
	public Individual findIndividualById(long customerId) {
	
		return this.individualService.getIndividualById(customerId);
	}
	
	public List<Individual> findIndividualByFirstName(String firstName){
		return this.individualService.getIndividualByFirstName(firstName);
	}
	
	
	public List<Individual> findIndividualByContactNo(long contactNo){
		return this.individualService.getIndividualByContactNo(contactNo);
	}
	
}
