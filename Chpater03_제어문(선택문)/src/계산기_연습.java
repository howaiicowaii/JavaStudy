import java.util.Scanner;

public class 계산기_연습 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int a = sc.nextInt();
		
		System.out.print("연산자 입력(+,-,*,/)");
		char c = sc.next().charAt(0);
		
		System.out.print("정수 입력 : ");
		int b = sc.nextInt();
		
		// 다중조건문으로도 해보고 switch 도 풀어보기 
		// 다중조건
		if(c == '+')
		{
			System.out.println(a+" + "+b+" = "+(a+b));
		}
		else if(c == '-')
		{
			System.out.println(a+" - "+b+" = "+(a-b));
		}
		else if(c == '*')
		{
			System.out.println(a+" * "+b+" = "+(a*b));
		}
		else if(c == '/')
		{
			if(b == 0)
			{
				System.out.println("0으로는 나눌 수 없습니다.");
			}
			else
			{
			System.out.println(a+" / "+b+" = "+(a/b));
			}
		}
		else
		{
			System.out.println("잘못된 입력값입니다.");
		}
	// ----------------------------------------------------
		// switch case 문 
//		switch(c)
//		{
//		case '+':
//			System.out.println(a+" + "+b+" = "+(a+b));
//			break;
//		case '-':
//			System.out.println(a+" - "+b+" = "+(a-b));
//			break;
//		case '*':
//			System.out.println(a+" * "+b+" = "+(a*b));
//			break;
//		case '/':
//			System.out.println(a+" / "+b+" = "+(a/b));
//			break;
//		default:
//			System.out.println("잘못된 입력값입니다.");
//		}
	}

}
