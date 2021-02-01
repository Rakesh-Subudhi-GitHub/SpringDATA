package com.rk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.rk.repository.IEmoployeRepo;

@SpringBootApplication
public class FinderMethodScalar_Custom_Query_Method_ScalarOperation {

	public static void main(String[] args) {
		
		//property
		ApplicationContext ctx=null;
	
		IEmoployeRepo empRepo=null;
		
		//create IOC container
		ctx=SpringApplication.run(FinderMethodScalar_Custom_Query_Method_ScalarOperation.class, args);
	
		//get proxy class object
		empRepo=ctx.getBean(IEmoployeRepo.class);
		
		//invoke the method
		System.out.println(empRepo.getEmployeDetailsByEno(10));
		
		//invoke the method
	/* Object obj=empRepo.getEmployeDetailsByEno(10);
		Object row[]=(Object[]) obj;
		System.out.println(row[0]+"   "+row[1]);   */
		
		//invoke the method
		float sal=empRepo.getEmployesal(10);
		System.out.println("sal is:: "+sal);
		
		//close ctx
		((ConfigurableApplicationContext) ctx).close();
		
	}//main

}//class
