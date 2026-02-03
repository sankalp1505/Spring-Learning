package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Student {
	
	Laptop ref;
	
	void study() {
		System.out.println("Student is Studying");
	}
	
	void useLaptop() 
	{
		ref.work();
	}

	public Student(Laptop ref) {
		
		this.ref = ref;
	}
	
	
	
}
