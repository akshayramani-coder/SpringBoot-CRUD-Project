package com.springrest.springrest.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.springrest.springrest.entities.Course;

@Service
public interface CourseService {
	
	public List<Course> getCourses();

	public Course getcourse(long id);

	public Course addCourse(Course course);

	public Course deleteCourse(long id);

	public Course updateCourse(Course course);
}
