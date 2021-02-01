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
public class WorkingDateValuesApplication {

	public static void main(String[] args) {
		
		//properties
		ApplicationContext ctx=null;
		
		ICustInfoMgmtService service=null;
		
		//create IOC container
		ctx=SpringApplication.run(WorkingDateValuesApplication.class, args);
		
		//get service class obj
		service=ctx.getBean("custService",ICustInfoMgmtService.class);
		
		//prepared DTO class
		CustomerInfoDTO dto=new CustomerInfoDTO();
		
		dto.setCustName("rakesh");
		dto.setCustAdd("hyd");
		dto.setBillAmt(21545.5f);
		dto.setDob(LocalDate.of(1990,10,20));
		dto.setTob(LocalTime.of(12,50));
		dto.setBillDate(LocalDateTime.now());
		
		//invoke the method
		int custid=service.regCutomer(dto);
		
		System.out.println("customer register suceufull cust id is :: "+custid);
	}//main

}//class
