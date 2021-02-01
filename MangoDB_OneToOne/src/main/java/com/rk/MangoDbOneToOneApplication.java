package com.rk;

import java.time.LocalDate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.rk.document.DrivingLicense;
import com.rk.document.Person;
import com.rk.repository.PersonRepo;

@SpringBootApplication
public class MangoDbOneToOneApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		
		PersonRepo perRepo=null;
		DrivingLicense licRepo=null;
		
		//create IOC container
		ctx=SpringApplication.run(MangoDbOneToOneApplication.class, args);

		//Repository call
		perRepo=ctx.getBean(PersonRepo.class);
	
		//prepared obj
		Person per=new Person(1000, "raja", "bbsr",
														new DrivingLicense(20,"2 whiler",LocalDate.of(2031, 10, 10)));
		
		//save the method
		perRepo.save(per);
		
		System.out.println("save the object id is ::  "+per.getPid());
	}//main

}//class
