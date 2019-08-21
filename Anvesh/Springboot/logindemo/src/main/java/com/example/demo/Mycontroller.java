package com.example.demo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class Mycontroller {

	@RequestMapping("/")
	public String login()
	{
		return "Login.jsp";
	}
	@RequestMapping("/greet")
	public ModelAndView greet(User user)
	{
	/*	String user=request.getParameter("uname");
		String pwd=request.getParameter("upass");
		System.out.println("username:"+user);
		System.out.println("password:" +pwd);
		HttpSession session=request.getSession();
		session.setAttribute("username", user);
		return "welcome.jsp";
		*/
		String msg="this is demo";
		String username=user.getUname();
		String password=user.getUpass();
		ModelAndView mv=new ModelAndView();
		if(username.equals(password)) {
		
		
		mv.addObject("obj",user);
		mv.addObject("mesg",msg);
		mv.setViewName("welcome.jsp");
		
	
	}
		else {
			mv.setViewName("invalid.jsp");
			
		}
		return mv;
}
}
