package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component
public class Employee {
	
	 int empId;
	 String empName;
	 double empSalary;

	 void work() {
		 System.out.println("Employee is working");
	 }
	      
	 void details() {
		 System.out.println("Employee Id: " + empId);
	     System.out.println("Employee Name: " + empName);
	     System.out.println("Employee Salary: " + empSalary);
	 }

	public Employee(@Value("${employee.empId}") int empId,@Value("${employee.empName}") String empName , @Value("${employee.empSalary}") double empSalary) {

	     this.empId = empId;
	     this.empName = empName;
	     this.empSalary = empSalary;
	}
	    
}
