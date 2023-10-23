package com.project1cbs.controller;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.project1cbs.model.Employee;
import com.project1cbs.service.AddEmployee;
import com.project1cbs.service.AddEmployeeImpl;

/**
 * Servlet implementation class AddEmployeeServlet
 */
public class AddEmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	 public static final Logger logger = LogManager.getLogger(AddEmployeeServlet.class);
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//		Integer empId = Integer.parseInt(request.getParameter("empid"));
		String empName = request.getParameter("empname");
		String empEmail = request.getParameter("empemail");
		String department = request.getParameter("empdept");
		String empDesig = request.getParameter("managerOrNot");
		logger.info("In Add employee servlet");
		//creating a employee object from the data entered by admin
		Employee employee = new Employee(empName,empEmail,empDesig,department);
		
		AddEmployee aemp = new AddEmployeeImpl();
		
		aemp.addEmployee(employee);
		
			logger.info("Add employee seccess");
			
			RequestDispatcher rd = request.getRequestDispatcher("AddEmployeeSuccess");
			rd.forward(request, response);
		

}
	
}
	
