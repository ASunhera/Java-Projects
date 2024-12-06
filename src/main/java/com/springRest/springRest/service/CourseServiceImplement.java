package com.springRest.springRest.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springRest.springRest.courseDao.CourseDAO;
import com.springRest.springRest.entity.Course;

@Service
public class CourseServiceImplement implements CourseService {
		
		@Autowired
		private CourseDAO courseDAO;
		
		public  CourseServiceImplement() {
			
		}
	@Override
	public List<Course> getCourses() {
		return courseDAO.findAll();
	}
	@Override
	public Course getCourse(long courseID) {
		Optional<Course> optionalUser = courseDAO.findById(courseID);
		Course course = optionalUser.orElse(null);
		return course;
	}
	@Override
	public Course addCourse(Course course) {
		return courseDAO.save(course) ;
	}
	
	@Override
	public Course deleteCourse(long courseID) {
		Optional<Course> optionalUser = courseDAO.findById(courseID);
		Course course = optionalUser.orElse(null);
		courseDAO.delete(course);
		return course;
	}
	@Override
	public Course updateCourse(Course course) {
		// TODO Auto-generated method stub
		return courseDAO.save(course);
	}

}
