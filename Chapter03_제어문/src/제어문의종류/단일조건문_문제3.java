/*
 *  문제3. 1학년부터 4학년까지 중간고사 시험을 보았다. 
         4학년은 70점 이상이면 합격, 그 이외의 학년은 60점 이상이면 합격이다. 
         이를 판단하는 프로그램을 작성해보자.
         점수가 0미만 100초과이면 경고문구 출력!
      => 한번 더 풀어보기
      
     중첩 조건문
     
 */
package 제어문의종류;

import java.util.Scanner;

public class 단일조건문_문제3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.print("1학년 점수 : ");
		int a = scan.nextInt();
		System.out.print("2학년 점수 : ");
		int b = scan.nextInt();
		System.out.print("3학년 점수 : ");
		int c = scan.nextInt();
		System.out.print("4학년 점수 : ");
		int d = scan.nextInt();
		
		if(d>=70)
			System.out.println("4학년 합격");
		if(a>=60 && a<=100 || b>=60 && b<=100 || c>=60 && c<=100)
			System.out.println("합격");
		if(a>100 || a<0 || b>100 || b<0 || c>100 || c<0 || d>100 || d<0)
			System.out.println("잘못된 숫자입니다 !!!");
	}

}
