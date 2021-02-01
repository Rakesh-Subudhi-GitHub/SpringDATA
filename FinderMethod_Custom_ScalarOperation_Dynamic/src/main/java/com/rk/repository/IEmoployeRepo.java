package com.rk.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rk.entity.Employe;
import com.rk.view.View;

public interface IEmoployeRepo extends JpaRepository<Employe, Integer>{

	//SELECT ENO,EADD FROM EMPLOYE WHERE EADD IN("?","?","?")
	public <T extends View> List<T>findByEadd(String city,Class<T> clazz); 
}
