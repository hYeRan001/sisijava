package com.kh.OOP5;

public abstract class Human {

	protected String name;
	protected int age;
	
	public Human (String name, int age) {
		this.name = name;
		this.age = age;
		
	}
	
	public String getNaem () {
		return this.name;
	}
	public int getAge () {
		return this.age;
	}
	public	abstract void makeSound();
	
}
