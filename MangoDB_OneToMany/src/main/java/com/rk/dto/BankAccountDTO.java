package com.rk.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BankAccountDTO {

	//properties
	private Long acno;
	private String type;
	private Float balance;

}//class
