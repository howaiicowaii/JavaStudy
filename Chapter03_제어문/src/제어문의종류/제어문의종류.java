package 제어문의종류;
//  54p
/*
 *    변수 => 저장(데이터)
 *    연산자 => 결과값 , 사용처 , 형식
 *    제어문 => 흐름 (동작) , 사용처 , 형식 
 *    1. 제어문의 종류 
 *        *** 제어문은 무조건 1개의 문장만 수행할 수 있다 
 *            if(조건문)
 *             문장 1 ====> 제어 
 *             문장 2 ====> 일반 문장 
 *             
 *           if(조건문)
 *           {     ==>  {} 블록 습관화 하기 
 *           		문장 1
 *          		문장 2
 *           }
 *    	   = 조건문 
 *           = 단일 조건문 
 *               형식)
 *                      if(조건문) => 조건문 (비교연산자 , 논리연산자 , 부정연산자)
 *                      {
 *                       	 조건문이 true일 경우에 수행할 문
 *                      }
 *                      => 명령문을 제어한다 => 수행 , 수행(X) 
 *                      => 단점 : 속도가 느리다 (단일 조건문 여러개 사용시) 
 *                      => 1개가 독립문장이기 때문에 
 *                      => 중복이 있는 경우에 사용하면 좋다 
 *                             ex) 1~100까지 중에 3,5,7의 배수 찾을 때 
 *           = 선택 조건문 : true와 false를 나눠서 작업
 *                  ==> 삼항연산자 
 *           	    if(조건문)
 *           		{
 *            			조건문이 true일때  
 *            		}
 *            		else
 *            		{
 *            			조건문이 false일때 
 *            		}
 *           = 다중 조건문 : 한번만 수행할때 주로 사용  (하나 수행하고 빠져나간다) ex) 키보드 입력 
 *                 => 계산기 : + , - , * , / 
 *                 if(조건문)
 *                 {
 *                 	조건문이 true면 수행하는 문장 ==> 수행하면 종료 
 *                 	false면 아래 else if(조건문) 으로 넘어간다
 *                 }
 *                 else if(조건문)
 *                 {
 *                 	조건문이 true면 수행하는 문장 ==> 수행하면 종료 
 *                 	false면 아래 else if(조건문) 으로 넘어간다
 *                 }
 *                 else if(조건문)
 *                 {
 *                 	조건문이 true면 수행하는 문장 ==> 수행하면 종료 
 *                 	false면 아래 else if(조건문) 으로 넘어간다
 *                 }
 *                 else
 *                 {
 *                 	// 생략이 가능 
 *                  	해당 조건이 없는 경우 처리하는 문장 
 *                 }
 *                 
 *                 ex)
 *                 int score = 80;
 *                 if(score >= 90)
 *                    A
 *                 if(score >= 80)
 *                    B
 *                 if(score >= 70)
 *                    C
 *                 if(score >= 60)
 *                    D
 *                 if(score < 60)
 *                    F
 *                    ==> 이렇게 작성하면 B-C-D 과정에서 못 빠져나가 결과값이 D 로 출력 
 *                    
 *                 int a = 15;
 *                 if(a%3==0)
 *                 else if(a%5==0)
 *                 else if(a%7==0)
 *                 ===> 이 경우 3의 배수와 5의 배수가 중복되기 때문에 다중조건문을 쓰면 안된다 
 *                            a%3==0 이 true 이기 때문에 바로 나와버린다 
 *                 ==>if(a%3==0)
 *                         if(a%5==0)... => 이 경우 이렇게 써야 된다  
 *                 
 *        = 선택문
 *        = 반복문 
 *        = 반복제어문 
 */
// 단일 조건문 : 조건식 (비교연산자 , 논리연산자 , 부정연산자)
// 1. 정수 한개를 입력받아서 짝수 / 홀수 

import java.util.Scanner;

public class 제어문의종류 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Scanner 는 클래스 => 키보드로 입력해서 저장 => 엔터치면 메모리에 저장 
		/* 
		 *   기능 (메소드)
		 *   정수 : nextInt();
		 *   문자열 : next();
		 *   실수 : nextDouble();
		 *   논리형 : nextBoolean(); 
		 *   문자는 X  ==> System.in => 정
		 *   웹/윈도우 (char(X)) 
		 */
		// Scanner 클래스 저장 => 클래스를 저장 할 때는 앞에 (new)
		Scanner scan = new Scanner(System.in);
		// System.in / System.out  => 자바 표준 입출력 
		System.out.print("정수 입력 : ");
		int num = scan.nextInt();
		// 여기서부터 가공 과정 
		if(num%2==0) 
		{
				System.out.println(num+"는(은) 짝수입니다");
		}
		if(num%2==1) // (num%2 != 0)  or !(num%2==0)
		{
				System.out.println(num+"는(은) 홀수입니다");
		}
	}

}
