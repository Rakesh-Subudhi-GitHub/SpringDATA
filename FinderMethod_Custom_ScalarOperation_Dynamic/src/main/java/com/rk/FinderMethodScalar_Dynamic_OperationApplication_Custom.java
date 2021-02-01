package com.rk;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.rk.repository.IEmoployeRepo;
import com.rk.view.ResultView;
import com.rk.view.ResultView1;
import com.rk.view.ResultView2;

@SpringBootApplication
public class FinderMethodScalar_Dynamic_OperationApplication_Custom {

	public static void main(String[] args) {
		
		//property
		ApplicationContext ctx=null;
	
		IEmoployeRepo empRepo=null;
		
		//create IOC container
		ctx=SpringApplication.run(FinderMethodScalar_Dynamic_OperationApplication_Custom.class, args);
	
		//get proxy class object
		empRepo=ctx.getBean(IEmoployeRepo.class);
		
		//intyernal proxy class name 
		System.out.println("internal proxy class is ::"+empRepo.getClass().getName());
		
		//invoke the method
		System.out.println("ResultView properties value print");
		List<ResultView> list=empRepo.findByEadd("hyd",ResultView.class);
		
		//print output
		list.forEach(view->{
			System.out.println(view.getEno()+"     "+view.getEadd());
		});
		
		//invoke the method with ResultView1
		System.out.println("====================================================================");
		System.out.println("ResultView1 properties value print");
				
		List<ResultView1> list1=empRepo.findByEadd("hyd",ResultView1.class);
				
				//print output
				list1.forEach(view1->{
					System.out.println(view1.getEno()+"     "+view1.getEname());
				});
		
		//invoke the method with ResultView2
			System.out.println("==================================================================");
			System.out.println("ResultView2 properties value print");
				
			List<ResultView2> list2=empRepo.findByEadd("hyd",ResultView2.class);
				
				//print output
				list2.forEach(view2->{
					System.out.println(view2.getEname()+"     "+view2.getEsal());
				});
		
		//close ctx
		((ConfigurableApplicationContext) ctx).close();
		
	}//main

}//class
