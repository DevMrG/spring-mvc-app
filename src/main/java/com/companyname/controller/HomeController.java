package com.companyname.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

	 @GetMapping("/hello")
	    public String greet(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
	        model.addAttribute("name", name);
	        return "home";
	    }
	 
	 @GetMapping("/")
	    public String home(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
		  return "home";
	 }
	
}
