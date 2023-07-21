package com.boa.customerapi.models;

import java.time.LocalDate;




import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor

public class FullName {
	
	private String firstName;
	
	private String lastName;

	private String middleName;

}
