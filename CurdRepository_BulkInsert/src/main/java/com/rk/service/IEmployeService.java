package com.rk.service;

import java.util.List;

import com.rk.dto.EmployeDTO;

public interface IEmployeService {

	public int[] regEmployeGroup(List<EmployeDTO> listdto);

	public long getEmployeCount();
}
