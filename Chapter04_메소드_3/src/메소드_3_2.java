/*
	정수를 입력 => 0~32767 -> 16bit => 2진법을 출력하는 메소드 
	입력 , 2진법 , 출력 => 조립
*/
import java.util.Scanner;
public class 메소드_3_2 {
	// 입력 받는 메소드 
	static int userInput()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력(0~32767):");
		int num = sc.nextInt();
		return num;
	}
	// 2진법 으로 바꾸는 메소드 
	static int[] change(int num)
	{
		int[] binary=new int[16];
		int index=15;
		while(true)
		{
			binary[index]=num%2;
			num=num/2; // num 값이 1이 되면 1/2= 0이기 때문에 종료된다
			if(num==0)
				break;
			index--;
		}
		return binary;
	}
	
	// 출력 하는 메소드 
	static void print(int[] binary)
	{
		for(int i=0;i<binary.length;i++)
		{
			if(i%4==0 && i!=0)
				System.out.print(" ");
			System.out.print(binary[i]);
		}
	}
	// 조립
	static void process()
	{
		// 입력값 받기 
		int num=userInput();
		int[] arr=change(num);
		print(arr);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process();
		
		// 입력창
//		Scanner sc = new Scanner(System.in);
//		System.out.print("정수 입력(0~32767):");
//		int num = sc.nextInt();
//		
//		// 처리
//		int[] binary=new int[16];
//		int index=15;
//		while(true)
//		{
//			binary[index]=num%2;
//			num=num/2; // num 값이 1이 되면 1/2= 0이기 때문에 종료된다
//			if(num==0)
//				break;
//			index--;
//		}
//		
//		// 출력 
//		for(int i=0;i<binary.length;i++)
//		{
//			if(i%4==0 && i!=0)
//				System.out.print(" ");
//			System.out.print(binary[i]);
//		}
		
		
	}

}
