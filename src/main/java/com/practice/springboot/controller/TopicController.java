package com.practice.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.practice.springboot.entity.Topic;
import com.practice.springboot.service.TopicService;

@RestController
public class TopicController {

	@Autowired
	private TopicService topicService;

	@RequestMapping("/")
	public String welcomeText() {
		return "hi";
	}

	@RequestMapping("/topics")
	public List<Topic> getTopics() {
		return topicService.getTopics();
	}

	@RequestMapping("/topics/{id}")
	public Topic getTopic(@PathVariable("id") int id) {

		return topicService.getTopic(id);
	}

	@PostMapping("/topics")
	public void insertTopic(@RequestBody Topic topic) {
		topicService.addTopic(topic);
	}

	@PutMapping("/topics/{id}")
	public void updateTopic(@RequestBody Topic topic, @PathVariable int id) {
		topicService.updateTopic(topic, id);
	}

	@DeleteMapping("/topics/{id}")
	public void deleteTopic(@PathVariable int id) {
		topicService.deleteTopic(id);
	}
}
