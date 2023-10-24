package com.sist.lib;

import java.util.StringTokenizer;

/*
	StringTonkenizer
		 1) countTokens() : 분리된 데이터 갯수 
         2) nextToken() : 실제 분리된 데이터 읽기 
         3) hasMoreTokens() : 분리된 수만큼 루프 수행 
*/
public class MainClass_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data="red|green|blue|black|white|yellow|pink|cyan|magenta";
		// \\|
		StringTokenizer st=new StringTokenizer(data,"|");
//		System.out.println("칼라 갯수:"+st.countTokens());
//		String color1=st.nextToken();
//		String color2=st.nextToken();
//		String color3=st.nextToken();
////	String color4=st.nextToken(); // 오류 발생 
//		System.out.println(color1);
//		System.out.println(color2);
//		System.out.println(color3);
		// st.nextToken() => 갯수를 벗어나면 오류 발생 
		
		System.out.println("칼라 갯수:"+st.countTokens());
		while(st.hasMoreTokens()) // 자른 갯수만큼 루프 수행 
		{
			System.out.println(st.nextToken());
		}
		/*
			hasMoreTokens
			1) cursor
			------------------
			  -> before First
			------------------
			 red => st.nextToken() ==> true 면 다음 걸로 넘어간다 
			------------------
			 blue => st.nextToken() ==> true 
			------------------
			 green => st.nextToken() ==> true
			------------------
			 -> after Last ==> st.nextToken() ==> false
			------------------
		*/
		
	}

}
