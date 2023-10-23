package com.project1cbs.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.project1cbs.dao.BooKCabDao;
import com.project1cbs.dao.BookCabDaoImpl;
import com.project1cbs.dao.GetACabDao;
import com.project1cbs.exception.CabUnavailableException;
import com.project1cbs.model.Cab;
import com.project1cbs.model.Employee;


public class BookCab extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	 public static final Logger logger = LogManager.getLogger(BookCab.class);

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
		logger.info("In Add cab page...");
		HttpSession session = request.getSession();
		Employee emp = (Employee) session.getAttribute("Employee");//pulling employee object from session
		PrintWriter out = response.getWriter();
//		String name = request.getParameter("username");
		out.println(emp);
		GetACabDao gcdao = new GetACabDao();
		
		
		@SuppressWarnings("unused")
		Integer empId = emp.getEmpId();
		Integer cabId = Integer.parseInt(request.getParameter("bcabid"));
		Cab cab = gcdao.getAcab(cabId);
		
		out.println(cab);
		BooKCabDao bcd = new BookCabDaoImpl();
		
		try {
			    bcd.bookAcabDao(emp, cab);
			    response.sendRedirect("BookCabSuccess");
				
				out.println("One cab is booked");
				logger.info("Booking cab success");

		} catch (CabUnavailableException e) {
			out.print(e.getMessage());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.getMessage();
		}
		
	}

}
