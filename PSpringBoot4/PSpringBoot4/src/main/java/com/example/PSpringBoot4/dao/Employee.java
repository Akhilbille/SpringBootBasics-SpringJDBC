package com.example.PSpringBoot4.dao;

import org.springframework.stereotype.Component;

@Component
public class Employee {
	private Integer id;
	private String city;
	private String name;
	
	
	public Employee(){
		System.out.println("Employee bean craeted.");
	}
	
	
	public void setId(Integer id) {
		this.id = id;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void setName(String name) {
		this.name = name;
	}


	@Override
	public String toString() {
		return "Employee [id=" + id + ", city=" + city + ", name=" + name + "]";
	}
	
	
	
	
	

}