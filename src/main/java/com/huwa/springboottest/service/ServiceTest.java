package com.huwa.springboottest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.huwa.springboottest.mapper.MapperTest;
import com.huwa.springboottest.model.Teacher;

@Service
public class ServiceTest {
	
	
	private MapperTest mapperTest;
	
	@Autowired
	public ServiceTest(MapperTest mapperTest) {
		this.mapperTest = mapperTest;
	}


	public List<Teacher>findAll() {
		
		List<Teacher> teacher = mapperTest.findAll();
		
		return teacher;
	}
	
}
