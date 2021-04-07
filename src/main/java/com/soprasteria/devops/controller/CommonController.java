package com.soprasteria.devops.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.soprasteria.devops.model.BaseObj;

@RestController
public class CommonController {
	
	@GetMapping(value="/hello-world")
	public BaseObj helloWorld() {
		
		return new BaseObj("2034", "DEVOPS Accelerator", "Sopra Steria");
	}

}
