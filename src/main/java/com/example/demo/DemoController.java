package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String display() {
		return "Succcessssss :P:P:P";
	}
	
	
}
