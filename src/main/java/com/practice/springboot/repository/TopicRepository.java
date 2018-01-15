package com.practice.springboot.repository;

import org.springframework.data.repository.CrudRepository;

import com.practice.springboot.entity.Topic;

public interface TopicRepository extends CrudRepository<Topic, Integer> {

}
