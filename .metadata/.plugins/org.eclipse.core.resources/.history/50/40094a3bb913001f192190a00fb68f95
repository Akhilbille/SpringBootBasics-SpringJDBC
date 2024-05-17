package com.Practise.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LaunchApp1 {
	
	public static void main(String[] args) {
		
		//To activate the spring and telling the spring to where to find instructions
		ApplicationContext container = new ClassPathXmlApplicationContext("applicationconfig.xml");
		
		Amazon amz = container.getBean(Amazon.class);
		
		
		Boolean status = amz.deliverTheProduct(1236.3);
		if(status)
			System.out.println("Delivered Succesfully..");
		else
			System.out.println("Delivery Failed");
		
	};

}
