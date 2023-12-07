package com.springrest.springrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.springrest.entities.Course;
import com.springrest.springrest.services.CourseService;

@RestController
public class MyController {

	@Autowired
	private CourseService courseService;

	@GetMapping("/home")
	public String home() {
		return "My Name Is Akshay";
	}

	// Get the Courses
	@GetMapping("/courses")
	public List<Course> getCourse() {
		return courseService.getCourses();
	}

//	get course for particular id
	@GetMapping("/course/{id}")
	public Course getCourse(@PathVariable("id") String id){
		return courseService.getcourse(Long.parseLong(id));
	}
	
	@PostMapping("/courses")
	public Course addCourse(@RequestBody Course Course) {
		return courseService.addCourse(Course);
	}
	
	@PutMapping("/courses")
	public Course updateCourse(@RequestBody Course Course) {
		
		return courseService.updateCourse(Course);
	}
	
	@DeleteMapping("/courses/{id}")
	public Course deleteCourse(@PathVariable("id") String id) {
		
		return courseService.deleteCourse(Long.parseLong(id));
	}
	
	
}
