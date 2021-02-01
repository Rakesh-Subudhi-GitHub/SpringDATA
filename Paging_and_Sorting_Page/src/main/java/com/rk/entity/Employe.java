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
	private Integer eno;
	
	@Column(length = 20)
	private String ename;
	
	@Column(length = 20)
	private String eadd;
	
	@Column(length = 10)
	private float esal; 

}
