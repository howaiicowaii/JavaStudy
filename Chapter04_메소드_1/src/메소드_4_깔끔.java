import java.util.Scanner;

public class 메소드_4_깔끔 {

	static int userInput()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("단 입력(2~9):");
		return sc.nextInt();
	}
	// 받은 정수에 해당되는 구구단 출력 
	static void gugudan(int dan)
	{
		for(int i=1;i<=9;i++)
		{
			System.out.println(dan + "x" + i + "=" + i*dan);
		}
	}
	// 조립기
	static void process()
	{
		int dan=userInput();
		gugudan(dan);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process();
	}

}
