package com.javabrains.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {

	@Autowired
	private TopicRepository topicRepository;

	public List<Topic> getTopics() {
		System.out.println("CourseService.getTopics");
		List<Topic> topics = new ArrayList<>();
		topicRepository.findAll()
				.forEach(topics::add);
		return topics;
	}

	public Topic getTopic(String id) {
		System.out.println("CourseService.getTopic." + id);
		return topicRepository.findById(id).get();
	}

	public void addTopic(Topic t) {
		topicRepository.save(t);
	}

	public void updateTopic(Topic updatedtopic, String id) {
		topicRepository.save(updatedtopic);

	}

	public void delTopic(String id) {
		topicRepository.deleteById(id);
	}

}
