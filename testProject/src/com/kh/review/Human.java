package com.kh.review;

public class Human {
	private String name;
	private int age;
	private String residentNumber;
	private char gender; //f -> 여자 m ->남자
	private String ko;
	
	//메서드의 이름은 같아도 매게변수의 숫자나 자료형이 다르면 구분이 가능하다.
    public Human (String name, int age, String residentNumber, char gender) {
        this.name = name;
        this.age = age;
        this.residentNumber = residentNumber;
        this.gender = gender;
        
    }
    
    public Human (String name, int age) {
    	this(name, age, "미입력", 'f');
    }

    public String getName() {
    	return this.name;
    }
    public int getAge() {
    	return this.age;
    }
    public String getResidentNumber() {
    	return this.residentNumber;
    }
    public char getGgender() {
    	return this.gender;
    }

    public void setName(String name) {
    	this.name = name;
    }
    public void setAge(int age) {
    	this.age = age;
    }
    public void setResidentNumbe(String residentNumber) {
    	this.residentNumber = residentNumber;
    }
    public void setGender(char gender) {
    	this.gender = gender;
    }
    
    public String toString() {
    	return this.name + " " + this.age+ "살 " + this.residentNumber + " "+ this.gender+"";
    }
    
//접근제한자 반환형 메서드이름(매게변수){
    // 실행할코드
    // }//제 10년후 나이는 00살 입니다 스트링값반환하는 메서드를 만들기
    public String getFutureAge() {
    	return "제 10년후 나이는"+(this.age+10)+"입니다";
    }
    
    
    
    
    
}
