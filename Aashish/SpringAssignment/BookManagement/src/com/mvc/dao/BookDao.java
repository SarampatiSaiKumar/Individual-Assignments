package com.mvc.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import com.mvc.bean.BookBean;
import com.mvc.util.DBConnection;
public class BookDao {
	public boolean addBook(BookBean bookBean)
	{

		int bookid =bookBean.getBookid();
		String title =bookBean.getTitle();
		String author =bookBean.getAuthor();
		int price =bookBean.getPrice();

		Connection con = null;
		Statement statement = null;
		ResultSet resultSet = null;

		try
		{
			con = DBConnection.createConnection(); //establishing connection
			statement = con.createStatement(); //Statement is used to write queries. Read more about it.
			String sql="insert into book values("+bookid+",'"+title+"','"+author+"',"+price+")";
			//System.out.println(sql);
			int x=statement.executeUpdate(sql);
			if(x>0)
				return true;

		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return false;

	}
	public ResultSet viewBook(BookBean bookBean)
	{
		int bookid =bookBean.getBookid();
		Connection con = null;
		Statement statement = null;
		ResultSet resultSet = null;
		
		try
		{
			con = DBConnection.createConnection(); //establishing connection
			statement = con.createStatement(); //Statement is used to write queries. Read more about it.
			String sql="select * from book where bookid="+bookid;
        	//System.out.println(sql);
        	resultSet = statement.executeQuery(sql);
        	
        		


		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return resultSet;
	}
}