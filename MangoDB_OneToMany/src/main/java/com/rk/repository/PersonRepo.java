package com.rk.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.rk.document.PersonInfo;

public interface PersonRepo extends MongoRepository<PersonInfo,String> {

}
