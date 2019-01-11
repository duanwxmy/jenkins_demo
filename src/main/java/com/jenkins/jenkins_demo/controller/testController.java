package com.jenkins.jenkins_demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testController {
	
	@GetMapping("/test")
	public String list() {
		return "holle jenkins 4";
	}
}
