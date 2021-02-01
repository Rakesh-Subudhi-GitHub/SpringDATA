package com.rk.dto;

import java.util.Map;
import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class PersonInfoDTO {

	//properties
	private  Integer pid;
	private  String pname;
	private  String paddrs;
	private  Set<VisaInfoDTO> visas;
	private  Map<String,BankAccountDTO>  accounts;
	

}//class
