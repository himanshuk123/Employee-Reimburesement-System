package com.ers.dbUtil;

import com.ers.entity.ReimEntity;
import com.ers.model.ReimModel;

public class ReimbursementMapper {
	public static ReimEntity mapReim(ReimModel r) {
		ReimEntity entity1 = new ReimEntity();
		
		entity1.setReim_ammount(r.getReim_ammount());
		entity1.setReim_dateofrequest(r.getReim_dateofrequest());
		entity1.setReim_descripton(r.getReim_descripton());
		entity1.setReim_id(r.getReim_id());
		entity1.setReim_status(r.getReim_status());
		entity1.setReim_type(r.getReim_type());
		entity1.setEmpid(r.getEmpid());
		return entity1;
	}
	
}
