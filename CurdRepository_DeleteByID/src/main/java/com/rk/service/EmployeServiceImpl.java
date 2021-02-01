package com.rk.service;

import java.util.Optional;

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
	public String removeEmpByID(int id) {
		
		Optional<Employe> opt=empRepo.findById(id);
		
		if(opt.isPresent())
		{
			empRepo.delete(opt.get());
			return "Employe details are completely deleted ";
		}
		else
		return "Employe is not deleted";
	}

}//class
