package com.encapsulation;

public class Person {

	
	private String name;// restricted access
	
	private String age;
	
	public String balance;

	public String getName() {
		return name;
	}

	public void setName(String newName) {
		this.name = newName;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String newAge) {
		this.age = newAge;
	}
	
	
	
	
}
