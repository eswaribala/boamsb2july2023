package com.boa.jwt.vos;



import com.boa.jwt.models.CompanyType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CorporateInput {
	
	private long customerId;
	
	private FullNameInput name;

	private long contactNo;
	
	private String email;
	
	private String password;
	
	private CompanyType companyType;
}
