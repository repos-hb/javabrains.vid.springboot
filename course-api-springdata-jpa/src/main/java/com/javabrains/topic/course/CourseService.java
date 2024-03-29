package com.javabrains.topic.course;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {

	@Autowired
	private CourseRepository courseRepository;

	public List<Course> getAllCourses(String id) {
		List<Course> courses = new ArrayList<>();
		courseRepository.findByTopicId(id)
				.forEach(courses::add);
		
		return courses;
	}

	public Course getCourse(String id) {
		return courseRepository.findById(id).get();
	}

	public void addCourse(Course t) {
		courseRepository.save(t);
	}

	public void updateCourse(Course updatedCourse) {
		courseRepository.save(updatedCourse);

	}

	public void delCourse(String id) {
		courseRepository.deleteById(id);
	}

}
