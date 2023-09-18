/*
 * 100점 만점으로 성적을 입력받아 90~100이면 A, 80~89이면 B, 70~79이면 C,
 * 60~69이면 D, 60점 미만이면 F를 출력하라 (다중 if 사용)
 */
import java.util.Scanner;

public class 제어문_문제5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력:");
		
		int score = sc.nextInt();
		
		if(score >=90 && score <= 100)
		{
			System.out.println("A학점입니다.");
		}
		else if(score >= 80 && score < 90)
		{
			System.out.println("B학점입니다.");
		}
		else if(score >=70 && score < 80)
		{
			System.out.println("C학점입니다.");
		}
		else if(score >= 60 && score < 70)
		{
			System.out.println("D학점입니다.");
		}
		else if(score < 60)
		{
			System.out.println("F학점입니다.");
		}
		
	}

}
