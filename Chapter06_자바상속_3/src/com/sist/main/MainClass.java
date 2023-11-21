package com.sist.main;
class A
{
	private int a;
	public A(int a)
	{
		this.a=a;
	}
//	public A()
//	{
//		
//	}
}
class B extends A
{

	public B(int a) {
		super(1); // public A(int a) 호출 => super 
		// 생성자 호출 시 매개변수가 동일해야한다 
	}
//	public B(int a)
//	{
//		super(a);
//	}
//	public B()
//	{
////		super(); // 생략가능 
//	}
}
// A 클래스에 메모리 할당되고 B 클래스에 순서대로 메모리가 할당될 수 있게 
// 메모리 할당 => 상위 클래스 먼저 => 상속받은 클래스 메모리 할당 
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
