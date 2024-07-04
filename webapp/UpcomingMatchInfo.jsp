<%@page import="com.model.MatchDao" %>
<%@page import="java.sql.ResultSet" %>

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
<i><h2>*************************** Upcoming Matches ***************************</h2></i>
<table border="1">
<tr><th>Sl No</th><th>Title</th><th>Place</th><th>MatchDate</th></tr>
<%
ResultSet rs = new MatchDao().retrieveMatch();
while(rs.next()){
%>
<tr><th><%= rs.getInt(1) %></th>
<th><%= rs.getString(2) %></th>
<th><%= rs.getString(3) %></th>
<th><%= rs.getString(4) %></th></tr>
<% } %>
</table>
</center>
</body>
</html>