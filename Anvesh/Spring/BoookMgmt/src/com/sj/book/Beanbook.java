package com.sj.book;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Beanbook {
int bookid;
String title,author,s;
float price;
public String getS() {
	return s;
}
public void setS(String s) {
	this.s=s;
}
public int getBookid() {
	return bookid;
}
public void setBookid(int bookid) {
	this.bookid = bookid;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getAuthor() {
	return author;
}
public void setAuthor(String author) {
	this.author = author;
}
public float getPrice() {
	return price;
}
public void setPrice(float price) {
	this.price = price;
}
String JDBC_DRIVER = "org.mariadb.jdbc.Driver";
String DB_URL2 = "jdbc:mariadb://localhost:3306/anvesh";
String USER = "root";
String PASS = "password";
Connection conn = null;
Statement stmt = null;
public String Ex() {
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
	            System.out.println("stmt created");
	            System.out.println(s);
	            if(s.equals("add")) {
		            System.out.println("loop created");
	            	
	            	String sql="insert into book values("+bookid+",'"+title+"','"+author+"',"+price+")";
	            	System.out.println(sql);
	            	int x=stmt.executeUpdate(sql);
	            	if(x>0)
	            		return "Record added successfully";
	            	return "bookid "+bookid+" already exists" ;
	            }
	            if(s.equals("update")) {
	            	 String sql="update book set title ='"+title+"' , author='"+author+"' , price="+price+" where bookid="+bookid;
	            	int x=stmt.executeUpdate(sql);
	            	if(x>0)
	            		return "Record updated successfully";
	            	return "bookid "+bookid+" is not present" ;
	            }
	            if(s.equals("delete")) {
	            	String sql="delete from book where bookid="+bookid;
	            	int x=stmt.executeUpdate(sql);
	            	if(x>0)
	            		return "Record deleted successfully";
	            	return " No record exists with bookid "+bookid ;
	            }
	            if(s.equals("view")) {  
	            	String op="";
	            	String sql="select * from book where bookid="+bookid;
	            	ResultSet rs = stmt.executeQuery(sql);
	            	while(rs.next()) {
	            		c++;
	            		op+= rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)
	            		+" "+rs.getString(4)+" ";
	            	}
	            	if(c==0) 
	            		return "please check the bookid "+bookid;
	              return op;
	            }
	            if(s.equals("viewall")) {
	            	String op="";
	            	String sql="select * from book";
	            	System.out.println(sql);
	            	ResultSet rs = stmt.executeQuery(sql);
	            	while(rs.next()) {
	            		c++;
	            		op+= rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)
	            		+" "+rs.getString(4)+"\n";
	            	}
	            	if(c==0) 
	            		return "No records present";
	            return op;
	            }
            conn.close(); 
        } 
        catch(Exception ex) 
        { 
            System.err.println(ex); 
        } 
     return "error";
}
}

