package com.rk;

import java.util.List;

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
		empRepo.findByEnameAndEadd("raja","hyd").forEach(System.out::println);
		
		System.out.println("===========================================================");
		empRepo.findByEsalBetween(10000,20000).forEach(System.out::println);
		
		System.out.println("===========================================================");
		empRepo.findByEnameStartingWithAndEaddStartingWith("r","h").forEach(System.out::println);
		
		System.out.println("============================================================");
		empRepo.findByEnoGreaterThanEqualAndEnameEndingWithOrEsalBetween(12,"a",10000,20000).forEach(System.out::println);
		
		System.out.println("============================================================");
		empRepo.findByEnameInOrEaddIn(List.of("raja","rohit","Rakesh"),
																	        List.of("hyd","bbs","bbsr")).forEach(System.out::println);
		//close ctx
		((ConfigurableApplicationContext) ctx).close();
		
	}//main

}//class
