package com.rk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.rk.repository.IEmoployeRepo;
import com.rk.service.IEmployeService;

@SpringBootApplication
public class FinderMethodScalar_Custom_Query_PLSQL{

	public static void main(String[] args) {
		
		//property
		ApplicationContext ctx=null;

		IEmployeService service=null;
		
		//create IOC container
		ctx=SpringApplication.run(FinderMethodScalar_Custom_Query_PLSQL.class, args);
	
		//get service class object
		service=ctx.getBean("empService",IEmployeService.class);
		
		//invoke the method
		service.fetchEmployeBySalRange(10000,100000).forEach(System.out::println);
		
		//close ctx
		((ConfigurableApplicationContext) ctx).close();
		
	}//main

}//class
