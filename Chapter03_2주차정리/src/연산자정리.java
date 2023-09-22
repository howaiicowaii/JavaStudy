/*
	연산자 
	---- 
	 => 결과값 (데이터형 사용)
	 1) 피연산자 / 연산자
	    ------ 연산대상
	    
연산대상이 1개 = 단항연산자 ++a !a  (char)10
				- 증감연산자
				  -------
				     |
				   ++ , -- => 1증가 , 1감소 
				   int a=10;
				   a++; => a=a=+1
				   
				   전치 연산자 : 먼저 증가 => 다른 연산 수행
				   후치 연산자 : 다른 여산 수행 => 증가 
				   int a = 10;
				   int b = a++;
				       ---  --
				        1    2
				   int a=10;
				   int b = ++a;
				        -- --
				        2   1
				   int a=10;
				   System.out.println(a++); => 10
				   System.out.println(++a); => 11 
				   ==> 게시물 번호 ==> --a
				- 부정연산자 => boolean 사용 (조건문)
				  boolea bCheck=false;
				  !bCheck => true
				  bCheck=!bCheck
				  
				  String s="aaa";
				  s.replace('a','b') ==> "bbb"
				  s="aaa"
				- 형변환연산자 
				  --------- boolean 생략 
	    2개 = 이항연산자 a+b 
	    		- 산술연산자
	    		  + , - , * , / , %
	    		  --         --  ---
	    		  => * 는 장바구니 
	    		  => + ( 문자열 결합 )
	    		     int 이하 데이터형은 연산시 int로 변경된다
	    		     double + int = double
	    		     char + char = int
	    		  => / => 정수/정수 = 정수 
	    		     / => 0으로 나누면 오류 발생 
	    		  => % => 부호가 왼쪽부호가 남는다
	    		- 비교연산자 : 조건문 / 반복문(조건식)
	    		    == , != , < , > , <= , >= : boolean
	    		    1. 문자열은 비교할 수 없다 
	    		       equals
	    		- 논리연산자
	    	       && ||
	    	       --
	    	       (조건) && (조건)
	    	       ------------- true && true = true
	    	       => 범위 , 기간
	    	       => (조건) && (조건)
	    	          ----
	    	           false => 뒤에 있는 조건은 수행하지 않는다
	    	                 => 효율적인 연산 
	    	       ||
	    	       --
	    	        (조건) || (조건)
	    	        -------------- 둘 중 하나 true면 true
	    	        => 사용처 : 오류처리, 잘못된 입력, 범위를 벗어나는 경우 
	    	        => 앞 true가 true면 => 뒤에 있는 조건은 수행하지 않는다 
	    		- 대입연산자
	    		  = , += , -=
	    		  +=
	    		  int a=10;
	    		  a+=1; ==> a=a+1; ==> a=11;
	    		  ==> 1개증가보다 여러개 증가할 때 사용 
	    		  a+=2 a+=3 ... 
	    		  => 비행기, 총알 ...
	    3개 = 삼항연산자 (조건) ? 값1 : 값2 ==> 페이지변경 
	    	          ----
	    	          true => 값1
	    	         false => 값2
	    	  => if~else
*/
public class 연산자정리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		boolean bCheck = false;
//		bCheck = !bCheck; // 이렇게 해줘야 bCheck 이 false에서 true로 바뀐다
//		if(!bCheck)
//		{
//			System.out.println("출력:");
//			
//		}
//		System.out.println(bCheck);
		
//		byte b1=10;
//		byte b2=20;
//		byte b3=b1+b2; // int long double float 
		
//		String s="Hello";
//		String s1=new String("Hello"); 
//		if(s.equals(s1)) // !s.equals(s1) => 같지 않다 
//			System.out.println("같다");
//		else
//			System.out.println("다르다");
	}

}
