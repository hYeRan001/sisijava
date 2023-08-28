package testProject;
import java.util.*;

public class home0729 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		String name, gender;
//		int non;
//		Float cm;
//		
//		System.out.print("이름을 임력하세요 :" );
//		name = sc.nextLine();
//		System.out.print("성별 임력하세요(남/여) :" );
//		gender = sc.nextLine();
//		System.out.print("나이를 임력하세요 :" );
//		non = sc.nextInt();
//		System.out.print("키 임력하세요(cm) :" );
//		cm= sc.nextFloat();
//		
//		System.out.print("키 " + cm + "인 " + non + "살 " + gender + "자 " +
//		 name + "님 " + "반갑습니다.");
		
//		int one, two;
//		
//		System.out.print("첫번째 정수 : ");
//		one = sc.nextInt();
//		System.out.print("두번째 정수 : ");
//		two = sc.nextInt();
//		System.out.println("더하기 결과: " + one + two);
//		System.out.println("빼기 결과: " + (one - two));
//		System.out.println("곱하기 결과: " + one * two);
//		System.out.println("나누기 몫 결과: " + one / two);
		
		
//		float non3, non4;
//		System.out.print("가로 : ");
//		non3 = sc.nextFloat();
//		System.out.print("세로 : ");
//		non4 = sc.nextFloat();
//		System.out.println("면적 : " + (non3*non4));
//		System.out.println("둘레 : " + ((non3+non4)*2));
		
//		String a1;
//		System.out.print("문자열을 입력하세요.: ");
//		a1 = sc.next();
//		System.out.println("첫번째문자: " + a1.charAt(0));
//		System.out.println("두번째문자: " + a1.charAt(1));
//		System.out.println("세번째문자: " + a1.charAt(2));		
//		
		//1011문제
//	    char a1;
//		
//			a1 = sc.next().charAt(0);	
//			System.out.print(a1);	
	//1014문제
//		char x,y;
//		x = sc.next().charAt(0);
//		y = sc.next().charAt(0);
//		System.out.print(y +" "+x);	 // 캐릭터형 출력시 가운데 "" 문자변환
		
		//1046문제		
		//char x;
		//x = sc.next().charAt(0);
		//System.out.print((int)x); //캐릭터형 숫자변경 -> 앞엥 int Vaiable참고
		
		//1050문제
//		int a , b;
//		a = sc.nextInt();
//		b = sc.nextInt();
//		if(a==b){ //ab가같으면 1출력
//			System.out.println(1);			
//		}else {//근데 아니면 0출력
//			System.out.println(0);}
//		
		
//		//1051문제
//		int a, b;
//		a = sc.nextInt();
//		b = sc.nextInt();
//		if(a<=b){ 
//			System.out.println(1);			
//		}else {//근데 아니면 0출력
//			System.out.println(0);}
//		
//		
		
		//1057문제
//		int a, b;
//		a = sc.nextInt();
//		b = sc.nextInt();
//			if(a == b) {
//				System.out.println(1);
//			} else {
//				System.out.println(0);
//			}
//		
		//1066
//		int a, b, c;
//		a = sc.nextInt();
//		b = sc.nextInt();
//		c = sc.nextInt();
//			if(a%2==0) {
//				System.out.println("even");
//			}	else{
//				System.out.println("odd");
//			}
//			if(b%2==0) {
//				System.out.println("even");
//			}	else{
//				System.out.println("odd");
//			}
//			if(c%2==0) {
//				System.out.println("even");
//			}	else{
//				System.out.println("odd");
//			}
		
		//1067
//		int a;
//		a = sc.nextInt();
//		if (a > 0){
//			System.out.println("plus");		
//		}
//		else {
//			System.out.println("minus");
//	
//		}		
//		if (a%2==0) {
//			System.out.println("even");
//		}else {
//			System.out.println("odd");
//		}
		
		//1070
//		int a;
//		a = sc.nextInt();
//			switch(a) {
//			case 12:
//			case 1:
//			case 2:
//				System.out.print("winter");
//				break;
//			case 3:
//			case 4:
//			case 5:
//				System.out.print("spring");	
//				break;
//			case 6:
//			case 7:
//			case 8:
//				System.out.print("summer");	
//				break;
//			case 9:
//			case 10:
//			case 11:
//				System.out.print("fall");
//				break;
//			}
		//1074
//		int a;
//		a = sc.nextInt();
//		while(a!=0) { //a가 0ㅇㅣ 아닐때까지 돌리겟다
//			System.out.println(a);	//a출력
//			a--; //a -1씩차감하면서 5 4 3 2 1 
//			
//		}
		
//		int a;
//		System.out.println("정수 :");
//		a = sc.nextInt();
//		if (a %2 == 0) { //짝수
//			System.out.println("짝수.");
//		} else {
//			System.out.println("홀수.");
//		}
		
		int a, b,c;
		System.out.println("인원수 : ");
		a = sc.nextInt();
		System.out.println("사탕개수 : ");
		b = sc.nextInt();
		c = b / a;
		System.out.println("1인당사탕개수:" + (c));
		System.out.println("남은사탕:" + (b-(a*c)));
		
		
		
		
	}
}
