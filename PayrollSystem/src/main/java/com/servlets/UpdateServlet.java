package com.servlets;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entities.Employee;

public class UpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public UpdateServlet() {
        super();
        
    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name=request.getParameter("name");
		double salary=Double.parseDouble(request.getParameter("salary"));
		String des=request.getParameter("description");
		int id=Integer.parseInt(request.getParameter("id"));
		
		Session s=new Configuration().configure().buildSessionFactory().openSession();
		Transaction tx=s.beginTransaction();
		Employee emp=(Employee)s.get(Employee.class ,id);
		
		emp.setDescription(des);
		emp.setJoinDate(new Date());
		emp.setName(name);
		emp.setSalary(salary);
		
		tx.commit();
		s.close();
		
		request.getRequestDispatcher("all_employee.jsp").include(request, response);
	}

}
