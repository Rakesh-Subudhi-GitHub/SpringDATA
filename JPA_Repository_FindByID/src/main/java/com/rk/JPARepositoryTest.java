package com.rk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

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
		System.out.println("Emp details is:: "+service.getEmployeDetailsById(1));
	}//main

}//class
