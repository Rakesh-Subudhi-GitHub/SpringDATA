package com.rk.repository;

import java.util.Collection;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.rk.entity.Employe;

public interface IEmoployeRepo extends JpaRepository<Employe, Integer>{

	//generate custom SQL querry
public List<Employe> findByEsalLessThan(float startsal);	//intaernal Query is [ SELECT ENO,ENAME,EADD,SAL FROM EMPLOYE WHERE ESAL<? ]

public List<Employe> findByEsalGreaterThan(float startsal);	//intaernal Query is [ SELECT ENO,ENAME,EADD,SAL FROM EMPLOYE WHERE ESAL>? 

public List<Employe> findByEnameLike(String name);//SELECT ENO,ENAME,EADD,SAL FROM EMPLOYE WHERE ENAME LIKE "?%"

//SELECT ENO,ENAME,EADD,SAL FROM EMPLOYE WHERE EADD IN("?","?","?")
public List<Employe> findByEaddIn(List<String> city);

//SELECT ENO,ENAME,EADD,SAL FROM EMPLOYE WHERE EADD NOTIN("?","?","?")
public List<Employe> findByEaddNotIn(List<String> city);

//SELECT ENO,ENAME,EADD,SAL FROM EMPLOYE WHERE EADD="?" ORDER BY ENO ASC
public Iterable<Employe> findByEaddOrderByEnoAsc(String city);
}
