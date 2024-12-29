package com.demo.deliveryservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestControllerImpl {
	
	@GetMapping("/")
	public String test() {
		return "Delivery Service is Up & Running !!!";
	}
}
