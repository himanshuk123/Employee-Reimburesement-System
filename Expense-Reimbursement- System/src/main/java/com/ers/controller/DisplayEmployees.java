package com.ers.controller;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.ers.entity.EmployeeEntity;
import com.ers.service.EmployeeRegistrationServiceImpl;


public class DisplayEmployees extends HttpServlet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		EmployeeRegistrationServiceImpl employeeService =new EmployeeRegistrationServiceImpl();
		PrintWriter out = response.getWriter();
		List<EmployeeEntity> elist = employeeService.displayAllEmployees();
		
		out.println("<div style=  ' background-color:  #ADD8E6;'>");
		out.println("<table width=200 height=200 border=1>");
		out.println("<caption> **************Employee Details************** </caption>");
		out.println("<br>");
		out.println("<tr><th>EmployeeAddress</th><th>EmployeeDepartment</th><th>Employee Designation</th><th>Employee DateofBirth:</th><th>EmployeeEmail:</th><th>Employee Gender: </th><th>Employee ID:</th><th>Employee Name:</th><th>Employee PhoneNumber: </th><th>Employee Type:</th></tr>");
		for(EmployeeEntity e:elist) {
			out.println("<tr><td>"+e.getEmpaddress()+"</td><td>"+e.getEmpldept()+"</td><td>"+e.getEmpdesignation()+"</td><td>"+e.getEmpdob()+"</td><td>"+e.getEmpemail()+"</td><td>"+e.getEmpgender()+"</td><td>"+e.getEmpid()+"</td><td>"+e.getEmpname()+"</td><td>"+e.getEmpphoneno()+"</td><td>"+e.getEmptype()+"<td></tr>");
		}
		out.println("</table>");
		
		out.println("</div>");
		
		out.println("<form action='ManagerHomePage.jsp'> <input type='submit' value='back to Home'></form> ");
	}

}
