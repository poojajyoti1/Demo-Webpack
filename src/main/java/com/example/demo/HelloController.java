package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

	@RequestMapping("/hello.htm")
	public void helloWorld(){
		return "hello";
	}
	
	@RequestMapping("/user")
	@ResponseBody
	public void getUser() {
		return "Pooja";
	}
}
