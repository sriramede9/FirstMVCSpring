package com.in28minutes.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//step 1 annottate as controller who is child of component

@Controller
public class HelloWorldController {

	// step 2 a method and request mapping

	@RequestMapping("/showForm")
	public String requeformController() {
		return "Hello-world";
	}

	@RequestMapping("/processorForm")
	public String ProcessorForm() {
		return "Hellow-world-form";
	}
}
