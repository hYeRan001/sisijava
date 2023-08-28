package testProject;
import java.util.*;
public class javaa0728 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//			for (int i = 1; i <= 20; i++) 
//				//조건식 ::::: 
//				//i는 1이고 i는 20보다 작아? ->맞으면코드실행 -> 증감식가서 조건이맞으면20될때까지 돍기
//				System.out.print(i);
		

		
//	int num = 1;
//	System.out.print("1이상의 숫자를 입력하세요 :");
//	num = sc.nextInt();
//	for(int i = 1; i <= num; i=i+1)
//	{System.out.println(i);}
//		if (num <= 0)
//		{System.out.println("1 이상의 숫자를 입력해주세요.");
//		} 
//	
		
//	int num;
//	
//	System.out.print("1이상의 숫자를 입력하세요 :");
//	num = sc.nextInt();
//	if (num < 1) {
//	while(num < 1) {
//	System.out.print("1이상의 숫자를 입력해주세요");
//	System.out.print("1이상의 숫자를 입력하세요 :");
//	num = sc.nextInt();
//	}
//			}for(int i =1; i <= num; i++)
//				System.out.print(i + " ");
//	
	
//	int num, sum = 0;
//	float total;
//	System.out.print("정수를 하나 입력하세요:");
//		num= sc.nextInt();
//	for (int i = 1; i <= num; i++)	{
//		sum = sum + i;
//		if (i == num)
//		System.out.print(i + " = " + sum );
//		else
//		System.out.print(i + " + " );
//	}
//		
		
//		int[] ar = new int[3];
//		
//		ar[0] = 7;
//		ar[1] = 8;
//		ar[2] = 9;
//		
//		int num = ar[0] + ar[1] + ar[2];
//		System.out.print(num);
//		//ar에 각각 저숫자 넣어줘 ar은 3개야 ar각각 더해서 num에 넣어서출력해줘
		
		
//		int dan;
//		System.out.print("숫자 : ");
//		dan = sc.nextInt();
//		System.out.println("====4단==== ");
//		for (int i = 1; i <= 9; i++) { 
//			System.out.println(dan + "*" + i + "=" + (i * dan)); }

	//7번문제
/*		int num1, num2, min, max;	
		do {
		System.out.print("첫 번째 숫자 : ");
		 num1= sc.nextInt();
		 
		System.out.print("두 번째 숫자 : ");
		 num2= sc.nextInt();
		if (num1 < 1 || num2 < 1)
			System.out.println("1이상의숫자를입력하세요.");} 
		
		while(num1 < 1 || num2 < 1);
		 if (num1 > 0  && num2 > 0) {
			 
			 if(num1 > num2) {
				 max = num1;
				 min = num1;
				 } else { 
					 max = num2;
					 min = num1;
				 }
			 for(int i = min; i <= max; i++) {
				 System.out.print(i + " ");	 
			 }
		 }	 else {
			 System.out.print("1이상의 숫자를 입력해주세요.");
			 }			*/
		
		//실습문제11 시작숫자 4 공차 3 -> 시작숫자부터 공차만큼 증가 10개까지 증강식		
/*		int n1, n2;
		System.out.print("시작숫자 : ");
		 n1= sc.nextInt();
		System.out.print("공차 : ");
		n2= sc.nextInt();		 
		for(int i = 0; i < 10; i++) {
			System.out.print(n1 + " ");
			n1 = n1 + n2; 
		}				*/
			
		// 실습문제 12 ----a1:연산자 , a2:정수1 , a3:정수2 이거 집ㅇㅔ서 다시해보고 안되면 쌤 ㅠ
//		int  a2, a3;
//		String a1;
//		System.out.print("연산자(+,-,*,/,%) : ");
//		a1= sc.nextLine();
//		System.out.print("정수1 : ");
//		a2= sc.nextInt();
//		System.out.print("정수2 : ");
//		a3= sc.nextInt();
//		
//		switch(a1){
//			case "+" :
//				System.out.print(a2 + "+" + a3 + " = " + (a2 + a3));
//				break;
//			case "-" :
//				System.out.print(a2 + "-" + a3 + " = " + (a2 - a3));
//				break;
//			case "*" :
//				System.out.print(a2 + "*" + a3 + " = " + (a2 * a3));
//				break;
//			case "/" :
//				System.out.print(a2 + "/" + a3 + " = " + (a2 / a3));
//				break;
//			case "%" :
//				System.out.print(a2 + "%" + a3 + " = " + (a2 % a3));
//				break;
//		}
		

		// 실습문제 13 실행예제 구현
		
//		int num;
//		
//		System.out.print("정수입력 : ");
//		num= sc.nextInt();
//		
//		//몇줄 실행 할것인가/ 세로로 몇벌실행할그양
//		for (int i = 1; i < num; i++) {
//				//몇번 가로로 실행할것인가
//			for (int j = 0; j < i; j++) {
//			System.out.print('*');
//			}
//			System.out.println();
//		}
//		
		
		//반복문 실습문제 1
		
//		int num;
//			System.out.print("정수 :");
//			num= sc.nextInt();
//			
//		if (num < 1)	
//			System.out.print("양수가아닙니다.");
//		else {
//		for (int i = 1; i <= num; i++) {
//			if (i % 2 == 0)
//				System.out.print("수");
//			else
//				System.out.print("박");
//		}}
//		
		//실습 2번
		
//		int num;
//		while(true) {
//		System.out.print("정수 :");
//		num= sc.nextInt();
//		
//	if (num < 1)	
//		System.out.print("양수가아닙니다.");
//	else {
//	for (int i = 1; i <= num; i++) {
//		if (i % 2 == 0)
//			System.out.print("수");
//		else
//			System.out.print("박");
//	}
//	break;
//	}
//		
//		
//		}
		//실습5번
		int nan, in, count = 0;
		
		System.out.print("난수를 입력하세요 : ");
		nan= sc.nextInt();
		count++;
		
		//반복: 1. 정답을 입력받는것 2.정답을확인하는것
		while(true){
		System.out.print("1~100 사이의 임의의 난수를 맞춰보세요. : ");
		in= sc.nextInt();
		
		if (nan == in) {
			System.out.println("정답입니다!! ");
			System.out.println(count + "회만에 맞추셨습니다. !");
			break;
		}else if (in < 1 || in > 100) {
			System.out.println("1~100사이의 숫자를 입력해주세요");
			count--;
		}else if (nan > in) {
			System.out.println("UP ");
		}else if (nan < in) {
			System.out.println("DOWN ");
		}
				}
	

	
	
	
	}
	
}
