package com.ers.service;

import java.util.List;

import com.ers.entity.EmployeeEntity;
import com.ers.model.EmployeeModel;

public interface EmployeeRegistrationService {
	public void addEmployee(EmployeeModel e);
	public List<EmployeeEntity> displayAllEmployees();
	}
