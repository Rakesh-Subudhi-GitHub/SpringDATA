package com.rk.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rk.entity.Employe;

public interface IEmoployeRepo extends JpaRepository<Employe, Integer>{

	//SELECT ENO,EADD FROM EMPLOYE WHERE EADD IN("?","?","?")
	public List<ResultView> findByEaddIn(List<String> city); 
}
