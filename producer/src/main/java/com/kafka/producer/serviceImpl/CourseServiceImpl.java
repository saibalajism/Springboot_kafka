package com.kafka.producer.serviceImpl;

import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.kafka.producer.entity.CourseEntity;
import com.kafka.producer.service.CourseService;

import tools.jackson.databind.ObjectMapper;
import tools.jackson.databind.node.ObjectNode;


@Service
public class CourseServiceImpl implements CourseService {
	
	@Autowired
	private KafkaTemplate<String, CourseEntity> kafkatemplate;

	@Autowired
	private ObjectMapper mapper;
	
	@Override
	public ResponseEntity<Object> sendMessage(CourseEntity course) {
		kafkatemplate.send("Course", "course", course);
		ObjectNode response = mapper.createObjectNode();
		response.put("message:", "Course is sent to kafka server");
		return new ResponseEntity<>(response, HttpStatus.OK);
	}
	

}
