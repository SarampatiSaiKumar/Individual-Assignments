package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Mycontroller {
	
	@RequestMapping("/xyz")
	public String demo()
	{
		return "abcd";
	}

	@RequestMapping("/lunch")
	public String something()
	{
		return "demo";
	}
}
