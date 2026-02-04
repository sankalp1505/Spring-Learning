package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ValueAnnotationApplication {

	public static void main(String[] args) {
		ApplicationContext ac = SpringApplication.run(ValueAnnotationApplication.class, args);
		Employee emp = ac.getBean(Employee.class);
		emp.work();
		emp.details();
	}

}
