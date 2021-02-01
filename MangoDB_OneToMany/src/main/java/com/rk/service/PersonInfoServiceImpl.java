package com.rk.service;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rk.document.BankAccount;
import com.rk.document.PersonInfo;
import com.rk.document.VisaInfo;
import com.rk.dto.BankAccountDTO;
import com.rk.dto.PersonInfoDTO;
import com.rk.dto.VisaInfoDTO;
import com.rk.repository.PersonRepo;

@Service("personService")
public class PersonInfoServiceImpl implements IPersonService {

	@Autowired
	private PersonRepo perRepo;
	
	@Override
	public String saveData(PersonInfoDTO dto) {
		
		//convert document --> dto
		PersonInfo doc=new PersonInfo();
		BeanUtils.copyProperties(dto, doc);  //simple properties copy
		
		//convert mapBankAccountDTOs   to  mapBankAccount doc objs
		//copy map obj and send doc
		Map<String,BankAccountDTO> accountDTO=dto.getAccounts();
		
		//craete a map 
		Map<String,BankAccount> account=new HashMap();  //just like [ arraylist list=new Arraylist() ]
		
		//transfer value
		accountDTO.forEach((key,bankAccount)->{   //map that way key or value pair
			
			BankAccount baDoc=new BankAccount();
			BeanUtils.copyProperties(bankAccount, baDoc);
			
			//add hash map
			account.put(key, baDoc);
			
		});
		
		//convert  SetVisaDTOs   to  setVisa Docs		
		Set<VisaInfoDTO>  SetvisaDTO=dto.getVisas();
		Set<VisaInfo>  SetvisaDoc=new HashSet();
		
		SetvisaDTO.forEach(visadto->{
					VisaInfo  vsdoc=new VisaInfo();
					BeanUtils.copyProperties(visadto, vsdoc);
					SetvisaDoc.add(vsdoc);
				});
		
		//set the value
		doc.setAccounts(account);
		doc.setVisas(SetvisaDoc);
		
		//save the object use perRepo
		perRepo.save(doc);
		
		//returns
		return "Doc is saved Succefully and Id is  ::  "+doc.getPid();
		
	}//method
}//class
