<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Employee</title>
</head>
<body>
   <form action="updateEmployee" method="post">
       Employee id : <input type="text" name="empid" id="empid" value="${e.empid}" readonly><br>
       Employee name : <input type="text" name="ename" id="ename" value="${e.ename}"><br>
       Salary: <input type="number" name="sal" id="sal" value="${e.sal}"><br>
       Department : <input type="text" name="department" id="department" value="${e.department}"><br>
       Designation : <input type="text" name="desg" id="desg" value="${e.desg}"><br>
       <button type="submit" name="btn" id="btn">Add new Employee</button>
   </form>
</body>
</html>