/*
 * 문제1. 정수 한 개를 입력받아서, 그 수가 50 이상의 수인지 50미만의 수인지 
         판단해보자.
 */
package 제어문의종류;

import java.util.Scanner;

public class 단일조건문_문제1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = scan.nextInt();
		if(num>=50)
		{
			System.out.println("50 이상입니다");
		}
		if(num<50)
		{
			System.out.println("50 미만입니다");
		}
	}

}
