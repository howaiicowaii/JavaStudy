import java.util.*;
public class 제어문_문제7_강사님버전 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1,num2;
		char op = ' ';
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 정수 입력 : ");
		num1 = sc.nextInt();
		
		System.out.print("두번째 정수 입력 : ");
		num2 = sc.nextInt();
		
		System.out.print("연산자 입력(+,-,*,/) : ");
		op = sc.next().charAt(0); // Scanner 를 char 로 받는 방법 
		
		switch(op)
		{
		case '+':
			System.out.println(num1+"+"+num2+"="+(num1+num2));
			break;
		case '-':
			System.out.println(num1+"-"+num2+"="+(num1-num2));
			break;
		case '*':
			System.out.println(num1+"*"+num2+"="+(num1*num2));
			break;
		case '/':
			if(num2==0) // 오류 처리 => 처리를 할 수 없는 경우 (예외처리)
				System.out.println("0으로 나눌 수 없습니다.");
			else
			{
			System.out.println(num1+"/"+num2+"="+(num1/num2));
			}
			break;
		default:
			System.out.println("처리할 수 없는 연산자입니다.");
		}
		
		
	}	

}
