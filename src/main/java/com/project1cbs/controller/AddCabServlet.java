package com.project1cbs.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.project1cbs.model.Cab;
import com.project1cbs.service.AddCab;
import com.project1cbs.service.AddCabImpl;

/**
 * Servlet implementation class AddCabServlet
 */
public class AddCabServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	 public static final Logger logger = LogManager.getLogger(AddCabServlet.class);
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
//		Integer cabId = Integer.parseInt(request.getParameter("cabid"));
		String cabModel = request.getParameter("cabmodel");
		String drivName = request.getParameter("drivername");
		String drivMobNo = request.getParameter("drivmobno");
		Integer bstatus = Integer.parseInt(request.getParameter("bstatus"));
		logger.info("In add cab page");
		//Creating a cab object takin input from the admin
		Cab cab = new Cab(bstatus,drivName,drivMobNo,cabModel);
		
		//Creating the addCab object to implement the addCab method
		AddCab acab = new AddCabImpl();
		
		 
		
			acab.addCab(cab);
			logger.info("Add cab success");
			RequestDispatcher rd = request.getRequestDispatcher("AddCabSuccess");
			rd.forward(request, response);
		    out.println("Cab added successfully");
			
		
	}

}
