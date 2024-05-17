package com.Practise.PSpringBoot3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.Practise.PSpringBoot3.services.Telusko;

@SpringBootApplication
public class PSpringBoot3Application {

	public static void main(String[] args) {
		  ConfigurableApplicationContext container = SpringApplication.run(PSpringBoot3Application.class, args);
		  Telusko courseBean = container.getBean(Telusko.class);
		  courseBean.purchaseCourse(123.0);
		
	}

}
