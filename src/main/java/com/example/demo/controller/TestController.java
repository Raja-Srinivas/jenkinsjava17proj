package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class TestController {

	@GetMapping("/display")
	public String displayMsg() {
		return "java 17";
	}
}
