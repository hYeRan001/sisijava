package testProject;
import java.util.*;

public class Switch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*int num = sc.nextInt();
				
		switch(num) {
		case 1: 
		System.out.print("1입니다.");
		
		case 2: 
		System.out.print("2입니다.");
		case 3: 
		System.out.print("3입니다.");
		
		default: 
			System.out.print("값이 없습니다.");
		} +*/
	
		//String day = sc.next();
		
//		switch(day) {
//		case "월":
//		case "화":
//		case "수":
//		case "목":
//		case "금":
//			System.out.print("금일은 정상 영업합니다.");
//			break; // 금요일까지만으로 하고 막아줘~ switch는 안막아두면 밑에꺼 다 실행됨
//		case "토":
//			System.out.print("금일은 휴일 입니다.");	
//		case "일":
//			System.out.print("잘못 입력하셨습니다.");	
//		}
//		
		int num1, num2;
      char sl; //cher 캐릭터형으로 해도됨
		
	
		System.out.print("피연산자1 입력 : ");
		num1 = sc.nextInt();
		System.out.print("피연산자1 입력 : ");
		num2 = sc.nextInt();
		System.out.print("연산자를 입력(+,-,*,/,%) : ");
		sl = sc.next().charAt(0); //sc.next().charAt(0)
	
				if(sl == '+') {							/*si에+를넣으면*/
				System.out.print(num1 + "+" + num2 + " = " + (num1 + num2)); /*이 수식을 걸어줘*/
			} 	else if(sl == '-') {
				System.out.print(num1 + "-" + num2 + " = " + (num1 - num2));
			}   else if(sl == '*') {
				System.out.print(num1 + "*" + num2 + " = " + (num1 * num2));
			}	else if(sl == '/') {
				System.out.print(num1 + "/" + num2 + " = " + ((double)num1 / num2));
			}	else if(sl == '%') {
				System.out.print(num1 + "%" + num2 + " = " + (num1 - num2));
			}	else {
				System.out.print("잘못 입력 하셨습니다.");
			}         		
		
		
		
		
		
	}
}
