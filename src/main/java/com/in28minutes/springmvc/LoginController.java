package com.in28minutes.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

	@RequestMapping(value = "/login",method = RequestMethod.GET)
	public String Greet() {
		return "login";
	}
	
	//now we need a method to handle post requests i mean when a form is submitted
	
	@RequestMapping(value = "/login",method = RequestMethod.POST)
	public String getDetails(@RequestParam String name,ModelMap model) {
		model.put("name", name);
		return "welcome";
	}
	
	
}
