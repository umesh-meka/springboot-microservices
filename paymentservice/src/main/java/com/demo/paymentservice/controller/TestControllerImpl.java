package com.demo.paymentservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestControllerImpl {
	
	@GetMapping("/")
	public String test() {
		return "Payment Service is Up & Running !!!";
	}
}
