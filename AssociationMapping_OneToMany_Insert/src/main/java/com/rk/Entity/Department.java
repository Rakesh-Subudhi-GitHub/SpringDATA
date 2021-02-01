package com.rk.Entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

//parent class

@Data
@Entity
@Table(name = "DEPARTMENT_OTM")
public class Department implements Serializable{

	//properties
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer deptNo;
	
	@Column(length = 20)
	private String deptName;
	@Column(length = 20)
	private String deptAdd;

	@OneToMany(targetEntity = Employe.class,cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	@JoinColumn(name = "dept_no",referencedColumnName = "deptNo")
	private List<Employe> emps;

	
}//class
