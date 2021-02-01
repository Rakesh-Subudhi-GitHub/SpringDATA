package com.rk.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.rk.document.Customer;

//public interface CustomerRepository extends MongoRepository<Customer,String> {


// if not take mongo db id  then it change pk =String to Integer and (remove the DTO or Document string id)    
public interface CustomerRepository extends MongoRepository<Customer,Integer> {
	
	public   List<Customer>  findByCadd(String cadd);
	
    public  List<Customer>  findByCnoBetween(int start,int end);
}
