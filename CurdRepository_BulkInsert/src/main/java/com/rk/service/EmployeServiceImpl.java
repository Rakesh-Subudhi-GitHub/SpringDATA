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
	public int[] regEmployeGroup(List<EmployeDTO> listdto) {
		
		//convert listdto to empRepo
		List<Employe> listEntity=new ArrayList();
		
		//list of Entity is add one by one
		listdto.forEach(dto->{
			Employe entity=new Employe();
			BeanUtils.copyProperties(dto, entity);
			
			//add value in list
			listEntity.add(entity);
		
			});
		
		//use EmpRepo
		List<Employe> listEntity1=(List<Employe>) empRepo.saveAll(listEntity);
		
		//gather ids to return array
		int[] ids=new int[listEntity1.size()];
		
		for(int i=0;i<listEntity1.size();i++)
		{
			ids[i]=listEntity1.get(i).getEno();
		}
		
		return ids;
		
	}//main

	@Override
	public long getEmployeCount() {
		
		//use empRepo
		long count=empRepo.count();
		
		return count;
	}

}//class
