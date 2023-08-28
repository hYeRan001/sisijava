package testProject;
import java.util.*;

public class java0802 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
/*		System.out.println("프로그램시작");
		hiEveryone(12);
		hiEveryone(13);
		System.out.println("프로그램의끝") }			*/
		
		
		
		
/*		
	int[] num; //int배열 이름을 num이라고할게
	num =new int[5]; // num의 새로운 int배열은 5개야 0부터 시작 0,1,2,3,4
	num[0] = 1;//[]배열은 0부터시작! 
	num[1] = 2;
	num[2] = 3;
	num[3] = 4;
	num[4] = 5;
	System.out.print(num[2]);//이러면 출력은 3이나옴num[2]=3;이니깐
	
	*/
	
		/*
	int[][] num; //[][]면 2차배열	
	num = new int [3][3]; //2차원배열로 봣을때 앞에 3행 뒤에 3열 (표로만들어주는건가봐용)
	int[][] num = {{1,2,3},{1,2,3},{1,2,3}}; 이렇게 써줘도됨 근데 위에걸 더 많이씀*/

		
		/*
	//문자형 변수srt을 생성하고 "안녕하세요"로 초기화한다. 
		String str = "안녕하세요";
	//만약 srt의 있는 값이 hi라면 "hi"출력 아니라면 str의 들어있는 값을출력
		if (str.equals("hi")) {
			System.out.print("hi");
		} else {System.out.print(str);}
	//길이가 8인 정수형 1차원배열 arr을 생성하고 값을 전부 5로 초기화한다
		//int[] arr = new int[8];
		//for (int i = 0; i < arr.length; i++)
			//arr[i] = 5;
		int[] arr = {5,5,5,5,5,5,5};
	//arr에 들어있는 데이터를 전부 출력한다.
		for (int i = 0; i < arr.length; i++)
		System.out.print(arr[i]);
	//3행 2열의 char형 2차원배역 arr2를 생성하고 a~f를 순차적으로 대입한다.
		char[][] arr2 = new char[3][2];
		char ch = 'a';
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++)
		{	arr2[i][j] = ch++;
				}   }
	//arr2에 들어있는 데이터를 전부 출력한다.
		
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				System.out.print(arr2[i][j]);
			}
		}
	
		
		*/
		
		
	/*	int[] arr1 = {1,2,3,4,5};
		int[] arr2 = new int[5];
		
		System.arraycopy(arr1, 0, arr2, 0, arr1.length);
		for(int i = 0; i < arr1.length; i++) {
			System.out.println(arr2[i]);
		}							*/
		
	/*	int[] arr = new int[10];
		for(int good = 1; good <= arr.length; good++) {
			arr[good-1] = good;
			System.out.println(arr[good-1]);
		}		*/
		
		
		/*
		int[] ar1 = new int[10];
		for(int i = 0; i < 10; i++) {
			ar1[i] = 10 - i;
			System.out.println(ar1[i] + " ");}		*/
		
		int num;
		int[] ar;				
		System.out.println("양의정수 : ");
		num = sc.nextInt();
		ar = new int[num];
			for(int i = 1; i <= num; i++) {
				ar[i-1] = num - i;
				System.out.print(i + " ");
			}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	
	
	

	
	}
	  public void test() {
		  
	  }
}