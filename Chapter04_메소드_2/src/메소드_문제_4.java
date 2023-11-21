// 4. 두 정수를 나눗셈 결과를 구해주는 메소드 구현
/*
	리턴형 O / 매개변수 O (2개)
	
	0으로 나눴을 때 "0으로는 나눌 수 없다" 출력하기 위해 String 으로 하는 게 좋다 
*/
import java.util.Scanner;
public class 메소드_문제_4 {
	static String div(int a,int b)
	{
		String result="";
		if(b==0)
			result="0으로 나눌 수 없습니다!!";
		else
			result=a+"/"+b+"="+a/(double)b;
		// String => format 나중에 배우면 (double) 대체 가능
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 정수 입력:");
		int a = sc.nextInt();
		System.out.print("두번째 정수 입력:");
		int b = sc.nextInt();
		
		String res = div(a,b);
		System.out.println(res);
	}

}
