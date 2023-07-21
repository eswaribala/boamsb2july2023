package com.boa.jwt.mutations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.boa.jwt.models.Corporate;
import com.boa.jwt.models.FullName;
import com.boa.jwt.services.CorporateService;
import com.boa.jwt.vos.CorporateInput;

import graphql.kickstart.tools.GraphQLMutationResolver;

@Component
public class CorporateMutation implements GraphQLMutationResolver{
    @Autowired 
	private CorporateService corporateService;
    
    public Corporate addCorporate(CorporateInput corporateInput) {
    	
    	Corporate corporate= Corporate.builder()
    			.customerId(corporateInput.getCustomerId())
    			.contactNo(corporateInput.getContactNo())
    			
    			.email(corporateInput.getEmail())
    			.companyType(corporateInput.getCompanyType())
    			.password(corporateInput.getPassword())
    			.name(FullName.builder()
    					.firstName(corporateInput.getName().getFirstName())
    					.lastName(corporateInput.getName().getLastName())
    					.middleName(corporateInput.getName().getMiddleName()).build()
    					)
    			
    			.build();
    	
    	return this.corporateService.addCorporate(corporate);
    	
    	
    }
   public Corporate updateCorporate(long customerId, String email) {
	   
	   return this.corporateService.updateCorporateEmail(customerId, email);
   }
    public boolean deleteCorporate(long customerId) {
    
    	return this.corporateService.deleteCorporate(customerId);
    }
    
}
