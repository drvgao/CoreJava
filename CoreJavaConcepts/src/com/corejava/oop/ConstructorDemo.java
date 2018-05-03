package com.corejava.oop;

public class ConstructorDemo {
	int number;
	int age;
	String name;
	
	public ConstructorDemo(String name, int phoneNo, int age) {
		this.number = phoneNo;
		this.age = age;
		this.name = name;
	}

	public ConstructorDemo() {
		// TODO Auto-generated constructor stub
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public int calculateAdd(int num1, int num2){
		return num1+num2;
	}
}
