package com.rk.service;

import java.util.List;

import com.rk.dto.EmployeDTO;
import com.rk.entity.Employe;


public interface IEmployeService {

public List<Employe> removeEmpInBatch(List<EmployeDTO> listdto);

}
