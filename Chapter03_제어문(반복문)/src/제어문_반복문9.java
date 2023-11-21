/*
 * 		up down 게임 
 * 		-----------
 * 		  컴퓨터에서 난수 발생 : 1~100 
 * 		  -----------------------
 * 		 => 힌트 
 * 			---
 * 			=> 정답이 나올 때까지 반복 
 * 			   ------------------ 무한루프 
 * 			   for(;;) => while(true)
 */
import java.util.*;
// import java.lang.*; << 이 안에 System, String, math 등 이미 포함되어 있다
public class 제어문_반복문9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 난수 발생 
		int com = (int)(Math.random()*100)+1;
		// 종료 => break; , System.exit(0);
		Scanner sc = new Scanner(System.in);
		int count = 0;
		for(;;) // 무한루프 
		{
			System.out.print("1~100사이의 값을 입력:");
			int user = sc.nextInt();
			if(user<1 || user>100)
			{
				System.out.println("잘못된 입력입니다.");
				continue;
			}
			count++;
			// 힌트 주기 
			if(user<com)
			{
				System.out.println("UP");
			}
			else if(user>com)
			{
				System.out.println("down");
			}
			else // 정답
			{
				System.out.println("Correct");
				System.out.println("입력횟수:"+count);
				System.exit(0); // 프로그램 종료 = break; 도 가능 
			}
			
		}
		

		
	}

}
