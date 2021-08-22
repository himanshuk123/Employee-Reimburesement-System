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


public class UpdateReim extends HttpServlet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ReimbursementServiceImpl reimservice = new ReimbursementServiceImpl();
		List<ReimEntity> elist= reimservice.allpendingreim();
		
		PrintWriter out = response.getWriter();
		//out.println("<body style 'background-color:  #ADD8E6;'>");
		out.println("<div style=  ' background-color:  #ADD8E6;'>");
		out.println("<table width=200 height=200 border=1>");           
		out.println("<caption> *************** All Pending Reimbursement ************ </caption>");
		out.println("<br>");
		out.println("<tr><th>Reimbursementy ID</th><th>Employee ID</th><th>Reimbursement ammount</th><th>Reimbursement DateOfRequest</th><th>Reimbursement Description</th><th>Reimbursement Status</th><th>Reimbursement Type</th></tr>");
		for(ReimEntity r:elist) {
		out.println("<tr><td>"+r.getReim_id()+"</td><td>"+r.getEmpid()+"</td><td>"+r.getReim_ammount()+"</td><td>"+r.getReim_dateofrequest()+"</td><td>"+r.getReim_descripton()+"</td><td>"+r.getReim_status()+"</td><td>"+r.getReim_type()+"<td></tr>");
		
	}
		out.println("</table>");
		
		out.println("<form action='http://localhost:8080/ERSSystem/UpdateReim2'  method='post'>"); 
		
		out.println("<br>");
		
		out.println("<select name='R_ID'>");
		for(ReimEntity r:elist) {
			out.println("<option name='R_ID' >" + r.getReim_id());
		}
		out.println("</select>");
		out.println("<input type='submit' name='type' value='Approve'/>");
		out.println("<input type='submit' name='type' value='Deny'/>");
		out.println("<br><br><form action='ManagerHomePage.jsp'> <input type='submit' value='Go back'></form> ");
		out.println("</div>");
		//out.println("</body>");
}
}
