package com.kafka.consumer.service;

import org.springframework.http.ResponseEntity;

import com.kafka.consumer.entity.CourseEntity;

public interface CourseService {
	
	ResponseEntity<Object> sendMessage(CourseEntity course);

}
