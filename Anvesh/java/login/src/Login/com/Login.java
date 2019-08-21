package Login.com;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
import java.sql.*; 
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
* Servlet implementation class Greeting
*/
@WebServlet(description = "Helloworldprog", urlPatterns = { "/Login" })
public class Login extends HttpServlet {
private static final long serialVersionUID = 1L;
      
   /**
    * @see HttpServlet#HttpServlet()
    */
   public Login() {
       super();
       // TODO Auto-generated constructor stub
   }

/**
* @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
*/
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
// TODO Auto-generated method stub
// response.getWriter().append("Served at: ").append(request.getContextPath());
//	int n1=Integer.parseInt(request.getParameter("first"));
//	int n2=Integer.parseInt(request.getParameter("second"));
//	String op=request.getParameter("operator");
//	PrintWriter out = response.getWriter();
//	out.println(op);
//	   int x=0;
//	switch(op) {
//	case "+": x=n1+n2;break;
//	case "-": x=n1-n2;break;
//	case "*": x=n1*n2;break;
//	case "/": x=n1/n2;break;
//	case "%": x=n1%n2;break;
//	default: break;
//	}
//	out.println("result : "+ x);
String uname=request.getParameter("uname");
int uid=Integer.parseInt(request.getParameter("uid"));
String JDBC_DRIVER = "org.mariadb.jdbc.Driver";
String DB_URL2 = "jdbc:mariadb://localhost:3306/anvesh";
String USER = "root";
String PASS = "password";
Connection conn = null;
    Statement stmt = null;
try { 
Class.forName(JDBC_DRIVER);
System.out.println("Connecting to a selected database...");
          conn = DriverManager.getConnection(DB_URL2, USER, PASS);
           System.out.println("Connected database successfully...");
           System.out.println("selecting data from table in given database...");
           stmt = conn.createStatement();
 String sql="select * from emp where ename='"+uname+"' and empno ="+uid;
           System.out.println(sql);
           PrintWriter out = response.getWriter();
       //    String sqlcreate = "insert into emp(empno,ename,deptno) values(3,'saikumar',20)";
           // insertion record,update, delete access executeupdate option
//	           int x = stmt.executeUpdate(sqlcreate);
//	          if(x>0)
//	       	  System.out.println("inserted successfully");
//	          else
//	       	  System.out.println("not inserted");
        // selecting the records from table
            ResultSet rs = stmt.executeQuery(sql);
           int c=0;
           while (rs.next()) 
           {
           	c++;
             out.println(rs.getString(1));
             out.println(rs.getString(2));
             out.println(rs.getString(3));
             out.println(rs.getString(4));
           } 
           if(c==0)
           	out.println("no data in the table");
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

