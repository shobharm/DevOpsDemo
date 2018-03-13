package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class DemoController {

	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String display() {
		return "Index";
	}
	
	
	@RequestMapping(value="/DevOpsDemo", method=RequestMethod.GET)
	public String displayHTML() {
		System.out.println("Inside HTML method");
		return "Index";
	}
	
}
