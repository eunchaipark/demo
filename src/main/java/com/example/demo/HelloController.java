package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
	@GetMapping("/")
	public @ResponseBody String index() {
		return "welcome home";
	}
	
	@GetMapping("/hello")
	public String hello(@RequestParam(required=false) String name, Model model) {
		model.addAttribute("greetings","hello~~네엥 안녕하세여"+name);
		return "hello";
	}
}
