package com.boa.resilience4jdemo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.boa.resilience4jdemo.services.CBService;

@RestController
public class CBController {
	@Autowired
	private CBService cbService;

	@GetMapping("/")
	public String getData() {
		return this.cbService.fetchData();
	}
}
