<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update</title>
</head>
<body>
    <form action="updateemp" method="post">
    Employee Id : <input type="text" name="id" id="id" value="${emp.id}" readonly><br>
    Employee name: <input type="text" name="name" id="name" value="${emp.name}"><br>
    Employee Salary: <input type="text" name="sal" id="sal" value="${emp.sal}"><br>
    <button type="submit" name="btn" id="btn">Update employee</button>
 </form>
</body>
</html>