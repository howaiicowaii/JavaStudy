package com.sist.main2;
// 변수,메소드 오버라이딩 => 덮어쓴다
/*
	오버라이딩 
	------- 
	1) 메소드명이 동일해야 한다 
	2) 상속이 있어야 한다 
	3) 매개변수가 동일해야 한다
	4) 리턴형이 동일해야 한다
	5) 축소는 불가능, 확대는 가능 (접근지정어)
	   --------------------
	   private < default < protected < public
*/
class Super{
	int number=10;
	void display()
	{
		System.out.println("Super:display Call...");
	}
}
class Sub extends Super // Super를 확장해서 새로운 클래스를 만든다
{
	int number=20;
	protected void display()
	{
		
	}
	/*
		void display()
		{
		   System.out.println("Super:display Call...");
		}
		// 변경이 가능 => 오버라이딩 
	*/
}
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Super su=new Super();
//		System.out.println("super.number="+su.number);
//		Sub sub=new Sub();
//		System.out.println("sub.number="+sub.number);
//		
//		Super su1=new Sub(); // 항상 따지는 건 왼쪽 꺼. Super 니까 Super 꺼 가져온다
//		System.out.println("su1.number="+su1.number); // 10 
//		// 클래스 선언에 따라서 해당 데이터를 제어
//		// Super 생성 => Super에 있는 변수 
		// Super / Sub / Sub=Super
		Super s1=new Super();
		s1.display();
		// ***
		Sub sub=new Sub();
		sub.display();
		// ***
		Super s2=new Sub();
		s2.display();
		
		/*
			멤버변수 : 선언된 클래스형 
			  Super s=new Super() ===> SUper가 가지고 있는 변수 제어 
			  Sub sub=new Sub() ===> Sub가 가지고 있는 변수 제어 
			  Super s=new Sub() ==> Super가 가지고 이쓴 변수 제어 
			메소드 
		*/
	}

}
