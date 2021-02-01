package com.rk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.rk.repository.IEmoployeRepo;

@SpringBootApplication
public class FinderMethodScalar_Custom_Query_Method_Update {

	public static void main(String[] args) {
		
		//property
		ApplicationContext ctx=null;
	
		IEmoployeRepo empRepo=null;
		
		//create IOC container
		ctx=SpringApplication.run(FinderMethodScalar_Custom_Query_Method_Update.class, args);
	
		//get proxy class object
		empRepo=ctx.getBean(IEmoployeRepo.class);
		
		//invoke the method
		//int count=empRepo.updateSAL(10000, 100000);
		//System.out.println(count+" employe is updated");
		
		//invoke the method
		int count=empRepo.deleteEmploye(10);
		System.out.println(count+"  empley data deleted");
		//close ctx
		((ConfigurableApplicationContext) ctx).close();
		
	}//main

}//class
