/*
	1. 1~10까지 출력하는 메소드 구현 => 이미 지정되어 있으니 사용자 요청값 X => 매개변수 X
	
	리턴형 메소드명(매개변수...)
	{			---------- 가변 매개변수
		=> 자체에서 출력 void (결과값 없는 상태)
	}
	메소드 : 기능처리 (연산자+제어문)
	       = 다른 클래스 연결
	       = 재사용 (호출) 
-----------------------
	static void print()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.print(i+" ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		print();
	}
-----------------------
	2. 1~10까지 합을 구하는 메소드 구현
	   ---------------- 사용자 요청하는 값은 없다 => 매개변수 X
	   메소드 자체에서 출력할 것인지 / 결과값을 넘겨서 main에서 출력할 것인지 
	   결과값 받아서 출력해보기 -> 리턴형 O
----------------------- (내가 한 거)
	static void num()
	{
		int sum = 0;
		for(int i=1;i<=10;i++)
		{
			sum += i;
		}
		System.out.println("1~10까지의 합:"+sum);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		num();
	}
-----------------------
	static int sum()
	{
		int hap = 0;
		for(int i=1;i<=10;i++)
		{
			hap += i;
		}
		return hap;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int hap = sum();
		System.out.println("hap:"+hap);
	}

*/
public class 메소드_문제_1번2번 {
	static int sum()
	{
		int hap = 0;
		for(int i=1;i<=10;i++)
		{
			hap += i;
		}
		return hap;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int hap = sum();
		System.out.println("hap:"+hap);
	}

}
