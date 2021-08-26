package com.servlets;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public Login() {
        super();
        
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String unm = request.getParameter("userName");
		String upass = request.getParameter("userPass");
		if(unm.equals("sairaj") && upass.equals("sairaj")) {
			request.getRequestDispatcher("home.jsp").include(request, response);
		}else if(unm.equals("shubam") && upass.equals("shubam")){
			request.getRequestDispatcher("home.jsp").include(request, response);
		}
		else {
			request.getRequestDispatcher("index.jsp").include(request, response);
		}
	}

}
