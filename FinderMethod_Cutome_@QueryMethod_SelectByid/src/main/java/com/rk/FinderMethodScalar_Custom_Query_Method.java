package com.rk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.rk.repository.IEmoployeRepo;

@SpringBootApplication
public class FinderMethodScalar_Custom_Query_Method {

	public static void main(String[] args) {
		
		//property
		ApplicationContext ctx=null;
	
		IEmoployeRepo empRepo=null;
		
		//create IOC container
		ctx=SpringApplication.run(FinderMethodScalar_Custom_Query_Method.class, args);
	
		//get proxy class object
		empRepo=ctx.getBean(IEmoployeRepo.class);
		
		//invoke the method
		empRepo.getEmployeDetails("raja").forEach(System.out::println);
		
		//close ctx
		((ConfigurableApplicationContext) ctx).close();
		
	}//main

}//class
