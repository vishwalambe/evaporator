package com.evaporator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController("/evaporator")
public class EvaporatorDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(EvaporatorDemoApplication.class, args);
	}
	
	@GetMapping
	public String getInfo() {
		return "Evaporator demo app";
	}
	
}
