package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entities.Employee;
import com.helper.FactoryProvider;


public class SaveEmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public SaveEmployeeServlet() {
        super();
      
    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
		String name=request.getParameter("name");
		double salary=Double.parseDouble(request.getParameter("salary"));
		String description=request.getParameter("description");
		
		Employee emp=new Employee(name,salary,description,new Date());
		Session session=new Configuration().configure().buildSessionFactory().openSession();
		System.out.println(session);
		Transaction tx=session.beginTransaction();
		session.save(emp);
		tx.commit();
		session.close();
		
		response.setContentType("text/html");
		PrintWriter ptr=response.getWriter();
		ptr.println("<h2 style='text-align:center;'>Employee Added Sucessfully</h2>");
		ptr.println("<h2 style='text-align:center;'><a href='all_employee.jsp'>View All Employees</a></h2>");
		ptr.println("<br>");
		ptr.println("<h2 style='text-align:center;'><a href='add_employee.jsp'>Add More Employees</a></h2>");
		
		
	}

}
