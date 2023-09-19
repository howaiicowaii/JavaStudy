import java.util.Scanner;

public class 반복문1_문제4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력:");
		int a = sc.nextInt();
		
		int sum = 0;
		for(int i=1;i<=10;i++)
		{
			sum+=i;
		}
		System.out.print("1~"+a+"까지의 합:"+sum);
	}

}
