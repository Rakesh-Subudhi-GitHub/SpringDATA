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
	public String removeEmployeById(int id) {
	
		//use empRepo
		if(empRepo.existsById(id))
		{
			empRepo.deleteById(id);
			return id+" emp details is succesfully deleted::: ";
		}
		else
		     return id+"emp does not exists";
	}//method

}//class
