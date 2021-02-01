package com.rk.repository;

import org.springframework.data.repository.CrudRepository;

import com.rk.entity.Employe;

public interface EmployeRepo extends CrudRepository<Employe, Integer> {

}
