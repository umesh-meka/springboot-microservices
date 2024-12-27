package com.demo.orderservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestControllerImpl {
	
	@GetMapping("/")
	public String test() {
		return "Order Service is Up & Running !!!";
	}
}
