package com.rk.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rk.document.Customer;
import com.rk.dto.CustomerDTO;
import com.rk.repository.CustomerRepository;

import ch.qos.logback.core.joran.util.beans.BeanUtil;

@Service("custService")
public class CustomerMgmtServiceImpl implements ICustomerMgmtService {

	@Autowired
	private CustomerRepository custRepo;

	@Override
	public List<CustomerDTO> fetchAllCustomerRecord() {
	
		//use custRepo
		List<Customer> listDoc=custRepo.findAll();
		
		//convert all Document to DTO
		List<CustomerDTO> listdto=new ArrayList();
		
		//transfer 
		listDoc.forEach(doc->{
			CustomerDTO dto=new CustomerDTO();
			//each record copy
			BeanUtils.copyProperties(doc, dto);
			
			//add listDTO
			listdto.add(dto);
		});
		
		//return all record
		return listdto;
		
	}//method

}//class
