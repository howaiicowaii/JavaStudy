import java.util.*;
public class 제어문_반복제어문3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		// 123456789
		while(true)
		{
			System.out.print("메뉴 선택:");
			int menu = sc.nextInt();
			if(menu<1 || menu>9) // 없는 메뉴를 선택한 경우
			{
				System.out.println("없는 메뉴입니다.");
				continue; // 조건식으로 이동 (처음부터 실행)
			}
			if(menu==9)
			{
				//System.exit(0); => exit을 쓰면 아예 종료되서 아래 명령들 수행못한다.
				break; // while만 종료 
			}
			System.out.println(menu+"번 메뉴를 선택하셨습니다.");
		}
		System.out.println("프로그램 종료!!");
		
	}

}
