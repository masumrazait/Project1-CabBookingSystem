package com.project1cbs.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.project1cbs.dao.GetBookingResults;
import com.project1cbs.dao.GetBookingResultsDaoImpl;
import com.project1cbs.model.BookingResult;
import com.project1cbs.model.Employee;

/**
 * Servlet implementation class RequestedCabStatus
 */
public class RequestedCabStatus extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		GetBookingResults gbr = new GetBookingResultsDaoImpl();
		List<BookingResult> bResult = gbr.getBookingResult();
		HttpSession session = request.getSession();
		Employee emp = (Employee) session.getAttribute("Employee");//pulling emp obj from session
		
		out.println("<!DOCTYPE html>\r\n"
				+ "<html>\r\n"
				+ "\r\n"
				+ "<head>\r\n"
				+ "    <link rel=\"stylesheet\" href=\"style.css\">\r\n"
				+ "    <title>Cab Request page</title>\r\n"
				+ "    <style>\r\n"
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
				+ "		body { background-image: url('./image/cab1.jpg'); background-size: cover; background-repeat: no-repeat; background-attachment: fixed;} \r\n"
				
				
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
				+"         <h3 style=\\\"color:white; align-item: center\\\">Cab Request Result</h3>"
				+ "    <table>\r\n"
				+ "        <thead>\r\n"
				+ "            <tr>\r\n"
				+ "                <th>Booking Id</th>\r\n"
				+ "                <th>Cab Id</th>\r\n"
				+ "                <th>Cab Model</th>\r\n"
				+ "                <th>Employee Name</th>\r\n"
				+ "                <th>Status</th>\r\n"
				+ "            </tr>\r\n"
				+ "        </thead>\r\n"
				+ "        <tbody>"
				+"          ");
		for(BookingResult b : bResult) {
			out.println("            <tr>");
				if(b.getBrId().getEmp().getEmpId() == emp.getEmpId()) {
					out.format("<td>"+b.getBrId().getbId()+"</td>");
					out.format("<td>%s</td>", b.getBrId().getCab().getCabId());
					out.format("<td>%s</td>", b.getBrId().getCab().getCabModel());
					out.format("<td>%s</td>", b.getBrId().getEmp().getName());
					out.format("<td>%s</td>", b.getStatus());
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
				+ "                    </div>\r\n"
				+ "\r\n"
				+ "                     <form action=\"EmployeeServlet\" method=\"post\" class=\"button\">\r\n"
				+ "                        <button type=\"submit\">Go Back!</button>\r\n"
				+ "                    </form>\r\n"
				+ "\r\n"
				+ "                </div>\r\n"
			
				+ "                        </div>\r\n"
				+ "                    </div>\r\n"
			
				+ "                </div>\r\n"
				+ "            </div>\r\n"
				+ "        </body>\r\n"
				+ "    </body>\r\n"
				+ "\r\n"
				+ "</html>");
	}

}
