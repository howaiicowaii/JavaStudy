/*
 *  문제2. 정수 한 개를 입력받아서, 그 수가 3의 배수인지 판단해보자.
 */
package 제어문의종류;

import java.util.Scanner;

public class 단일조건문_문제2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = scan.nextInt();
		
		if(num%3==0)
		{
			System.out.println("3의 배수입니다");
		}
		if(num%3!=0)
		{
			System.out.println("3의 배수가 아닙니다");
		}
	}

}
