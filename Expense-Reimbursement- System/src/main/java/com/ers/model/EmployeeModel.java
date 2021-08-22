package com.ers.model;

public class EmployeeModel {
	private String empid;
	private String empname;
	private String empdesignation;
	private String empdept;
	private String empdob;
	private String empgender;
	private String empemail;
	private String emppassword;
	private String empphoneno;
	private String empaddress;
	public String Emptype;
	
	
	public String getGetEmptype() {
		return Emptype;
	}
	public void setGetEmptype(String getEmptype) {
		this.Emptype = getEmptype;
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
	public String getEmpdept() {
		return empdept;
	}
	public void setEmpdept(String empdept) {
		this.empdept = empdept;
	}

	
	@Override
	public String toString() {
		return "EmployeeModel [empid=" + empid + ", empname=" + empname + ", empdesignation=" + empdesignation
				+ ", empdob=" + empdob + ", empgender=" + empgender + ", empemail=" + empemail + ", emppassword="
				+ emppassword + ", empphoneno=" + empphoneno + ", empaddress=" + empaddress + "]";
	}
	
}
