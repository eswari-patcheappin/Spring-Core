package com.tnsif.springcoretwo;

import org.springframework.stereotype.Component;

@Component
public class Student {
	private String name = "Eswari";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void showStudentName() {
		System.out.println("Student Name: "+name);
	}
}
