package com.rk;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.rk.document.Customer;
import com.rk.repository.CustomerRepository;

@SpringBootApplication
public class SpringDataMongoDbCurdOpeartionApplication {

	public static void main(String[] args) {
		//properties
		ApplicationContext ctx=null;
		
		CustomerRepository custRepo=null;
		
		//create IOC container
		ctx=SpringApplication.run(SpringDataMongoDbCurdOpeartionApplication.class, args);
	
		//use service
		custRepo=ctx.getBean(CustomerRepository.class);
	
		
		//get all customer details
		//use CustomerRepo
		
		//invoke methods
				/*List<Object[]> list=custRepo.getData("hyd");
				list.forEach(row->{
					for(Object val:row) {
						System.out.print(val+"  ");
					}
					System.out.println();
				});
				*/
				System.out.println("..................................");
		
				/*List<Customer> list=custRepo.getAllData("hyd");
				list.forEach(cust->{
					System.out.println(cust);
				});*/
				
				/*System.out.println("..................................");
				
				List<Customer> list=custRepo.getAllData1("hyd","suresh");
				list.forEach(cust->{
					System.out.println(cust);
				});*/
				
				System.out.println("..................................");
				
				//List<Customer> list=custRepo.getRegData("^h");  // cadd starting with h
				//List<Customer> list=custRepo.getRegData("g$");  // cadd end with g
				/*		List<Customer> list=custRepo.getRegData("z");  // cadd containing  y
						list.forEach(cust->{
							System.out.println(cust);
						});
				*/		
				
			/*	List<Customer> list=repo.getDataByCnoRange(3000,10000);
				list.forEach(System.out::println); */
				
				List<Customer> list=custRepo.getDataByOrCond("^s","hyd");
				list.forEach(System.out::println);
	}//method
}//class
