
package javaconnection;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;


public class DBConnector {

	/**
	 * @param args
	 * @throws  
	 */
	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mariadb://localhost:3306/anvesh?user=root&password=password");
			 System.out.println("Connected database successfully...");
			 Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("select * from emp");
            System.out.println("empno  ename	job");
	         
	         while (rs.next()) {
	            int id = rs.getInt("empno");
	            String name = rs.getString("ename");
	            String job = rs.getString("job");
	            System.out.println(id+"   "+name+"    "+job);
	         }
	      



 		
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
