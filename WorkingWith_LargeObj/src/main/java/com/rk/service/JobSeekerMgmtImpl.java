package com.rk.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rk.dto.JobSeekerDTO;
import com.rk.entity.JobSeeker;
import com.rk.repository.JobSeekerRepository;

@Service("jobService")
public class JobSeekerMgmtImpl implements IJobSeekerMgmtService{

	@Autowired
	private JobSeekerRepository jobRepo;
	
	@Override
	public int regJobSeeker(JobSeekerDTO dto) {
		
		//convert DTO to Entity
		JobSeeker entity=new JobSeeker();
		BeanUtils.copyProperties(dto, entity);
		
		//use Repo
		int id=jobRepo.save(entity).getJsid();
		
		return id;
	
	}//method

}//class
