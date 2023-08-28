package testProject;
import java.util.*;

public class test0727 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	//	int i = 1;
		//초기식이밖에잇음
	//	while(i <= 10)//조건식 
	//		{ System.out.println(i); //수행문장
	//		i++; //증감식	
	//		 }
		
	
		//for (int i = 0; i < 10; i++) //i는 지역변수
		//{System.out.println(i);}
	

/*	for (int i = 0; i < 10; i=i+2) { //i지역변수 1)초기식 i=0 -> 2)조건식 i=10보다작다(참) 3)시스템으로i몇인지확인 
		//4)1,2,3을계속반복후i=i+2 2씩증감 10이될때까지
		System.out.println(i);
		
	}*/
		
/*	int dan = 2;
	for (int i = 0; i <= 9; i++) { //i지역변수 
		System.out.println(dan + "*" + i + "=" + (i * dan));
	//2*1=2 하고끝 다시 위 i++증감식확인후 i가 1씩증가
	}	*/
	

	//사용자로부터 한개의 값을 입력받아 1부터 그 숫자까지의 숫자들을 모두 출력하세요 단 입력한 수는 1보다 크거나 같아야됩니다.
	// 1미만이라면 1이상의숫자를입력해주세요 출력 0넣으면 다시 반복하게하세요..
/*	int num = 0;
	while(num < 1) {
	System.out.print("1이상의 숫자를 입력하세요 :");
	num = sc.nextInt();
	if (num <= 0)
	{System.out.println("1 이상의 숫자를 입력해주세요.");
	} else{	
		int i = 1;
		while (i <= num) 
		{System.out.println(i); 	i++; }}} //반복해야되는걸 감싸줘야함 while로	*/

	//1부터모든숫자를 거꾸로 출력하ㅅ요 대신 입력한 수는 1보다 크거나 같기
/*	int num;
		System.out.print("1이상의 숫자를 입력하세요 :");
		num = sc.nextInt();
	for(int i = num; i >= 1; i--) //역순으로전개
	{System.out.println(i); }
	//입력받은 값부터 1까지 반복하라 */
	
	/* int num = 0;
	while(num < 1) {
		System.out.print("1이상의 숫자를 입력하세요 :");
		num = sc.nextInt();
		
		if (num > 0) {
		for (int i = num; i >= 1; i--)
			{System.out.print(i + " ");
			}
		}else {
			System.out.print("1이상의 숫자를 입력해주세요");
		}	
	}			*/
	
		int num, sum = 0;
		float total;
		System.out.print("정수를 하나 입력하세요 : ");
		 num= sc.nextInt();
		for (int i = 1; i <= num; i++){
			sum = sum + i;
			if (i == num)
			System.out.print(i + " = " + sum );
			else
			System.out.print(i + " + " );
		}					
		//두개의 값을 입력받아 그 사이의숫자를 모두출력하세요
/*		int num1, num2, min, max;
		
		System.out.print("첫 번째 숫자 : ");
		 num1= sc.nextInt();
		System.out.print("두 번째 숫자 : ");
		 num2= sc.nextInt();
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
			 System.out.print("1이상의 숫자를 입력해주세요.");}				*/
		
//		int one, two, min, max;
//			System.out.print("첫 번째 숫자 : ");
//			one= sc.nextInt();
//			System.out.print("두 번째 숫자 : ");
//			two= sc.nextInt();
//			
			
		
	
		 
		 
		
		
	
	
	
	
	
	
	
	
	
	
	/*	int i = 1;
	while (i <= num) //조건체크 
	{System.out.println(i);//조건확인후 진행 
	i++; } // 증감 i2가되니깐 조건체크부터 반복      */
	
	
	
	
	
	}
}
