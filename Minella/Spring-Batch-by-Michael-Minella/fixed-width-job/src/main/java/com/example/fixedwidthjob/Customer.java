package com.example.fixedwidthjob;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer {
	private String firstName;
	private String middleInitial;
	private String lastName;
	private String addressNumber;
	private String street;
	private String city;
	private String state;
	private String zipCode;
}
