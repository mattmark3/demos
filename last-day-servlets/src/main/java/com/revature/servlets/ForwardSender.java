package com.revature.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.servlets.DefaultServlet;
import org.apache.log4j.Logger;

public class ForwardSender extends DefaultServlet {
	private Logger log = Logger.getRootLogger();
	
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		log.trace("request received by ForwardSender, forwarding to the receiver");
		
		// forward
//		request.getRequestDispatcher("/receiver").forward(request, response);
		
		// redirect
		response.sendRedirect("/last-day-servlets/receiver");
	}

}
