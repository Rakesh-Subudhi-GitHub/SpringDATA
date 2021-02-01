package com.rk.dto;

import java.io.Serializable;

import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
//@RequiredArgsConstructor
@AllArgsConstructor
@NoArgsConstructor
public class CustomerDTO implements Serializable{

	//properties
		private String id;
		private Integer cno;
		private String cname;
		private  String cadd;
		private  Float billAmt;
		
}
