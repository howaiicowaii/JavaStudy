/*
	조건문
	단일 조건문 / 선택 조건문 / 다중 조건문 => 형식, 순서 
	------------------------------
	연산자 => 어떤 연산자 => 결과값?
	----- 비교연산자 , 논리연산자 , 부정연산자 
	단일조건문
	-------
	   if(조건문) 
	   
	선택조건문
	-------
	
	다중조건문 
	-------
	   if(조건문)
	   {
	   		조건이 true일때 => 수행 => 종료
	   		false일때 밑의 조건문을 찾는다 
	   }
	   else if(조건문)
	   {
	   		조건이 true일때 => 수행 => 종료
	   		false일때 밑의 조건문을 찾는다 
	   }
	   else
	   {
	   		해당 조건이 없는 경우에 처리 문장
	   }
	   ============================
	   switch(정수,문자,문자열)
	                  -----
       {
       case 값:
          처리문장
          break;
       --
       --
       default:
          처리문장 ==> 생략 가능
       }
*/
import java.util.Scanner;
public class 문제_0921 {

	public static void main(String[] args) {
		
	// 1.
		// BufferedReader => 이게 더 간편하다
//		Scanner sc = new Scanner(System.in);
//		System.out.print("두자리 정수 입력(10~99):");
//		int num = sc.nextInt();
//		if(num%11==0)
//		{
//			System.out.println("10의 자리와 1의 자리가 같습니다");
//		}
//		else
//			System.out.println("10의 자리와 1의 자리가 같지 않습니다.");
		
	// 2. if~else if 활용
//		Scanner sc = new Scanner(System.in);
//		System.out.println("달을 입력하세요(1~12):");
//		int num = sc.nextInt();
//		if(num==3 || num==4 || num==5) // if(num>=3 && num<=5)
//		{
//			System.out.println("봄");
//		}
//		else if(num==6 || num==7 || num==8)
//		{
//			System.out.println("여름");
//		}
//		else if(num==9 || num==10 || num==11)
//		{
//			System.out.println("가을");
//		}
//		else if(num==12 || num==1 || num==2)
//		{
//			System.out.println("겨울");
//		}
//		else
//			System.out.println("잘못된 입력값입니다");
		
	// 2-2. switch 활용 
//		Scanner sc = new Scanner(System.in);
//		System.out.print("달을 입력하세요(1~12):");
//		int a=sc.nextInt();
//		switch(a)
//		{
//		case 3: case 4: case 5:
//			System.out.println("봄");
//			break;
//		case 6: case 7: case 8:
//			System.out.println("여름");
//			break;
//		case 9: case 10: case 11:
//			System.out.println("가을");
//			break;
//		case 12: case 1: case 2:
//			System.out.println("겨울");
//			break;
//		default:
//			System.out.println("잘못된 입력값입니다.");
//		}
		
	// 3.
//		int sum=0,i=1;
//		while(i<100) {
//			if(i%3!=0)
//			{
//				i++;
////				continue; // 생략가능 
//			}
//			else
//				sum+=i;
//				i++;
//		}
//		System.out.println("sum:"+sum);
		
	// 4.
//		int sum=0,i=1;
//		while(true)
//		{
//			if(i>50)
//				break;
//				sum+=i;
//				i++;
//		}
//		System.out.println(sum);
		
	// 5. 
//		int sum=0;
//		double avg;
//		for(int i=1;i<=10;i++)
//		{
//			int a=(int)(Math.random()*10)+1;
//			System.out.print(a+" ");
//			sum+=a;
//		}
//		avg = sum/10.0;
//		System.out.println("\n평균 : "+avg);
////	    System.out.printf("\n평균:%.1f\n",sum/10.0);

	// 6.
//		int sum = 0;
//		for(int i=1;i<=100;i++)
//		{
//			if(i%2==0)
//			{
//				sum+=i;
//			}
//		}
//		System.out.println(sum);
		
	// 7.
		int count=0;
		while(true)
		{
			int a=(int)(Math.random()*6)+1;
			int b=(int)(Math.random()*6)+1;
			count++;
			System.out.println("["+a+","+b+"]");
			if(a==b)
			{
				break;
			}
		}
		System.out.println("count:"+count);
	}

}
