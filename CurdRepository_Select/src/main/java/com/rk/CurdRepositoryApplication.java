package com.rk;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.rk.dto.EmployeDTO;
import com.rk.service.IEmployeService;

@SpringBootApplication
public class CurdRepositoryApplication {

	public static void main(String[] args) {
		//properties
		ApplicationContext ctx=null;
		IEmployeService service=null;
		
		//Create IOC container
		ctx=SpringApplication.run(CurdRepositoryApplication.class, args);
	
		//get Service class obj
		service=ctx.getBean("empService",IEmployeService.class);
	
		//invoke the Service class
		   service.getEmpDetails().forEach(System.out::println);;
	}//main

}//class
