package com.ers.controller;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ers.entity.EmployeeEntity;
import com.ers.model.EmployeeModel;
import com.ers.service.ReimbursementServiceImpl;


public class UpdateEmpProfile extends HttpServlet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String empid=String.valueOf(request.getSession().getAttribute("empid"));
		
		
		String empname=request.getParameter("empname");
		String empdesignation=request.getParameter("empdesignation");
		String empldept=request.getParameter("empldept");
		String empdob=request.getParameter("empdob");
		String empgender=request.getParameter("empgender");
		String empemail=request.getParameter("empemail");
		String emppassword=request.getParameter("emppassword");
		String empphoneno=request.getParameter("empphoneno");
		String empaddress=request.getParameter("empaddress");
		
		
		//Model is mapped
		EmployeeModel empmod = new EmployeeModel();
		empmod.setEmpaddress(empaddress);
		empmod.setEmpdept(empldept);
		empmod.setEmpdesignation(empdesignation);
		empmod.setEmpdob(empdob);
		empmod.setEmpemail(empemail);
		empmod.setEmpgender(empgender);
		empmod.setEmpid(empid);
		empmod.setEmpname(empname);
		empmod.setEmppassword(emppassword);
		empmod.setEmpphoneno(empphoneno);
	
		
		
		ReimbursementServiceImpl reimservice = new ReimbursementServiceImpl();
		
		reimservice.updateemp(empmod);
	
		
		List<EmployeeEntity> elist = reimservice.displayparticularemp(empid);
		
		PrintWriter out = response.getWriter();
		out.println("<div style=  ' background-color:  #ADD8E6;'>");
		out.println("<table width=200 height=200 border=1>");           
		out.println("<caption> ************* Updated Profile Details********** </caption>");
		out.println("<br>");
		out.println("<tr><th>EmployeeAddress</th><th>EmployeeDepartment</th><th>Employee Designation</th><th>Employee DateofBirth:</th><th>EmployeeEmail:</th><th>Employee Gender: </th><th>Employee ID:</th><th>Employee Name:</th><th>Employee Password:</th><th>Employee PhoneNumber: </th><th>Employee Type:</th></tr>");
		for(EmployeeEntity e:elist) {
			out.println("<tr><td>"+e.getEmpaddress()+"</td><td>"+e.getEmpldept()+"</td><td>"+e.getEmpdesignation()+"</td><td>"+e.getEmpdob()+"</td><td>"+e.getEmpemail()+"</td><td>"+e.getEmpgender()+"</td><td>"+e.getEmpid()+"</td><td>"+e.getEmpname()+"</td><td>"+e.getEmppassword()+"</td><td>"+e.getEmpphoneno()+"</td><td>"+e.getEmptype()+"<td></tr>");
		}
		
		out.println("</table>");
		
		out.println("<form action='EmployeeHomePage.jsp'> <input type='submit' value='back to Employee Home Page'></form> ");
		
		out.println("</div>");
		
	}
	}


