

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Invoking
 */
import java.io.*; 
import javax.servlet.*; 
import javax.servlet.http.*; 
  
// Extend HttpServlet class 
public class Invoking extends HttpServlet  
{  
   private String output; 
    public Invoking(){
    	
    }
   // Initializing servelet 
   public void init() throws ServletException  
   { 
      output = "Advance Java Concepts"; 
   } 
  
   // Requesting and printing the output 
   public void doGet(HttpServletRequest req,  
                    HttpServletResponse resp) 
      throws ServletException, IOException  
      { 
         resp.setContentType("text/html"); 
         PrintWriter out = resp.getWriter(); 
         out.println(output); 
      } 
  
      public void destroy()  
      { 
         System.out.println("Over"); 
      } 
} 