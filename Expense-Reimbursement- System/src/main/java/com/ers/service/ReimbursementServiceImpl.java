package com.ers.service;

import java.util.List;
import java.util.logging.Logger;

import com.ers.dao.ReimbursmentDaoImpl;
import com.ers.entity.EmployeeEntity;
import com.ers.entity.ReimEntity;
import com.ers.model.EmployeeModel;
import com.ers.model.ReimModel;

public class ReimbursementServiceImpl {
	static Logger logger=Logger.getLogger("ReimbursementServiceImpl.class");
	ReimbursmentDaoImpl reimdao = new ReimbursmentDaoImpl();
	public void addReimbursment(ReimModel r) {
		logger.info("Rembursement added successfully.....");
		reimdao.addReimbursment(r);
	}
	
	public List<EmployeeEntity> displayparticularemp(String empid){
		logger.info("Displayed Particular Reimbursement ");
		return reimdao.displayparticularemp(empid);
	}
	
	public List<ReimEntity> reimforpartemployee(String empid){
		logger.info("Particular Reimbursement ....");
		return reimdao.reimforpartemployee(empid);
	}
	
	public List<ReimEntity> displayalreimbursement(){
		logger.info("Display all Reimbursement ");
		return reimdao.displayalreimbursement();
	}
	
	public List<ReimEntity> allrejectedreim(){
		logger.info("Updation Success! And details are rejected");
		return reimdao.allrejectedreim();
	}
	
	public List<ReimEntity> allacceptedreim(){
		logger.info("Updation Success! And details are accepted");
		return reimdao.allacceptedreim();
	}
	
	public List<ReimEntity> allpendingreim(){
		logger.info("All Pendding requestss.....");
		return reimdao.allpendingreim();
	}
	
	public void updatereim2(Integer ID,String type){
		logger.info("updating reimbursemet");
		 reimdao.updatereim2(ID,type);
	}
	
	public void updateemp(EmployeeModel e){
		reimdao.updateemp(e);
	}
			
}
