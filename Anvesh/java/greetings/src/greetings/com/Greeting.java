package greetings.com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * Servlet implementation class Addition
 */
@WebServlet("/Addition")
public class Greeting extends HttpServlet {
private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Greeting() {
        // TODO Auto-generated constructor stub
    }

/**
* @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
*/
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
// TODO Auto-generated method stub

PrintWriter pr=response.getWriter();
response.setContentType("text/html");
int x=Integer.parseInt(request.getParameter("t1"));
int y=Integer.parseInt(request.getParameter("t2"));
pr.println("The addition of numbers is "+ (x+y));

} 


/**
* @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
*/

}

