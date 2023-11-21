// 웹 => 아이디 중복체크 , 로그인 , 관리자/사용자 , 아이디 찾기 , 비밀번호 찾기
import java.util.Scanner;

public class 제어문_문제1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력:");
		int num = sc.nextInt(); // 키보드로 입력된 값을 받는다
		/*
		 * 정수  :  nextInt();
		 * 실수  :  nextDouble();
		 * 논리  :  nextBoolean();
		 * 문자열 : next();
		 * *** 단점은 char는 읽지 못한다 
		 *          ----- 문자열로 읽어서 첫번째 문자를 자른다 
		 *                            --------- charAt(0);
		 * 
		 */
		
		if(num > 0)
		{
			System.out.println(num+"는(은) 양수입니다.");
		}
		else
		{
			System.out.println(num+"는(은) 음수입니다.");
		}
	}

}
