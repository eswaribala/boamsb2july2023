package com.boa.customerapi.models;

import javax.annotation.Generated;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;


@Data
@AllArgsConstructor
@NoArgsConstructor

public class Customer {
	
	private long customerId;
	
	private FullName name;
	
	private long contactNo;
	
	private String email;
	
	private String password;
	
	
	

	
}
