/*
 * 		1차 for
 * 		for(시작점;어디까지;몇씩증감)
 * 			초기값  조건식  ++,+=,--,-=
 * 		ex) 1~100
 * 			int i=1; i<=100; i++
 * 		ex) 1~100 => 홀수만 출력 (if문 없이도 가능)
 * 		--------------------- 
 * 		문자는 정수 (문자는 모든 연산시 정수로 변경된다)
 * 		for(int i=...
 * 			----- for문 {} 블럭 안에서만 사용이 가능하다
 * 		변수 사용 범위 {} 블럭을 벗어나면 메모리 해제 
 * 
 * 		{
 * 			int a=10;
 * 			{
 * 				int b=20;
 * 				{
 * 					int c=30;
 * 				}
 * 			}
 * 		}
 * 
 * 		중첩 for => 2차 for문 
 * 
 * 		for(초기값;조건식;증감식)
 * 		{
 * 			for(초기값;조건식;증감식)
 * 			{
 * 			
 * 			}
 * 		}
 */
public class 제어문_반복문_2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//  for(int i=1;i<=100;i+=2) // 홀수만 출력 if문을 반드시 달아야 하는 건 아니다
//		for(int i=2;i<=100;i+=2) // 짝수만 출력 
//		{
//				System.out.print(i+" ");
//		}
		for(int i=1;i<=4;i++) // 줄의 수 
		{
			for(int j=1;j<=i;j++) // 실제 출력물
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
