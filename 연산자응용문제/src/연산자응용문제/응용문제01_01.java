package 연산자응용문제;

import java.util.Scanner;

public class 응용문제01_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		 농구공 5개씩 한 박스에 들어간다. 40개면 8상자,26개면 6상자이다 
//	     삼항연산자를 이용해서 구현하시오  ==> 총페이지 만들 때 사용
		
			Scanner scan = new Scanner(System.in);
			System.out.print("농구공 갯수 입력 : ");
			int ball = scan.nextInt();
			System.out.println("박스 갯수 : " + (ball % 5 == 0 ? ball/5 : (ball/5)+1));
			
		
		
		/*
		Scanner scan = new Scanner(System.in);
		System.out.println("농구공 갯수 :");
		int count = scan.nextInt();
		System.out.println("필요한 상자의 수 : "+(count%5==0?count/5:count/5+1));
		*/
		
		/*
		Scanner scan = new Scanner(System.in);
		System.out.println("농구공 갯수 : ");
		int ball = scan.nextInt();
//		System.out.println("필요한 상자의 수 : "+(ball%5==0 ? ball/5 : ball/5+1));
		System.out.println("필요한 박스:"+(int)(Math.ceil(ball/5.0)));
		*/
		
		
//		System.out.println(농구공<=5 ? "1박스" : "");
//		System.out.println(농구공>=6 && 농구공<=10 ? "2박스" : "");
//		System.out.println(농구공>=11 && 농구공<=15 ? "3박스" : "");
//		System.out.println(농구공>=16 && 농구공<=20 ? "4박스" : "");
//		System.out.println(농구공>=21 && 농구공<=25 ? "5박스" : "");
//		System.out.println(농구공>=26 && 농구공<=30 ? "6박스" : "");
		// ==> 내가 했는데 너무 번거로워 안좋음
	
	}

}
