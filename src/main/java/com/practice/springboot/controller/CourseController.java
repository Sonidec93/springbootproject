package com.practice.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.practice.springboot.entity.Course;
import com.practice.springboot.service.CourseService;
import com.practice.springboot.service.TopicService;

@RestController
public class CourseController {

	@Autowired
	private CourseService courseService;
	@Autowired
	private TopicService topicService;

	@PostMapping("/topics/{id}/course")
	public void addTopicToCourse(@RequestBody Course course,
			@PathVariable("id") int id) {
		course.setTopic(topicService.getTopic(id));
		courseService.addCourse(course);
	}

	@GetMapping("/topics/{id}/courses")
	public List<Course> getAllCoursesByTopic(@PathVariable("id") int id) {
		return courseService.getAllCoursesByTopic(id);
	}

	@GetMapping("/topics/{id}/course/{courseId}")
	public Course getSpecificCourse(@PathVariable("courseId") int id) {

		return courseService.getCourse(id);
	}

	@PutMapping("/topics/{id}/course/{courseId}")
	public void updateCourse(@RequestBody Course course, @PathVariable int id,
			@PathVariable int courseId) {
		course.setTopic(topicService.getTopic(id));
		courseService.addCourse(course);
	}

	@DeleteMapping("/topics/{id}/course/{courseId}")
	public void deleteCourse(@PathVariable("courseId") int courseId) {
		courseService.deleteCourse(courseId);	

	}
}
