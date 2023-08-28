package com.kh.OOP5;
import java.util.*;

public class Run {
	public static void main(String[] args) {  
		Scanner sc = new Scanner(System.in);
	
		int num = 0;
		
		System.out.print("숫자를 입력하세요 : ");
		num = sc.nextInt();
		if(num<=10) {
			System.out.println("10이하");
		} else {
			System.out.println("10초과");
		}					
		//2번 
		
		int value = 1000;
		for(int i = 1; i <-5; i++) {
			 value -= i;
		}System.out.println(value);
		
		
		int [] ko = new int[num];
		for (int i = 0; i <ko.length; i++) {
					ko[i] =num;
		}
		for (int i = 0; i <ko.length; i++) {
			System.out.println(ko[i]);
}
		
		
		
		Student kim = new Student("김철수", 20);
		kim.makeSound();
		kim.sleep();
		kim.swim();
	}
}
