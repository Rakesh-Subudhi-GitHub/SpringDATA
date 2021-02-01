package com.rk;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStream;
import java.io.Reader;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.dao.DataAccessException;

import com.rk.dto.JobSeekerDTO;
import com.rk.entity.JobSeeker;
import com.rk.service.IJobSeekerMgmtService;

@SpringBootApplication
public class WorkingWithLargeObjApplication {

	public static void main(String[] args) {
		
		//properties
		ApplicationContext ctx=null;
		
		IJobSeekerMgmtService service=null;
		
		//create IOC container
		ctx=SpringApplication.run(WorkingWithLargeObjApplication.class, args);
	
		//get service class object
		service=ctx.getBean("jobService",IJobSeekerMgmtService.class);
		
		//client entering values
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter JobSekeer name:: ");
		String name=sc.next();
		System.out.println("enter JobSekeer address:: ");
		String add=sc.next();
		System.out.println("enter JobSekeer qlfy:: ");
		String qlfy=sc.next();
		
		System.out.println("enter JobSeeker photoLocation :: ");
		String photoLocation=sc.next();
		
		System.out.println("enter JobSeeker resumelocation :: ");
		String resumeLocation=sc.next();
		
		try {
			
			//create byte[] representing BLOB file(photo file)
			InputStream is=new FileInputStream(photoLocation);
			byte[] photoContext=new byte[is.available()];
			is.read(photoContext);
			
			//create char[] representing CLOB file(Resume file)
			File file=new File(resumeLocation);
			Reader reader=new FileReader(file);
			char[] resumeContext=new char[(int) file.length()];
			reader.read(resumeContext);
		
			//create DTO class obj
			JobSeekerDTO dto=new JobSeekerDTO();
			dto.setJsname(name);
			dto.setQlfy(qlfy);
			
			dto.setPhoto(photoContext);
			dto.setResume(resumeContext);
			
			//invoke the method
			int id=service.regJobSeeker(dto);
			System.out.println("JobSeeker registaion successfully id is ::"+id);
			
		}//try
		
		catch (DataAccessException dae) {
			dae.printStackTrace();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		//close ctx
		((ConfigurableApplicationContext) ctx).close();
		
	}//main

}//class
