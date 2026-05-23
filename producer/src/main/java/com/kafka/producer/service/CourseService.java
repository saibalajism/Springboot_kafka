package com.kafka.producer.service;

import org.springframework.http.ResponseEntity;

import com.kafka.producer.entity.CourseEntity;

public interface CourseService {
	
	ResponseEntity<Object> sendMessage(CourseEntity course);

}
