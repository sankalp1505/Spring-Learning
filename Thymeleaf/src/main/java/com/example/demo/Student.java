package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/student")
public class Student {

	
	@GetMapping("/details/{name}")
	String showDetail(@PathVariable String name,Model m) {
		m.addAttribute("message",name);
	
		return "details";
	}
	
	
}
