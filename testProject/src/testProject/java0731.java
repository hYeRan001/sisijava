package testProject;

import java.util.Scanner;

public class java0731 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		//길이가 5인 int형 1차원 배열생성
//	int[] ar1 = new int[5]; //5개짜리 배열 생성 완료
//		//길이가 7인 double형 1차원 배열생성 ar2
//	double[] ar2 = new double[7];
//		//배열의 변수선언과 메모리할당을 "분리"하여 길이가 9인 float형 배열 ar3생성
//	float[] ar3;
//	ar3 =  new float[9];
//	//배열의 길이를 구하는방법 (확인방법)
//	System.out.println("ar1의 길이 : " + ar1.length);
//	System.out.println("ar2의 길이 : " + ar2.length);
//	System.out.println("ar3의 길이 : " + ar3.length);
		
//		String str[] = new String[5];
//		
//		str[0] = "ran";
//		str[1] = new String("hye");				
//		str[4] = "hi";		
//		str[2] = "tree";
//		str[3] = "hong";
//		//배열 5개중에 하는거라 각 순서는 상관없음
//		int count = 0;
//		for (int i = 0; i < str.length; i++)
//			count += str[i].length();
//			
//		System.out.println("총 문자의 수는? : " + count);
		
		//얕은 복사
//		int[] arr1 = {1, 2, 3, 4, 5};
//		int[] arr2 = arr1;
//		arr2[2] = 0;
//		System.out.println(arr1[2]);
		
		//깊은 복사(=복제)
		
		
		//완전한복사
		//int[] arr1 = {1,2,3,4,5};
		//int[] arr2 = new int[5];
		
		//	for(int i = 0; i < arr1. length; i++){
		// 	arr2[i] = arr[i];	}
		//반복문을 통해서 arr2에 있는 모든 요소 출력
		//for(int i = 0; i < arr2.length; i++) {
		// System.out.println("arr[" + i + "] : " + arr2[i]);
		//}

		/*
		int[] arr1 = {1, 2, 3, 4, 5};
		int[] arr2 = arr1;
		//보편적인 배열 복사방법
		arr2 = arr1.clone();
		//배열 arr1을 전부 7로 초기화
		Arrays.fill(arr1, 7);				*/
		
		//길이가10인배열선언 1~10까지 값을 반복문
//		int[] ar1 = new int[10];
//		for(int i = 1; i <=10; i++){ //i는 1이고 i는 10이거나 미만 i하나씩업 {
//			ar1[i - 1] = 1;  // ar1은 i를 -1씩차감할거야
//		 System.out.println(i + " "); //결과값출력 : 10 9 8 7 6 5 4 3 1 
//			}
//		
		//길이 10 / 1~10까지 역순
//		int[] ar1 = new int[10];
//		for(int i = 0; i < 10; i++) {
//			ar1[i] = 10 - i;
//			System.out.println(i + " ");
//			
//		}
//		int num;
//		int arr[];
//		System.out.print("양의 정수: ");
//		num = sc.nextInt();
//		arr = new int[num];
//		for(int i = 1; i <=5; i++) {
//			arr[i - 1] = 1; 
//			System.out.println(i + " ");
//		}
		
//		String[] str = new String[5];
//		str[0] = "사과";
//		str[1] = "귤";				
//		str[2] = "포도";		
//		str[3] = "복숭아";
//		str[4] = "참외";
//		System.out.print(str[1]);
	
	
/*		
		String str;//검색할 문자열
		int[] strLoc; //위치값(인덱스)저장
		char ch; //찾을 문자하나
		int count = 0;		
		System.out.print("문자열 : ");
		str = sc.next();
		System.out.print("문자 : ");
		ch = sc.next().charAt(0);
		//ch가 존재하는 위치 구하기
		System.out.println("application에 i가 존재하는 위치(인덱스): " );
		for (int i = 0; i <str.length(); i++);{
			if (str.charAt(i) == ch) {
				System.out.print(i + "");
				count++;
			}
		}
		
		System.out.println(ch + "개수 : " + count);
		
		
		*/
		String[] days = {"월", "화", "수", "목", "금", "토", "일"};
		int a1;
		
		System.out.print("0~6사이 숫자 입력 : ");		
		a1 = sc.nextInt();
		switch(a1) {
		case 0:
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
		case 6:
			System.out.print(days[a1] + "요일");
			break;

			default:
				System.out.print("잘못입력하셨습니다.");
		}
		
		
		
		
		
		
		
		
		
		

		
		
			
}
	
	
}
