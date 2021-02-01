package com.rk.Service;

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
	public String registerCutomer(CustomerDTO dto) {
		
		//all dto value send to document
		Customer custDoc=new Customer();
		
		//all properties transfer
		BeanUtils.copyProperties(dto, custDoc);

		//save the documentFile in mongo db
		//use custRepo
		custDoc=custRepo.save(custDoc);
		
		
		return "Save the object Sucessfully and cno :: "+custDoc.getCno();
	}//method

}//class
