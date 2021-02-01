package com.rk.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.rk.dto.EmployeDTO;
import com.rk.entity.Employe;
import com.rk.repository.IEmoployeRepo;

import ch.qos.logback.core.joran.util.beans.BeanUtil;

@Service("empService")
public class EmployeServiceImpl implements IEmployeService {

	@Autowired
	private IEmoployeRepo empRepo;

	@Override
	public List<EmployeDTO> getPageRecord(int pageNo, int pageSize) {
	
		//prepared pageable object having pageNo,pageSize
						//	Pageable pageable=PageRequest.of(pageNo, pageSize);
		Pageable pageable=PageRequest.of(pageNo, pageSize,org.springframework.data.domain.Sort.Direction.ASC,"eno");
		
		//get Page<T> object
		Page<Employe> page=empRepo.findAll(pageable);
		
		//get ListEntity from Page<T> obj
		List<Employe> listEntity=page.getContent();
		
		//convert listentity to listdto
		List<EmployeDTO> listdto=new ArrayList();
		
		listEntity.forEach(entity->{
			  EmployeDTO dto=new  EmployeDTO();
			  BeanUtils.copyProperties(entity, dto);
			  listdto.add(dto);
									});
		
		return listdto;
	
	}//method

	@Override
	public void getRecordsByPagination(int pagesizes) {
		
		//get total no in records
		long count=empRepo.count();
		
		//get total no of page
		int pageCount=(int) (count/pagesizes);
		
		if(count%pagesizes!=0)
		{
			pageCount++;
			
			//display record page by page
			for(int i=0;i<pageCount;++i)
			{
				 Pageable pageable=PageRequest.of(i, pagesizes);
				 Page<Employe> page=empRepo.findAll(pageable);
				 List<Employe> listEntities=page.getContent();
				   listEntities.forEach(System.out::println);
				   System.out.println(page.getNumber()+1+" of"+page.getTotalPages());
				   System.out.println("---------------------------------------------");
				   }//for
		}//if
	}//method

}//class
