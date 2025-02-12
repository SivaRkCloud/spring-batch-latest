package com.example.compositeitemwriterjob;


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
	private String address;
	private String city;
	private String state;
	private String zip;
	private String email;
}
