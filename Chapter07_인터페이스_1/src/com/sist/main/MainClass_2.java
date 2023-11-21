package com.sist.main;
/*
	인터페이스
	 기본문법)
	        변수는 사용할 수 없다 (상수만 사용이 가능하다) 
	        int i; ==> 오류 
	        int i=10; ==> 생략된 것이 있다 
	        --------- public static final int i=10;
	                  ------------------- 컴파일러가 자동으로 추가 
	                  => static final int i=10;
	                     // 상수 (static final)
	                     final int i=10;
	                     // 상수형 변수 
	                     int i=10;
	                     // 변수?
	       메소드
	        구현이 안된 메소드 : 구현내용이 여러개인 경우 (선언만) 
	         (public abstract) void display(); // public abstract 자동 생략
	         public (abstract) void display();
	        구현이 된 메소드 : 공통으로 사용되는 부분 정의 
	          => 새로운 기능 추가
	        (public) default void aaa(){}
	        (public) static void bbb(){}
	     ==> 메소드나 상수를 선언하면 무조건 public 붙인다 (없으면 자동으로)
	 상속 : => 인터페이스도 클래스다 
	          -------------- 상속시 상위클래스다
	          extends
	          implements (인터페이스에게 상속 내려받을 때)
	          ---------- 상속
	 다중 상속 => , 로 구분 해서 다중 상속 사용 (인터페이스)
	 
	 interface  =====  interface
	           extends
	 interface  =====  class
	          implements 
	 class A
	 interface B
	 interface C
	 class D extends A implements B,C => 다중 상속
	 {       -------   ----------
	          확장      구현해서 사용하겠다
	 } 
	   
*/
//interface A
//{
//	/*public static final*/ int a = 0;
//	/*public abstract*/ void aaa(); // 구현이 안된 메소드
//	default void ooo() {} // 새로운 기능은 구현하고 가야지 영향을 미치지 않는다
////	          ㄴ 구현이 된 메소드 (다른 클래스에서 ooo() 기능 추가하고 싶으면 갖다 쓰면 된다)
////	                (void ooo(); 이렇게 하면 구현 안해서 오류->클래스마다 다 구현해줘야함)
//}
//class B implements A
//{
//	public void aaa() {} // interface A 에 있는 void aaa() 앞에는 public 생략
//}
interface A
{
	void aaa();
}
interface B /*extends A*/
{
	void bbb();
 // void aaa();
}
class C implements B,A
{

	@Override
	public void aaa() {
		// TODO Auto-generated method stub
		System.out.println("aaa() Call...");
	}

	@Override
	public void bbb() {
		// TODO Auto-generated method stub
		System.out.println("bbb() Call...");
	}
	
}
public class MainClass_2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		B b=new C();
//		b.aaa();
//		b.bbb(); => B 에서 extends 뺐기 때문에 오류 발생
		C c=new C(); // 이렇게 하면 aaa, bbb 다 접근 가능
		c.aaa();
		c.bbb();
		
	}

}
