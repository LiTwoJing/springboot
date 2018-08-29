package com.huwa.springboottest.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.huwa.springboottest.model.Teacher;
import com.huwa.springboottest.service.ServiceTest;

@Controller
public class ControllerTest {
	
	
	private ServiceTest serviceTest;
	
	
	@Autowired
	public ControllerTest(ServiceTest serviceTest) {
		this.serviceTest = serviceTest;
	}



	@GetMapping("/")
	@ResponseBody
	public Map<String,Object> test(){
		System.out.println("HI,SpringBoot");
		Map<String,Object> result =new HashMap();
		List<Teacher> teacher= serviceTest.findAll();
		result.put("teacher", teacher);
		return result;
	}
}
