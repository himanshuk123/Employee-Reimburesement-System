package com.ers.controller;
import java.io.IOException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.ers.entity.EmployeeEntity;
import com.ers.model.EmployeeModel;
import com.ers.service.EmployeeRegistrationServiceImpl;


public class EmployeeLoginController extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String empid=request.getParameter("empid");
		String emppassword=request.getParameter("emppassword");
		String emptype=request.getParameter("emptype");
		
		EmployeeModel empmod = new EmployeeModel();
		empmod.setEmpid(empid);
		empmod.setEmppassword(emppassword);
		empmod.setGetEmptype(emptype);
		
		
		EmployeeRegistrationServiceImpl employeeService =new EmployeeRegistrationServiceImpl();
		List<EmployeeEntity> elist = employeeService.displayAllEmployees();
		Boolean ispresent = false;
		
		for(EmployeeEntity e: elist ) {
			if(empid.equals(e.getEmpid()) && emptype.equalsIgnoreCase("Employee") && emppassword.equals(e.getEmppassword()) ) {
				ispresent=true;
				break;
			}
		}
		
		
		if(ispresent) {
			request.getSession().setAttribute("empid", empid);
			RequestDispatcher rd = request.getRequestDispatcher("EmployeeHomePage.jsp");
			rd.forward(request, response);
		}else if(emptype.equalsIgnoreCase("Manager")) {
			RequestDispatcher rd = request.getRequestDispatcher("ManagerHomePage.jsp");
			rd.forward(request, response);
		}
		
		else {
			RequestDispatcher rd = request.getRequestDispatcher("errorpage.jsp");
			rd.forward(request, response);
		}
	}

}
