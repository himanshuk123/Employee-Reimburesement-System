package com.ers.dbUtil;

import com.ers.entity.EmployeeEntity;
import com.ers.model.EmployeeModel;

public class EmployeeMapper {

	
	public static EmployeeEntity mapEmployee(EmployeeModel e) {
		EmployeeEntity entity=new EmployeeEntity();
		entity.setEmpaddress(e.getEmpaddress());
		entity.setEmpdesignation(e.getEmpdesignation());
		entity.setEmpdob(e.getEmpdob());
		entity.setEmpemail(e.getEmpemail());
		entity.setEmpgender(e.getEmpgender());
		entity.setEmpid(e.getEmpid());
		entity.setEmpldept(e.getEmpdept());
		entity.setEmpname(e.getEmpname());
		entity.setEmppassword(e.getEmppassword());
		entity.setEmpphoneno(e.getEmpphoneno());
		entity.setEmptype(e.getGetEmptype());
			
		return entity;
  }
}