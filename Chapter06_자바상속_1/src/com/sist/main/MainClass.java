package com.sist.main;
/*
	1. 객체 지향 프로그램 
	   1) 데이터 보호 : 캡슐화 
	      => 데이터를 은닉화 => 메소드를 통해서 접근 
	         -----------    ---------------
	          private        Getter/Setter (읽기/쓰기)
	   2) 재사용 기법
	      = 반복 제거
	      = 상속(is-a) / 포함(has-a) => 클래스 크기 비교 (상속,포함이 있어야 가능)
	      = 이미 사용중에 있다 (신뢰성이 뛰어나다)
	      => 재사용(= 상속,포함 클래스가 포함된다), 가독성 (메소드로 구현), 견고성(예외처리)
	      => 기본 문법 (~8장) => 9장~ : 조립식(라이브러리 이용)
	      => 프로그램 짜기 (네트워크 프로그램, 데이터베이스 프로그램) 
	   3) 자바의 상속 (194p)
	      = 재사용 목적으로 사용한다 (기존의 만들어진 클래스를 확장해서 사용하는 것)
	        -------- 상속 (재사용, 기능 변경해서 사용)
	                 -------------------------
	                  ㄴ 라이브러리를 상속해서 처리하는 경우가 많다
	      = 필요시에는 변경해서 사용 / 있는 그대로 사용 | (2가지 방식)
	        ------------------   ------------
	            ㄴ 상속              ㄴ 포함 
	      = 2가지 다 반복 코딩을 제거할 수 있다
	      ex) 
	         윈도우 => 변경해서 사용 / 있는 그대로 사용
	         public class Login extends JFrame // 상속클래스 
	                            ------- 상속
	         public class Login
	         {
	         	JFrame fr = new JFrame(); // 포함 클래스 
	         }
	         
	         => 상속 특징 
	            = 한개만 상속이 가능 (단일 상속) (자바는 다중 상속이 안된다)
	            = 형식 
	              A extends B => B가 가지고 있는 모든 것을 가지고 온다
	                             => 멤버변수, 공유변수, 메소드, 생성자, 초기화 블록
	                                ------         ------
	                                이렇게 2가지만 상속이 들어온다
	                             => 상속의 예외 조건 
	                                1) 생성자 
	                                2) 초기화 블록 
	                                3) static => 상속이 아니라 공유할 수 있다
	                                4) 멤버변수 => 상속은 된다, 접근이 불가능한 게 있다
	                                             private
	                             => 필요한 기능만 설정 
	                            멤버변수를 사용하려면 => private 대신 => protected
	                                               -------------------------
	                             => 메소드의 기능을 변경해서 사용할 때 
	                                => 오버라이딩 
	                                => 속도(최적화) => 가급적이면 상속해서 사용하지 않는다
	                                상속 
	                                class A
	                                class B extends A
	                                
	                       B b=new B(); => A클래스 메모리 할당 => B클래스 메모리 할당
	                                       ---------------------------------
	                       => Spring 에서는 상속 개념이 거의 없다 (메모리 할당 과하다)
	                          (일반클래스로 사용 => 처리)
	                           ------------ POJO
	                       => 자바의 모든 클래스 
	                               ---------
	                               | 라이브러리/사용자 정의 클래스 => Object클래스로부터 상속을 받는다
	                               | class A extends Object 
	                                         -------------- 생략이 가능 => Object가 가지고 있는 모든 기능을 사용할 수 있다
	              -               -
	           하위클래스         상위클래스
	                 
	              상속내리는 클래스 : 상위클래스 , 슈퍼클래스 , 베이스클래스 , 부모클래스 
	              상속을 받는 클래스 : 하위클래스 , 서브클래스 , 파생클래스 , 자식클래스
	              
	         상속 : 기존에 만들어진 클래스를 확장해서 새로운 클래스를 만들어서 사용 
	                                 ---- extends
	         ex)
	            class 게시판 
	            {
	            	글쓰기
	            	목록 출력 
	            	상세보기
	            	수정 
	            	삭제 
	            	검색 
	            }
	            // 확장 
	            class 갤러리게시판 extends 게시판
	            {
	            	글쓰기 ====> 변경 ==> 이미지 업로드 
	            	목록 출력 => 변경  ==> 이미지 출력
	            	상세보기
	            	수정 
	            	삭제 
	            	검색 
	            }
	            class 답변형게시판 extends 게시판 
	            {
	            	글쓰기
	            	목록 출력 
	            	상세보기
	            	수정 
	            	삭제 
	            	검색 
	            	==> 추가 : 답변 
	            }
	            
	            => Music 
	               지니뮤직 ==> 상속 ==> 멜론 
	               CGV    ==> 상속 ==> 롯데시네마 , 메가박스 
	               상속을 받는 경우 => 변경 / 다른 기능 추가 
	                               -----------------
	                                | 오버라이딩   | 오버로딩  ==> 다형성 
	               *** 객체 지향의 3대 특성 
	                   캡슐화 / 상속,포함을 통한 재사용 / 오버라이딩, 오버로딩 (다형성)
	                   ----       ---          (상속이 있어야 오버라이딩 할 수 있다)
	                           |
	                       클래스 상속보다는 인터페이스 상속을 더 자주 사용한다
	                                    ------------ 
	                   => 필수는 아니다 (=권장사항)
	                   
	         동물 
	          | 
	         인간 
	         
	         class 동물 
	         class 인간 extends 동물 
	         ----- 데이터형 (사용자 정의)
	                | 인간, 동물 데이터형도 포함 (데이터형이 2개)
	         형식)
	             동물 a=new 인간();
	             인간 b=new 인간();
	         *** 상속 
	             서로 다른 클래스 여러개를 모아서 관리 (동물 - 개,말,돼지...)
	             ----------------------------
	              | 프로그램 
	                ------
	                 | 통합 
	                   int a,b~a => 26개 변수 
	                   int[] alpha => 1개 배열 (같은 데이터형을 모은다) 
	                   => 한개의 이름으로 제어할 때가 가장 잘 짠 프로그램이다
	                   => 다른 데이터형을 모으는 것 => 클래스 
	                   => 메소드 (명령문의 집합)
	                   => 상속 => 클래스 여러개를 모아주는 것
	
	      
*/
class Super
{
	int a,b;
	void display() {}
}
class Sub extends Super
{
//	int a,b;
//	void display() {} ==> 상속을 내리면 보이진 않지만 그대로 들어온다
	public void aaa()
	{
		System.out.println("a="+a);
		System.out.println("b="+b);
		display();
	}
}
public class MainClass {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
