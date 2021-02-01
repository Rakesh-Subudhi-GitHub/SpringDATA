package com.rk;

import java.util.List;
import java.util.Random;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.rk.Service.CustomerMgmtServiceImpl;
import com.rk.Service.ICustomerMgmtService;
import com.rk.dto.CustomerDTO;

@SpringBootApplication
public class SpringDataMongoDbCurdOpeartionApplication {

	public static void main(String[] args) {
		//properties
		ApplicationContext ctx=null;
		ICustomerMgmtService service=null;
		
		//create IOC container
		ctx=SpringApplication.run(SpringDataMongoDbCurdOpeartionApplication.class, args);
	
		//use service
		service=ctx.getBean("custService",ICustomerMgmtService.class);
	
		//invoke the method					print each record
		service.fetchAllCustomerRecord().forEach(System.out::println);
		
		//close ctx
		((ConfigurableApplicationContext) ctx).close();
	}//main

}//class
