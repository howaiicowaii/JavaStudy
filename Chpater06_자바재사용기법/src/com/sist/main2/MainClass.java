package com.sist.main2;
class Super // double
{
	
}
class Sub extends Super // int 
{
	
}
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 묵시적 형변환 => 자동 형변환 
		Super su=new Sub(); // 데이터형 (사용자 정의)
		// double su = 10; => 자동 형변환. 왼쪽이 더 크기 때문에 OK
		
		// 강제 형변환 
		Sub s=(Sub)su;
		// int a=(int)10.5;
		
		String str="";
		StringBuffer sb=new StringBuffer();
		Object obj=new Object();
		
		// 객체 비교 => instanceof 
		if(str instanceof Object) // str < Object.(= str은 Object 소속이다)
			System.out.println("true");
		else
			System.out.println("false");
		
		if(sb instanceof Object) // sb < Object 라는 뜻 
			System.out.println("true");
		else
			System.out.println("false");
		
		if(obj instanceof String) //  
			System.out.println("true");
		else
			System.out.println("false");
		
//		if(sb instanceof String) // 서로 아무 관계 아니기 때문에 (상속관계 아니라) 에러
//			System.out.println("true");
//		else
//			System.out.println("false");
		
	}

}
