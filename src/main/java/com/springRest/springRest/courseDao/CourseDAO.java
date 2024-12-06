package com.springRest.springRest.courseDao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springRest.springRest.entity.Course;

public interface CourseDAO extends JpaRepository<Course, Long> {

}
