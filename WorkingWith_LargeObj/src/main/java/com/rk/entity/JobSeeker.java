package com.rk.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;

import lombok.Data;

@Data
@Entity
public class JobSeeker implements Serializable{

	//properties
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer jsid;
	
	@Column(length = 20)
	private String jsname;
	@Column(length = 20)
	private String qlfy;
	
	@Lob
	private byte[] photo;
	@Lob
	private char[] resume;
 
}//class
