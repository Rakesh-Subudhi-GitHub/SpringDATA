package com.rk.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.rk.Entity.Employe;

public interface EmployeRepo extends JpaRepository<Employe, Integer> {

	//@Query("select e.eno,e.ename,e.eadd,e.esal,d.deptNo,d.deptName,d.deptAdd from Employe e  inner join e.dept d") 
	//@Query("select e.eno,e.ename,e.eadd,e.esal,d.deptNo,d.deptName,d.deptAdd from Employe e  right join e.dept d") 
	//@Query("select e.eno,e.ename,e.eadd,e.esal,d.deptNo,d.deptName,d.deptAdd from Employe e  left join e.dept d") 
	@Query("select e.eno,e.ename,e.eadd,e.esal,d.deptNo,d.deptName,d.deptAdd from Employe e  full join e.dept d") 
	public List<Object[]>  getJoinsDataChildToParent();
}
