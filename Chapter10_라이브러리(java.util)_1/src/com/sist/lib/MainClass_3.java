package com.sist.lib;
/*
	Random 클래스 
	
*/
import java.util.*;
/*
	Random => 임의의 수를 추출할 때 사용 
	          ------- 자바 JVM(가상머신)에서 
	          => Math.random() 로 대체가능하지만 리턴형이 double 이어서 형변환 필요 
	=> int nextInt(int bound)
	               ---------
	                 100 ==> 0~99 + 1  (=> 1~100)
	       nextInt(100)+1
*/
public class MainClass_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// A~Z 알파벳을 임의로 10개 출력 
		Random r=new Random();
//		for(int i=1;i<=10;i++)
//		{
//			char c=(char)(r.nextInt(26)+65);
//			// (26) => 0~25
//			System.out.print(c+" ");
//		}
		
//		for(int i=1;i<=6;i++)
//		{
//			int lotto=r.nextInt(45)+1; // 1~45
//			System.out.print(lotto+" ");
//		}
		
		int day=r.nextInt(7)+7; // 7~13
//		Set set=new HashSet(); // Set = 중복 다 제거해준다 
		for(int i=1;i<=day;i++)
		{
			int rr=r.nextInt(31)+1;
			System.out.println(rr+" ");
//			set.add(rr);
		}
		System.out.println("======= 최종 결과 =======");
//		for(Object obj:set)
//		{
//			System.out.print(obj+" ");
//		}
	}

}
