package com.rk.document;

import java.util.Map;
import java.util.Set;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PersonInfo {

	//properties
	@Id
	private  Integer pid;
	private  String pname;
	private  String paddrs;
	
	//VisaInfo class 
	private  Set<VisaInfo> visas;
	
	//BankAccount class
	private  Map<String,BankAccount>  accounts;
	

}//class