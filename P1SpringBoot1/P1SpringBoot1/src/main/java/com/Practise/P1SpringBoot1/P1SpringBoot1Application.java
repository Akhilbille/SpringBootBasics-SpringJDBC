package com.Practise.P1SpringBoot1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;



@SpringBootApplication
public class P1SpringBoot1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext container = SpringApplication.run(P1SpringBoot1Application.class, args);
		
		
	Amazon amz = container.getBean(Amazon.class);
		
		
		Boolean status = amz.deliverTheProduct(1236.3);
		if(status)
			System.out.println("Delivered Succesfully..");
		else
			System.out.println("Delivery Failed");
		
	}

}
