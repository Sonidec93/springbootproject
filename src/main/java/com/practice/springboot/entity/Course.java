package com.practice.springboot.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table
public class Course {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer courseId;

	public void setCourseId(Integer courseId) {
		this.courseId = courseId;
	}

	private String courseName;
	private String courseDescription;
	@ManyToOne
	private Topic topic;

	public Integer getCourseId() {
		return courseId;
	}

	public Topic getTopic() {
		return topic;
	}

	public void setTopic(Topic topic) {
		this.topic = topic;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getCourseDescription() {
		return courseDescription;
	}

	public void setCourseDescription(String courseDescription) {
		this.courseDescription = courseDescription;
	}
}
