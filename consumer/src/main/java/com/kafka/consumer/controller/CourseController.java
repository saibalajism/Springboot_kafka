package com.kafka.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kafka.consumer.entity.CourseEntity;
import com.kafka.consumer.service.CourseService;


@RestController

@RequestMapping("/Kafka")
public class CourseController {
	
	@Autowired
	private CourseService service;
	
	@GetMapping("/getmessage")
	public ResponseEntity<String> getCourse(){
		String data=service.getMessage();
		return new ResponseEntity<String>(data,HttpStatus.OK);
		
	}

}
