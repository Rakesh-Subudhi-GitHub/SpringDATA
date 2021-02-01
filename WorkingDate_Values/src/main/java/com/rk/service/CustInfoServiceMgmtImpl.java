package com.rk.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rk.Repository.CustInfoRepository;
import com.rk.dto.CustomerInfoDTO;
import com.rk.entity.CustomerInfo;

@Service("custService")
public class CustInfoServiceMgmtImpl implements ICustInfoMgmtService {

	@Autowired
	private CustInfoRepository custRepo;
	
	@Override
	public int regCutomer(CustomerInfoDTO dto) {
	
		//convert dto to entity  dto-->entity
		CustomerInfo entity=new CustomerInfo();
		BeanUtils.copyProperties(dto, entity);
		
		//use custRepo to insert the record
		int custid=custRepo.save(entity).getCustId();
		
		return custid;
	
	}//service

}
