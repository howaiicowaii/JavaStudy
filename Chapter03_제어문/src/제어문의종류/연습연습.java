/*
*    1) 정수 입력을 1개 받는다
 *   >>11 
 *   같은 숫자입니다 
 *   >>88
 *   >>77
 *   
 *   2) 1~100사이의 난수를 3개 발생
 *   => 발생된 난수 출력 
 *   => MAX , MIN 값 출력
 */
package 제어문의종류;

import java.util.Scanner;

public class 연습연습 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 1)
		 Scanner scan = new Scanner(System.in);
		 System.out.print("정수 입력 : ");
		 int num  = scan.nextInt();
		 
		 if(num>=0 && num<100)
		 {
		 if(num%11==0)
		 {
			 System.out.println(num+"는(은) 같은 숫자입니다");
		 }
		 if(num%11!=0)
		 {
			 System.out.println(num+"는(은) 다른 숫자입니다");
		 }
		 }
		 if(num<0 || num>100)
		 {
			 System.out.println("잘못된 입력값입니다!!!");
		 }
		 */
		
		// 2)
		Scanner scan = new Scanner(System.in);
		int num1 = (int)(Math.random()*100)+1;
		int num2 = (int)(Math.random()*100)+1;
		int num3 = (int)(Math.random()*100)+1;
		System.out.println(num1+", "+num2+", "+num3);
		
		int max = num1;
		if(max<num2)
			max = num2;
		if(max<num3)
			max = num3;
		System.out.println("MAX : "+max);
		
		int min = num1;
		if(min>num2)
			min = num2;
		if(min>num3)
			min = num3;
		System.out.println("MIN : "+min);
	}

}
