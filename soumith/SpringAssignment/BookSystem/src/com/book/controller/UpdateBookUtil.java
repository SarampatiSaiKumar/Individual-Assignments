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
 * Servlet implementation class UpdateBookUtil
 */
@WebServlet("/UpdateBookUtil")
public class UpdateBookUtil extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateBookUtil() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		 
		 int isbn=Integer.parseInt(request.getParameter("isbn"));
		 int price=Integer.parseInt(request.getParameter("price"));
		 BookBean bean= new BookBean();
		 bean.setIsbn(isbn);
		 bean.setPrice(price);
		  if(BookDB.update(bean)>0) {
		 out.println("book updated succesfully");
			out.println("<a href=\"home.html\">Home Page<a>");

		 
	 }
	 else {
		 out.println("book not updated");
     	out.print("Invalid Book Isbn value");


	 }
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
