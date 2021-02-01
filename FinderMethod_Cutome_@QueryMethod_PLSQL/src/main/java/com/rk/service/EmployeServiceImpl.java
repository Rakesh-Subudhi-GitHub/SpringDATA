package com.rk.service;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureQuery;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.object.StoredProcedure;
import org.springframework.stereotype.Service;

import com.rk.dto.EmployeDTO;
import com.rk.entity.Employe;

@Service("empService")
public class EmployeServiceImpl implements IEmployeService{

	@Autowired
	private EntityManager em; //automatically config in empRepo or entity class
	
	@Override
	public List<EmployeDTO> fetchEmployeBySalRange(float startSal, float endSal) {
		
		//create and StoreProcedure Object
		StoredProcedureQuery procedure=em.createStoredProcedureQuery("P_GET_EMPS_BY_SALRANGE",Employe.class);
		
		//register PL/SQL procedure parameters
		procedure.registerStoredProcedureParameter(1,Float.class,ParameterMode.IN);
		procedure.registerStoredProcedureParameter(2,Float.class,ParameterMode.IN);
		procedure.registerStoredProcedureParameter(3,Employe.class,ParameterMode.REF_CURSOR);
		
		//set value IN parameters
		procedure.setParameter(1,startSal);
		procedure.setParameter(2,endSal);
		
		//class PL/SQL procedure
		List<Employe> listEntity=procedure.getResultList();
		
		//convert listEntity to listDto
		List<EmployeDTO> listDto=new ArrayList();
		
		listEntity.forEach(entity->{
			EmployeDTO dto=new EmployeDTO();
			BeanUtils.copyProperties(entity, dto);
			
			listDto.add(dto);
		});
		
		return listDto;
		
	}//method

}//class
