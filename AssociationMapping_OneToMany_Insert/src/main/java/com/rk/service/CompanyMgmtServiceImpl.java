package com.rk.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
	public void saveDataUsingParent() {
		
		//prepare Entity object
		//Child obj set data
		Employe emp1=new Employe();
		Employe emp2=new Employe();
		Employe emp3=new Employe();
		
		//value
		emp1.setEname("raka");
		emp1.setEadd("hyd");
		emp1.setEsal(12545.0f);
	
			emp2.setEname("kaka");
			emp2.setEadd("bbs");
			emp2.setEsal(54785.0f);
				
				emp3.setEname("raka");
				emp3.setEadd("hyd");
				emp3.setEsal(12545.0f);
				
			//Parent obj set data
			Department dept=new Department();
			
			//value
			dept.setDeptName("IT");
			dept.setDeptAdd("hyd");
			
			
			//map the Parent collections
			List<Employe> employes=List.of(emp1,emp2,emp3);
			dept.setEmps(employes);
			//or write
			//dept.setEmps(List.of(emp1,emp2,emp3));
			
			//map the child corresponding parents
			emp1.setDept(dept);
			emp2.setDept(dept);
			emp3.setDept(dept);
			
	//save the object using Parent
		deptRepo.save(dept);	
		System.out.println("Save the all employes or Department using help of ::::: Parent class :::");
	}//method

	@Override
	public void saveDataUsingChild() {
		
		//prepare Entity object
				//Child obj set data
				Employe emp1=new Employe();
				Employe emp2=new Employe();
				Employe emp3=new Employe();
				
				//value
				emp1.setEname("raka");
				emp1.setEadd("hyd");
				emp1.setEsal(12545.0f);
			
					emp2.setEname("kaka");
					emp2.setEadd("bbs");
					emp2.setEsal(54785.0f);
						
						emp3.setEname("raka");
						emp3.setEadd("hyd");
						emp3.setEsal(12545.0f);
						
					//Parent obj set data
					Department dept=new Department();
					
					//value
					dept.setDeptName("IT");
					dept.setDeptAdd("hyd");
					
					
					//map the Parent collections
					List<Employe> employes=List.of(emp1,emp2,emp3);
					dept.setEmps(employes);
					//or write
					//dept.setEmps(List.of(emp1,emp2,emp3));
					
					//map the child corresponding parents
					emp1.setDept(dept);
					emp2.setDept(dept);
					emp3.setDept(dept);
					
			//save the object using Parent
				empRepo.save(emp1);
				empRepo.save(emp2);
				empRepo.save(emp3);
				System.out.println("Save the all employes or Department using help of ::::: Child class :::");
	}//method

}//class
