package com.sonata;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DemoExample
 */
@WebServlet("/DemoExample")
public class DemoExample extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	public DemoExample() {
		super();
	}
    	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    		// TODO Auto-generated method stub
    		response.setContentType("text/html");
    		PrintWriter out=response.getWriter();
    		String id=request.getParameter("id");
    		String p=request.getParameter("place");
    		
out.println(id);
out.println(p);

    		
    	}


}
