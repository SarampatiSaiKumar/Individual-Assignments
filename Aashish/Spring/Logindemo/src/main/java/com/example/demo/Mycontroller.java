package com.example.demo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Mycontroller {

	
	
	@RequestMapping("/")
	public String login()
	{
		return "login1.jsp";
	}
	
/*	@RequestMapping("/greet")
	public String greet(HttpServletRequest req)
	{
		String user = req.getParameter("uname");
		String pwd = req.getParameter("upass");
		System.out.println("username: " +user);
		System.out.println("password: " +pwd);
		
		HttpSession session = req.getSession();
		session.setAttribute("username",user);
		return "welcome.jsp";
	}
	
*/
	 @RequestMapping("/greet")
	public ModelAndView greet(User user)
	{
		 ModelAndView mv = new ModelAndView();
		 
		 String username= user.getUname();
		 String password = user.getUpass();
		 
		 if(username.equals(password))
		 {
			 mv.addObject("Abj",user);
			 mv.addObject("msg", "aaa");
			 mv.setViewName("Welcome.jsp");
		 }
		 else
		 {
			 mv.setViewName("invalid.jsp");
		 }
		 
		 return mv;
		 
/*		 
		 ModelAndView mv = new ModelAndView();
		 mv.addObject("Abj" , user);         //Abj is the alias name.
		 mv.addObject("msg", user);
		 mv.setViewName("Welcome.jsp");
		 return mv;
*/		 
	}
	 
}
