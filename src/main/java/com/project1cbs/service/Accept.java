package com.project1cbs.service;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.project1cbs.dao.RequestDao;
import com.project1cbs.dao.RequestDaoImpl;
import com.project1cbs.exception.BookingIdNotFoundException;


public class Accept extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Accept() {
        super();
        // TODO Auto-generated constructor stub
    }
    public static final Logger logger = LogManager.getLogger(Accept.class);
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 logger.info("In accept page");
		PrintWriter out = response.getWriter();
		Integer BookingReqId = Integer.parseInt(request.getParameter("bcabid"));
		RequestDao rq= new RequestDaoImpl();
		
		try {
			if(rq != null) {
				rq.acceptRequest(BookingReqId);
				 logger.info("Successfully cab assigned...");

				out.println("<!DOCTYPE html>\r\n"
						+ "<html>\r\n"
						+ "\r\n"
						+ "<head>\r\n"
						+ "    <link rel=\"stylesheet\" href=\"style.css\">\r\n"
						+ "    <title> Addcab Success </title>\r\n"
						+ "\r\n"
						+ "\r\n"
						+ "    <body>\r\n"
						+ "        <h1 style=\"color:white;text-align:center;\">Cab assigned successfully!</h1>\r\n"
						+ "        <div style=\"float:right\">\r\n"
						+ "            <form align=\"right\" name=\"form1\" method=\"post\" action=\"LogoutServlet\">\r\n"
						+ "                <label class=\"logoutLblPos\">\r\n"
						+ "            <button class=\"btns\" type=\"submit\">Logout</button>\r\n"
						+ "             </label>\r\n"
						+ "            </form>\r\n"
						+ "        </div>\r\n"
						+ "\r\n"
						+ "        <body>\r\n"
						+ "\r\n"
						+ "            <div class=\"login-page\">\r\n"
						+ "                <div class=\"form\">\r\n"
						+ "                    <div class=\"login\">\r\n"
						+ "                        <div class=\"login-header\">\r\n"
						+ "                            <h3>Press the button go back to admin page</h3>\r\n"
						+ "                        </div>\r\n"
						+ "                    </div>\r\n"
						+ "                    <form action=\"CheckCabRequestsServlet\" method=\"post\" class=\"button\">\r\n"
						+ "                        <button type=\"submit\">Admin Page</button>\r\n"
						+ "                    </form>\r\n"
						+ "                </div>\r\n"
						+ "            </div>\r\n"
						+ "        </body>\r\n"
						+ "    </body>\r\n"
						+ "\r\n"
						+ "</html>");
			}
		} catch (BookingIdNotFoundException e) {
			// TODO Auto-generated catch block
			out.println(e.getMessage());
			 logger.info("cab assign failed...");

		}
		
	}

}
