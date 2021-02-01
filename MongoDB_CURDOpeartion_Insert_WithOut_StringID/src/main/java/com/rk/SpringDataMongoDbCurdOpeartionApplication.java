package com.rk;

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
	
		//invoke the method
	
		//dto
		CustomerDTO dto=new CustomerDTO();
		
		dto.setCno(new Random().nextInt(1000));
		dto.setCname("xyz");
		dto.setCadd("abc");
		dto.setBillAmt(85858.80f);
		
		//invoke the method
		System.out.println(service.registerCutomer(dto));
		//close ctx
		((ConfigurableApplicationContext) ctx).close();
	}//main

}//class
