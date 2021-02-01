package com.rk.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.rk.entity.Employe;

public interface IEmoployeRepo extends JpaRepository<Employe, Integer>{

	//@Query("FROM Employe WHERE Esal>=?1 AND Esal<=?2")
	@Query("FROM Employe WHERE Esal>=:startSal AND Esal<=:endSal")
	public List<Employe> getEmployeBysalRange(float startSal,float endSal); 
	
}
