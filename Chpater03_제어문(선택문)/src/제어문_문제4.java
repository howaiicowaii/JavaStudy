import java.util.Scanner;

public class 제어문_문제4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력:");
		int year = sc.nextInt();
		
		/*
		 *  윤년 => 로마시대때 
		 *  4년마다 윤년
		 *  100년마다 제외 
		 *  400년마다 윤년 
		 */
		if((year%4==0 && year%100!=0)||(year%400==0))
		{
			System.out.println(year+"년도는 윤년입니다.");
		}
		else
		{
			System.out.println(year+"년도는 윤년이 아닙니다.");
		}
	}

}
