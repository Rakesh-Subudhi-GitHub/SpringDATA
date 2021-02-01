package com.rk.service;

import java.util.ArrayList;
import java.util.List;

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
	public List<CustomerInfoDTO> selectCutomerDetails() {
		
		//use CutoRepo find all details
		List<CustomerInfo> listEntity=custRepo.findAll();
		
		//convert listEntity to listDto entity-->dto
		List<CustomerInfoDTO> listdto=new ArrayList();
		
		listEntity.forEach(entity->{
			CustomerInfoDTO dto=new CustomerInfoDTO();
			BeanUtils.copyProperties(entity, dto);
		    
			listdto.add(dto);	
		});
		
		return listdto;
	}//method
	
	}//service

