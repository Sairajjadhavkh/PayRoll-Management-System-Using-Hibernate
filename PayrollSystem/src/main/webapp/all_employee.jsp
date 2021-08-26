<%@page import="org.hibernate.Query"%>
<%@page import="org.hibernate.Session"%>
<%@page import="org.hibernate.cfg.Configuration"%>
<%@page import="com.entities.*"%>
<%@page import="java.util.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All Employees</title>
 <%@include file="all_js.jsp" %>
</head>
<body>
<div class="container">
<%@include file="navbar.jsp" %>
<br>
<h3>ALL EMPLOYESS PRESENT IN THE COMPANY :</h3>

<%
	Session ses=new Configuration().configure().buildSessionFactory().openSession();
	Query q=ses.createQuery("from Employee");
	List<Employee> list=q.list();
	for(Employee e:list){ %>
	
		Employee Id:-<%=e.getId() %><br> Employee Name:-<%=e.getName() %><br> Employee Salary:-<%=e.getSalary()%><br> Employee Description:-<%=e.getDescription()%><br>
		<a class="btn btn-primary" href="DeleteServlet?emp_id=<%= e.getId() %>" role="button">Delete</a>
		<a class="btn btn-primary" href="edit.jsp?emp_id=<%= e.getId() %>" role="button">Update</a>
		**********************************************************************************************************************************************************************
	<% }
%>
</div>
</body>
</html>