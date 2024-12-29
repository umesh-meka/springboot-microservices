package com.demo.orderservice.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.resilience4j.ratelimiter.RequestNotPermitted;
import io.github.resilience4j.ratelimiter.annotation.RateLimiter;

@RestController
@RequestMapping("/order")
public class OrderControllerImpl {
	
	@Value("${server.port}")
	private String port;
	
	@GetMapping("/status")
    @RateLimiter(name = "oderStatusRateLimit", fallbackMethod = "oderStatusFallBack")
	public String oderStatus( ) {
		return "Order Submitted Successfully !!! on Port: "+port;
	}
	
	public String oderStatusFallBack(RequestNotPermitted exception) {
		return "ORDER-SEERVICE is down. Please try again later !!!";
	}

}
