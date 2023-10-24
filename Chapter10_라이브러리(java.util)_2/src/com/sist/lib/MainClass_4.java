package com.sist.lib;
import java.util.*;
// 332p => Date / Calendar 
/*
	날짜 관련된 클래스 (시간 포함)
	-----------------------
	Date => 기능이 없다 (단지 날짜만 저장할 목적)
	                      --------- 오라클 호환 에 필요 
	Calendar : Date 에 없는 기능을 보완 
	           => 요일 , 마지막날 읽기 
	           => 달력 (예약)
	           => 월 , 요일 => 1 부터 (요일)
	              -- 0번부터 
	=> Date : 일반 클래스 
	          Date date=new Date();
	   Calendar : 추상클래스 (new 사용 X)
	              Calendar cal=Calendar.getInstance();
	              => getInstance() , newInstance()
	                 -------------   ------------- 
	                  => 싱글턴 (생성할 때 마다 같은 주소를 갖고있는 것들) (static)
*/
import java.util.*;
class A
{
	static A a;
	public static A newInstance()
	{
		if(a==null)
			a=new A();
		return a;
	}
}
public class MainClass_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		A aa=new A();
//		System.out.println("aa="+aa);
//		A bb=new A();
//		System.out.println("bb="+bb);
		
//		A aa=A.newInstance(); // 싱글턴 
//		A bb=A.newInstance();
//		A cc=A.newInstance();
//		
//		System.out.println("aa="+aa);
//		System.out.println("bb="+bb);
//		System.out.println("cc="+cc); // => 싱글턴: 메모리 주소를 한개만 사용(static)
		
		Scanner sc=new Scanner(System.in);
		System.out.print("년 월 일 입력(2023 10 24):");
		int year=sc.nextInt();
		int month=sc.nextInt();
		int day=sc.nextInt();
		
		Calendar cal=Calendar.getInstance(); // 추상클래스 (new 사용 X)
		// 날짜 지정 
		cal.set(Calendar.YEAR, year);
		cal.set(Calendar.MONTH, month-1);
		cal.set(Calendar.DATE, day);
		String[] strWeek= {"","일","월","화","수","목","금","토"};
		int week=cal.get(Calendar.DAY_OF_WEEK);
		int lastday=cal.getActualMaximum(Calendar.DATE);
		System.out.println(year+"년도 "+month+"월 "+day+"일은 "
				+strWeek[week]+"요일입니다");
		System.out.println(month+"월의 마지막날은 "+lastday);
	}

}
