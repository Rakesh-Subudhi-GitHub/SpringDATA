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
		empRepo.getEmployeDetailsByCity("hyd","bbs","bbsr").forEach(row->{
			System.out.println(row[0]+"   "+row[1]+"  "+row[2]);
		});
		
		System.out.println("================================================================");
		
		//invoke the method
		empRepo.getEmployeDetailsByNameLatter("r%").forEach(row->{
			System.out.println(row[0]+"    "+row[1]+"   "+row[2]);
		});
		
		System.out.println("=================================================================");
		
		//invoke the method
		empRepo.getEmployeDetailsByEnoRange(1,10).forEach(System.out::println);
		
		System.out.println("===============================================================");
		//invoke the method
		empRepo.getEmployeDetailsByName("raja","rakesh","suresh").forEach(System.out::println);
		
		//close ctx
		((ConfigurableApplicationContext) ctx).close();
		
	}//main

}//class
