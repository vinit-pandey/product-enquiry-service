package com.microservice.productenquiryservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients("com.microservice.productenquiryservice")
public class ProductEnquiryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductEnquiryServiceApplication.class, args);
	}

}
