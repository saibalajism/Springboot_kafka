package com.kafka.consumer.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.kafka.consumer.entity.CourseEntity;

public interface CourseService {
	
	void consume(CourseEntity course); 
	String getMessage();

}
