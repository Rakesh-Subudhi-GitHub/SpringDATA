package com.rk.entity;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class CustomerInfo implements Serializable{

	//properties
	@Id
	@	GeneratedValue(strategy = GenerationType.AUTO)
	private Integer custId;
	
	@Column(length = 20)
	private String custName;
	
	@Column(length = 20)
	private String custAdd;
	
	@Column(length = 10)
	private float billAmt;
	
	private LocalDate dob;
	private LocalTime tob;
	private LocalDateTime billDate;
}
