package com.kafka.consumer.serviceImpl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.kafka.consumer.entity.CourseEntity;
import com.kafka.consumer.service.CourseService;

import ch.qos.logback.classic.Logger;
import tools.jackson.databind.JsonNode;
import tools.jackson.databind.ObjectMapper;
import tools.jackson.databind.node.ObjectNode;


@Service
public class CourseServiceImpl implements CourseService {
	
	private String courseList;
	
	@Autowired
	private ObjectMapper mapper;
	
	@KafkaListener(topics="Course", groupId="Kafka_listner")
	
	public void consume(CourseEntity course) {
		courseList=course + "Got list from kafka server";
		System.out.println(courseList);
	}
	
	/*@Override
	public ResponseEntity<Object> getMessage() {
		ObjectNode response = mapper.createObjectNode();
		response.put("message:", "Got list from kafka server");
		JsonNode listOfCourse = mapper.valueToTree(courseList);
		response.set("courselist", listOfCourse);
		return new ResponseEntity<>(response, HttpStatus.OK);
	}*/	
	
	@Override
	public String getMessage() {
		return courseList;
	}	

}
