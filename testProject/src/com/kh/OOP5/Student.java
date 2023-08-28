package com.kh.OOP5;

public class Student extends Human implements Swimmable, sleepable{

	public Student(String name, int age) {
		super(name, age);
	}
	
	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println(super.getNaem() + "님은 잠을 잡니다.");
	}

	@Override
	public void swim() {
		// TODO Auto-generated method stub
		System.out.println(super.getNaem() + "님은 수영을 합니다.");
	}

	@Override
	public void makeSound() {
		// TODO Auto-generated method stub
		System.out.println("저는 "+super.getNaem() +"이고" + super.getAge()+"살 입니다." );
	}

	
}
