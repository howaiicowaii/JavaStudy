package com.sist.exception;
// 예외처리의 기본 267p
/*
	가장 많이 사용된다 => 예외복구 
	try ~ catch => 예외복구
	1) 형식 
	   try
	   {
	      에러없이 실행이 가능한 소스 
	      // main ==> 정상수행하는 문장 => but 개발자 실수 or 사용자의 잘못된 입력
	   }catch(Exception ex) // Exception => 모든 에러 다 잡을 수 있는 
	   {
	      예외복구 ==> 다시 입력 요청 or 다음 문장으로 넘어가기
	   } ==> catch 는 예상되는 예외를 따로 처리 => 여러개 사용이 가능 (= 다중 catch)
	   
	2) 동작 흐름 
	
	   문장 1
	   문장 2
	   try ==> 전체 or 부분 사용 가능  => 에러가 발생할 수 있는 부분 
	   {
	      문장 3
	      문장 4
	      문장 5
	   }catch(Exception e) // 에러났을 때 처리되는 부분 
	   {
	   	  문장 6
	   }
	   문장 7
	   문장 8
	   
	   => 문장 1 => 문장 2 => 문장 3 => 문장 4 => 문장 5
	   => 문장 7 => 문장 8 // 에러가 없는 경우 순서 
	   --------------------------------------------------
	   문장 1
	   문장 2
	   try ==> 전체 or 부분 사용 가능  => 에러가 발생할 수 있는 부분 
	   {
	      문장 3
	      문장 4 ==> int a=10/0; => 에러 발생 ==> catch 로 이동 
	      문장 5
	   }catch(Exception e) // 에러났을 때 처리되는 부분 
	   {
	   	  문장 6
	   }
	   문장 7
	   문장 8
	   
	   => 1 => 2 => 3 => 6 => 7 => 8
	   ---------------------------------------------------
	   문장 1
	   문장 2 ==> 에러 발생 
	   try ==> 전체 or 부분 사용 가능  => 에러가 발생할 수 있는 부분 
	   {
	      문장 3
	      문장 4  == 에러발생? ==> catch 로 이동 (try 블록 안에서 밑의 문장들은 건너뛴다)
	      문장 5
	   }catch(Exception e) // 에러났을 때 처리되는 부분 
	   {
	   	  문장 6 ==> 복구 => 문장 3번으로 이동 
	   }
	   문장 7
	   문장 8
	   
	   1 => 프로그램 종료 (= 비정상 종료) 
	   
	   try ==> 정상으로 수행하는 문장
	          => 개발자의 실수 or 사용자의 잘못된 입력값 : 에러발생 
	                                              ------
	                                              | 종료 => 종료방지를 위해 catch
	                                              
       *** 수행문장에 이상이 없는 경우 (에러가 없는 경우)
           try { 소스 }
       *** 수행문장에 이상이 있는 경우 (에러가 있는 경우)
                   --------- 무시 = catch
*/
public class MainClass_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("문장1");
		System.out.println("문장2"); // 만약 여기서 에러 발생하면 1 수행하고 비정상 종료
		try
		{
			System.out.println("문장3");
			System.out.println(10/0); // 에러발생 => 4,5 건너뛰고 6으로 
			System.out.println("문장5");
		}catch(Exception ex) {
			System.out.println("문장6");
		}
		System.out.println("문장7");
		System.out.println("문장8==정상종료");
	}

}
