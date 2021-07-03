package com.microservice.productenquiryservice.proxyclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.microservice.productenquiryservice.bean.ProductEnquiryBean;

//@FeignClient(name="product-stock-service",url="localhost:8800")
@FeignClient(name="product-stock-service")
public interface ProductStockClient {
	
	@GetMapping("/check-product-stock/productName/{productName}/productAvailability/{productAvailability}")
	public ProductEnquiryBean checkProductStock(@PathVariable String productName,
	                                          @PathVariable String productAvailability);

}
