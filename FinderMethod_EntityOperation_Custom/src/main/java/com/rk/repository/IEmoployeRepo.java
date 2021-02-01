package com.rk.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.rk.entity.Employe;

public interface IEmoployeRepo extends JpaRepository<Employe, Integer>{

	//generate custom SQL querry
	public List<Employe> findByEadd(String eadd);  //internally querry is::  [ SELECT ENO.ENAME,EADD,SAL FROM EMPLOYE WHERE EADD=? ]
}
