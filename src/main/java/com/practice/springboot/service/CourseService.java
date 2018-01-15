package com.practice.springboot.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practice.springboot.entity.Course;
import com.practice.springboot.repository.CourseRepository;

@Service
public class CourseService {

	@Autowired
	private CourseRepository repository;

	public List<Course> getAllCourses() {
		List<Course> courses = new ArrayList<Course>();
		repository.findAll().forEach(courses::add);
		return courses;
	}

	public List<Course> getAllCoursesByTopic(int id) {
		return repository.findByTopicId(id);
	}

	public Course getCourse(int id) {
		return repository.findOne(Integer.valueOf(id));

	}

	public void addCourse(Course course) {
		repository.save(course);
	}

	public void updateCourse(Course course, int id) {
		repository.save(course);

	}

	public void deleteCourse(int id) {
		repository.delete(Integer.valueOf(id));
	}
}
