package com.springRest.springRest.service;

import java.util.List;

import com.springRest.springRest.entity.Course;

public interface CourseService {
		public List<Course> getCourses();

		public Course getCourse(long courseID);

		public Course addCourse(Course course);

		public Course deleteCourse(long courseID);

		public Course updateCourse(Course course);

}
