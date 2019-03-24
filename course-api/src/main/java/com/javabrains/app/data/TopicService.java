package com.javabrains.app.data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {

	private List<Topic> topics = new ArrayList<>(Arrays.asList(

			new Topic("spring", "Spring Framework", "Spring Framework Desc"), new Topic("java", "J2EE", "J2EE Desc"),
			new Topic("maven", "Maven Repo", "Maven Repo Desc")

	));

	public List<Topic> getTopics() {
		System.out.println("TopicService.getTopics");
		return topics;
	}

	public Topic getTopic(String id) {
		System.out.println("TopicService.getTopic." + id);
		for (Topic t : topics) {
			if (t.getId().equalsIgnoreCase(id)) {
				System.out.println("found");
				return t;
			}
		}
		return null;
	}

	public void addTopic(Topic t) {
		topics.add(t);
		System.out.println(topics);
	}

	public void updateTopic(Topic updatedtopic, String id) {
		for (int i = 0; i < topics.size(); i++) {
			if (topics.get(i).getId().equals(id)) {
				topics.set(i, updatedtopic);
				break;
			}

		}

	}

	public void delTopic(String id) {
		for (int i = 0; i < topics.size(); i++) {
			if (topics.get(i).getId().equals(id)) {
				topics.remove(i);
				break;
			}
		}

	}

}
