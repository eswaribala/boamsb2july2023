package com.boa.customerapi.models;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="Individual")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Individual {
	@Enumerated(EnumType.STRING)
	@Column(name="Gender")
	private Gender gender;
	@DateTimeFormat(iso = ISO.DATE)
	@Column(name="DOB")
	private LocalDate dob;

}
