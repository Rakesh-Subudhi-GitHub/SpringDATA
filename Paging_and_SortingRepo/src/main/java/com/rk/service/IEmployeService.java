package com.rk.service;

import java.util.List;

import com.rk.dto.EmployeDTO;

public interface IEmployeService {

	public List<EmployeDTO> getAllEmpDetails(String property,boolean asc);
}
