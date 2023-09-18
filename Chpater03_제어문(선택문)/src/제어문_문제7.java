import java.util.Scanner;

public class 제어문_문제7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력:");
		int A = sc.nextInt();
		
		System.out.print("+,-,*,/ 입력:");
		char c = sc.next().charAt(0);
		
		System.out.print("정수 입력:");
		int B = sc.nextInt();
		
		int res = 0;
		switch(c)
		{
		case '+':
			res = A + B;
			System.out.println(A+" + "+B+" = "+res);
			break;
		case '-':
			res = A - B;
			System.out.println(A+" - "+B+" = "+res);
			break;
		case '*':
			res = A * B;
			System.out.println(A+" * "+B+" = "+res);
			break;
		case '/':
			res = A / B;
			System.out.println(A+" / "+B+" = "+res);
			break;
		default:
			System.out.println("잘못된 입력값입니다.");
		}
		
		
		
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("정수 입력:");
//		int num1 = sc.nextInt();
//		System.out.print("+,-,*,/ 입력:");
//		char c = ' ';
//		c = sc.next().charAt(0);
//		System.out.print("정수 입력:");
//		int num2 = sc.nextInt();
//		int res = 0;
//		
//		switch(c)
//		{
//		
//		case '+':
//			res = num1 + num2;
//			System.out.println(num1+" + "+num2+" = "+res);
//			break;
//		case '-':
//			res = num1 - num2;
//			System.out.println(num1+" - "+num2+" = "+res);
//			break;
//		case '*':
//			res = num1 * num2;
//			System.out.println(num1+" * "+num2+" = "+res);
//			break;
//		case '/':
//			res = num1 / num2;
//			System.out.println(num1+" / "+num2+" = "+res);
//			break;
//		default:
//			System.out.println("잘못된 입력값입니다.");
//		
//		}
		
		
	}

}
