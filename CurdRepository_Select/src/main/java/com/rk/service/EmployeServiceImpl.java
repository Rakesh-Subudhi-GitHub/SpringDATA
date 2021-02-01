package com.rk.service;

import java.util.ArrayList;
import java.util.List;

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
	public Iterable<EmployeDTO> getEmpDetails() {
		
		//use empRepo
		Iterable<Employe> itEntites=empRepo.findAll();
		
		Iterable<EmployeDTO> itDTO=new ArrayList();
		
		//converting entity to dto
		itEntites.forEach(entity->{
			EmployeDTO dto=new EmployeDTO();
			BeanUtils.copyProperties(entity, dto);
			((ArrayList) itDTO).add(dto);
		});
		return itDTO;
	}


}//class
