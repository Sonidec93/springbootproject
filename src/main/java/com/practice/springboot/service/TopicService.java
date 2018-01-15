package com.practice.springboot.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practice.springboot.entity.Topic;
import com.practice.springboot.repository.TopicRepository;

@Service
public class TopicService {

	@Autowired
	private TopicRepository repository;

	public List<Topic> getTopics() {

		List<Topic> list = new ArrayList<Topic>();
		repository.findAll().forEach(list::add);
		return list;
	}

	public Topic getTopic(int id) {
		return repository.findOne(Integer.valueOf(id));

	}

	public void addTopic(Topic topic) {
		repository.save(topic);
	}

	public void updateTopic(Topic topic, int id) {
		// TODO Auto-generated method stub
		// for (int i = 0; i < topics.size(); i++) {
		// if (topics.get(i).getId() == id) {
		// topics.set(i, topic);
		// }
		// }

		repository.save(topic);

	}

	public void deleteTopic(int id) {
		repository.delete(Integer.valueOf(id));
	}
}
