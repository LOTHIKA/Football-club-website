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

@WebServlet("/AddMatchForm")
public class AddMatchFormServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out =response.getWriter();
		response.setContentType("text/html");
		ArrayList<String> list = (ArrayList<String>)request.getAttribute("errors");
		out.println("<link rel='stylesheet' href='style.css'>");
		out.println("<html>");
		out.println("<body>");
	    out.println("<center>");
		out.println("<i><h2>Add Match Details</h2></i>");
		if(list!=null) {
			Iterator <String> itr=list.iterator();
			out.println("<ul>");
			while(itr.hasNext()) {
				out.println("<li>"+itr.next()+"</li>");
			}
			out.println("</ul>");
		}
		out.println("<form action='AddMatchCont' method='post'>");
		out.println("<table>");
		out.println("<tr><td>Title</td><td><input type='text' name='title' required></td></tr><br><br> ");
		out.println("<tr><td>Place</td><td><input type='text' name='place' required></td></tr><br><br> ");
		out.println("<tr><td>Match Date</td><td><input type='datetime' name='date' required></td></tr><br><br> ");
		out.println("<tr><td> </td><td><input type='submit' value='Submit'></td></tr>");
		out.println(" </table></form> </center> </body> </html> ");

		}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	     doGet(request,response);
		
	}
}
