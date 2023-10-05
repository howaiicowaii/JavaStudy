// 정수 한개를 입력받아서 => 짝수/홀수 => 출력 
// 메소드 3개로 출력 
import java.util.*;
public class 메소드_3_문제_1 {
	// 입력 받기
	static int userInput()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력:");
		return sc.nextInt();
	}
	static String check(int num)
	{
		String res = "";
		if(num%2==0)
		{
			res = num+"는(은) 짝수입니다";
		}
		else
			res = num+"는(은) 홀수입니다";
		
		return res;
//		return num%2==0 ? num+"는(은) 짝수입니다" : num+"는(은) 홀수입니다";
//		// 삼항연산자로 대체하면 한줄로 출력 가능
	}
	static void print(String res)
	{
		System.out.println(res);
	}
	static void process()
	{
		int userInput=userInput();
		String res=check(userInput);
		print(res);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner sc = new Scanner(System.in);
//		System.out.print("정수 입력:");
//		int num = sc.nextInt();
//		
//		String res = "";
//		if(num%2==0)
//		{
//			res = num+"는(은) 짝수입니다";
//		}
//		else
//			res = num+"는(은) 홀수입니다";
//		
//		System.out.println(res);
		
		process();
	}

}
