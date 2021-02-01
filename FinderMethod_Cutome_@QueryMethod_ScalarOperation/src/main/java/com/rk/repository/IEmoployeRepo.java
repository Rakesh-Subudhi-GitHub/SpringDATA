package com.rk.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.rk.entity.Employe;

public interface IEmoployeRepo extends JpaRepository<Employe, Integer>{

	@Query("SELECT eno,ename,eadd FROM Employe WHERE eadd IN(:city1,:city2,:city3)")
	public List<Object[]> getEmployeDetailsByCity(String city1,String city2,String city3); 
	
	@Query("SELECT eno,ename,eadd FROM Employe WHERE ename like :initialchar")
	public List<Object[]> getEmployeDetailsByNameLatter(String initialchar); 
	
	@Query("SELECT eno,ename,eadd FROM Employe WHERE eno>=:start AND eno<=:end")
	public List<String> getEmployeDetailsByEnoRange(int start,int end); 
	
	@Query("SELECT eadd FROM Employe WHERE ename IN(:name1,:name2,:name3)")
	public List<String> getEmployeDetailsByName(String name1,String name2,String name3); 
	
}
