package com.rk.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import com.rk.entity.Employe;

public interface IEmoployeRepo extends JpaRepository<Employe, Integer>{

	
	@Query(value = "SELECT SYSDATE FROM DUAL",nativeQuery = true)
	public String getSystemDate();
	
	@Query(value = "INSERT INTO EMPLOYE VALUES(?,?,?,?)",nativeQuery = true)
	@Modifying
	@Transactional
	public int insertRecordInEmploye(int no,String name,String eadd,float sal);
	
}
