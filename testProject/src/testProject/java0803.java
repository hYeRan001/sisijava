package testProject;
import java.util.*;
public class java0803 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//double형 변수 num을 생성하고 3.75를 대입해라
		double  num = 3.75;
		
		//int형 변수 num2를 생성하고 숫자를 하나 입력받아라
		int num2 = sc.nextInt();
		//입력받은 num2(길이)를 활용해 1차원배열을 하나 만들고 모든수를 5로초기화
		int[] arr = new int[num2];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = 5;
		}
		//arr배열의 2 인덱스 값에 0을 넣어준다.
		arr[2] = 0;
		//arr배열을 처음부터 끝까지 아래와 같은 방식으로 출력한다
		//배열안에 값이 5일때 5출력
		//배열안에 값이 0일때 "5가 아닙니다"
		for (int i = 0; i < arr.length; i++)
			if(arr[i] == 5)
				System.out.println(arr[i]);
			else
				System.out.println("5가아닙니다.");
	
	
	
	
	
	
	
	
	
	
	
	}
}
