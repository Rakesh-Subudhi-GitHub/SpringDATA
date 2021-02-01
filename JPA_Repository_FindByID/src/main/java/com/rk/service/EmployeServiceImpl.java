package com.rk.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rk.dto.EmployeDTO;
import com.rk.entity.Employe;
import com.rk.repository.IEmoployeRepo;

@Service("empService")
public class EmployeServiceImpl implements IEmployeService {

	@Autowired
	private IEmoployeRepo empRepo;

	@Override
	@Transactional
	public EmployeDTO getEmployeDetailsById(int eno) {
		
		//use empRepo
		Employe entity=empRepo.getOne(eno);
		
		//convert entity --> dto
		EmployeDTO dto=new EmployeDTO();
		BeanUtils.copyProperties(entity, dto);
		
		return dto;
	}

	
	
}//class
