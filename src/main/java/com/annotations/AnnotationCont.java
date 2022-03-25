package com.annotations;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AnnotationCont {
	
	@RequestMapping(method = RequestMethod.GET, value = "/get")
	public String load() {
		System.out.println("cont");
		return "Controller";
	}
}
