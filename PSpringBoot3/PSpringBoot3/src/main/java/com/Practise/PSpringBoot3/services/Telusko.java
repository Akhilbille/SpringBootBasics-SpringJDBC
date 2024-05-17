package com.Practise.PSpringBoot3.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Telusko {
	
	
	
	@Autowired
	@Qualifier("servlet")
	private Courses course;
	
	public void purchaseCourse(Double price) {
		System.out.println("Ready to purchase the course");
		course.buyCourse(price);
	}

}
