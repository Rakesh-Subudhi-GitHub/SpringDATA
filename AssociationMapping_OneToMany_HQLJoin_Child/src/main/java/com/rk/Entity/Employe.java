package com.rk.Entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

//child class

@Setter
@Getter
@Entity
@Table(name="EMPLOYE_OTM")
@NoArgsConstructor
public class Employe implements Serializable{

	//properties
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer eno;
	
	@Column(length = 20)
	private String ename;
	@Column(length = 20)
	private String eadd;
	@Column(length = 10)
	private float esal;
	
	@ManyToOne(targetEntity = Department.class,cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	@JoinColumn(name = "dept_no",referencedColumnName = "deptNo")
	private Department dept;

	@Override
	public String toString() {
		return "Employe [eno=" + eno + ", ename=" + ename + ", eadd=" + eadd + ", esal=" + esal + "]";
	}

}
