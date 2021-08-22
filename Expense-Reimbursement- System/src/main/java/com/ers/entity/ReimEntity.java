package com.ers.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ReimbursementTable")
public class ReimEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="reim_id")
	private int reim_id;
	@Column(name="reim_type")
	private String reim_type;
	@Column(name="reim_ammount")
	private String reim_ammount;
	@Column(name="reim_descripton")
	private String reim_descripton;
	@Column(name="reim_status")
	private String reim_status;
	@Column(name="reim_dateofrequest")
	private String reim_dateofrequest;
	@Column(name="empid")
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
		return "ReimEntity [reim_id=" + reim_id + ", reim_type=" + reim_type + ", reim_ammount=" + reim_ammount
				+ ", reim_descripton=" + reim_descripton + ", reim_status=" + reim_status + ", reim_dateofrequest="
				+ reim_dateofrequest + ", empid=" + empid + "]";
	}
	
}
