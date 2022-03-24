package com.annotations;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Annotation1 {

	@GetMapping("/")
	public String sayHello() {
	return "Hello";
	}
	
}


