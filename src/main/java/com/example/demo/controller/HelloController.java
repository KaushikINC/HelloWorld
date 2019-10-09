package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
	

	@RequestMapping("/sayHello")
	@ResponseBody
	public String handler() {
		return "Hello World!!! This is my first Hello World in Springboot";
	}
	
	@RequestMapping("/")
	public String handlerHtml() {
		return "myapp.html";
	}

}
