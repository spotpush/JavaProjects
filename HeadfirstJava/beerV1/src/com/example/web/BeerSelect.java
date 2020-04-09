package com.example.web;

import com.example.model.*; //imports model class from model/BeerExpert.class
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;

public class BeerSelect extends HttpServlet {
	public void doPost(HttpServletRequest request,HttpServletResponse response)
		throws IOException, ServletException {
	//response.setContentType("text/html");
	//PrintWriter out = response.getWriter();
	//out.println("Beer Selection Advice<br>");
	String c = request.getParameter("color");
	//out.println("<br>Got beer color "+c);
	BeerExpert be = new BeerExpert(); //instantiate BeerExpert(.class)
	List result = be.getBrands(c); //call getBrands from BeerExpert
	
	request.setAttribute("styles", result); //add attribute to the request object for JSP
	RequestDispatcher view = request.getRequestDispatcher("result.jsp"); //instantiate a request dispatcher
	view.forward(request, response); //use RequestDispatcher to ask the container to load JSP
	
	//Iterator it = result.iterator(); //create an iterator to loop through the List
	//while (it.hasNext()) {
	//	out.print("<br>try: "+ it.next());
	//}
	}
}