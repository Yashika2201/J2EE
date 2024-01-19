<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Employee</title>
</head>
<body>
   <form action="insertEmployee" method="post">
       Employee id : <input type="text" name="empid" id="empid"><br>
       Employee name : <input type="text" name="ename" id="ename"><br>
       Salary: <input type="number" name="sal" id="sal"><br>
       Department : <input type="text" name="department" id="department"><br>
       Designation : <input type="text" name="desg" id="desg"><br>
       <button type="submit" name="btn" id="btn">Add new Employee</button>
   </form>
</body>
</html>