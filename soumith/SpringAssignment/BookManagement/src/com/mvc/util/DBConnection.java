package com.mvc.util;
 
import java.sql.Connection;
import java.sql.DriverManager;
 
public class DBConnection {
 public static Connection createConnection()
 {
 Connection con = null;
 String url = "jdbc:mariadb://localhost:3306/java";
 String username = "root"; 
 String password = "password"; 
 
 try 
 {

 Class.forName("org.mariadb.jdbc.Driver"); 
 //con = DriverManager.getConnection("jdbc:mariadb://localhost:3306/java?user=root&password=password");
 con = DriverManager.getConnection("jdbc:mariadb://localhost:3306/java",username,password);
 //System.out.println("Printing connection object "+con);
 } 
 catch (Exception e) 
 {
 e.printStackTrace();
 }
 return con; 
 }
}