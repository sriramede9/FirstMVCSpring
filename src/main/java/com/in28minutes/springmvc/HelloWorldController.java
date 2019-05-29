package com.in28minutes.springmvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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

	@RequestMapping("/processorForm2")
	public String withModel(HttpServletRequest request, Model model) {

		// get form element here name

		String nameString = request.getParameter("name").toUpperCase();

		model.addAttribute("message", nameString);

		return "modelhelloworld";
	}

	@RequestMapping("/processorForm3")
	public String usingRequestParam(@RequestParam("name") String name, Model model) {

		model.addAttribute("message", name.toUpperCase());

		return "modelhelloworld";
	}

	@RequestMapping("/formtag")
	public String formTags(Model model) {

		model.addAttribute("student", new Student());

		return "formtag";
	}

	// method to get the submitted form action

	@RequestMapping("/formResponse")
	public String formResponse(@ModelAttribute("student") Student stobj) {

		// we are getting student obj which is used to set and get fname and lname which
		// is send by model.addAttribute

		return "Response-form";
	}

}
