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
		empRepo.findByEsalLessThan(10000).forEach(System.out::println);
		
		System.out.println("=========================================================");
		empRepo.findByEsalGreaterThan(10000).forEach(System.out::println);
		
		System.out.println("=========================================================");
		empRepo.findByEnameLike("r%").forEach(System.out::println);
		
		System.out.println("===========================================================");
		empRepo.findByEaddIn(List.of("bbs","hyd","ctc")).forEach(System.out::println);
		
		System.out.println("===========================================================");
		empRepo.findByEaddNotIn(List.of("bbs","hyd","ctc")).forEach(System.out::println);
		
		System.out.println("===========================================================");
		empRepo.findByEaddOrderByEnoAsc("hyd").forEach(System.out::println);
		
		//close ctx
		((ConfigurableApplicationContext) ctx).close();
		
	}//main

}//class
