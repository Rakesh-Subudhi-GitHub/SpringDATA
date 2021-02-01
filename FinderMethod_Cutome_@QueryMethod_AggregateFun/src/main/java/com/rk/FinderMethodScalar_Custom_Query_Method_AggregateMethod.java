package com.rk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.rk.repository.IEmoployeRepo;

@SpringBootApplication
public class FinderMethodScalar_Custom_Query_Method_AggregateMethod {

	public static void main(String[] args) {
		
		//property
		ApplicationContext ctx=null;
	
		IEmoployeRepo empRepo=null;
		
		//create IOC container
		ctx=SpringApplication.run(FinderMethodScalar_Custom_Query_Method_AggregateMethod.class, args);
	
		//get proxy class object
		empRepo=ctx.getBean(IEmoployeRepo.class);
		
		//invoke the method
		long count=empRepo.getEmployeCount();
		System.out.println("employe table count is ::  "+count);
		
		//invoke the method
		Object result[]=(Object[])empRepo.getEmployeAggregateData();
		System.out.println("MAX SAL :: "+result[0]+"  MIN SAL :: "+result[1]+"  AVG SAL :: "+result[2]);
		
		//close ctx
		((ConfigurableApplicationContext) ctx).close();
		
	}//main

}//class
