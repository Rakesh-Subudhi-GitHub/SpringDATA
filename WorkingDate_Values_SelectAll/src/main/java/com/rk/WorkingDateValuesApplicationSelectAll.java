package com.rk;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.rk.dto.CustomerInfoDTO;
import com.rk.service.ICustInfoMgmtService;

@SpringBootApplication
public class WorkingDateValuesApplicationSelectAll {

	public static void main(String[] args) {
		
		//properties
		ApplicationContext ctx=null;
		
		ICustInfoMgmtService service=null;
		
		//create IOC container
		ctx=SpringApplication.run(WorkingDateValuesApplicationSelectAll.class, args);
		
		//get service class obj
		service=ctx.getBean("custService",ICustInfoMgmtService.class);
	
		//invoke the method
		service.selectCutomerDetails().forEach(System.out::println);
		
	}//main

}//class
