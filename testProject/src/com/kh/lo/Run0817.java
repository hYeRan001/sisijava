package com.kh.lo;

import java.util.*;
public class Run0817 {
	public static void main(String[] args) {   //////이게 배열보다 더 쉽다고..한다
	 List<String> list = new ArrayList<>(); //컬렉션 인스턴스 생성    >>>>>>> ArrayList(배열기반)에서 LinkedList로 변경 가능
	 
	 //컬렉션 인스턴스에 문자열 인스턴스 저장
	 list.add("Toy");
	 list.add("Box");
	 list.add("Robot");
	 
	 //저장된 문자열 인스턴스의 참조;
		for(int i = 0; i<list.size(); i++)
			System.out.println(list.get(i)+'\t');
		System.out.println();
		
		list.remove(0);//첫번재인스턴스삭제
		//첫번째인스턴스 삭제 후 나머지 인스턴스들을 참조
		for(int i = 0; i < list.size(); i++)	
			System.out.println(list.get(i)+'\t');
		System.out.println();
		
		
	}
}
