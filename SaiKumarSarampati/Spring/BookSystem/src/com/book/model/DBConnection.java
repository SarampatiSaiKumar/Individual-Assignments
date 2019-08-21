package com.book.model;
import java.sql.*;

public class DBConnection {
	
	public static Connection CreateConnection() {
		Connection con = null;
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			
			con = DriverManager.getConnection("jdbc:mariadb://localhost:3306/java?user=root&password=password");
			Statement st=con.createStatement();
			System.out.println("connection succeded");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("connection failed");

		}
		return con;
	}
	

}
