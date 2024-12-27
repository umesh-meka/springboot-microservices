package com.demo.serviceregistry.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestControllerImpl {
	
	@GetMapping("/home")
	public String test() {
		return "Service Registry is Up & Running !!!";
	}
}
