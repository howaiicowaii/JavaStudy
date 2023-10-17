package com.sist.main2;
class Super
{
	
}
class Sub extends Super
{
	
}
// NullPointerException , ClassCastException
public class MainClass4 {
	static String str; // null 값 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Super ssss; // Null => NullPointerException
		Super s=new Sub();
//		Sub ss=(Sub)new Super(); // 오류 발생 ClassCastException 
		Sub ss=(Sub)s; // 객체 형변환 
//		char c=str.charAt(0); // str 은 null 값이기 때문에 오류 발생 
		
//		Super sss=new Super(); // 오류 발생
//		Sub ssss=(Sub)sss;
	}

}
