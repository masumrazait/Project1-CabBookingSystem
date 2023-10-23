package com.project1cbs.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.project1cbs.model.Cab;
import com.project1cbs.service.CabBooking;
import com.project1cbs.service.CabBookingImpl;

/**
 * Servlet implementation class EmployeeServlet
 */
public class EmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		CabBooking cb = new CabBookingImpl();
		List<Cab> freeCabs = cb.getFreeCabs();
		
//		out.println("");
//		for(Cab cab : freeCabs) {
//			out.println(cab);
//			out.println("<br>");
//		}
		
		out.println("<!DOCTYPE html>\r\n"
				+ "<html>\r\n"
				+ "\r\n"
				+ "<head>\r\n"
				+ "    <link rel=\"stylesheet\" href=\"style.css\">\r\n"
				+ "    <title>Employee page</title>\r\n"
				+ "    <style>\r\n"
				+ "        /* div.buttons {\r\n"
				+ "            display: grid;\r\n"
				+ "            grid-gap: 10px;\r\n"
				+ "        }\r\n"
				+ "        \r\n"
				+ "        button:hover {\r\n"
				+ "            color: rgb(158, 245, 245);\r\n"
				+ "        } */\r\n"
				+           ""
				+ "body { background-image: url('./image/cab3.jpg'); background-size: cover; background-repeat: no-repeat; background-attachment: fixed;} \r\n"
				
				+ "				table {\r\n"
            
				+ "					width: 800px;\r\n"
				+ "					border-collapse: collapse;\r\n"
				+ "					overflow: hidden;\r\n"
				+ "					box-shadow: 0 0 20px rgba(0,0,0,0.1);\r\n"
				+ "				}\r\n"
				+ "\r\n"
				+ "				th,\r\n"
				+ "				td {\r\n"
				+ "					padding: 15px;\r\n"
				+ "					background-color: rgba(255,255,255,0.2);\r\n"
				+ "					color: #fff;\r\n"
				+ "				}\r\n"
				+ "\r\n"
				+ "				th {\r\n"
				+ "					text-align: left;\r\n"
				+ "				}\r\n"
				+ "\r\n"
				+ "				thead {\r\n"
				+ "					th {\r\n"
				+ "						background-color: #55608f;\r\n"
				+ "					}\r\n"
				+ "				}\r\n"
				+ "\r\n"
				+ "				tbody {\r\n"
				+ "					tr {\r\n"
				+ "						&:hover {\r\n"
				+ "							background-color: rgba(255,255,255,0.3);\r\n"
				+ "						}\r\n"
				+ "					}\r\n"
				
				+ "					"
				+ "    </style>\r\n"
				+ "\r\n"
				+ "    <body>\r\n"
				+" <div style=\"float:right\">\r\n"
				+ "<form align=\"right\" name=\"form1\" method=\"post\" action=\"LogoutServlet\">\r\n"
				+ "  <label class=\"logoutLblPos\">\r\n"
				+ "    <button class=\\\"btns\\\" type=\\\"submit\\\">Logout</button>\r\n"
				+ "  </label>\r\n"
				+ "</form>\r\n"
				+ "</div>  "
				+ "\r\n");
		out.println("<center>\r\n"
				+ "    <table>\r\n"
				+ "        <thead>\r\n"
				+ "            <tr>\r\n"
				+ "                <th>Cab Id</th>\r\n"
				+ "                <th>Cab Model</th>\r\n"
				+ "                <th>Driver Name</th>\r\n"
				+ "                <th>Driver Mob No</th>\r\n"
				+ "            </tr>\r\n"
				+ "        </thead>\r\n"
				+ "        <tbody>");
		for(Cab cab : freeCabs) {
			
			out.println("            <tr>");
			out.format("<td>"+cab.getCabId()+"</td>");
			out.format("<td>%s</td>", cab.getCabModel());
			out.format("<td>%s</td>", cab.getDriverName());
			out.format("<td>%s</td>", cab.getDrivMobNo());
//			s.setAttribute("requestId", b.getRequestId());
//			out.format("<td>"
//					+"<form method=\"post\" action=\"Assign\" >\r\n"
//					+ "<button type=\"submit\" class=\"button button1\" >Assign</button>\r\n"
//					+ "</form>"
//					+"</td>");
			out.println("            <tr>");
		}
		out.println("        </tbody>\r\n"
				+ "    </table>\r\n"
				+ "    </center>");
				out.println( "<body>\r\n"
			
				+ "            <div class=\"login-page\">\r\n"
				+ "                <div class=\"form\">\r\n"
				+ "                    <div class=\"login\">\r\n"
				+ "                        <div class=\"login-header\">\r\n"
				+ "                            <h3>Enter cab id which you want to book</h3>\r\n"
				+ "                            <!-- <p>Please enter your credentials to login.</p> -->\r\n"
				+ "                            <!-- <p>Who are you ?</p> -->\r\n"
				+ "                        </div>\r\n"
				+ "                    </div>\r\n"
				+ "                    <form class=\"login-form\" action=\"BookCab\" method=\"get\">\r\n"
				+ "\r\n"
				+ "                        <div class=\"buttons\">\r\n"
				+ "                            <input type=\"number\" placeholder=\"Enter cab id\" name=\"bcabid\" />\r\n"
				+ "                            <button type=\"submit\" class=\"button\">submit</button>\r\n"
				+ "                        </div>\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "                    </form>\r\n"
				+ "                        <div class=\"login-header\">\r\n"
				+ "                            <h3>Press the button to Check Booking Result</h3>\r\n"
				+ "                        </div>\r\n"
				+ "\r\n"
				+ "                     <form action=\"RequestedCabStatus\" method=\"post\" class=\"button\">\r\n"
				+ "                        <button type=\"submit\">Go to Booking Result!</button>\r\n"
				+ "                    </form>\r\n"
				+ "                </div>\r\n"
				+ "            </div>\r\n"
				+ "        </body>\r\n"
				+ "    </body>\r\n"
				+ "\r\n"
				+ "</html>");
		
//		response.sendRedirect("BookCab");
		
	}

}
