package com.kafka.producer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kafka.producer.entity.CourseEntity;
import com.kafka.producer.service.CourseService;


@RestController

@RequestMapping("/Kafka")
public class CourseController {
	
	@Autowired
	private CourseService service;
	
	@PostMapping("/sendmessage")
	public ResponseEntity<Object> addCourse(@RequestBody CourseEntity course){
		return service.sendMessage(course);
		
	}

}
