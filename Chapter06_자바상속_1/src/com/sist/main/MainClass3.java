package com.sist.main;
/*
	=> 객체 지향의 3대 특성 
	   -------
	     데이터 손실 방지 : 캡슐화 (변수 : private => 은닉화: 가장(보이지 않는다) , 기능 => 처리 )
	                          --- 저장 / 읽기 => Getter/Setter 메소드로 만들어 기능
	                          --- HTML
	     재사용 : 상속 / 포함 (***)
	     수정 / 추가 : 유지 보수 
	     --------- 다형성 ( 오버라이딩:변경 / 오버로딩:추가 )
	     
	   상속 : 재사용이 목적 
	   --- 상위 클래스 : 상속을 내리는 클래스 => 공통적으로 사용하는 내용(변수,메소드)
	       하위 클래스 : 상속을 받은 클래스 => 재사용 => 확장 (extends)
	       -------- 하위 클래스 (확장)
	         | 여러개의 하위 클래스를 묶어서 사용 => 상위 클래스를 이용 
	         | 단일 상속 , 키워드 (extends)
	       --> 있는 그대로 사용 (변경이 없이) => 포함 (포함을 상속보다 더 자주 사용한다)
	       class Window
	       {
	       	JFrame fr = new JFrame(); =>***더 자주 사용 // 포함은 오버라이딩이 안된다
	       								             -> 오버라이딩 자주 사용안한다
	       }
	       --> 변경해서 사용 => 상속 
	       class Winddow extends JFrame
	       => new를 이용하지 않아도 메모리 할당이 가능 (리플렉션)
	       
	   사용법 
	     class A
	     class C
	     class B extends A
	     class B extends A,C => 오류 -> 다중상속 (C언어,React에서는 가능)
	     ---------------------------------------------------------
	     class A  ( 위 오류난 거를 단일상속으로 사용하려면 )
	     class C extends A => A,C 기능 
	     class B extends C => A,C,B 기능 
	     => 상속을 받은 클래스가 메모리는 크다 
	     => 클래스의 크기는 위로 올라갈수록 크다 (범위) => 공통 기반 , 구체화 
	     
	         생물
	          |
	       -------
	       |     |
	      동물   식물 
	       |     |
	    -------------
	    |   |   |   |
     포유류 양서류 ...
       |
   ---------
   |   |   |
  인간  소  개 
  ---
   |
  -----
  |   |
  남자 여자 
  |    |
 홍길동 심청이  => 상속 (위로 올라갈수록 커진다)
 
    class A
    class B extends A ==> A > B ==> is-a(상속)
    
    class A
    class B
    {
    	A a=new A() (포함)  ==> B > A ==> has-a(포함)
    }
    
    상속 => static : 상속은 없다 => 공통 사용이 가능
           private : 상속은 가능 => 접근이 불가능 
          ---------
           생성자
           초기화 블록  ==> 예외
          ---------
    ==> 메모리 할당 
        여러개를 묶어서 사용 => 상위 클래스로 메모리 할당 
        확장된 클래스로 메모리 할당 
        ----------
        class A
        class B extends A
        
        => B b=new B() => 기본 
        -------------------
        class A
        class B extends A => B, A
        class C extends A => C, A
        class D extends A => D, A
        class E extends A => E, A
        
	       
*/
public class MainClass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
