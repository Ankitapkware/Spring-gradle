package com.annotations.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/response")
public class ControllerPrac {
	
	@Autowired
	PostMappingService service;
	
	@GetMapping("/allData")
	public List<Data> allData(){
		return service.allData();
	}

    @PostMapping("/postbody")
    public String postBody(@RequestBody Data data) {
    	return service.addData(data);
    }
}