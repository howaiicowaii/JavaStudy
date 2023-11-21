// 정수 1개 입력 => 3의 배수 여부 확인 
import java.util.*;
public class 메소드_3_문제_2 {
//	static int userInput()
//	{
//		Scanner sc = new Scanner(System.in);
//		System.out.print("정수 입력:");
//		return sc.nextInt();
//	}
	static String check(int num)
	{
		String res=num+"은(는) 3의 배수가 아닙니다.";
		if(num%3==0)
			res = num+"은(는) 3의 배수입니다.";
		return res;
	}
	static void print(String res)
	{
		System.out.println(res);
	}
	static void process()
	{
		int num=메소드_3_문제_1.userInput(); // 재사용 기법 (클래스명.메소드명)
		String res=check(num);
		print(res);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner sc = new Scanner(System.in);
//		System.out.print("정수 입력:");
//		int num = sc.nextInt();
//		
//		String check="";
//		if(num%3==0)
//			check = num+"은(는) 3의 배수입니다.";
//		else
//			check = num+"은(는) 3의 배수가 아닙니다.";
//		
//		System.out.println(check);
		
		process();
		
	}

}
