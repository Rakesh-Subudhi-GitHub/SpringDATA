package com.rk.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.rk.document.Person;

public interface PersonRepo extends MongoRepository<Person,String> {

}
