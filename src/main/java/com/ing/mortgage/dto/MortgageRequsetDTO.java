package com.ing.mortgage.dto;

import java.io.Serializable;
import java.time.LocalDate;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class MortgageRequsetDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	private Long mortgageId;
	private String operationType;
	private Double propertyCost;
	private Double deposit;
	private String employmentStatus;
	private String occupation;
	private String contractType;
	private LocalDate dateOfJoining;
	private String title;
	private String firstName;
	private String middleName;
	private String surName;
	private LocalDate dateOfBirth;
	private Long phoneNumber;
	private String email;
	private String confirmEmail;

}
