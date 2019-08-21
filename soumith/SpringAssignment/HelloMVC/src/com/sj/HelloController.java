/**
 * 
 */
package com.sj;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author sangeeta
 *
 */
@Controller
@RequestMapping(value="/hi")
public class HelloController {
	
	 @RequestMapping(value="/hello" ,method = RequestMethod.GET)
	  public String hi(@RequestParam("name") String name, Model model) {
	    String message = "Hi " + name + "!";
	    model.addAttribute("message", message);
	    return "success";
	  }
	
	
	
	
	
	

}
