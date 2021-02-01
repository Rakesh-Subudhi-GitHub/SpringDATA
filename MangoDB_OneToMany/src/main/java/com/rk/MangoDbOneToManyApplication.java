package com.rk;

import java.time.LocalDate;
import java.util.Map;
import java.util.Set;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.rk.dto.BankAccountDTO;
import com.rk.dto.PersonInfoDTO;
import com.rk.dto.VisaInfoDTO;
import com.rk.service.IPersonService;
import com.rk.service.PersonInfoServiceImpl;

@SpringBootApplication
public class MangoDbOneToManyApplication {

	public static void main(String[] args) {
		
		ApplicationContext ctx=null;
		IPersonService service=new PersonInfoServiceImpl();
		
		//create IOC container
		ctx=SpringApplication.run(MangoDbOneToManyApplication.class, args);
	
		//get Service class
		service=ctx.getBean("personService",IPersonService.class);
	
		//inistialise the value
		VisaInfoDTO  visaDTO=new VisaInfoDTO(567778L,"USA",LocalDate.of(2030, 10, 10));
		VisaInfoDTO  visaDTO1=new VisaInfoDTO(567718L,"CANDADA",LocalDate.of(2031, 10, 10));
		
		BankAccountDTO  accDTO1=new BankAccountDTO(1465654L, "savings",70000.0f);
		BankAccountDTO  accDTO2=new BankAccountDTO(2465654L, "current",170000.0f);
		BankAccountDTO  accDTO3=new BankAccountDTO(3465654L, "savings",270000.0f);
		
		//main class
		PersonInfoDTO  dto=new PersonInfoDTO(4561, "rakesh", "hyd",
				
				Set.of(visaDTO, visaDTO1),
				Map.of("account1",accDTO1,"account2",accDTO2,"account3",accDTO3));
		
		//calling method
		System.out.println(service.saveData(dto));

	}//main

}//class
