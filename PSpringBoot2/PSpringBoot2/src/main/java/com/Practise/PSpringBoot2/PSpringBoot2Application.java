package com.Practise.PSpringBoot2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class PSpringBoot2Application {

	public static void main(String[] args) {
		 ConfigurableApplicationContext container = SpringApplication.run(PSpringBoot2Application.class, args);
		 Student st = container.getBean(Student.class);
		 st.initialise();
		 
		 System.out.println(container.getClass().getName());
		 System.out.println(container.getBeanDefinitionCount());
		 String beans[] = container.getBeanDefinitionNames();
		 for(String bean:beans) {
			 System.out.print(bean+" : ");
		 }
		 
	}

}
