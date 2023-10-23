package com.project1cbs.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.project1cbs.dao.GetUserCredentialsDao;
import com.project1cbs.dao.GetUserCredentialsDaoImpl;
import com.project1cbs.model.Employee;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
    public static final Logger logger = LogManager.getLogger(LoginServlet.class);
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		Integer uid = Integer.parseInt(request.getParameter("uid"));
		String email = request.getParameter("email");
		String pwd = request.getParameter("password");
		String user = request.getParameter("users");

		// Creating dao object for fetching the data from the database to validate login
		GetUserCredentialsDao dao = new GetUserCredentialsDaoImpl();
		Employee emp = dao.getEmpObj(uid);
		String designation="";
        if(emp != null) {
        	HttpSession hsession = request.getSession(true);
    		hsession.setAttribute("Employee", emp);// from dao getting Employee obj from the uid and storing it in sessioncreating a session to store the employee object in the session
    	    hsession.setMaxInactiveInterval(0);
    		designation = dao.getDesignation(uid);
        }
		
		logger.info("We are in login page");
		if(user.equalsIgnoreCase("Admin") && email.equalsIgnoreCase("Admin@gmail.com") && pwd.equalsIgnoreCase("Admin123")) {
			logger.info("Admin login success");
			RequestDispatcher rd = request.getRequestDispatcher("Admin.html");
			rd.forward(request, response);
			return;
			
		}
		if(designation.equalsIgnoreCase("Employee")) {
			if(email.equals(emp.getEmail()) && pwd.equalsIgnoreCase(emp.getPassword())) {
				logger.info("Employee login success");
				RequestDispatcher rd = request.getRequestDispatcher("EmployeeServlet");
				rd.forward(request, response);
				return;
			}
			
		}
		if(designation.equalsIgnoreCase("Manager")) {
			if(email.equals(emp.getEmail()) && pwd.equalsIgnoreCase(emp.getPassword())) {
			logger.info("Manager login success");
			RequestDispatcher rd = request.getRequestDispatcher("CheckCabRequestsServlet");
			rd.forward(request, response);
			return;
			}
     	}
		    logger.info("Credential not matched");
			out.println("<h2 style=\"color:red;text-align:center;\">Wrong User name or password or Designation !!</h2>");
			RequestDispatcher rd = request.getRequestDispatcher("Login.html");
			rd.include(request, response);
		
		
		
	}

}
