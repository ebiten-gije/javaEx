package com.javaex.oop.person;

public class Student extends Person {

	public String school;
	
	public Student(String school) {
		this.school = school;
	}
	
	public Student(String name, int age, String school) {
		super(name, age);
		this.school = school;
	}
	
	@Override
	public void showInfo() {
	//	super.showInfo();
		System.out.printf("이름: %s, 나이: %d, 학교: %s%n", super.getName(), super.getAge(), school);
	}

}
