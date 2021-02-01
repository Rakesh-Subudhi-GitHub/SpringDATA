package com.rk.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.rk.Entity.Department;

public interface DepartmentRepo extends JpaRepository<Department, Integer> {

	//@Query("select d.deptNo,d.deptName,d.deptAdd,e.eno,e.ename,e.eadd,e.esal from Department d  inner join d.emps e")
		//@Query("select d.deptNo,d.deptName,d.deptAdd,e.eno,e.ename,e.eadd,e.esal from Department d   left join d.emps e")
		//@Query("select d.deptNo,d.deptName,d.deptAdd,e.eno,e.ename,e.eadd,e.esal from Department d  right join d.emps e")
		@Query("select d.deptNo,d.deptName,d.deptAdd,e.eno,e.ename,e.eadd,e.esal from Department d  full join d.emps e")

		public    List<Object[]>    getJoinsDataParentToChild();

}
