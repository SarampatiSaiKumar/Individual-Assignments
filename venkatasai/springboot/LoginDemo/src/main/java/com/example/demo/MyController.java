package com.example.demo;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {

	// methosd 2HttpSession httpSession;
	@RequestMapping("/")
	public String login() {
		return "login.jsp";
	}
	@RequestMapping("/greet")
	/*method1
	 * public String greet(HttpServletRequest httpServletRequest) {
		String user= httpServletRequest.getParameter("uname");
		String pass= httpServletRequest.getParameter("upass");
		System.out.println("user:"+ user+"  pass:"+pass);
		
		HttpSession httpSession=httpServletRequest.getSession();

		httpSession.setAttribute("username", user);
		return "welcome.jsp";
	}
*/
	/*method2
	 * public String greet(User user) {
		
		httpSession.setAttribute("username", user);
		return "welcome.jsp";
	}
*/
	public ModelAndView greet(User user) {
		String msg="thinnava Raa?";
		String username=user.getUname();
		String password= user.getUpass();
		ModelAndView modelAndView= new ModelAndView();
		if(username.equals(password)) {
		modelAndView.addObject("obj",user);
		modelAndView.addObject("mg",msg);
		modelAndView.setViewName("welcome.jsp");
		}
		else {
			modelAndView.setViewName("invalid.jsp");
			}
		return modelAndView;
	}

	}
