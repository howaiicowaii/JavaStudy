/*
	Math : 수학 
	  => Math.random() ==> java.util.Random()
	                       Random r=new Random();
	                       r.nextInt(100) => 0~99 
	     | Math => final 클래스 => 변경이 불가능
	               있는 그대로 사용 
	               모든 메소드가 static 이다 
	               => Math 는 객체 생성을 하지 않는다
	  => Math.ceil() : 웹에서 가장 많이 사용 
	                   ----------------
	                    | 페이징 => 무한 스크롤 도 페이지를 나눈다 
	                      ---- 총페이지 구할 때 쓰는 메소드 => ceil()
	     => 올림 메소드 
	        172/10.0 ==> 17.2 ==> 18p ==> 2
	        => 배열보다는 컬렉션이 필요(가변형)
	     => Math 는 리턴형 => 대부분 double
	System
	------
	  System.out.println() => 웹 => 확인 
	     정상적으로 사용자가 데이터를 보냈는지 확인할 때 많이 사용 
	     순서 => 동작  
	     에러 => 처리 
	  System.gc() : 메모리 해제 요청 , 웹서버(톰캣)
	  System.exit() : 프로그램 종료 ==> 윈도우  
    -------- 
     *** String / StringBuffer / Wrapper 클래스Long,Double,Byte...)
     데이터형 ==> 문자열로 변경할 줄 알아야 한다 
     문자열 ==> 다른 데이터형으로 변경할 줄 알아야 한(Integer,다 
     ------
     => 2진법 , 8진법 , 16진법
        ------------------- 10진법 ==> Wrapper 클래스 
*/
import java.util.*;
public class MainClass_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner sc=new Scanner(System.in);
//		System.out.print("총 갯수:");
//		int total=sc.nextInt();
//		
//		// ==> 10개씩 나눠서 출력 ==> 총페이지 
//		// 이전  1/10  다음 
//		int page=(int)Math.ceil(total/10.0); // ceil 은 double 형 이기에 형변환
//		// SELECT CEIL(COUNT(*)/10.0) FROM recipe;
//		System.out.println("총페이지:"+page);
		
		int a=10;
		System.out.println(Integer.toBinaryString(a)); // Wrapper 클래스들
		System.out.println(Integer.toOctalString(a));
		System.out.println(Integer.toHexString(a));
	}

}
