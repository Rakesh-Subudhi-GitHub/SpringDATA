package com.rk.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rk.Entity.Department;

public interface DepartmentRepo extends JpaRepository<Department, Integer> {

}
