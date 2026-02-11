package com.example.demo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Laptop implements ElectronicDevice{

	@Override
	public void useDevice() {
		System.out.println("Laptop is working.");
		
	}
	
	
}
