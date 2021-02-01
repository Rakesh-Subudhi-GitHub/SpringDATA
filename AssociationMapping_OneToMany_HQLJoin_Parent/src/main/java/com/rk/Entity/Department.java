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
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

//parent class

@Setter
@Getter
@Entity
@Table(name = "DEPARTMENT_OTM")
@NoArgsConstructor
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

	@Override
	public String toString() {
		return "Department [deptNo=" + deptNo + ", deptName=" + deptName + ", deptAdd=" + deptAdd + "]";
	}

	
}//class
