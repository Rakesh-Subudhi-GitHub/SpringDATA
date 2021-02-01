package com.rk.document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Document //its just like Entity in Oracle 
									//mongo db it called  Document
@RequiredArgsConstructor
@NoArgsConstructor
@Data
public class Customer {

	//properties
	@Id
	private String id;  //in mongo db all pk is string type

	@NonNull
	private Integer cno;
	@NonNull
	private String cname;
	
	private  String cadd;
	private  Float billAmt;
}
