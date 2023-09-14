package 연산자응용문제;

import java.util.Scanner;

public class 응용문제01_02_교수님버전 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("문자 입력:");
		char ch = scan.next().charAt(0);
		// "ABC"
		//  012
		System.out.println("ch="+ch);
		boolean b=(ch>='A' && ch<='Z' ||
				ch>='a' && ch<='z' ||
				ch>='0' && ch<='9'? true : false);
		System.out.println(b);
	}

}
