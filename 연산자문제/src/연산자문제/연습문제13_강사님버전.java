package 연산자문제;

import java.util.Scanner;

public class 연습문제13_강사님버전 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// *Scanner 입력 후 Ctrl + Space 하면 'import java.util.Scanner;' 알아서 붙여준다
		Scanner scan = new Scanner(System.in);
		System.out.println("세개 정수 입력(1 2 3):");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		System.out.println(a*b+c);
	}

}
