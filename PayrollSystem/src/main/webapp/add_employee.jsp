<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Employee</title>
<%@include file="all_js.jsp" %>
</head>
<body>
<div class="container">
	<%@include file="navbar.jsp" %>
	<h3>This is add employee page</h3>
	<br>
	
	<form action="SaveEmployeeServlet" method="post">
  <div class="form-group">
    <label for="titel">Employee Name</label>
    <input type="text" class="form-control" id="titel" aria-describedby="emailHelp" placeholder="Enter Employee Name" required name="name">
  </div>
  <div class="form-group">
    <label for="salary">Salary</label>
    <input type="text" class="form-control" id="salary" placeholder="Enter Salary" required name="salary">
  </div>
  <div class="form-group">
    <label for="exampleFormControlTextarea1">Employee Description</label>
    <textarea class="form-control" id="exampleFormControlTextarea1" rows="3" required name="description"></textarea>
  </div>
  <div class="container text-center">
   <button type="submit" class="btn btn-primary">Add</button>
  </div>
 
</form>
</div>
</body>
</html>