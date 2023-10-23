package com.project1cbs.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class BookCabSuccess
 */
public class BookCabSuccess extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE html>\r\n"
				+ "<html>\r\n"
				+ "\r\n"
				+ "<head>\r\n"
				+ "    <link rel=\"stylesheet\" href=\"style.css\">\r\n"
				+ "    <title> Book Cab Success page </title>\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "    <body>\r\n"
				+ "        <h1 style=\"color:white;text-align:center;\">Cab Booked successfully!</h1>\r\n"
				+ "\r\n"
				+ "        <body>\r\n"
				+ "            <div class=\"login-page\">\r\n"
				+ "                <div class=\"form\">\r\n"
				+ "                    <div class=\"login\">\r\n"
				+ "                        <div class=\"login-header\">\r\n"
				+ "                            <h3>Press the button go back to add another cab</h3>\r\n"
				+ "                        </div>\r\n"
				+ "                    </div>\r\n"
				+ "\r\n"
				+ "                     <form action=\"BookCab\" method=\"service\" class=\"button\">\r\n"
				+ "                        <button type=\"submit\">Go Back!</button>\r\n"
				+ "                    </form>\r\n"
				+ "                        <div class=\"login-header\">\r\n"
				+ "                            <h3>Press the button to Check Booking Result</h3>\r\n"
				+ "                        </div>\r\n"
				+ "\r\n"
				+ "                     <form action=\"RequestedCabStatus\" method=\"post\" class=\"button\">\r\n"
				+ "                        <button type=\"submit\">Go to Booking Result!</button>\r\n"
				+ "                    </form>\r\n"
				+ "\r\n"
				+ "                </div>\r\n"
				+ "            </div>\r\n"
				+ "        </body>\r\n"
				+ "    </body>\r\n"
				+ "\r\n"
				+ "</html>");
	}

}
