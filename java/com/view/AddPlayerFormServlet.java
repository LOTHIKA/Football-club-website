package com.view;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/AddPlayer")
public class AddPlayerFormServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		out.println("<link rel='stylesheet' href='style.css'>");
		out.println("<html>");
		out.println("<body>");
		out.println("<center>");
	
        out.println("<center>");
 		out.println("<i><h2>Add Player Details</h2></i>");
 		out.println("<form action='AddPlayerCont' method='post' enctype='multipart/form-data'> ");
 		out.println("<table>");
 		out.println("<tr><td>Name</td><td><input type='text' name='name' required></td></tr> <br><br> ");
 		out.println("<tr><td>Age</td><td><input type='integer' name='age' required ></td></tr> <br><br> ");
 		out.println("<tr><td>Profile</td><td><input type='file' name='profile' ></td></tr> <br><br> ");
 		out.println("<tr><td></td><td><input type='submit' value='Submit'></td></tr>");
 		out.println(" </table> </form> </center> </body> </html> ");
          
 
	    
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
