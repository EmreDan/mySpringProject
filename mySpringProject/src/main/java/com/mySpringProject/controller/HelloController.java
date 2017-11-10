package com.mySpringProject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

	@RequestMapping("hi")
	@ResponseBody
	public String hello() {
		return "Hello Spring World";
	}

	@RequestMapping("/")
	@ResponseBody
	public String start() {
		return "Start Spring World";
	}

	@RequestMapping("/bye")
	@ResponseBody
	public String bye() {
		return "Bye Spring World";
	}
	
}
