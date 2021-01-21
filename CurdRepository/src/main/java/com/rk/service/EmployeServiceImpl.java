package com.rk.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rk.dto.EmployeDTO;
import com.rk.entity.Employe;
import com.rk.repository.EmployeRepo;

@Service("empService")
public class EmployeServiceImpl implements IEmployeService {

	@Autowired
	private EmployeRepo empRepo;

	@Override
	public int regEmploye(EmployeDTO dto) {
		
		//convert entity to dto
		Employe emp=new Employe();
				
		BeanUtils.copyProperties(dto, emp);
		
		//use EmpRepo
		Employe entity=empRepo.save(emp);
		
		return emp.getEno();
		
	}//method

}//class
