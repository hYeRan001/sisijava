package com.kh.review;
import java.util.Scanner;
public class Run {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		Human kim = new Human("김유리", 15, "201211-2xxxxxxx", 'f');
		Human ch = new Human("김철수", 18, "201021-1xxxxxxx", 'm');
		kim.setAge(12);
		
		System.out.println(kim.toString());
		System.out.print(kim.getFutureAge());
		//제 10년후 나이는 00살 입니다 스트링값반환하는 메서드를 만들기
		
		//크기가 3인 Human 객체배열  arr을 만들고 
		//kim과 ch와 똑같이 0번, 1번째 인댁스에 생성하라
		
		Human[] arr = new Human[3];
		arr[0] = new Human ("김유리", 15, "201211-2xxxxxxx", 'f');
		arr[1] = new Human ("김철수", 18, "201021-1xxxxxxx", 'm');
		
		
	}
}
