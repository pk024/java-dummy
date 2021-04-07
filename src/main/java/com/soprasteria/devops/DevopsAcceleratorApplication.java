package com.soprasteria.devops;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
@SpringBootApplication
public class DevopsAcceleratorApplication {

	public static void main(String[] args) {
		SpringApplication.run(DevopsAcceleratorApplication.class, args);
	}

}
