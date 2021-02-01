package com.rk.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.rk.entity.Employe;

public interface IEmoployeRepo extends JpaRepository<Employe, Integer>{

	//@Query("FROM  Employe WHERE Ename=?1")
	@Query("FROM  Employe WHERE Ename=:ename") //its same as namedparam or String(name) will same other wise is error proviedes 
	public List<Employe> getEmployeDetails(String ename); 
	
}
