package com.sist.main;
/*
	7장 정리 
	--------- JSP, Spring, Spring-Boot => 기반이 자바 => 1차 프로젝트 
	          => HTML/CSS/JavaScript 
	          => 데이터 저장 => 오라클 / MySQL 
	         ---------------------------- 데이터 분석까지 (파이썬) => K-디지털 과정
	추상클래스보다는 인터페이스의 비중이 더 높다 
	
	*** 인터페이스는 같은 기능을 가지는 클래스를 만들어서 제어
	             -------- 강제화
	   interface I
	   {
	      void aaa();
	      void bbb();
	      void ccc();
	       default void ddd(){} // 필요한 곳에서만 구현하게 만든다
	       default void eee(){}
	       default void kkk(){} // 필요한 곳에서 알아서 오버라이딩
	   }
	   class A implements I
	   {
	      void aaa(){} // = 강제로 구현해야한다 
	      void bbb(){}
	      void ccc(){}
	       void ddd(){}
	   }
	   class B
	   {
	      void aaa(){}
	      void bbb(){}
	      void ccc(){}
	       void eee(){}
	   }
	   class C
	   {
	      void aaa(){}
	      void bbb(){}
	      void ccc(){}
	       void kkk(){}
	   }
	   ddd(),eee(),kkk() => 인터페이스로 관리할 수 없다
	   I i=new A() => i를 가지고 A가 가지고 있는 메소드를 제어 
	     => 접근을 할 수 없는 메소드가 존재
	     aaa(), bbb(), ccc() => ddd() 는 접근 불가능
	   I i=new B() => i를 가지고 B가 가지고 있는 메소드를 제어
	   I i=new C() => i를 가지고 C가 가지고 있는 메소드를 제어 
	   ===> A,B,C가 유형이 같은 경우 한개의 이름으로 제어하는 게 편하다
	   인터페이스 목적 => 서로 다른 클래스를 묶어서 관리 
	                  ------------ 관련 
	               => 관리하기 편하다(소스 코딩이 간결)
	               => 인터페이스의 메소드 동일 
	               ex)
	                       DriverManager (= 인터페이스)
	                          | ( DB들 전부 한번에 제어 가능 ) 
	             ----------------------------------- 
	              |     |     |    |     |      |
	        DB : 오라클 MySQL MSSQL DB2 SQLITE 사이베이스...
	          VARCHAR2 VARCHAR
	          CLOB     TEXT
	             => SQL => ANSI(표준화)
	             
	             컬렉션 (CRUD)
	             Collection
	                | 
	          ---------------
	          |
	         List
	          |
	       ---------------------------------
	       |        |       |         |    |
	   ArrayList  Vector LinkedList Stack Queue
	   
	1) 인터페이스 VS 추상클래스 
	   -------------------------------------------------------------
	             인터페이스                    추상클래스
	   -------------------------------------------------------------
	    구현메소드  선언된 메소드              선언된 메소드 / 구현 메소드
	           public void display();
	           1.8버전 부터)
	             구현된 메소드 사용 가능
	             = default 
	               (접근지정어가 아니다)
	               (구현된 메소드라는 걸
	               구분하기 위해 default)
	           (인터페이스는 전부 public)
	             = static 
	              => 접근시에 반드시 인터페이스명으로만
	                 접근이 가능
	             
	   --------------------------------------------------------------
	    인스턴스변수  사용할 수 없다               사용 가능 
	               => 공용이기 때문              private 변수 가능
	               => 상수형 변수만 사용 가능
	               => public 만 사용 가능(only) 
	                  (없으면 자동 추가)
	   --------------------------------------------------------------
	    생성자       생성자가 없다                생성자가 있다
	   --------------------------------------------------------------
	    접근범위      모든 내용을 공개             한정한다 (모든 접근지정어 사용)
	                => 변수, 메소드 
	                = public 만 사용
	   --------------------------------------------------------------
	    상속         다중 상속 가능               단일 상속 
	                implements                extends
	              interface ==> interface
	                      extends
	              interface ==> class 
	                     implements
	              => 사용자 정의,라이브러리 
	                => 단일 상속이 중심이다
	              => 윈도우 : 여러개 받는 경우가 있다
	   --------------------------------------------------------------
	   ** 공통점 : new 를 이용해서 메모리 할당이 불가능하다 ( 익명의 클래스로 가능은 하지만 비효율 )
	             => 상속을 내려서 상속받은 클래스가 구현해서 사용하게 만든다
	   ** 목적 : 서로 다른 클래스를 연결해서 사용이 가능
	            관련된 클래스를 모아서 사용할 때 주로 사용
	   ** 실생활 
	      => 110V => 220V => 어댑터 (= 인터페이스)
	      => 컴퓨터 : 마우스, 키보드 
	         업체가 여러개
	         ----------
	          MS => 인터페이스 전송
	   --------------------------------------------------------------
	    인터페이스의 구성요소 
	    public interface interface 명 
	    {
	       ------------------------
	        상수 : 반드시 초기값 설정 (명시적으로 설정) 
	        int a=10; (명시적 초기화)
	        (public static final) int a=10;
	         => 생략이 되면 접근지정어 / 제어어를 자동 추가 
	       ------------------------
	        구현이 안된 메소드 : 프로그램에 맞게 구현 
	        => 개발자가 알아서 구현 
	        (public abstract) void display();
	        ----------------- 생략 가능 
	       ------------------------
	        구현이 된 메소드
	        => 공통으로 사용되는 부분 
	          => 필요시마다 변경해서 사용
	          (public) default void method(){}
	                   ------- 접근지정어가 아니다. 구현된 메소드라는 걸 구분하기 위한 것
	          (public) static void method(){}
	          ==> 인터페이스명.메소드명()
	              -----------------
	       ------------------------
	    }
	    *** 만약에 기능 추가가 있는 경우에는 default 를 이용한다 ( not 접근지정어 )
	                                 -------
*/
import java.util.*;
interface I
{
	// public 은 생략하면 => 컴파일러가 자동 추가 cuz 인터페이스의 접근지정어는 모두 public
	public static void display()
	{
		System.out.println("I:display() Call...");
	}
}
class A 
{
	public static void aaa()
	{
		System.out.println("A:aaa() Call...");
	}
}
class B extends A
//       상속 
{
	public void bbb()
	{
		aaa(); // 호출 가능 
		A.aaa(); // 호출 가능 (A 가 static 이기 때문)
	}
}
class C implements I
//       구현(상속) ==> class(단일 상속), interface(다중 상속)
{
	public void ccc()
	{
//		display();
		I.display(); // 인터페이스의 static 메소드는 인터페이스 이름으로만 접근이 가능
	}
}
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		List list=new ArrayList();
//		list.add("aaa");
//		list.add("bbb");
		
	}

}
