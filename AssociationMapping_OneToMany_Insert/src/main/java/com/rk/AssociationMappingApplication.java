package com.rk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.rk.service.CompanyMgmtServiceImpl;
import com.rk.service.ICompanyMgmtService;

@SpringBootApplication
public class AssociationMappingApplication {

	public static void main(String[] args) {
		//properties
		ApplicationContext ctx=null;
		
		//create IOC container
		ctx=SpringApplication.run(AssociationMappingApplication.class, args);
		
		//get Service class object
		ICompanyMgmtService service=ctx.getBean("compService",ICompanyMgmtService.class);
		
		//invoke the method
		try {
			//calling the method 
			//service.saveDataUsingParent();
			
			service.saveDataUsingChild();
		}
		catch (Exception e) {
			System.out.println("Object is not saved::::");
			e.printStackTrace();
		}
		
		//close ctx
		((ConfigurableApplicationContext) ctx).close();
		
	}//main

}//class
