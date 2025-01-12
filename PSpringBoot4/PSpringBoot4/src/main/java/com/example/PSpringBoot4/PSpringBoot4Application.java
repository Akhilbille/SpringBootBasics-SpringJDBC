package com.example.PSpringBoot4;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.PSpringBoot4.dao.Employee;
import com.example.PSpringBoot4.dao.EmployeeDAOImp;

@SpringBootApplication
public class PSpringBoot4Application {

	public static void main(String[] args) {
	 ConfigurableApplicationContext container = SpringApplication.run(PSpringBoot4Application.class, args);
	  EmployeeDAOImp dao = container.getBean(EmployeeDAOImp.class);
//	  List<Employee> employesData = dao.getEmployeesData();
	  
	  dao.getEmployeesData().forEach(e -> System.out.println(e));
	  
	}

}
