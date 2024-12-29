package com.demo.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class GatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(GatewayApplication.class, args);
	}

	@Bean
	public RouteLocator configureRoute(RouteLocatorBuilder builder) {
		return builder.routes()
				.route("deliveryId", r -> r.path("/delivery/**").uri("http://localhost:8088")) // static routing
				.route("paymentId", r -> r.path("/payment/**").uri("http://localhost:8087")) // static routing
				.route("orderId", r -> r.path("/order/**").uri("lb://ORDER-SERVICE")) // dynamic routing
				.build();
	}

}
