package com.boa.customerapi.mutations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.boa.customerapi.models.FullName;
import com.boa.customerapi.models.Individual;
import com.boa.customerapi.services.IndividualService;
import com.boa.customerapi.vos.IndividualInput;

import graphql.kickstart.tools.GraphQLMutationResolver;

@Component
public class IndividualMutation implements GraphQLMutationResolver{
    @Autowired 
	private IndividualService individualService;
    
    public Individual addIndividual(IndividualInput individualInput) {
    	
    	Individual individual= Individual.builder()
    			.customerId(individualInput.getCustomerId())
    			.contactNo(individualInput.getContactNo())
    			.dob(individualInput.getDob())
    			.email(individualInput.getEmail())
    			.gender(individualInput.getGender())
    			.password(individualInput.getPassword())
    			.name(FullName.builder()
    					.firstName(individualInput.getName().getFirstName())
    					.lastName(individualInput.getName().getLastName())
    					.middleName(individualInput.getName().getMiddleName()).build()
    					)
    			
    			.build();
    	
    	return this.individualService.addIndividual(individual);
    	
    	
    }
   public Individual updateIndividual(long customerId, String email) {
	   
	   return this.individualService.updateIndividualEmail(customerId, email);
   }
    public boolean deleteIndividual(long customerId) {
    
    	return this.individualService.deleteIndividual(customerId);
    }
    
}
