package com.cont;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/RegisterFormCont")
public class RegisterFormContServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("name").trim();
		String a=request.getParameter("age").trim();
		String gender=request.getParameter("gender").trim();
		String address=request.getParameter("addr").trim();
		int age=Integer.parseInt(a);
		
		RequestDispatcher rd1=request.getRequestDispatcher("RegisterSuccess.html");
		rd1.forward(request, response);
	}

	
	
	}
