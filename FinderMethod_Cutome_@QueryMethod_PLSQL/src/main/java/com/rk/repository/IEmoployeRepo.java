package com.rk.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.rk.entity.Employe;

public interface IEmoployeRepo extends JpaRepository<Employe, Integer>{
	
}
