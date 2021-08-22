package com.ers.model;

public class ReimModel {
	private int reim_id;
	private String reim_type;
	private String reim_ammount;
	private String reim_descripton;
	private String reim_status;
	private String reim_dateofrequest;
	private String empid;
	

	
	public String getEmpid() {
		return empid;
	}
	public void setEmpid(String empid) {
		this.empid = empid;
	}
	public int getReim_id() {
		return reim_id;
	}
	public void setReim_id(int reim_id) {
		this.reim_id = reim_id;
	}
	public String getReim_type() {
		return reim_type;
	}
	public void setReim_type(String reim_type) {
		this.reim_type = reim_type;
	}
	public String getReim_ammount() {
		return reim_ammount;
	}
	public void setReim_ammount(String reim_ammount) {
		this.reim_ammount = reim_ammount;
	}
	public String getReim_descripton() {
		return reim_descripton;
	}
	public void setReim_descripton(String reim_descripton) {
		this.reim_descripton = reim_descripton;
	}
	public String getReim_status() {
		return reim_status;
	}
	public void setReim_status(String reim_status) {
		this.reim_status = reim_status;
	}
	public String getReim_dateofrequest() {
		return reim_dateofrequest;
	}
	public void setReim_dateofrequest(String reim_dateofrequest) {
		this.reim_dateofrequest = reim_dateofrequest;
	}
	
	@Override
	public String toString() {
		return "ReimModel [reim_id=" + reim_id + ", reim_type=" + reim_type + ", reim_ammount=" + reim_ammount
				+ ", reim_descripton=" + reim_descripton + ", reim_status=" + reim_status + ", reim_dateofrequest="
				+ reim_dateofrequest + ", empid=" + empid + "]";
	}
}
