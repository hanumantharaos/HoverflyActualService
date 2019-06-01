package com.example.hoverfly.controller;

import java.util.Date;
import java.util.UUID;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController {
	
	@RequestMapping("/service/hoverfly")
	public HoverflyServiceResponse getSampleResponse() {
		
		System.out.println("Inside Sample Service Response");
		
		return new HoverflyServiceResponse("returned value from HoverflyServiceResponse"
				,new Date().toString(),UUID.randomUUID().toString());
	}

}
