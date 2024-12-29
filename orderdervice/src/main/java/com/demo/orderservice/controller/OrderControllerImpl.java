package com.demo.orderservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderControllerImpl {
	
	@GetMapping("/status")
	public String oderStatus( ) {
		return "Order Submitted Successfully !!!";
	}

}
