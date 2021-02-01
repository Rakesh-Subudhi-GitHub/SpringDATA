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
		       int []ids=service.regEmployeGroup(List.of(new EmployeDTO("raja", "hyd", 158754.87f),
		        																																		new EmployeDTO("rohit", "bbs",858758.54f),
		        																																		new EmployeDTO("laxmi", "fdds",58758.54f),
		        																																		new EmployeDTO("saknc", "dssd",9958.54f),
		        																																		new EmployeDTO("eewew", "scbbs",50758.54f),
		        																																		new EmployeDTO("reede", "bbs",858758.54f),
		        																																		new EmployeDTO("qwewe", "sdbbs",8758.54f)));
		
		       System.out.println("inserting id is :: "+Arrays.toString(ids));
		       
		       System.out.println("--------------------------------------------------------------");
		       System.out.println("employe count is :: "+service.getEmployeCount());
	}//main

}//class
