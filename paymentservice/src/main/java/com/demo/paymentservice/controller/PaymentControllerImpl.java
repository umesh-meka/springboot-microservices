package com.demo.paymentservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payment")
public class PaymentControllerImpl {
	
	@Autowired
	private OrderServiceConsumer orderServiceConsumer;
	
	@GetMapping("/status")
	public String paymentStatus( ) {
		return "Payment Completed Successfully !!!";
	}
	
	@GetMapping("/orderstatus")
	public String getOrderStatus( ) {
		return orderServiceConsumer.getOrderStatus();
	}

}
