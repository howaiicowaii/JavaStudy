// 한 개의 정수를 입력받아 3의 배수인지 판별하여 출력하라 
// 짝수/홀수 , 대문자/소문자 같은 게 나오면 if~else 
import java.util.Scanner;

public class 제어문_문제2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력:");
		int num = sc.nextInt();
		// int num = (int)(Math.random()*100)+1; // 1~100
		
		if(num % 3 == 0)
		{
			System.out.println(num+"는(은) 3의 배수입니다.");
		}
		else // if(num % 3 != 0)
		{
			System.out.println(num+"는(은) 3의 배수가 아닙니다.");
		}
	}

}
