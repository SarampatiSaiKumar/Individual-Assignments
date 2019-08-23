package com.book.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.book.model.BookBean;
import com.book.model.BookDB;

/**
 * Servlet implementation class ViewBookServlet
 */
@WebServlet("/ViewBookServlet")
public class ViewBookServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ViewBookServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		 int isbn=Integer.parseInt(request.getParameter("isbn"));
		 BookBean bean= new BookBean();
		 bean.setIsbn(isbn);
		 if(BookDB.viewBook(bean)>0) {
				out.println("<table class='table table-bordered table-striped'>");
				out.println("<tr><th>ISBN</th><th>Book Name</th><th>Author</th><th>Price</th></tr>");
				out.println("<tr><td>"+bean.getIsbn()+"</td><td>"+bean.getTitle()+"</td><td>"+bean.getAuthor()+"</td><td>"+bean.getPrice()+"</td><td>"+"</tr>");
				out.println("<a href=\"home.html\">Home Page<a>");

		 }
		 else {
	        	out.print("Invalid Book Isbn value");

		 }
		
	}

}
