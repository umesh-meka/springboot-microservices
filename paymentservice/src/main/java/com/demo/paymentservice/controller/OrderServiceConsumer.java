package com.demo.paymentservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class OrderServiceConsumer {
	
	@Autowired
	private DiscoveryClient discoveryClient;
	
	@Autowired
	private RestTemplate restTemplate;
	
	public String getOrderStatus() {
		List<ServiceInstance> list = discoveryClient.getInstances("ORDERSERVICE");
		ServiceInstance si = list.get(0);
		String url = si.getUri()+"/order/status";
		return restTemplate.getForObject(url, String.class);
	}

}
