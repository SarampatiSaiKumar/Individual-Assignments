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
 * Servlet implementation class UpdateBookServlet
 */
@WebServlet("/UpdateBookServlet")
public class UpdateBookServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateBookServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	@SuppressWarnings("deprecation")
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		 int isbn=Integer.parseInt(request.getParameter("isbn"));
		
		 BookBean bean= new BookBean();
		 bean.setIsbn(isbn);
		 if(BookDB.viewBook(bean)>0) {
				out.println("<table class='table table-bordered table-striped'>");
				out.println("<tr><th>ISBN</th><th>Book Name</th><th>Author</th><th>Price</th></tr>");
				out.println("<tr><td>"+bean.getIsbn()+"</td><td>"+bean.getTitle()+"</td><td>"+bean.getAuthor()+"</td><td>"+bean.getPrice()+"</td><td>"+"</tr>");
		
				// out.println( "<a href=\" "+response.encodeUrl("/BookManagement/UpdateBookUtil") +  "\">Update the book</a> ");
				 out.println("Update the price information  in the below form");
				  out.println(
	                        "<form action=\"" +
	                        response.encodeUrl("/BookManagement/UpdateBookUtil") +
	                        "\" method=\"post\">" +
	                       
	                        "<td><input type=\"text\" name=\"isbn\"" +
	                        "value="+bean.getIsbn()+" size=\"19\"></td>" +
	                        "<td><input type=\"text\" name=\"price\"" +
	                        "value="+bean.getPrice()+" size=\"19\"></td>" +
	                       
	                        
	                        
	                        
	                        
	                        "<td><input type=\"submit\"" +
	                        "value=\"Update Information\"></td>" +
	                        
	                        "</form>" 
	                        );
                        
				//out.println()

		 }
		 else {
	        	out.print("Invalid Book Isbn value");

		 }
		/* if(BookDB.update(bean)>0) {
			 out.println("book updated succesfully");
				out.println("<a href=\"home.html\">Home Page<a>");

			 
		 }
		 else {
			 out.println("book not updated");

		 }*/
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
