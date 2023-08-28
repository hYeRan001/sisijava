package testProject;
import java.util.*;

public class Input {
	public static void main(String[] args) {
//		String str1, str2, str3;
//		Scanner sc = new Scanner(System.in);
//
//		str1 = sc.next();
//		str2 = sc.nextLine();
//		str3 = sc.next();
//		
//		System.out.println(str1);
//		System.out.println(str2);
//		System.out.println(str3);
//		
		//변수가 몇개 필요한치 체크 
		
		String name,gender;
		int age;
		float height;		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름을 입력하세요:");
		name = sc.nextLine();
		System.out.print("성별을 입력하세요(남/여):");
		gender = sc.nextLine();
		System.out.print("나이를 입력하세요:");
		age = sc.nextInt();
		System.out.print("키를 입력하세요(cm):");
		height = sc.nextFloat();
		System.out.print("키 "+height+"cm인 "+age+"살 "
		+ gender +"자 "+name+"님"+ " 반갑습니다 ^^");
	}
}
