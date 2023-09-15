/*
 *   문제4. 사용자로부터 세 개의 정수를 입력받아, 그 수들의 최대값과 최소값, 
         합계와 평균을 구해보자.
 */
package 제어문의종류;

import java.util.Scanner;

public class 단일조건문_문제4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("첫번째 정수 입력 : ");
		int num1 = scan.nextInt();
		System.out.print("두번째 정수 입력 : ");
		int num2 = scan.nextInt();
		System.out.print("세번째 정수 입력 : ");
		int num3 = scan.nextInt();
		
		int total = (num1+num2+num3);
		double avg = total/3;
		
		int max = num1;
		if(max<num2)
			max = num2;
		if(max<num3)
			max = num3;
		System.out.println("최대값 : "+max);
		
		int min = num1;
		if(min>num2)
			min = num2;
		if(min>num3)
			min = num3;
		System.out.println("최소값 : "+min);
		System.out.println("합계 : "+total);
		System.out.println("평균 : "+avg);
	}

}
