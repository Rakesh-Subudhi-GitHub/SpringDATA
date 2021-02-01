package com.rk.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
@AllArgsConstructor
@NoArgsConstructor
public class EmployeDTO implements Serializable {
	
	public EmployeDTO(int i) {
		// TODO Auto-generated constructor stub
	}

	private Integer eno;
	@NonNull
	private String ename;
	@NonNull
	private String eadd;
	@NonNull
	private Float esal;
}
