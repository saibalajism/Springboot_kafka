package com.kafka.consumer.entity;


import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CourseEntity {
	private String courseId;
	private String title;
	private String courseName;
	private double price;

}
