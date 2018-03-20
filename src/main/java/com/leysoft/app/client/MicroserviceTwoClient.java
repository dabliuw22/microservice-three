package com.leysoft.app.client;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RibbonClient(name = "microservice-two")
@FeignClient(name = "microservice-two")
public interface MicroserviceTwoClient {
	
	@GetMapping(value = {"/saludo"})
	public Object[] getAll();
	
	@GetMapping(value = {"/saludo/{id}"})
	public Object get(@PathVariable("id") Long id);
}