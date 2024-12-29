package com.demo.deliveryservice.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="PAYMENT-SERVICE")
public interface PaymentServiceConsumer {
	
	@GetMapping("/payment/status")
	public String getPaymentStatus();
}
