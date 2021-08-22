package com.ers.dao;

import java.util.List;

import com.ers.entity.EmployeeEntity;
import com.ers.model.EmployeeModel;

public interface EmployeeRegDetails {
	public void addEmployee(EmployeeModel e);
	public List<EmployeeEntity> displayAllEmployees();
}
