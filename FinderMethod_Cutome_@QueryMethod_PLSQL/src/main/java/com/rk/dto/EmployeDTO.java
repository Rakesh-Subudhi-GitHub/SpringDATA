package com.rk.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class EmployeDTO implements Serializable{

	//properties
	private Integer eno;
	private String ename;
	private String eadd;
	private float esal; 

}
