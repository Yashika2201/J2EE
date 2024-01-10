<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee List</title>
</head>
<body>
<h1>Employee Details</h1>
	<table border = 5px>
	<thead>
		<tr>
			<th>ID</th>
			<th>Name</th>
			<th>Salary</th>
			<th>Options</th>
		</tr>	
	</thead>
	<tbody>
		<c:forEach var="emp" items="${elist}">
			<tr>
			<td>${emp.id}</td> 
			<td>${emp.name}</td>
			<td>${emp.sal}</td>
			<td>
			<a href="delete?id=${emp.id}">delete</a>/
			<a href="edit?id=${emp.id}">edit</a>
			</td>
			</tr>
		</c:forEach>
	</tbody>
	</table>
	
	<a href ="addemp.jsp">Insert New Employee</a>
</body>
</html>