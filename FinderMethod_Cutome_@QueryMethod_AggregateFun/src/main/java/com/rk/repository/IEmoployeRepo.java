package com.rk.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.rk.entity.Employe;

public interface IEmoployeRepo extends JpaRepository<Employe, Integer>{

	@Query("SELECT COUNT(*) FROM Employe")
	public long getEmployeCount(); 
	
	@Query("SELECT COUNT(*),MAX(esal),MIN(esal),AVG(esal) FROM Employe")
	public Object getEmployeAggregateData(); 
	
}
