package com.sist.lib;
/*
	자바에서 가장 많이 사용되는 패키지 
	=> java.lang(9장) / java.util(10장) / java.io(11장) / java.sql(12장)
	=> 웹사이트 => HTML / CSS -> 오픈소스 (필요하면 긁어다 쓰기 가능)
	   => Spring / React => 하고 안하고 연봉 300 차이 
	java.lang : Object / String / Math / Wrapper
	java.util : Date / StringTokenizer
	            List (ArrayList) , Map (HashMap)
	=> Calendar => 기본 달력 (예약할 때 사용)
*/
import java.util.*;
public class MainClass_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		// System.in , System.out => 자바 표준 입출력 
		// 키보드 입력값 받기 , 화면 출력 
		System.out.print("년 월 일 입력(2023 10 25):");
		int year=sc.nextInt();
		int month=sc.nextInt();
		int day=sc.nextInt();
		
		// => 요일 , 입력달의 마지막 날짜 => Calendar 에 설정 
		// set() => get()
		/*
			1. 년도 설정 set(Calendar.YEAR, year);
			2. 월 설정 set(Calendar.MONTH, month-1); => month 는 0번부터 시작 
			3. 일 설정 set(Calendar.DATE, 1); => 달력 / 오늘 날짜 출력할거면 day 
			
			=> Calendar => 추상 클래스 
			               -------- 미완성 (메소드 구현이 안된 상태)
			               new 이용해서 메모리 할당이 불가능하다 
			=> new 를 사용하지 않고 메모리 할당 (추상클래스, 인터페이스)
		*/
		// Calendar 객체 생성 
		Calendar cal=Calendar.getInstance(); // Calendar => new 사용 불가능 
		// 요청한 달의 날짜 설정 
		cal.set(Calendar.YEAR, year);
		cal.set(Calendar.MONTH, month-1);
		cal.set(Calendar.DATE, 1);
		
		// 요일 구하기 
		int week=cal.get(Calendar.DAY_OF_WEEK)-1;
		// 1~7까지 ==> 코딩하기엔 0번 부터하는 게 편해서 -1 해주었다 => 일 ~ 토 (0~6)
		// 해당 달의 마지막일을 가지고 온다 
		int lastday=cal.getActualMaximum(Calendar.DATE);
		
		// 출력 
		String[] strWeek= {"일","월","화","수","목","금","토"};
		System.out.println(year+"년도 "+month+"월 ");
		
		for(String w:strWeek)
		{
			System.out.print(w+"\t");
		}
		System.out.println("\n"); // 다음 줄 이동 
		
		for(int i=1;i<=lastday;i++)
		{
			if(i==1) // 처음에 요일까지 공백 출력 
			{
				for(int j=0;j<week;j++)
				{
					System.out.print("\t");
				}
			}
			System.out.printf("%2d\t",i);
			week++; // 0~6 만 돌아야한다. 그래서 if문으로 넘어가지 못하게 설정 
			if(week>6) // 토 를 넘어가면 일 로 다시 돌아가게 
			{
				week=0;
				System.out.println(); // 그리고 한 줄 띄어라 
			}
		}
	}

}
