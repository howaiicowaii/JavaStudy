package 연산자문제;
import java.util.Scanner;
public class 연습12_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 강사님 버전
		Scanner scan = new Scanner(System.in);
		//                            --------- 키보드 입력값
		//Scanner 버전
		/* System.out.print("첫번째 정수 입력:");
		int a = scan.nextInt();
		System.out.print("두번째 정수 입력:");
		int b = scan.nextInt();
		*/
		System.out.println("정수 두개 입력(10 20):");
		int a = scan.nextInt();
		int b = scan.nextInt();
		System.out.println(a-b);
		System.out.println(a*b);
		
		
	}

}
