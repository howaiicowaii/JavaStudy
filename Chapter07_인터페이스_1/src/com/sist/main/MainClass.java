package com.sist.main;
/*
	interface
	---------
	  => 서로 다른 클래스를 연결해서 사용 
	  => 결합성이 낮은 프로그램 짤 때 사용 (민폐 X)
	  => 개발자가 같은 메소드를 사용 => 표준화
	  => 관련된 클래스를 묶어서 한개의 이름으로 관리 
	     --------------------------------
	      Model => 형식이 동일 ==> interface 
	  => class A
	  => class B extends A
	  
	     A a=new A(); => a에 있는 변수,메소드만 호출 
	     B b=new B(); => b에 있는 변수,메소드만 호출
	     A c=new B(); => A에 있는 변수 호출,메소드는 B에 있는 메소드 호출 (오버라이딩)
	                                    ----------------------
	                                      | 오버라이드된 메소드를 사용
	                                      
	     interface I => aaa() ==> 클래스 공통으로 적용되는 메소드만 선언 
	     class A implements I
	     	aaa() bbb() => bbb() 는 I에 없기 때문에 I 로는 사용 불가능 => A a=new A() 해야 사용 가능
	     class B implements I
	     class C implements I
	     
	     I i=new A(): => i.aaa() 만 사용 가능
	     --- -------  i 에 존재하는 메소드중에 A에서 오버라이딩한 메소드 호출 
	     I i=new B();
	     I i=new C():
	     
	     상위클래스 객체명=new 하위클래스()
	     
	     => 접근 : 변수는 상위클래스에 있는 변수만
	              메소드는 상위클래스에 있는 메소드만
	                     ------------------- 오버라이딩된 것만
	     => 인터페이스 통해서 클래스에 접근
	        ------- 인터페이스에 있는 메소드만 가지고 있어야 효율적이다 
	     interface A
	     {
	         void aaa();
	         void bbb();
	     }
	     class B implements A
	     {       ----------
	         void aaa(){}
	         void bbb(){}
	         void ccc(){}
	     }
	     
	     A a=new B(); ==> 가급적이면 사용하지 않는다 => ccc() 는 버려지기 때문
	     --- => aaa(),bbb()
	     B b=new B(); =+> ccc() 접근 가능
*/
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
