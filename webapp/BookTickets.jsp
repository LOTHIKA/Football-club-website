<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>VSB - FOOTBALL CLUB</title>
<link rel="stylesheet" href="style.css">
</head>
<body>
<center>
<h1><i>Book Your Football Tickets</i></h1>

        <form action="BookingCont" method="post">
        <table>
        <tr>
          <td>Name</td>
            <td><input type="text" id="name" name="name" required></td><br><br></tr>
         <tr>   <td>Email</td>
           <td> <input type="email" id="email" name="email" required></td><br><br></tr>
          <tr>  <td>Select Match</td>
            <td><select>
                <option value="match1" required>Match 1</option>
                <option value="match2" required>Match 2</option>
                <option value="match3" required>Match 3</option>
            </select></td><br><br></tr>
         <tr><td>Number of Tickets</td>
            <td><input type="number" id="tickets" name="tickets" required></td><br><br></tr>
            <tr><td></td><td><button type="submit">Book Tickets</button></td></tr>
            </table>
        </form> 
        </center>
</body>
</html>