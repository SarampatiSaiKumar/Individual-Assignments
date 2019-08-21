package com.mvc.controller;

import javax.servlet.http.HttpServlet;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mvc.bean.BookBean;
import com.mvc.dao.BookDao;
@WebServlet("/BookServlet")
public class BookServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		
		String bool=request.getParameter("s");
		
		if(bool.equals("home"))
		{
			String s=request.getParameter("bookdetails");
			if(s.equals("add")){
				request.getRequestDispatcher("/add.jsp").forward(request, response);	
			}
			else if(s.equals("view")){
				request.getRequestDispatcher("/view.jsp").forward(request, response);
			}
			else if(s.equals("delete")){
				request.getRequestDispatcher("/delete.jsp").forward(request, response);
			}
			else if(s.equals("update")){
				request.getRequestDispatcher("/update.jsp").forward(request, response);
			}
			else if(s.equals("viewall")){
				request.getRequestDispatcher("/viewall.jsp").forward(request, response);
			}
		}
		else if(bool.equals("add")) {
			int bookid=Integer.parseInt(request.getParameter("bookid"));
  		  	String title=request.getParameter("title");
  		  	String author=request.getParameter("author");
  		  	int price=Integer.parseInt(request.getParameter("price"));
  		  	BookBean bookBean = new BookBean(); 
  		  	bookBean.setBookid(bookid);
  		  	bookBean.setTitle(title);
  		  	bookBean.setAuthor(author);
  		  	bookBean.setPrice(price);
  		  	//System.out.println("setting done");
  		  	BookDao bookDao = new BookDao(); //creating object for LoginDao. This class contains main logic of the application.
  		 
  		  	boolean userValidate = bookDao.addBook(bookBean);
  		  	if(userValidate)
  		  	{
  		  		out.println("Book Added Successfully");
  		  		out.print("");
  		  		request.getRequestDispatcher("/index.jsp").include(request, response);
  		  	}
  		  	
  			
		}
		
		else if(bool.equals("view")) {
			int bookid=Integer.parseInt(request.getParameter("bookid"));
  		  	
  		  	BookBean bookBean = new BookBean(); 
  		  	bookBean.setBookid(bookid);
  		  	
  		  	//System.out.println("setting done");
  		  	BookDao bookDao = new BookDao(); //creating object for LoginDao. This class contains main logic of the application.
  		  	ResultSet rs = bookDao.viewBook(bookBean);
  		  try {
  			  out.println("<h4>BookId"+" "+"Title"+" "+"Author"+" "+"Price</h4>");
			while(rs.next()) {
				out.print(rs.getString(1)+"	|");
				out.print(rs.getString(2)+"	|");
				out.print(rs.getString(3)+"	|");
				out.print(rs.getString(4)+"	|");
			}
			out.print("<br><br><br><hr>");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
  		  		request.getRequestDispatcher("/index.jsp").include(request, response);
  		  	}
  		  	
  			
		}
	}

