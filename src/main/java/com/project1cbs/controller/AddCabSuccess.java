package com.project1cbs.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AddCabSuccess
 */
public class AddCabSuccess extends HttpServlet {

 

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE html>\r\n"
				+ "<html>\r\n"
				+ "\r\n"
				+ "<head>\r\n"
				+ "    <link rel=\"stylesheet\" href=\"style.css\">\r\n"
				+ "  <style> body { background-image: url('./image/cab2.jpg'); background-size: cover; background-repeat: no-repeat; background-attachment: fixed;} </style> \r\n"
				+ "    <title> Addcab Success page </title>\r\n"
				
				+ "\r\n"
				+ "\r\n"
				+ "    <body>\r\n"
				+ "        <h1 style=\"color:white;text-align:center;\">Cab added successfully!</h1>\r\n"
				+ "\r\n"
				+ "        <body>\r\n"
				+ "            <div class=\"login-page\">\r\n"
				+ "                <div class=\"form\">\r\n"
				+ "                    <div class=\"login\">\r\n"
				+ "                        <div class=\"login-header\">\r\n"
				+ "                            <h3>Press the button go back to admin page</h3>\r\n"
				+ "                        </div>\r\n"
				+ "                    </div>\r\n"
				+ "\r\n"
				+ "                    <a href=\"Admin.html\"> <button type=\"submit\">Admin page </button> </a>\r\n"
				+ "\r\n"
				+ "                </div>\r\n"
				+ "            </div>\r\n"
				+ "        </body>\r\n"
				+ "    </body>\r\n"
				+ "\r\n"
				+ "</html>");
		//response.sendRedirect("Admin.html");
	
	}

	
}
