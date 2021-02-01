package com.rk.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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
	public EmployeDTO findEmployeDetailsByID(int id) {
		
		//use empRepo
		Optional<Employe> opt=empRepo.findById(id);
		
		EmployeDTO dto=null;
		
		//check emp exist
		if(opt.isPresent())
		{
			//get Emp details
			Employe emp=opt.get();
			//copy to dto
			dto=new EmployeDTO();
			
			BeanUtils.copyProperties(emp, dto);
			
		}
		return dto;
	}

}//class
