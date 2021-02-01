package com.rk.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import com.rk.entity.Employe;

public interface IEmoployeRepo extends JpaRepository<Employe, Integer>{

	
	@Query("UPDATE Employe SET esal=esal+:amount WHERE esal<=:sal")
	@Modifying
	@Transactional
	public int updateSAL(float amount,float sal); 
	
	@Query("DELETE FROM Employe WHERE eno=:eno")
	@Modifying
	@Transactional
	public int deleteEmploye(int eno);
}
