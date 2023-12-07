package com.springrest.springrest.services;


import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springrest.springrest.entities.Course;

@Service
public class CourseServiceImpl implements CourseService {

	List<Course> list;

	public CourseServiceImpl() {
		// TODO Auto-generated constructor stub

		list = new ArrayList<>();
		list.add(new Course(14, "java", "This is the best couse"));
		list.add(new Course(19, "C++", "This is the best couse"));
	}

	@Override
	public List<Course> getCourses() {
		// TODO Auto-generated method stub
		return list;
		
	}

	@Override
	public Course getcourse(long Id) {
		// TODO Auto-generated method stub
		Course c = null;
		for (Course course : list) {
			if(course.getId() == Id) {		
				c = course;
				break;
			}	
		}
		return c;
	}

	@Override
	public Course addCourse(Course course) {
		// TODO Auto-generated method stub
		list.add(course);
		return course;
	}
	
	@Override
	public Course deleteCourse(long id) {
		// TODO Auto-generated method stub
		for(Course course:list) {
			if(course.getId() == id) {
				
			}
		}
		return null;
	}

	@Override
	public Course updateCourse(Course course) {
		// TODO Auto-generated method stub
		list.forEach(e ->{
			if(e.getId()==course.getId()) {
				e.setTitle(course.getTitle());
				e.setDescription(course.getDescription());
			}
		});
		return course;
		
	}

}
