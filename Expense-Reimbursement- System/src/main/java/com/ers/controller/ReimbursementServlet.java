package com.ers.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ers.entity.EmployeeEntity;
import com.ers.model.ReimModel;
import com.ers.service.ReimbursementServiceImpl;

public class ReimbursementServlet extends HttpServlet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String empid=String.valueOf(request.getSession().getAttribute("empid"));
		String reim_type = request.getParameter("reim_type");
		String reim_ammount = request.getParameter("reim_ammount");
		String reim_descripton = request.getParameter("subject");
		String reim_dateofrequest = request.getParameter("reim_dateofrequest");
		
		
		
		ReimModel reimmod = new ReimModel();
		reimmod.setEmpid(empid);
		reimmod.setReim_ammount(reim_ammount);
		reimmod.setReim_dateofrequest(reim_dateofrequest);
		reimmod.setReim_descripton(reim_descripton);
		reimmod.setReim_type(reim_type);
		
		
		ReimbursementServiceImpl reimservice = new ReimbursementServiceImpl();
		reimservice.addReimbursment(reimmod);
		List<EmployeeEntity> elist = reimservice.displayparticularemp(empid);
		
		PrintWriter out = response.getWriter();
//		out.println("<table width=200 height=200 border=1>");           
//		out.println("<caption> Employee Details </caption>");
//		out.println("<tr><th>EmployeeAddress</th><th>Employee_dept</th><th>Employee_Desgn</th><th>Employee_DateofBirth:</th><th>EmployeeEmail:</th><th>Employee Gender: </th><th>Employee ID:</th><th>Employee Name:</th><th>Employee Password:</th><th>Employee PhoneNumber: </th><th>Employee Type:</th></tr>");
//		for(EmployeeEntity e:elist) {
//			out.println("<tr><td>"+e.getEmpaddress()+"</td><td>"+e.getEmpldept()+"</td><td>"+e.getEmpdesignation()+"</td><td>"+e.getEmpdob()+"</td><td>"+e.getEmpemail()+"</td><td>"+e.getEmpgender()+"</td><td>"+e.getEmpid()+"</td><td>"+e.getEmpname()+"</td><td>"+e.getEmppassword()+"</td><td>"+e.getEmpphoneno()+"</td><td>"+e.getEmptype()+"<td></tr>");
//		}
//		
//		out.println("</table>");
//		out.println("<br>");
		
		out.println("<div style=  ' background-color:  #ADD8E6;'>");
		out.println("<h1>YOUR REQUEST IS SUBMITTED.....WE WILL CHECK WHAT WE CAN DO</h1>");
//		out.println("<br>");
//		out.println("<br>");
//		out.println("<br>");
//		
		out.println("</div>");
		
		
		

	} 
	

}
