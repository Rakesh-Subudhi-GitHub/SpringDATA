package com.rk.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.rk.document.Customer;

public interface CustomerRepository extends MongoRepository<Customer,String> {

}
