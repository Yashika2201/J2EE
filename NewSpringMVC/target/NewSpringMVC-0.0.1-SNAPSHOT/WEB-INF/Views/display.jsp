<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employee</title>
</head>
<body>
	<table>
		<thead>
			<tr>
				<th>ID</th>
				<th>Name</th>
				<th>Salary</th>
				<th>Designation</th>
				<th>Department</th>
				<th>Options</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="e" items="${elist }">
				<tr>
					<td>${e.empid}</td>
					<td>${e.ename}</td>
					<td>${e.sal}</td>
					<td>${e.desg}</td>
					<td>${e.dept}</td>
					<td><a>Edit</a> | <a>Delete</a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>