package com.sist.main;
/*
 
 	==> 객체지향에 연연하지 말고 프로그램 짜기 
 	
< 캡슐화,재사용(상속/포함),다형성(오버라이딩,오버로딩) >
	객체지향의 3대 특성 => 문법사항이 아니다, 권장사항  
	--------------- 
	class Window extends JFrame // 재사용 => 상속 
	  => 변경 사항이 있는 경우 
	class Window
	{
		JFrame f=new JFrame() // 재사용 => 포함 => 변경사항 없는 경우
	}
	=> 웹 / 스프링 => 상속이 거의 없다  => 포함을 주로 사용 
	
	1. 캡슐화 : 데이터 보호 
	          멤버변수 는 private 로 은닉화 => 기능 설정을 통해 접근
	                                      -------
	                                      멤버변수 : 저장/읽기 
	                                      ---------------
	                                         |
	                                      getter/setter (= 캡슐화)
	          데이터를 감추고 메소드를 통해서 접근하는 방식 => 캡슐화 
	2. 상속 / 포함 (재사용) : 기존의 클래스를 재사용 
	   상속
	   ---
	   1) 목적
	      = 재사용 (신뢰성이 뛰어나다, 개발 속도가 빠르다)
	      = 유지보수를 쉽게 만든다
	      = 중복 제거  
	      = 통일성있는 코드 작성 
	      단점) 실행속도가 느리다 (자바는 느려서 요즘 게임은 어셈블러 를 사용)
	           ------ 최적화 => exe(자바엔 없다) (자바 => 웹, 모바일)
	                                               J2EE J2ME => J2SE
		  장점) 적은 양으 ㅣ코드로 새로운 클래스를 작성
		  class JFrame => 1000줄 정도
		  {
		  	---
		  	---
		  }
		  
		  class A extends JFrame
		  {
		  }
		  
		  코드를 공통적으로 관리하기 때문에 여러 코드를 추가,변경이 용이하다
		                           ------------- --- 
		                                오버로딩    오버라이딩 
	      *** 자바는 한마디로 오버라이딩 프로그램이다. => 변경 
	                                            ---
	                                            ㄴ 프레임워크 (실제 소스 제공)
	                                          스프링 => 전자정부 프레임워크
	                                               => 애니 프레임워크 
	   2) 작성방법 
	      => 확장한다 => 기존의 클래스를 확장해서 새로운 클래스 제작 
	         extends
	      => class Parent
	         class Child extends Parent
	                     -------
	      단점) 단일 상속만 가능하다 
	   3) 상속의 특징 
	      1. 생성자,초기화 블록은 상속이 안된다 
	         상속받은 클래스의 객체 생성시에 => 상속내리는 클래스가 먼저 메모리 할당을 한다
	         class A
	         {
	         	int a,b;
	         	String s;
	            ----------
	         	public A() => 클래스에 생성자가 없으면 자동 추가 
	         	{
	         	}
	         	---------- => 자동 추가 
	         }
	         
	         class B extends A
	         {
	         	int c,d;
	         	---------
	         	public B() 
	         	{
	         		super() => 자동추가. 생략가능. 상위클래스 메모리를 먼저 할당
	         	}
	         	---------- => 자동추가 
	         }
	         
	         B b=new B(); => 기본형 
	         
	          Stack => 메모리에서 처리 (할당,해제)
	        --b--
	        
	        -----     Heap => 실제 데이터 저장 (프로그래머)
	                -----------------
	                  ----super----
	                    ----a----
	                    
	                    ----b----
	                    
	                    ----s----
	                    
	                    ---------
	                  -------------
	                  
	                  ----this-----
	                   -----------
	                   
	                   -----------
	                -----------------
	   => 모든 클래스의 상위 클래스 (최상위 클래스)
	      => Object => 모든 클래스는 Object 의 상속을 받는다 
	   => private => 상속은 된다 But, 접근이 불가능 => getter/setter 메소드로 사용 
	                               ---------- protected
	   => 상속 => 상위 클래스 => super
	             --------
	          => 자신 클래스 => this
	             -------- 
	   => 상속을 내리는 클래스 : 상속받은 클래스에 접근이 불가능 => 자기 것만 사용 가능 
	                        -----------------------
	      상속을 받는 클래스 : 자신 거 + 상속 내림 받은 클래스까지 접근이 가능 
	                       this + super
	  
 (오버라이딩,오버로딩)
	3. 다형성 => 필요시에 
	   => 변경해야 된다 => 오버라이딩 
	   => 추가해서 사용 => 오버로딩 
	[접근지정어] 리턴형 메소드명(매개변수)
	--------- ----- ----- ------
	{
	
	}
    --------------------------------------------
             오버라이딩        오버로딩 => 기술면접 (100%)
    --------------------------------------------
    상태        상속        같은 클래스안에서 
          => 상속없이 오버라이딩 가능
          => 익명의 클래스  
    메소드명     동일해야한다    동일해야한다
    매개변수     동일         갯수나 데이터형이 다르다
    리턴형      동일          관계없다
    접근지정어  축소(X) 확대(O)  관계없다
        private < default < protected < public
        
        => ex)
              void aaa()
              
              => protected void aaa() => 축소는 안되지만 확대는 가능 
                 public void aaa()
              => 메소드는 다른 클래스와 연결할 때 사용 
                 ---- public 
        => Modify : 기존의 기능 변경 , New => 새로운 기능 추가 
        => 면접의 기술 = 정의를 내린다 => 부연설명
        => 객체지향 프로그램의 객체란? 
                          현실세계를 특성화시킨 것 => 추상화 => 단순화 
                          ------------ 객체는 메모리 주소
    --------------------------------------------
    상속 예외조건 => static : 공용으로 사용이 가능 (= 공용변수)
                  생성자 / 초기화 블록 
                  private : 상속은 된다 But,접근이 불가능 
    주의점)
         접근지정어 
         클래스 => [접근지정어] class 클래스명 
                  public => 다른 클래스에 메모리 할당 
         메소드 => [접근지정어] 리턴형 메소드명(매개변수)
                  public
         멤버변수 => [접근지정어] 데이터형 변수명
                  private / protected
         생성자 => [접근지정어] 클래스명()
                  public
         지역변수, 매개변수 : 접근지정어 사용 불가능
                          static 도 접근지정어 사용할 수 없다
                          => final 만 사용이 가능하다 => 상수형
         메소드
           멤버메소드 : static, 멤버변수를 사용할 수 있다 
           static 메소드 : static 만 사용할 수 있다
                  만약 => 멤버변수,멤버메소드 사용할 때는
                         반드시 객체 생성후에 사용 
           class A
           { 
              private int a;
              static int b;
              public void aaa()
              {
                 a,b,bbb()
              }
              public static void bbb()
              {
                 b => 사용이 가능 (static int b 이기 때문)
                 a,aaa() => 사용 불가능 (static메소드는 static변수만 사용 가능)
                 A aa=new A();
                 aa.a 
                 aa.aaa() 해야 사용이 가능하다 
              }
           }
         초기화 블록 : 자동 호출 
          = 인스턴스 블록 
            {
            	static,멤버변수를 초기화
            }
          = static 블록 
            static{
            	static 변수만 초기화 가능 
            }
        변수에 대한 초기화 
          1) 명시적 초기화 private int a=10;
          ------------
          2) 초기화 블록 : static 변수 초기화 
             => static 은 생성자를 호출할 필요가 없다 => 자동 메모리 할당 
          3) 생성자 : 인스턴스 변수 초기화 
             => 인스턴스는 반드시 생성자를 호출해야 저장 
             => new 생성자()
             => 시작과 동시에 처리해야하는 게 있을 때 사용 
                윈도우 => 화면 설
                웹 => 자동 로그인, 쿠키 읽기 
                일반 => 데이터베이스 연결 , 서버 연결..
          ------------ 클래스 영역은 선언만 가능 => 구현 불가능 
           구현 => 연산처리 , 제어문 , 파일 읽기 , 오라클 데이터 읽기...

*/
class A
{
	int a;
	public A()
	{
		super(); // 모든 클래스는 기본적으로 Object 에게 상속을 받는다
	}
}
class B extends A
{
	int c;

	public B() {
		super(); // 자동생성되는 부분. 생략이 가능.
	}
	
}
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
