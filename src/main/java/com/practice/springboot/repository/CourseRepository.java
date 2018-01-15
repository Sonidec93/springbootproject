package com.practice.springboot.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.practice.springboot.entity.Course;

public interface CourseRepository extends CrudRepository<Course, Integer> {

	public List<Course> findByTopicId(Integer topicId);

}
