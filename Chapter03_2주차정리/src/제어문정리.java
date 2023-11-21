/*
	자바 제어문 종류 
	------------
	조건문
	  = 단일 조건문 
	    if(조건문) => true/false (부정연산자,논리연산자,비교연산자)
	    {
	    	조건이 true일때 수행하는 문장
	    }
	    => 독립적인 경우
	  = 선택 조건문 => true / false 나눠서 처리
	    ex) 로그인 => O or X , 아이디중복체크 , 검색
	    if(로그인이 되었다면)
	    {
	    	로그인된 경우 
	    }
	    else
	    {
	    	로그인이 안된 경우
	    }
	  = 다중 조건문 : 한개의 문장만 수행
	    if(조건문)
	    {
	    	조건이 true일때 수행
	    	false면 => 밑의 조건문으로 이동
	    }
	    else if(조건문)
	    {
	    }
	    else if(조건문)
	    {
	    	조건이 true일때 수행
	    	false면 => 밑의 조건문으로 이동
	    }
	    else
	    {
	    	해당 조건이 없는 경우 처리되는 문장
	    }
	    
	선택문 : 한개의 값을 선택한 경우에 처리
	        별점...
	       => 카테고리 , 메뉴 ..., 서버 프로그램
	      switch(정수,문자,문자열)
	      {
	      	case 값:
	      		처리문장;
	      	case 값:
	      		처리문장;		  
	      		break;    			
	      }
	반복문
	  for : 횟수지정 => 배열 , 컬렉션
	  				  ---------- 인덱스 번호 => 일정하게
	  				  => for문 (for-each)
	  				     for a of list (JS)
	  				     for i in (Python)
	  				     
	        => 1차     1    2    4
	        	for(초기값;조건식;증감식)
	        	{
	        		반복문장 3 
	        	}
	        => 2차 => 코딩테스트 자주 출제
	        	=> 알고리즘 (2차) => SORT, 등수구하기...
	        	      1    2    8
	        	for(초기값;조건식;증감식)
	        	{         3    4    6
	        		for(초기값;조건식;증감식)
	        		{        5
	        			반복 수행 문장
	        		}
	        		줄바꿈 7
	        	}
	반복제어문 
*/
public class 제어문정리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={1,2,3,4,5}; // 배열
		for(int a:arr) // for-each구문 => 웹 출력(목록)에서 자주 사용
		{
			System.out.println(a);
		}
	}

}
