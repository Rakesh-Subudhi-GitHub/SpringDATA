package com.rk.service;

import java.util.List;

import com.rk.dto.EmployeDTO;

public interface IEmployeService {

	public List<EmployeDTO> getPageRecord(int pageNo,int pageSize);
	public void getRecordsByPagination(int pagesizes);
}
