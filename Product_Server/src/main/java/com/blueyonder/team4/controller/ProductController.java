package com.blueyonder.team4.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import org.springframework.cloud.client.*;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;

import com.blueyonder.team4.model.Product;
import org.springframework.core.*;


@RestController
@RequestMapping("/product")
public class ProductController {
	@Autowired
	private RestTemplate restTemplate;
	
	
	
	@GetMapping("/all")
	public List<Product> getAllProducts(){
//		List<ServiceInstance> instances=discoveryClient.getInstances("view-product");
		String url="http://localhost:8080"+"/product/get";
		ResponseEntity<List<Product>> response=restTemplate.exchange(url, HttpMethod.GET,null,new 
				ParameterizedTypeReference<List<Product>>() {});
		return response.getBody();
				
		
		
	}
	
	
	
}
