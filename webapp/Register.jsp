
<%@ page import="java.util.List" %>
<%@ page import="java.util.Iterator" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>FOOTBALL CLUB</title>
<link rel="stylesheet" href="style.css">
</head>
<body>
<center>
<i><h2>Registration form for Players</h2></i>
<form action="RegisterFormCont" method="post">
<table>
<tr><td>Name</td><td><input type="text" name="name" required></td></tr> <br><br>
<tr><td>Age</td><td><input type="text" name="age" required></td></tr> <br><br>
<tr><td>Gender</td><td> <input type="radio" name="gender" value="Male" required>Male
        <input type="radio" name="gender" value="Female" required>Female</td></tr> <br><br>
<tr><td>Address</td><td> <input type="text" name="addr" required></td></tr>  <br><br>
<tr><td></td><td><input type="submit" value="Submit"></td></tr>
</table>
</form>
</center>
</body>
</html>