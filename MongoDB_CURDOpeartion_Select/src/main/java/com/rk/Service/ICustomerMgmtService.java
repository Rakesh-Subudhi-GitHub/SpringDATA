package com.rk.Service;

import java.util.List;

import com.rk.dto.CustomerDTO;

public interface ICustomerMgmtService {

	public List<CustomerDTO> fetchAllCustomerRecord();
}
