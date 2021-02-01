package com.rk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.rk.service.IEmployeService;

@SpringBootApplication
public class PagingAndSortingVarxApplication {

	public static void main(String[] args) {
		
		//properties
		ApplicationContext ctx=null;
		IEmployeService service=null;
		
		//create IOC container
		ctx=SpringApplication.run(PagingAndSortingVarxApplication.class, args);
		
		//use service class config
		service=ctx.getBean("empService",IEmployeService.class);
		
		//invoke the method
		//service.getPageRecord(2, 3).forEach(System.out::println);
		System.out.println("------------------------------------------------------------------------------------");
		
		
		service.getRecordsByPagination(3);
	}//main

}//class
