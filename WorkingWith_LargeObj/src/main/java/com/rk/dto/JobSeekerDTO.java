package com.rk.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Data
public class JobSeekerDTO implements Serializable{

	//properties
	private Integer jsid;
	private String jsname;
	private String qlfy;
	
	private byte[] photo;
	private char[] resume;
 
}//class
