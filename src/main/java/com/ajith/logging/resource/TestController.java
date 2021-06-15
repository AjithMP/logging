package com.ajith.logging.resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class TestController {
	
 Logger LOGGER = LoggerFactory.getLogger(TestController.class);
@GetMapping("/home")
public String helloMethod() {
	
	LOGGER.error("The method helloMethod() throwing error"); /*The log method error has very less information to understand to 
	                                                            issue so we need to use trace*/
	
	LOGGER.trace("Hi bye");/*The method trace will provide more information compare to error and by 
	                     default trace method logs are not available in console so need to configure in property file*/
	return " Welcome to spring log app";
}
}
