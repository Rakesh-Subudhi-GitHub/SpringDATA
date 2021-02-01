package com.rk.Service;

import java.util.List;
import java.util.Optional;

import com.rk.dto.CustomerDTO;

public interface ICustomerMgmtService {

	public  Optional<CustomerDTO>  fetchCustomerByCno(int cno);
	
    public   List<CustomerDTO>  fetchCustomersByCadd(String cadd);
    
    public   List<CustomerDTO>  fetchCustomersByCnoRange(int start,int end);
}
