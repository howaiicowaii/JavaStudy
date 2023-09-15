/*
 * 문제7. 정수 3개를 입력받아서 총점과 평균을 구하고 학점을 구하는 프로그램
        작성 ( 90이상이면 A,80이상이면 B, 70이상이면 C,60이상이면 D, 
        나머지는 F)
 */
package 제어문의종류;

import java.util.Scanner;

public class 단일조건문_문제7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("첫번째 점수 : ");
		int num1 = scan.nextInt();
		System.out.print("두번째 점수 : ");
		int num2 = scan.nextInt();
		System.out.print("세번째 점수 : ");
		int num3 = scan.nextInt();
		int total = (num1+num2+num3);
		int avg = total/3;
		System.out.println("총점 : "+total);
		System.out.println("평균 : "+avg);
		int grade = avg/10;
			if(grade>=9 && grade<10) // grade==9 로 하는 게 더 간단 
				System.out.println("학점 : A");
			if(grade>=8 && grade<9)
				System.out.println("학점 : B");
			if(grade>=7 && grade<8)
				System.out.println("학점 : C");
			if(grade>=6 && grade<7)
				System.out.println("학점 : D");
			if(grade<6 && grade>0)
				System.out.println("학점 : F");
//		if(avg>=90 && avg<100)
//			System.out.println("A");
//		if(avg>=80 && avg<90)
//			System.out.println("B");
//		if(avg>=70 && avg<80)
//			System.out.println("C");
//		if(avg>=60 && avg<70)
//			System.out.println("D");
//		if(avg<60 && avg>0)
//			System.out.println("F");
		
		
	}

}
