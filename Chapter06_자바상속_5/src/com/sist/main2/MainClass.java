package com.sist.main2;
class Movie{
	// 공통성
	/*
		예약을 한다
		영화목록을 보여준다
		상세보기
		영화 추천 
	*/
	void reserve() {
		System.out.println("예약을 한다");
	}
	void list() {
		System.out.println("영화 목록을 보여준디");
	}
	void detal()
	{
		System.out.println("영화 상세보기를 한다");
	}
	void recommand()
	{
		System.out.println("영화 추천기능 수행");
	}
}
class CGV extends Movie{

	// 기능 추가 도 가능하다 
	// 상위 클래스인 Movie 로 접근이 아니라 CGV로 접근한다 
	@Override
	public void reserve() { // 접근지정어도 수정 가능 
		// TODO Auto-generated method stub
		System.out.println("CGV 예약"); // 수정 
	} // 원하는 부분만 수정해서 사용할 수 있다. 나머지는 상위클래스 따라 그대로
	
}
class MegaBox extends Movie{

	@Override
	void reserve() {
		// TODO Auto-generated method stub
		System.out.println("MegaBox 예약");
	}
	// 확장 => Movie 가 가지고 있는 메소드 외에 다른 기능 추가 
	public void print() // 상위클래스 Movie 는 갖고있지 않은 메소드이다
	{
		System.out.println("MegaBox:print() Call...");
	}
	
}
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CGV c = new CGV();
		c.reserve();
		MegaBox m = new MegaBox();
		m.reserve();
		
		// 한개의 객체만 생성 => 상위클래스 
		// 상속을 받는 목적 => 관련된 클래스를 묶어서 한개의 객체이용 
		Movie mm=new CGV(); // Movie 안에 있는 메소드만 호출 가능
		                    // 오버라이딩(덮어쓰기) => 메소드는 CGV 껄로 덮어 써진다
		                    //                    변수는 Movie 꺼 그대로 사용
		mm.reserve(); // 
		// 생성자와 클래스가 다른 경우 => 오버라이딩된 메소드 호출 
		mm=new MegaBox(); // mm은 print()를 호출할 수 없다
		mm.reserve();
		// mm.print() => 불가능. Movie 에는 print() 메소드가 없기 때문.
		
		/*
			생성자와 클래스명이 다른 경우 
			Movie m=new CGV()
			-----       ----- 
			m을 통해 접근시에 => Movie 안에 있는 메소드와 멤버변수에만 접근 가능
			class Movie 
			{
				int a=100;
				void print(){movie}
			} 
			class CGV extends Movie
			{
				int b;
				void aaa(){}
				------------
				int a=1000;  ==> 멤버변수 오버라이딩 (고쳐쓸 수 있다)
				void print(){cgv} => 메소드 오버라이딩 (고쳐쓸 수 있다)
				------------ => 보이지는 않지만 메모리상에는 존재 (상속받았기 때문)
			}
			
			Movie m=new CGV();
			        ---------
			         ㄴ 주소 변경 
			m ==> a, print() => 메소드는 CGV 의 메소드를 호출 
			m.a => 100 
			m.print() => print(){cgv}
			
			1) 변수 => 클래스명 
			2) 메소드 => 생성자
			
			==> 클래스 100개 
			==> 분리 작업할 것인지
			==> 한개의 객체로 제어할 것인지 ==> Object 로 모아서 처리
			==> 배열
			Object[] obj={10,"aaa",1.5,'A',new Movie()}; // 가능
		*/
//		Object o=10;
//		int i=(int)o;
		
		Object o=new CGV();
		
		CGV cc=(CGV)o; // 객체 형변환
		
		// 자바에서 => 클래스 객체를 리턴하는 메소드가 많이 존재 
		//          -------------- Object 
	}

}
