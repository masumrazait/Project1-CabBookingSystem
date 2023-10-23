package com.project1cbs.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.project1cbs.dao.GetCabRequestsDaoImpl;
import com.project1cbs.model.BookingRequests;

/**
 * Servlet implementation class CheckCabRequestsServlet
 */
public class CheckCabRequestsServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	 public static final Logger logger = LogManager.getLogger(CheckCabRequestsServlet.class);

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
//		out.println("We are in check cab request");
		
		GetCabRequestsDaoImpl gcr = new GetCabRequestsDaoImpl();
		List<BookingRequests> bookingRequerts = gcr.getBookingRequests();
		
		logger.info("In check cab request page...");
		out.println("<!DOCTYPE html>\r\n"
				+ "<html>\r\n"
				+ "\r\n"
				+ "<head>\r\n"
				+ "    <link rel=\"stylesheet\" href=\"style.css\">\r\n"
				+ "    <title>Cab Request page</title>\r\n"
				+ "    <style>\r\n"
				+ "  body { background-image: url('./image/cab4.jpg'); background-size: cover; background-repeat: no-repeat; background-attachment: fixed;} \r\n"
				
				+ "        /* div.buttons {\r\n"
				+ "            display: grid;\r\n"
				+ "            grid-gap: 10px;\r\n"
				+ "        }\r\n"
				+ "        \r\n"
				+ "        button:hover {\r\n"
				+ "            color: rgb(158, 245, 245);\r\n"
				+ "        } */\r\n"
				+ "				table {\r\n"
            
				+ "					width: 800px;\r\n"
				+ "					border-collapse: collapse;\r\n"
				+ "					overflow: hidden;\r\n"
				+ "					box-shadow: 0 0 20px rgba(0,0,0,0.1);\r\n"
				+ "				}\r\n"
			
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
				+ "				"
				+"              tbody {\r\n"
				+ "	tr {\r\n"
				+ "		&:hover {\r\n"
				+ "			background-color: rgba(255,255,255,0.3);\r\n"
				+ "		}\r\n"
				+ "	}\r\n"
				+ "	td {\r\n"
				+ "		position: relative;\r\n"
				+ "		&:hover {\r\n"
				+ "			&:before {\r\n"
				+ "				content: \"\";\r\n"
				+ "				position: absolute;\r\n"
				+ "				left: 0;\r\n"
				+ "				right: 0;\r\n"
				+ "				top: -9999px;\r\n"
				+ "				bottom: -9999px;\r\n"
				+ "				background-color: rgba(255,255,255,0.2);\r\n"
				+ "				z-index: -1;\r\n"
				+ "			}\r\n"
				+ "		}\r\n"
				+ "	}\r\n"
				+ "}"
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
				+ "\r\n"
				+"      ");
		out.println("<center>\r\n"
				+"         <h3 style=\\\"color:white; align-item: center\\\">Pending Cab Requests</h3>"
				+ "    <table>\r\n"
				+ "        <thead>\r\n"
				+ "            <tr>\r\n"
				+ "                <th>Booking Id</th>\r\n"
				+ "                <th>Cab Id</th>\r\n"
				+ "                <th>Cab Model</th>\r\n"
				+ "                <th>Employee Id</th>\r\n"
				+ "                <th>Employee Name</th>\r\n"
				+ "            </tr>\r\n"
				+ "        </thead>\r\n"
				+ "        <tbody>"
				+"          ");
		for(BookingRequests b : bookingRequerts) {
			out.println("            <tr>");
			if(b.getCheckedOrNot() == 0) {
				
				out.format("<td>"+b.getbId()+"</td>");
				out.format("<td>%s</td>", b.getCab().getCabId());
				out.format("<td>%s</td>", b.getCab().getCabModel());
				out.format("<td>%s</td>", b.getEmp().getEmpId());
				out.format("<td>%s</td>", b.getEmp().getName());
				
			}
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
				+ "                            <h5>Enter Booking id which you want to Accept</h5>\r\n"
				+ "                            <!-- <p>Please enter your credentials to login.</p> -->\r\n"
				+ "                            <!-- <p>Who are you ?</p> -->\r\n"
				+ "                        </div>\r\n"
				+ "                    </div>\r\n"
				+ "                    <form class=\"login-form\" action=\"Accept\" method=\"get\">\r\n"
				+ "\r\n"
				+ "                        <div class=\"buttons\">\r\n"
				+ "                            <input type=\"number\" placeholder=\"Booking Id\" name=\"bcabid\" />\r\n"
				+ "                            <button type=\"submit\" class=\"button\">Accept</button>\r\n"
				+ "                        </div>\r\n"
				+ "                    </form>\r\n"
				+ "                    <form class=\"login-form\" action=\"Reject\" method=\"get\">\r\n"
				+ "\r\n"
				+ "                        <div class=\"buttons\">\r\n"
				+"                              <h5>Enter the booking Id which you want to reject</h5>"
				+ "                            <input type=\"number\" placeholder=\"Booking Id\" name=\"bcabid\" />\r\n"
				+ "                            <button type=\"submit\" class=\"button\">Reject</button>\r\n"
				+ "                        </div>\r\n"
				+ "                    </form>\r\n"
				+ "                </div>\r\n"
				+ "            </div>\r\n"
				+ "        </body>\r\n"
				+ "    </body>\r\n"
				+ "\r\n"
				+ "</html>");
	}

}
