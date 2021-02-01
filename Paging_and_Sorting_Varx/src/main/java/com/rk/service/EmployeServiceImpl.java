package com.rk.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import  org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.rk.dto.EmployeDTO;
import com.rk.entity.Employe;
import com.rk.repository.IEmoployeRepo;

@Service("empService")
public class EmployeServiceImpl implements IEmployeService {

	@Autowired
	private IEmoployeRepo empRepo;
	
	@Override
	public List<EmployeDTO> getAllEmpDetailsbySorting(boolean asc, String... property) {
		//use empRepo
				List<Employe> listEntity=(List<Employe>) empRepo.findAll(asc?Sort.by(Sort.Direction.ASC,"ename"):
																															Sort.by(Sort.Direction.DESC,"ename"));
				
				//convert entity to dto
				List<EmployeDTO> listdtos=new ArrayList();
				
				listEntity.forEach(entity->{
					EmployeDTO dto=new EmployeDTO();
					//copy
					BeanUtils.copyProperties(entity, dto);
					
					listdtos.add(dto);
				});
		return listdtos;
	}

}
