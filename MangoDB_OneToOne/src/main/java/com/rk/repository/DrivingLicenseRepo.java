package com.rk.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.rk.document.DrivingLicense;

public interface DrivingLicenseRepo extends MongoRepository<DrivingLicense,String> {

}
