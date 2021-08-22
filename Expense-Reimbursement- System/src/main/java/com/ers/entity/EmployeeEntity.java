package com.ers.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="EmployeeTab")
public class EmployeeEntity {
	@Id
	@Column(name="empid")
	private String empid;
	@Column(name="empname")
	private String empname;
	@Column(name="empdesignation")
	private String empdesignation;
	@Column(name="empldept")
	private String empldept;
	@Column(name="empdob")
	private String empdob;
	@Column(name="empgender")
	private String empgender;
	@Column(name="empemail")
	private String empemail;
	@Column(name="Emptype")
	private String Emptype;
	@Column(name="emppassword",unique=true)
	private String emppassword;
	@Column(name="empphoneno",unique=true)
	private String empphoneno;
	@Column(name="empaddress")
	private String empaddress;
    @OneToMany(cascade=CascadeType.ALL,targetEntity=ReimEntity.class)
	
	List<ReimEntity> reimbursementList;

	
	public List<ReimEntity> getReimbursementList() {
		return reimbursementList;
	}
	public void setReimbursementList(List<ReimEntity> reimbursementList) {
		this.reimbursementList = reimbursementList;
	}
	
	
	public String getEmpid() {
		return empid;
	}
	public void setEmpid(String empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public String getEmpdesignation() {
		return empdesignation;
	}
	public void setEmpdesignation(String empdesignation) {
		this.empdesignation = empdesignation;
	}
	public String getEmpdob() {
		return empdob;
	}
	public void setEmpdob(String empdob) {
		this.empdob = empdob;
	}
	public String getEmpgender() {
		return empgender;
	}
	public void setEmpgender(String empgender) {
		this.empgender = empgender;
	}
	public String getEmpemail() {
		return empemail;
	}
	public void setEmpemail(String empemail) {
		this.empemail = empemail;
	}
	public String getEmppassword() {
		return emppassword;
	}
	public void setEmppassword(String emppassword) {
		this.emppassword = emppassword;
	}
	public String getEmpphoneno() {
		return empphoneno;
	}
	public void setEmpphoneno(String empphoneno) {
		this.empphoneno = empphoneno;
	}
	public String getEmpaddress() {
		return empaddress;
	}
	public void setEmpaddress(String empaddress) {
		this.empaddress = empaddress;
	}
	public String getEmpldept() {
		return empldept;
	}
	public void setEmpldept(String empldept) {
		this.empldept = empldept;
	}
	public String getEmptype() {
		return Emptype;
	}
	public void setEmptype(String Emptype) {
		this.Emptype = Emptype;
	}
	@Override
	public String toString() {
		return "EmployeeEntity [empid=" + empid + ", empname=" + empname + ", empdesignation=" + empdesignation
				+ ", empldept=" + empldept + ", empdob=" + empdob + ", empgender=" + empgender + ", empemail="
				+ empemail + ", Emptype=" + Emptype + ", emppassword=" + emppassword + ", empphoneno=" + empphoneno
				+ ", empaddress=" + empaddress + ", reimbursementList=" + reimbursementList + "]";
	}
	
	
}
