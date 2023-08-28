package com.kh.iclass;  //패키지만들면 com 안에 kh안에 iclass폴더안에 있는거임!!!!!!!!!!
import java.util.Scanner; //자바.유틸 폴더안에서 스케너를 가지고온다.
			//class는 설계도라고 보면됩니다.
public class MainStart {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
	/*		
			//class사용해서 객체배열 만드는방법
			//1) class이름[] 객체배열이름 = new class이름[크기:길이];
			//->위처럼 작성시 객체배일이 생성은 되지만 비어있는상태
			
			Product[] drinkList = new Product[3];
			//실제객체를 만드는방법
			//2) 객체배열이름[index] = new class이름(매개변수);
			drinkList[0] = new Product( "양준혁" ,"아메리카노",1000,10);
			drinkList[1] = new Product("홍혜란" ,"카페라떼", 2000, 10);
			drinkList[2] = new Product();

			drinkList[0].productInfo();
			drinkList[1].productInfo();
			drinkList[2].productInfo();
			
			
			//class이름 객체이름 = new class이름(); -- 내가사용하고싶은걸 만드는것 new가들어가면 실제 메모리 공간으로 만들어줘
//			Product iceAme; //참조변수만 만들어진상태 ( 리모폰만들구있음)
//			iceAme = new Product("아메리카노",1000,10); // 참조변수가 메모리 공간의 주소값을 가지고있는상태 (리모콘을 제품에 연결한상태)
//							//iceAme가 객체		
//			
//			Product iceLatte; //참조변수만 만들어진상태 ( 리모폰만들구있음)
//			iceLatte = new Product("카페라떼", 2000, 10); // 참조변수가 메모리 공간의 주소값을 가지고있는상태 (리모콘을 제품에 연결한상태)
			
	//		iceAme.setPrice(1000); //이거 넣어주면 product에 34쪽으로 들어가서 가격변동됨
//			iceLatte.setPrice(2000);
			
//			iceAme.productInfo();
//			iceLatte.productInfo();

//		System.out.print(iceAme.addprice(iceLatte.getPrice()));     */
			
			final int MAX	= 20;
			Product[] menuArr = new Product[MAX];
			
			menuArr[0] = new Product( "아메리카노",1000,"고소해요");
			
			//음료명,금액,설명을 입력받아 drinArr에 추가하기
			String name, description;
			int price;
			
			System.out.println("음료명을 입력하세요 : ");
			name = sc.next();
			System.out.println("금액을 입력하세요 : ");
			price = sc.nextInt();
			System.out.println("설명을 입력하세요 : ");
			description = sc.next();
		
			for(int i = 0;  i < menuArr.length; i++) {				
				
				if(menuArr[i] == null) { // 객체에 자리가 있니?
					menuArr[i] = new Product(name, price, description);
					System.out.println(menuArr[i].getName()+"가 메뉴에 추가되었습니다. ");
					break;
				}else  if(menuArr[i].getName().equals(name)) { // 객체에 이름데이터 값이 입력받은 이름과 똑같니?
					System.out.println(name + "은 이미 등록되어있습니다.");
					break;
				}else if (i == (menuArr.length -1)) { //마지막 확인 끝?
					System.out.print("더이상 메뉴를 추가할 수 없습니다.");
				}
			}
			
			//음료목록 출력해주셍.
			System.out.println("메뉴명\t가격\t설명");
			for (int i = 0; i < menuArr.length; i++) {
				if(menuArr[i] == null) {
					System.out.println(i + "\t-\t-\t-");
				}else {
				System.out.println(i + "\t" +menuArr[i].toString());
			}
		}
//			for (int i = ( menuArr.length - 1);  i >=0;  i++) {
//				if(menuArr[i] != null) {
//					System.out.println(menuArr[i].getName()+"가 메뉴가 삭제되었습니다. ");
//					menuArr[i] = null;
//					break;
//				} else if(i == 0) {
//					System.out.print("삭제할 메뉴가 존재하지않습니다.");
//				}
//			}
			//조회
			//이름을 입력하세요 : 아메리카노
			//0번 메뉴 아메리카노 1000시원해요
			//해당메뉴가 목록에 존재하지 않스빈다.
//			System.out.print("조회할 메뉴의 이름을 입력하세요 : ");
//			String tName = sc.next();
//			for(int i = 0; i < menuArr.length; i++) {
//				System.out.print("해당메뉴가 목록에 없습니다.");
//				break;
//			}else if (menuArr[i].getName().equals(tName)) {
//				System.out.print(i  + "\t" +  menuArr[i].toString());
//				break;
//			}else if (i == (menuArr.length -1)) {
///			System.out.print("해당메뉴가 목록에 존재하지 않습니다.");
//			}
			
			//수정할 정보를 입력하세요 : (이름,가격,설명)
			//새로운 oo 을 입력하셍요 :ㅇㅇㅇ
			//sdlectMenu이용해 해당정보 수정 후 아래와 같이 출력
			//아메리카노 1000 시원해요
			Product selectMenu;
			int num;
			System.out.print("수정할 메뉴의 번호를 입력하세요 : ");
			num = sc.nextInt();
			
			selectMenu = menuArr[num];
			if (selectMenu ==  null) {
				System.out.print("해당 번호의 메뉴가 존재하지 ㅇ않습니다. ");
			} else {
				System.out.print("수정할 정보를 입력하세요. : ");
				num = sc.nextInt();
				switch(sc.next()) {
				case "이름" :
					System.out.print("새로운이름입력 : ");
					selectMenu.setName(sc.next());
					break;
				case "가격" :
					System.out.print("새로운가격입력 : ");
					selectMenu.setPricee(sc.nextInt());
					break;
				case "설명" :
					System.out.print("새로운가격입력 : ");
					selectMenu.setDesciption(sc.next());
					break;
					default : 
						System.out.print("잘못입력하셧습니다 ");
				}
			}
			
}
}

