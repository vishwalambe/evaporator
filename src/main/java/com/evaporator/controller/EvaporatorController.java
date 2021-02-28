package com.evaporator.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EvaporatorController {

	@Value("${application.info}")
	private String appInfo;
	
	@Value("${configuration.info}")
	private String confInfo;
	
	@GetMapping(value = "/appInfo")
	public String getAppInfo() {
		return appInfo+" while demo from WINIT";
	}
	
	@GetMapping(value = "/confInfo")
	public String getConfigurationInfo() {
		return confInfo;
	}
	
}
