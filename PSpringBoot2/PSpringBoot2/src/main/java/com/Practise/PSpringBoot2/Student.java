package com.Practise.PSpringBoot2;

import org.springframework.stereotype.Component;

@Component
public class Student {
	private String firstName;
	private Integer id;
	
	public void initialise() {
		this.firstName = "Akhil";
		this.id = 123;
		System.out.println(firstName+" " + id);
	}
	
	
	

}
