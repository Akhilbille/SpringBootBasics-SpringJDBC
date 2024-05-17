package com.Practise.PSpringBoot3.services;

import org.springframework.stereotype.Service;

@Service
public class Servlet implements Courses {

	@Override
	public void buyCourse(Double price) {
		System.out.println("Thanks for purchasing Servlet Course "+ price);

	}

}
