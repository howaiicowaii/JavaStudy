/*
	1. 사용자로부터 아이디를 받아서 중복체크하는 메소드 원형을 작성하시오
	-> static boolean idCheck(String id)
	2. 2단에서 9단까지 구구단을 출력하는 메소드 원형을 작성하시오
	-> static void gugudan()
	
	1. 1~10까지 출력하는 메소드 구현
	
	static void num()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.print(i+" ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		num();
	} 
		
	2. 1~10까지 합을 구하는 메소드 구현
	
	static void num()
	{
		int sum = 0;
		for(int i=1;i<=10;i++)
		{
			sum += i;
		}
		System.out.println("1~10까지의 합:"+sum);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		num();
	}
	
	3. 1~n까지 합을 구하는 메소드 구현
	
	
	4. 두 정수를 나눗셈 결과를 구해주는 메소드 구현
	5. 문자열의 소문자를 대문자로 바꿔주는 메소드 구현
	6. 문자열을 거꾸로 출력하는 메소드 구현


*/
import java.util.Scanner;
public class 메소드_문제_첫째장 {
	static int num(int n)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("n의 값을 입력하시오:");
		return sc.nextInt();
	}
	static void total()
	{
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
}
