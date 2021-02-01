package com.rk;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.rk.dto.EmployeDTO;
import com.rk.service.IEmployeService;

@SpringBootApplication
public class JPARepositoryTest {

	public static void main(String[] args) {
		
		//properties
		ApplicationContext ctx=null;
		IEmployeService service=null;
		
		//create IOC container
		ctx=SpringApplication.run(JPARepositoryTest.class, args);
		
		//use service class config
		service=ctx.getBean("empService",IEmployeService.class);
		
		//invoke the method
		try {
			service.removeEmpInBatch(List.of(new EmployeDTO(10),new EmployeDTO(12),new EmployeDTO(11)));
			System.out.println("employe is deleted successfully");
		}//try
		catch (Exception e) {
		System.out.println("employe is not deleeted its some internal problem here");	
		}
	}//main

}//class
