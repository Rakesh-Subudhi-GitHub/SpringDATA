package com.rk.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
@AllArgsConstructor
public class EmployeDTO implements Serializable {
	
	private Integer eno;
	@NonNull
	private String ename;
	@NonNull
	private String eadd;
	@NonNull
	private Float esal;
}
