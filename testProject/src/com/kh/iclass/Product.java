package com.kh.iclass;

//접근지정자 - class - 클레스이름 { 여기안에는 설계정보 (안에 필드 / 매서드넣기 } 
class Product{
		//필드 (데이터영역 : 내가 필요한 데이터 적어주기) 
	 	//변수를 필요한 만큼 생성한다. 메인문에서 쓰다가 더 추가로 써줘도 가능
/*	 	private String name;
	 	private int  price;
	 	private int  count;      //필드변수에는 private 필수로 앞에 넣어주어야합니다.
	 	private int  totalprice;
	 	private String  hu;
	 	
		// 매서드 (기능영역 내가 필요한 데이터를 적어준걸 기반으로 기능을 넣어주기)
	 	
	 	//매서드 작성방법
	 	//생성자 => 데이터 필드를 초기화 시키기 위해 생성시에 한번만 호출 되는 특수한 매서드
	 	//생성자는 class와 이름이 똑같은 매서드로 반환형(ex void등등)을 가지고 있지 않다. 그냥 클레스명이랑 똑같이
	 	// 개발자가 직접 만들어주지 않으면 기본 생성자는 내부적으로 컴파일러가 만들어준다
//	 	public Product() {
//	 		
//	 	}
	 	//매개변수에 개수나 타입에 따라 여러개를 생성 할 수 있다.
	 	// 단 생성자(Product)를 직접 적어주면 기본생성자는 자동생성되지 않는다.

	public Product(String hu, String name, int price, int count) {
	 		this.hu = hu;
			this.name = name;
	 		this.price = price;
	 		this.count = count;
	 		
	 	} //this는 클래스 안에서 뭐뭐를찾는다.
		 	
	public Product() {
		
	}
	 	//네임값을 세팅하는 기능

	public void setHu(String hu) {
		this.hu = hu;
	}
	
		public void setName(String name) {
			this.name = name;
		}
		
		public void setPrice(int price) {
			if (price < 0 )
				this.price = 0;
			else
			this.price = price;
		}
		public void setCount(int count) {
			if (count < 0 )
				this.count = 0;
			else
			this.count = count;
		}
		//제품가격에 특정값을 매개변수로 넘겨받아서 합한값을리턴
		//접근 제한자 -반환자료형 -매서드이름 (매개변수) {		실행할 코드 	 }
		public int addprice(int plusPrice) {
			int sum = this.price + plusPrice;
			 return sum; 
		} 
		
		//네임값을 가지고 오는 기능
		//접근 제한자 반환자료형 매서드이름 (매개변수) {		실행할 코드 	 }
		public String getHu() {
			return this.hu;
		}
		
		public String getName() {
			 return this.name;
		}
		
		public int getPrice () {
			 return  this.price;
		}
		public int getCount () {
			 return  this.count;
		}

		public void productInfo() {
			System.out.println("주문자: "+getHu()+ getName()+ " 잔당 " +getPrice() + " 원에 " + getCount()+ " 잔 팝니다." );
		}
		
		//제품 가격 두개를 매개변수로 넘겨받아서 합한 값을 리턴헤주는 매서드
		//매서드이름  totalPrice
		
		*/
		
	//필드
	//필요한데이터의변수나열
		private String name;
		private int price;
		private int count;
		private String description;
		
		private final int MAX_COUNT = 50;
		
		//생성자
		//접근제한자 클레스이름(매개변수){}
		public Product(String name, int price,  /* int count,*/ String desciption) {
			this.name = name == null ? "이름없음" : name;
			this.price = price < 0 ? 0 : price; //price가 0보다 작으면 0을 넣어주고 작지않으면price에넣기
			this.count = this.MAX_COUNT;
			this.description = description == null ? "이름없음" : description;
			//this.--- = --- : 내클레스안에서 뭘찾아오겠다.
		}
		
		//3가지 getter(필드값데이터반환) , setter(데이터값대입), toString(모든데이터String반환)
		public String getName()
		{			return this.name;		}
		
		public int getPrice()
		{			
			return this. price;		}
		
		public String getDesciption()
		{			
			return this.description;		}
		
	
		//setter(데이터값대입)
		public void setName(String name) {
			this.name = name == null ? "이름없음 ": name ;
		}	
		
		public void setPricee(int price) {
			this.price = price <0 ? 0 : price;
		}
		public void setDesciption(String description) {
			this.description = description == null ? "-" : description;
		}
		public String toString() {
			String str = this.name + "\t" + this.price + "\n" + this.description;
			return str;
		}
		
}