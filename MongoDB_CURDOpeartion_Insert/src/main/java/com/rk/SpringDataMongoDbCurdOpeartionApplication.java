package com.rk;

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
		//System.out.println(service.registerCutomer(new CustomerDTO(900,"raka","hyd",85968.8f)));
		
		//dto
		CustomerDTO dto=new CustomerDTO();
		dto.setCno(902);
		dto.setCname("devi");
		dto.setCadd("bbs");
		dto.setBillAmt(91000.0f);
		
		//invoke the method
		System.out.println(service.registerCutomer(dto));
		//close ctx
		((ConfigurableApplicationContext) ctx).close();
	}//main

}//class
