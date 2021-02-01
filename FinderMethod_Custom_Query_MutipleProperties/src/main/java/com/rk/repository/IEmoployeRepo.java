package com.rk.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rk.entity.Employe;

public interface IEmoployeRepo extends JpaRepository<Employe, Integer>{

	//generate custom SQL querry
	//SELECT ENO,ENAME,EADD,SALFROM EMPLOYE WHERE ENAME="?" AND EADD="?"
	public List<Employe> findByEnameAndEadd(String name,String add);
	
	//SELECT ENO,ENAME,EADD,SALFROM EMPLOYE WHERE ESAL BETWEEN ? AND ?
		public List<Employe> findByEsalBetween(float startSal,float endSal);
		
   //SELECT ENO,ENAME,EADD,ESALARY FROM  EMPLOYE WHERE ENAME LIKE '?'  AND EADD LIKE '?'
	  public   List<Employe>  findByEnameStartingWithAndEaddStartingWith(String name,String addrs);
	
	//SELECT ENO,ENAME,EADD,ESALARY FROM  EMPLOYEE WHERE  (ENO>="?" AND ENAME LIKE '?') OR (ESALARY BETWEEN "?" AND "?")
      public   List<Employe>  findByEnoGreaterThanEqualAndEnameEndingWithOrEsalBetween(int Eno,String name,float startSalary,float endSalary);
      
    //SELECT ENO,ENAME,EADD,ESALARY FROM  EMPLOYEE WHERE ENAME IN('raja','rani','suresh') OR EADD IN('hyd','mumbai','delhi')
      public   List<Employe>  findByEnameInOrEaddIn(List<String> names,List<String> addresses);	
}
