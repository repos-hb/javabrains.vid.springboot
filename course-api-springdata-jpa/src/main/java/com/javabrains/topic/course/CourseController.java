package com.javabrains.topic.course;

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
public class CourseController {
	
	@Autowired
	private CourseService courseService; 

	@RequestMapping("/topics/{id}/courses")
	public List<Course> getAllCourses(@PathVariable String id){
		return courseService.getAllCourses(id);
				
	}
	
	@RequestMapping("/topics/{topicId}/courses/{id}")
	public Course getCourse(@PathVariable String topicId, @PathVariable String id) {
		return courseService.getCourse(id);
	}
		
	@RequestMapping(method=RequestMethod.POST, 
					value="/topics/{topicId}/courses")
	public void addCourse(@RequestBody Course c, @PathVariable String topicId) {
		c.setTopic(new Topic(topicId, "qqq", "zzz"));
		courseService.addCourse(c);
	}
	
	@RequestMapping(method=RequestMethod.PUT,
					 value="/topics/{topicId}/courses/{id}")
	public void updateCourse(@RequestBody Course c, @PathVariable String topicId) {
		c.setTopic(new Topic(topicId, "", ""));
		courseService.updateCourse(c);
	}
	
	@RequestMapping(method=RequestMethod.DELETE,
					value="/topics/{topicId}/courses/{id}")
	public void deleteCourse(@PathVariable String id) {
		courseService.delCourse(id);
	}
}
