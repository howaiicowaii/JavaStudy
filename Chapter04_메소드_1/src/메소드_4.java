/*
	리턴형 (처리 결과값 => 반드시 한개만 사용이 가능) => 여러개일 때는 배열, 클래스 이용
		  --------------------------------
	1) 로그인 요청 
	   --------
	   boolean => 경우의 수 2개 
	   경우의 수가 3개인 경우 
	   ------------ id X,pwd X,login => String, int (유지보수 고려하면 String이 좋다)
	2) 기본형 => int, long, double
	3) 영화 정보 요청 : class
	4) 정렬 요청 => 10 40 50 20 30 => 배열
	------------------------------------
	   경우의 수..
	   
	ex) 정수 => 사칙연산
	     +  int plus(int,int)
	     -  int minus(int,int)
	     *  int gop(int,int)
	     /  String div(int,int) => 0으로 나눴을 때 "0으로 나눌 수 없습니다" 나오기 때문
	
*/
//	1. 기능별로 나눠서 처리 (한가지 기능만 수행)
/*
		ex)
			사람 <===> 자판기
			--- 행위자 (액터) => 유스케이스 다이어그램 
*/
//	2. 반복이 있는 경우 
//	3. 다른 클래스와 연결 (*****)
//	사칙연산 
import java.util.Scanner;
//	1. 정수 한개 입력 받아서(2~9) => 구구단을 출력 
// 출력해야할 값이 많으면 void를 이용해 자체출력하는 게 더 편하다
public class 메소드_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 절차적 언어 => 재사용을 할 수 없다
		Scanner sc = new Scanner(System.in);
		System.out.print("단 입력(2~9):");
		// print() = 메소드 => 사용자가 요청한 메세지를 출력
		int dan = sc.nextInt();
		// nextInt() = 메소드 => 키보드로 정수값 입력시 => 읽어서 => 메모리에 저장
		// 구구단 출력 
		for(int i=1;i<=9;i++)
		{
			System.out.println(dan + "x" + i + "=" + i*dan);
		}
		
		
	}

}
