package com.example.demo;

import org.springframework.stereotype.Component;

@Component("mob")
public class Mobile implements ElectronicDevice{

	@Override
	public void useDevice() {
		System.out.println("Mobile is working");
		
	}

}
