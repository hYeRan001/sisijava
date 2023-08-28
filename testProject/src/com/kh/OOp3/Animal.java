package com.kh.OOp3;

// Animal 추상클레스 작성
//추상클레스는 일반클레스와 동일하지만 추상매서드를 포함할 수 있어 객체생성이 되지않음
//상속받아 추상메서드를 모두 구현해 사용할 수 있다.


// 필드 값 : String name, int age
// 필드를 초기화하는 생성자 작성
// 추상메서드 makeSound : 매게변수와 반환값(리턴값)이 없음
//추상클레스는 public 옆에 abstract입력
public abstract class Animal {
    // 필드 값 : String name, int age
	protected String name;
	protected int age;
	
	// 필드를 초기화하는 생성자 작성
	public Animal (String name, int age) {
		this.name = name;
		this.age = age;
	}
	  // 추상메서드 makeSound : 매게변수와 반환값(리턴값)이 없음
	public	abstract void makeSound();
	
}
