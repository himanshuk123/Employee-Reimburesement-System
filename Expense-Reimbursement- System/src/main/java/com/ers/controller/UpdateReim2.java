package com.ers.controller;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.ers.service.ReimbursementServiceImpl;


public class UpdateReim2 extends HttpServlet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String rid=request.getParameter("R_ID");
		String type=request.getParameter("type");
		Integer ID = Integer.parseInt(rid);
		
		ReimbursementServiceImpl reimservice = new ReimbursementServiceImpl();
		reimservice.updatereim2(ID,type);
		out.println("<div style=  ' background-color:  #ADD8E6;'>");
		
		out.println("<h1>Update Successful!!! </h1>");
		out.println("</div>");
	}

}
