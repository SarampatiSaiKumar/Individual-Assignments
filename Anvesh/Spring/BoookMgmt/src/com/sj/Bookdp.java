package com.sj;


import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Bookdp
 */
@WebServlet("/Bookdp")
public class Bookdp extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Bookdp() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		  PrintWriter out = response.getWriter();
		  out.println("hi");
		  String s=request.getParameter("bookdetails");
		  out.println(s);
		  String JDBC_DRIVER = "org.mariadb.jdbc.Driver";
		  String DB_URL2 = "jdbc:mariadb://localhost:3306/sai";
		 String USER = "root";
		 String PASS = "password";
		 Connection conn = null;
	     Statement stmt = null;
	     int c=0;
	     try
	        { 
				Class.forName(JDBC_DRIVER);
				 System.out.println("Connecting to a selected database...");
		           conn = DriverManager.getConnection(DB_URL2, USER, PASS);
		            System.out.println("Connected database successfully...");
		            //STEP 4: Execute a query
		            System.out.println("selecting data from table in given database...");
		            stmt = conn.createStatement();
		            if(s.equals("add")) {
		            	  int bookid=Integer.parseInt(request.getParameter("bookid"));
		        		  String title=request.getParameter("title");
		        		  String author=request.getParameter("author");
		        		  int price=Integer.parseInt(request.getParameter("price"));
		            	String sql="insert into book values("+bookid+",'"+title+"','"+author+"',"+price+")";
		            	int x=stmt.executeUpdate(sql);
		            	if(x>0)
		            		out.println("Record added successfully");
		            	else
		            		out.println("bookid "+bookid+" already exists" );
		            }
		            if(s.equals("update")) {
		            	  int bookid=Integer.parseInt(request.getParameter("bookid"));
		        		  String title=request.getParameter("title");
		        		  String author=request.getParameter("author");
		        		  int price=Integer.parseInt(request.getParameter("price"));
		            	String sql="update book set title ='"+title+"' , author='"+author+"' , price="+price+" where bookid="+bookid;
		            	int x=stmt.executeUpdate(sql);
		            	if(x>0)
		            		out.println("Record updated successfully");
		            	else
		            		out.println("bookid "+bookid+" is not present" );
		            }
		            if(s.equals("delete")) {
		            	  int bookid=Integer.parseInt(request.getParameter("bookid"));
		            	String sql="delete from book where bookid="+bookid;
		            	int x=stmt.executeUpdate(sql);
		            	if(x>0)
		            		out.println("Record deleted successfully");
		            	else
		            		out.println(" No record exists with bookid "+bookid );
		            }
		            if(s.equals("view")) {  
		            	int bookid=Integer.parseInt(request.getParameter("bookid"));
		            	System.out.println("select * from book where bookid="+bookid);
		            	String sql="select * from book where bookid="+bookid;
		            	System.out.println(sql);
		            	ResultSet rs = stmt.executeQuery(sql);
		            	while(rs.next()) {
		            		c++;
		            		out.print(rs.getString(1)+" ");
		            		out.print(rs.getString(2)+" ");
		            		out.print(rs.getString(3)+" ");
		            		out.print(rs.getString(4)+" ");
		            	}
		            	if(c==0) 
		            		out.println("please check the bookid "+bookid);
		            
		            }
		            if(s.equals("viewall")) {
		            	String sql="select * from book";
		            	System.out.println(sql);
		            	ResultSet rs = stmt.executeQuery(sql);
		            	while(rs.next()) {
		            		c++;
		            		out.print(rs.getString(1)+" ");
		            		out.print(rs.getString(2)+" ");
		            		out.print(rs.getString(3)+" ");
		            		out.print(rs.getString(4)+" ");
		            	}
		            	if(c==0) 
		            		out.println("No records present");
		            }
	            conn.close(); 
	        } 
	        catch(Exception ex) 
	        { 
	            System.err.println(ex); 
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
