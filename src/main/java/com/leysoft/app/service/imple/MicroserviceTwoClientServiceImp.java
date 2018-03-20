package com.leysoft.app.service.imple;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.leysoft.app.service.inter.MicroserviceTwoClientService;

@Service
public class MicroserviceTwoClientServiceImp implements MicroserviceTwoClientService {
	
	private static final String URL_GET_ALL = "http://localhost:8000/saludo";
	
	private static final String URL_GET = "http://localhost:8000/saludo/{id}";
	
	@Autowired
	private RestTemplate restTemplate;
	
	@Override
	public Object[] getAll() {
		ResponseEntity<Object[]> response = restTemplate.getForEntity(URL_GET_ALL, Object[].class);
		if(response.getStatusCode().equals(HttpStatus.OK)) {
			return response.getBody();
		}
		return new Object[] {};
	}

	@Override
	public Object get(Long id) {
		Map<String, Object> uriVariables = new HashMap<>();
		uriVariables.put("id", id);
		ResponseEntity<Object> response = restTemplate.getForEntity(URL_GET, Object.class, uriVariables);
		if(response.getStatusCode().equals(HttpStatus.OK)) {
			return response.getBody();
		}
		return new Object();
	}
}