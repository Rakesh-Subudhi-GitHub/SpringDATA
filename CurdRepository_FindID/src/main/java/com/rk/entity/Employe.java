package com.rk.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Employe implements Serializable{

	//properties
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer Eno;
	
	@Column(length = 20)
	private String Ename;
	
	@Column(length = 20)
	private String Eadd;
	
	@Column(length = 10)
	private float Esal; 

}
