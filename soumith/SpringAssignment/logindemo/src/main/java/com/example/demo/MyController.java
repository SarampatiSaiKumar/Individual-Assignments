package com.example.demo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {

	@RequestMapping("/")
	public String login()
	{
		return "login.jsp";
	}
	@RequestMapping("/Login")
	public ModelAndView Welcome(User user)
	{
		
		String uname= user.getUname();
		String password = user.getPwd();
		ModelAndView mv =new ModelAndView();
		
		if(uname.equals(password)) {
		mv.addObject("obj",user);
		mv.addObject("msg","you are logged in");
		mv.setViewName("Welcom.jsp");
		}
		else
		{
			mv.setViewName("invalid.jsp");
		}
		return mv;
	}
}
