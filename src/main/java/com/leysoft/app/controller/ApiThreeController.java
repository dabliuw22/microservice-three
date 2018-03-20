package com.leysoft.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.leysoft.app.client.MicroserviceTwoClient;

import io.swagger.annotations.Api;

@Api
@RestController
public class ApiThreeController {
	
	@Autowired
	private MicroserviceTwoClient client;
	
	
	@GetMapping(value = {"/"})
	public Object[] hello() {
		return client.getAll();
	}
	
	@GetMapping(value = {"/{id}"})
	public Object hello(@PathVariable("id") Long id) {
		return client.get(id);
	}
}