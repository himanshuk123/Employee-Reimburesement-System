package com.ers.controller;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.ers.entity.ReimEntity;
import com.ers.service.ReimbursementServiceImpl;


public class AllRejectedReim extends HttpServlet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		ReimbursementServiceImpl reimservice = new ReimbursementServiceImpl();
		List<ReimEntity> elist= reimservice.allrejectedreim();
		
		PrintWriter out = response.getWriter();
		out.println("<div style=  ' background-color:  #ADD8E6;'>");
		out.println("<table width=200 height=200 border=1>");           
		out.println("<caption> ***********All Rejected Reimbursement********** </caption>");
		out.println("<br>");
		out.println("<tr><th>Reimbursementy ID</th><th>Employee ID</th><th>Reimbursement ammount</th><th>Reimbursement DateOfRequest</th><th>Reimbursement Description</th><th>Reimbursement Status</th><th>Reimbursement Type</th></tr>");
		for(ReimEntity r:elist) {
		out.println("<tr><td>"+r.getReim_id()+"</td><td>"+r.getEmpid()+"</td><td>"+r.getReim_ammount()+"</td><td>"+r.getReim_dateofrequest()+"</td><td>"+r.getReim_descripton()+"</td><td>"+r.getReim_status()+"</td><td>"+r.getReim_type()+"<td></tr>");
	}
		out.println("</table>");
		out.println("</div>");

		out.println("<form action='ManagerHomePage.jsp'> <input type='submit' value='Go back'></form> ");
}
}
