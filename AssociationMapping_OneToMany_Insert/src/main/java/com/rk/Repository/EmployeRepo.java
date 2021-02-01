package com.rk.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rk.Entity.Employe;

public interface EmployeRepo extends JpaRepository<Employe, Integer> {

}
