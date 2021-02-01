package com.rk.document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {

	//properties
	@Id
	private Integer pid;
	private String pname;
	private String padd;
	
	private DrivingLicense license;

}
