package com.rk.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rk.Entity.Department;
import com.rk.Entity.Employe;
import com.rk.Repository.DepartmentRepo;
import com.rk.Repository.EmployeRepo;

@Service("compService")
public class CompanyMgmtServiceImpl implements ICompanyMgmtService {

	@Autowired
	private DepartmentRepo deptRepo;
	@Autowired
	private EmployeRepo empRepo;
	
	
	@Override
	@Transactional
	public void loadDataUsingParent() {
	
		//use Repo
		List<Department> listDept=deptRepo.findAll();
		
		//show all result
		listDept.forEach(dept->{
			System.out.println("parent show :: "+dept);
			
			//child load
			List<Employe> listEmp=dept.getEmps();
			listEmp.forEach(emp->{
				System.out.println("child show :: "+emp);
			});
		});
	}//method


	@Override
	@Transactional
	public void loadDataUsingChild() {
		
		//use Repo
		List<Employe> listEmp=empRepo.findAll();
		
		//print all data
		listEmp.forEach(emp->{
			System.out.println("child print :: "+emp);
			
			//print Parent
			Department dept=emp.getDept();  //bcz its one of all childs so no need any collections
			System.out.println(dept);
		});
	}//method
	
}//class
