package com.rk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.rk.repository.IEmoployeRepo;

@SpringBootApplication
public class FinderMethodEntityOperationApplication_Custom {

	public static void main(String[] args) {
		
		//property
		ApplicationContext ctx=null;
	
		IEmoployeRepo empRepo=null;
		
		//create IOC container
		ctx=SpringApplication.run(FinderMethodEntityOperationApplication_Custom.class, args);
	
		//get proxy class object
		empRepo=ctx.getBean(IEmoployeRepo.class);
		
		//intyernal proxy class name 
		System.out.println("internal proxy class is ::"+empRepo.getClass().getName());
		
		//invoke the method
		empRepo.findByEadd("hyd").forEach(System.out::println);
		
		//close ctx
		((ConfigurableApplicationContext) ctx).close();
		
	}//main

}//class
