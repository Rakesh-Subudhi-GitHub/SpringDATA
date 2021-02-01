package com.rk.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rk.dto.EmployeDTO;
import com.rk.entity.Employe;
import com.rk.repository.IEmoployeRepo;

@Service("empService")
public class EmployeServiceImpl implements IEmployeService {

	@Autowired
	private IEmoployeRepo empRepo;

	@Transactional
	@Override
	public List<Employe> removeEmpInBatch(List<EmployeDTO> listdto) {
		
		List<Employe> listEntity=new ArrayList();
		
		//add each element of dto to entity
		listEntity.forEach(dto->{
			
			Employe entity=new Employe();
			BeanUtils.copyProperties(dto, entity);
			
			listEntity.add(dto);
		});
		
		//remove all listentity use empRepo
		empRepo.deleteInBatch(listEntity);
		
		return listEntity;
	}
	
}//class
