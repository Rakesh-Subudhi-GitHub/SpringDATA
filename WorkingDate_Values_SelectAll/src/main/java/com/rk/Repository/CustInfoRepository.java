package com.rk.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rk.entity.CustomerInfo;

public interface CustInfoRepository extends JpaRepository<CustomerInfo,Integer>{

}
