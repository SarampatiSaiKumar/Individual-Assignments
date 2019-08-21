package com.book.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.book.model.DBConnection;
import com.book.model.BookBean;

public class BookDB {
	public static int save(BookBean bean){
		int status=0;
		try{
			Connection con=DBConnection.CreateConnection();
			PreparedStatement st=con.prepareStatement("insert into book values(?,?,?,?)");
			System.out.println(bean.getAuthor());
			st.setInt(1, bean.getIsbn());
			st.setString(2,bean.getTitle() );
			st.setString(3, bean.getAuthor());
			st.setInt(4 ,bean.getPrice());
			
			status=st.executeUpdate();
			

			
		
			con.close();
			
		}catch(Exception e){System.out.println(e);}
		
		return status;
	}

	public static List<BookBean> view() {
		List<BookBean> list=new ArrayList<BookBean>();

		try{
			Connection con=DBConnection.CreateConnection();
			PreparedStatement ps=con.prepareStatement("select * from book");
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				BookBean bean=new BookBean();
				bean.setIsbn(rs.getInt(1));
				bean.setTitle(rs.getString(2));
				bean.setAuthor(rs.getString(3));
				bean.setPrice(rs.getInt(4));
				
				list.add(bean);
			}
			con.close();
			
		}catch(Exception e){System.out.println(e);}
		
		return list;
	
		
	}

	public static int update(BookBean bean) {
		int status=0;
		
		try{
			Connection con=DBConnection.CreateConnection();
			PreparedStatement st=con.prepareStatement("update book set price='"+bean.getPrice()+"' where isbn='"+bean.getIsbn()+"'");
			
			
			status=st.executeUpdate();
			

			
		
			con.close();
			
		}catch(Exception e){System.out.println(e);}
		
		return status;
	}

	public static int delete(BookBean bean) {
		
		// TODO Auto-generated method stub
	int status=0;
		
		try{
			Connection con=DBConnection.CreateConnection();
			System.out.println(bean.getIsbn());

			PreparedStatement st=con.prepareStatement("delete from book where isbn='"+bean.getIsbn()+"'");
			
			status=st.executeUpdate();
			

			
		
			con.close();
			
		}catch(Exception e){System.out.println(e);}
		
		return status;
}

	public static int viewBook(BookBean bean) {
		
		// TODO Auto-generated method stub
		int status=0;
		try{
			Connection con=DBConnection.CreateConnection();
			PreparedStatement ps=con.prepareStatement("select * from book where isbn='"+bean.getIsbn()+"'");
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				
				bean.setIsbn(rs.getInt(1));
				bean.setTitle(rs.getString(2));
				bean.setAuthor(rs.getString(3));
				bean.setPrice(rs.getInt(4));
				status=1;
				
				
			}
			con.close();
			
		}catch(Exception e){System.out.println(e);}
		
		return status;
	}
}
