package com.sist.lib;
/*
	Wrapper : 기본 데이터형을 클래스화 
	  => 기본 데이터형에 기능을 부여해서 쉽게 사용이 가능하게 만드는 클래스 
	  int ==> Integer
	  long ==> Long
	  double ==> Double
	  boolean ==> Boolean
	  -------------------- 웹에서 주로 사용 (4개 정도)
	  
	  => 웹/윈도우 => 모든 데이터값 문자열 
	                ---------------
	                문자열을 정수,실수,논리형
	  => Double.parseDouble("4.5") => 4.5 (실수형)
	     Integer.parseInt("10") => int page=10
	     Boolean.parseBoolean("true") => true
	             --------------------
	              HTML => checkbox
	  => 제네릭 사용시 => 데이터형을 통일 
	     ----- 메소드 => 리턴형 , 매개변수 
	                   -------------- Object 
	     <Integer> => 항상 클래스형이 들어가야 한다. <int> (X)
	     ---------
	     배열 => 저장 (클래스) => Object 
	     
	     class Box<T> ==> T(Object)
	     {
	     	T t=new T();
	     	void setT(T t){}
	     	T getT()
	     	{
	     		return T;
	     	}
	     }
	     
	     Box<String>
	     -----------------------
	     *** 오토박싱 / 언박싱 
	     Integer i=10; => int 처럼 사용이 가능. 오토박싱 (클래스지만 정수처럼 사용 가능)
	     int j=i; => 언박싱 (정수지만 클래스처럼 사용 가능)
*/
import java.util.*;
public class MainClass_1 {
	static void aaa(Integer i)
	{
		System.out.println(i);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		aaa(10);
		
//		Integer i=10; // 오토박싱 
//		int j=i; // 언박싱 
//		System.out.println(i);
		
//		List<MainClass_1> list=new ArrayList<MainClass_1>(); // 제네릭 => 데이터형 통일 
//		list.add("a");
//		list.add(10.5);
//		list.add(10);
//		list.add('A');
//		list.add(new MainClass_1());
//		list.add(10);
//		list.add('A');
//		list.add(new MainClass_1());
//		list.add(10);
//		list.add('A');
//		list.add(new MainClass_1());
	}

}
