package com.rk;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.rk.repository.IEmoployeRepo;
import com.rk.repository.ResultView;

@SpringBootApplication
public class FinderMethodScalar_Static_OperationApplication_Custom {

	public static void main(String[] args) {
		
		//property
		ApplicationContext ctx=null;
	
		IEmoployeRepo empRepo=null;
		
		//create IOC container
		ctx=SpringApplication.run(FinderMethodScalar_Static_OperationApplication_Custom.class, args);
	
		//get proxy class object
		empRepo=ctx.getBean(IEmoployeRepo.class);
		
		//intyernal proxy class name 
		System.out.println("internal proxy class is ::"+empRepo.getClass().getName());
		
		//invoke the method
		List<ResultView> list=empRepo.findByEaddIn(List.of("hyd","bbs","bbsr"));
		
		//print output
		list.forEach(view->{
			System.out.println(view.getEno()+"     "+view.getEadd());
		});
		
		//close ctx
		((ConfigurableApplicationContext) ctx).close();
		
	}//main

}//class
