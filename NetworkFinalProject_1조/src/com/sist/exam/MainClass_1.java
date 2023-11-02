package com.sist.exam;
/*
	Thread 
	------ 모든 프로그램에 한개 이상 존재한다
	           ------ 프로세스
	       => 프로그램 안에서 여러개의 프로그램을 동시에 수행 
	       => main 메소드 => Thread
     => 서버에는 반드시 쓰레드를 필요로 한다
        --- 여러명이 접근시에 통신부분을 따로 수행 
        --- 클라이언트 <==> 쓰레드 : 멀티쓰레드(멀티쓰레드가 없으면 다른 사람은 대기해야한다)
     => 사용처 (사용자 정의 쓰레드)
        1. 데이터 수집 
        2. 네트워크 서버 => 서버를 여러개 수행 
        3. 게임 (비행기...) => 비행기, 총알 => 쓰레드 (따로따로 각각 수행)
        4. 웹 서버 
           ------ 아파치 / IIS. 우리는 톰캣 (테스트용 => 웹서버)
                                    => WAS (Web Application server)
        5. 데이터베이스 서버 : 오라클 (서버)
        ----- 서버는 한개만 수행 (사용자 요청에 대한 처리만 쓰레드를 사용)
     => 사용자 정의 쓰레드 
        => 서버개발자 
        => 서버측 사이드 (서버에서 동작하게 코딩) => Back-End
        => 방법 1
           쓰레드 상속  
           public class MyThread extends Thread
           {
           		Thread 확장 
           		쓰레드가 동작 
           		public void run()
           		{
           			=> 동작 => 한가지 일만 수행할 수 있게 만든다 
           		}
           }
         => 방법 2
            => 동작 (확장없이 동작만)
            인터페이스 구현 => 윈도우에 주로 사용 
            public class MyThread implements Runnable
            {
            	public void run()
            	{
            		=> 확장없이 동작만 
            	}
            }
         => 방법 3
            익명의 함수 ()=>run : 람다식 (메소드명 없이 사용 => 코딩이 간결)
               단점 : 재사용에 문제 (객체지향을 벗어난다)
               Runnable r=()->{
               		구현 
               }
	       
	        => 자바스크립트 
	           function aaa(){}
	           lit aaa=()=>{} ==+> 자바스크립트는 이걸 선호 (람타(X), 화살표함수)
	   => 쓰레드의 생명주기 (생성~소멸)
	   쓰레드 생성 
	   => Thread => java.lang 안에 
	      ***** run()은 호출하지 않는다 -> run() = start()가 자동호출 
	            start(){run()}
	   new Thread() ===> start() =========> run()
	   쓰레드 생성     ===> 대기 (쓰레드가 필요한 자원 확보) ===> 쓰레드 동작 ======> 일시정지
	                                                       |             sleep 
	                                                    쓰레드 종료 interrupt()
	   => start() => run() 수행 (자동호출)
	   => sleep() => 일시정지 
	   => interrupt() => 쓰레드 소멸 
	   => 쓰레드는 시분할 프로그램 
	             ---- 나눠서 작업 
	             
	   ex)
	      1~10 => 출력 
	      
	      => new Thread() => 1 
		     1) JVM
		        => 이름부여 ==> Thread-0 => 변경 
		        => 우선순위 ==> 사용자 정의 => 5
		           1~10 => 5
		           10 => main (가장 빠르다)
		           1 => gc
		           1~10 중 높을수록 더 빨리 처리해준다
	      => new Thread() => 1
	      => new Thread() => 1
	           
*/
class MyThread extends Thread
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(getName()+":"+i);
			try
			{
				Thread.sleep(100); // 1000분의 1초 단위. 100 => 0.1초당 멈춤
			}catch(Exception ex) {}
		}
	}
}
public class MainClass_1 {
	
	public static void main(String[] args) {
//		System.out.println(Thread.currentThread().getName());
		MyThread t1=new MyThread();
		MyThread t2=new MyThread();
		MyThread t3=new MyThread();
		
		// 동작 => run() => start() 호출하면 run() 수행 (자동호출)
		t1.start(); // Thread-0
		t2.start(); // Thread-1
		t3.start(); // Thread-2
	}
}
