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
	public List<EmployeDTO> getempbyids(List<Integer> ids) {
		
		//use empRepo
		List<Employe> listEntitys=(List<Employe>) empRepo.findAllById(ids);
		
		//convert listEntiey to listdto
		List<EmployeDTO> listDTO=new ArrayList();
		
		listEntitys.forEach(entity->{
			EmployeDTO dto=new EmployeDTO();
			
			//convert entity-->dto
			BeanUtils.copyProperties(entity,dto);
			listDTO.add(dto);
		});
		
		return listDTO;
	}

	
}//class
