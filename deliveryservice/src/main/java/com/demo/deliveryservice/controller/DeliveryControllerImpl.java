package com.demo.deliveryservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/delivery")
public class DeliveryControllerImpl {
	
	@Value("${server.port}")
	private String port;
	
	@Autowired
	private OrderServiceConsumer orderServiceConsumer;
	
	@Autowired
	private PaymentServiceConsumer paymentServiceConsumer;
	
	@GetMapping("/status")
	public String deliveryStatus( ) {
		return "Delivery Completed Successfully !!! on Port: "+port;
	}
	
	@GetMapping("/orderstatus")
	public String getOrderStatus() {
		return orderServiceConsumer.getOrderStatus();
	}

	@GetMapping("/paymentstatus")
	public String getPaymentStatus() {
		return paymentServiceConsumer.getPaymentStatus();
	}
}
