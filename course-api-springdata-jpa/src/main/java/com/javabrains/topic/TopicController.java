package com.javabrains.topic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.javabrains.topic.Topic;
import com.javabrains.topic.TopicService;

@RestController
public class TopicController {
	
	@Autowired
	private TopicService topicService; 

	@RequestMapping("/topics")
	public List<Topic> getAllTopics(){
		System.out.println("CourseController.getAllTopics");
		return topicService.getTopics();
				
	}
	
//	@RequestMapping(produces=MediaType.APPLICATION_JSON_VALUE,
//					value="/topics/{id}")
	@RequestMapping("/topics/{id}")
	public Topic getTopic(@PathVariable String id) {
		System.out.println("CourseController.getTopic."+id);
		return topicService.getTopic(id);
	}
		
	@RequestMapping(method=RequestMethod.POST, 
					value="/topics")
	public void addTopic(@RequestBody Topic t) {
		System.out.println("CourseController.addTopic");
		topicService.addTopic(t);
	}
	
	@RequestMapping(method=RequestMethod.PUT,
					 value="/topics/{id}")
	public void updateTopic(@RequestBody Topic t, @PathVariable String id) {
		topicService.updateTopic(t, id);
	}
	
	@RequestMapping(method=RequestMethod.DELETE,
					value="/topics/{id}")
	public void deleteTopic(@PathVariable String id) {
		topicService.delTopic(id);
	}
}
