// 알파벳을 받아서 대문자, 소문자, 숫자, 다른 문자 
package 제어문의종류;

import java.util.Scanner;

public class 단일조건문_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		// 알파벳 받기 

		System.out.println("알파벳 입력 : ");
		char ch = scan.next().charAt(0);  // charAt(0) => 문자의 첫번째것만 가져온다 
		/*
		 *   Hel l o   Java
		 *   0123456789
		 */
		// 대문자 
		if(ch >= 'A' && ch <= 'Z')
		{
				System.out.println(ch +"는(은) 대문자입니다");
		}
		// 소문자 
		if(ch >= 'a' && ch <= 'z')
		{
				System.out.println(ch +"는(은) 소문자입니다");
		}
		// 숫자 
		if(ch >= '0' && ch <= '9')
		{
				System.out.println(ch +"는(은) 숫자입니다");
		}
		// 기타 
		if(!(
					ch>='a' && ch<='z' ||
					ch>='A' && ch<='Z' ||
					ch>='0' && ch<='9'
		   ))
		{
				System.out.println("기타");
		}
		
	}

}
