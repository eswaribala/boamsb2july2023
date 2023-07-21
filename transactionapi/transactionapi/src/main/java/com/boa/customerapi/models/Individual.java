package com.boa.customerapi.models;

import java.time.LocalDate;

import org.bson.codecs.pojo.annotations.BsonId;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "individuals")
public class Individual {
@BsonId
    private long customerId;
	
	private FullName name;
	
	private long contactNo;
	
	private String email;
	
	private String password;
	private Gender gender;
	
	private LocalDate dob;

}
