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
	public List<Object[]> loadDataUsing_HQLJoins_ChildToParent() {
	
		List<Object[]> list=empRepo.getJoinsDataChildToParent();
		
		return list;
	}
	
	
}//class
