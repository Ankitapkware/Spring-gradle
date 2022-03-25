package com.annotations.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class PostMappingService {
	
	private static List<Data> loadData(){
		List<Data> user = new ArrayList<Data>();
		user.add(new Data("Ankita", 21, "Chandigarh"));
		return user;
		
	}
	
	private List<Data> userData = loadData();
	
	List<Data> allData(){
		return userData;
	}

	public String addData(Data data) {
		userData.add(data);
		return "Users data added";
	}

}
