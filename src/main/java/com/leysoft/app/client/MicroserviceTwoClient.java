package com.leysoft.app.client;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

//@FeignClient(name = "microservice-two")
@FeignClient(name = "api-gateway-server")
@RibbonClient(name = "microservice-two")
public interface MicroserviceTwoClient {
	
	public static final String SERVICE_NAME = "microservice-two";
	
	@GetMapping(value = {"/" + SERVICE_NAME + "/saludo"})
	public Object[] getAll();
	
	@GetMapping(value = {"/" + SERVICE_NAME + "/saludo/{id}"})
	public Object get(@PathVariable("id") Long id);
}