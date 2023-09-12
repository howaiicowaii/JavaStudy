/*
 *   변수의 초기화
 *   1) 변수 추출
 *   2) 변수 선언(데이터형)
 *   3) 변수 초기화
 *      = 명시적인 초기화
 *        int a=10;
 *      = 입력값
 *        ***Scanner : 키보드 입력값을 받을 때 사용
 *        BufferedReader : 예외처리
 *      = 임의값을 받아서 초기화
 *        ---- 랜덤
 *      = 크롤링
 */
import java.util.Scanner;
public class 변수의초기화 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=100;
		int b=(int)(Math.random()*100);
		// 0.0 ~ 0.99 만 나올 수 있으니 (int) 해서 0 나옴
		Scanner scan=new Scanner(System.in);
		//                       키보드 입력값
		System.out.println(b);
		System.out.println("정수 입력:");
		int c=scan.nextInt();
		System.out.println(c);
		int aa=10;
		int bb=20;
		
		// a=20, b=10
		int temp=aa;
		aa=bb;
		bb=temp;
		System.out.println(aa);
		System.out.println(bb);
		
	}

}
