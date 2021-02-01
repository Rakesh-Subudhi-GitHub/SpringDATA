package com.rk.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rk.document.Customer;
import com.rk.dto.CustomerDTO;
import com.rk.repository.CustomerRepository;

@Service("custService")
public class CustomerMgmtServiceImpl implements ICustomerMgmtService {

	@Autowired
	private CustomerRepository custRepo;

	@Override
	public Optional<CustomerDTO> fetchCustomerByCno(int cno) {
//	
//		//use reop
//		Optional<Customer> doc=custRepo.findById(cno);
//		
//		//convert  Document obj to DTO object
//		Optional<CustomerDTO> dto=null;
//		
//		if(doc.isPresent()) {
//			 dto=Optional.of(new CustomerDTO());
//		    BeanUtils.copyProperties(doc.get(),dto.get());
//		}
//		else
//		  dto=Optional.empty();
//		
//		return dto;
		return null;
	}

	@Override
	public List<CustomerDTO> fetchCustomersByCadd(String cadd) {
		
		//use repo
		List<Customer> listDocs=custRepo.findByCadd(cadd);
		
		//convert listDocs to  listDTO
		List<CustomerDTO> listDTO=new ArrayList();
		listDocs.forEach(doc->{
		  CustomerDTO dto=new CustomerDTO();
		  BeanUtils.copyProperties(doc, dto);
		  listDTO.add(dto);
		});
		
		return listDTO;
	}

	@Override
	public List<CustomerDTO> fetchCustomersByCnoRange(int start, int end) {
		
		//use repo
				List<Customer> listDocs=custRepo.findByCnoBetween(start, end);
		
				//convert listDocs to  listDTO
				List<CustomerDTO> listDTO=new ArrayList();
				listDocs.forEach(doc->{
				  CustomerDTO dto=new CustomerDTO();
				  BeanUtils.copyProperties(doc, dto);
				  listDTO.add(dto);
				});
				
				return listDTO;
	}

}//class
