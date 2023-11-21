// 1.  int형 변수 x가 10보다 크고 20보다 작을 때 true인 조건식 작성 (조건문)
// 2. char형 변수 ch가 공백이고 탭이 아닐 때 true인 조건식 작성
// 3. char형 변수 ch가 'x' 또는 'X'일 때 true인 조건식 작성

import java.util.*;
public class 제어문_반복문_문제1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	// 1.
		// x>10 && x<20
	// 2.
		// ch==' ' && ch!='\t'
	// 3.
		// ch=='x' || ch=='X'
	// 4.
		// ch>='0' && ch<='9'
	
	// 5.
//		for(int i=1;i<=6;i++)
//		{
//			for(int j=1;j<=6;j++)
//			{
//				if(i+j==6)
//				{
//					System.out.println("["+i+"+"+j+"]");
//				}
//			}
//		}
		
	// 6.new
//		Scanner sc = new Scanner(System.in);
//		System.out.print("시작 값:");
//		int start = sc.nextInt();
//		System.out.print("끝 값:");
//		int end = sc.nextInt();
//		int res=1;
//		
//		for(int i=start;i<=end;i++)
//		{
//			res*=i;
//		}
//		System.out.println("결과값:"+res);
	// 6. et
//		Scanner sc = new Scanner(System.in);
//		System.out.print("첫번째 정수 입력:");
//		int a = sc.nextInt();
//		System.out.print("두번째 정수 입력:");
//		int b = sc.nextInt();
//		
//		for(int i=a;i<=b;i++)
//		{
//			
//		}
		
	// 7.
//		int sum=0;
//		for(int i=5;i<=16;i++)
//		{
//			sum+=i;
//		}
//		System.out.println("결과값:"+sum);
		
		
	// 8.
//		int even = 0;
//		for(int i=3;i<=4462;i++)
//		{
//			if(i%2==0)
//			{
//				even+=i;
//			}
//		}
//		System.out.println("3~4462 사이의 짝수의 합:"+even);
		
	// 9.
//		int i=0; // while 때 켜야한다
//		int sum2=0;
//		int sum3=0;
//		for(int i=0;i<=12;i++)
//		{
//			if(i%2==0)
//			{
//				sum2+=i;
//			}
//			if(i%3==0)
//			{
//				sum3+=i;
//			}
//			
//		}
//		System.out.println("2의 배수의 합:"+sum2);
//		System.out.println("3의 배수의 합:"+sum3);
		// ---------------
//		while(i<=12)
//		{
//			if(i%2==0)
//			{
//				sum2+=i;
//			}
//			if(i%3==0)
//			{
//				sum3+=i;
//			}
//			i++;
//		}
//		System.out.println("2의 배수의 합:"+sum2);
//		System.out.println("3의 배수의 합:"+sum3);
		
	// 10.
//		int i=1;
//		int sum=0;
//		while(i<=100)
//		{
//			if(i%4==0)
//			{
//				sum+=i;
//			}
//			i++;
//		}
//		System.out.println("4의 배수의 합:"+sum);
//		--------------
//		int a4=0;
//		for(int i=1;i<=100;i++)
//		{
//			if(i%4==0)
//				a4+=i;
//		}
//		System.out.println(a4);
//		=-------------
	
	// 11. new
//		int count=0;
//		for(int i=1;i<=10;i++)
//		{
//			int a=(int)(Math.random()*100)+1;
//			System.out.print(a+" ");
//			if(a%2==0)
//				count++;
//		}
//		System.out.println("\n결과값:"+count);
		
	// 11. et
//		int i=1;
//		int count=0;
//		while(i<=10)
//		{
//			if(i%2==0)
//			{
//				count++;
//			}
//			i++;
//		}
//		System.out.println("짝수의 개수:"+count);
		
	// 12. new
//		int a3=0,a5=0;
//		for(int i=1;i<=10;i++)
//		{
//			int a=(int)(Math.random()*100)+1;
//			System.out.print(a+" ");
//			if(a%3==0)
//				a3++;
//			if(a%5==0)
//				a5++;
//		}
//		System.out.println("\n3의 배수 갯수:"+a3);
//		System.out.println("5의 배수 갯수:"+a5);
//		-----------------------
		
	// 13.
//		for(int i=1;i<=5;i++)
//		{
//			for(int j=1;j<=10;j++)
//			{
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
	// 15. new
//		for(int i=1;i<=5;i++)
//		{
//			for(int j=1;j<=5;j++)
//			{
//				System.out.print(i+" ");
//			}
//			System.out.println();
//		}
		
	// 15. 다시 
//		for(int i=1;i<=5;i++)
//		{
//			for(int j=1;j<=5;j++)
//			{
//				System.out.print(i);
//			}
//			System.out.println();
//		}
		
	// 16.
//		for(int i=1;i<=5;i++)
//		{
//			for(int j=1;j<=5;j++)
//			{
//				if(i==j)
//				{
//					System.out.print(i);
//				}
//				else
//					System.out.print("#");
//			}
//			System.out.println();
//		}
		
	// 17.
//		for(int i=1;i<=5;i++)
//		{
//			char c ='A';
//			for(int j=1;j<=5;j++)
//			{
//				System.out.print(c++ +" ");
//			}
//			System.out.println();
//		}
		
	// 18. new
		char c ='A';
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				System.out.print(c+" ");
			}
			c++;
			System.out.println();
		}
		
	// 18. 다시 
//		char c = 'A';
//		for(int i=1;i<=5;i++)
//		{
//			
//			for(int j=1;j<=5;j++)
//			{
//				System.out.print(c++);
//			}
//			System.out.println();
//		}

}

}
