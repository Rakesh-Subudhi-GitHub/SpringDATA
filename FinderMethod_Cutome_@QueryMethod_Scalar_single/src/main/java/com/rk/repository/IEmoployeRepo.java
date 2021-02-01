package com.rk.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.rk.entity.Employe;

public interface IEmoployeRepo extends JpaRepository<Employe, Integer>{

	@Query("FROM Employe WHERE eno= :eno")
	public Employe getEmployeDetailsByEno(int eno); 

	@Query("SELECT ename,eadd FROM Employe WHERE eno= :no")
	public Object getEmployeDetailsByEno1(int no); 
	
	@Query("SELECT esal FROM Employe WHERE eno= :no")
	public float getEmployesal(int no); 
}
