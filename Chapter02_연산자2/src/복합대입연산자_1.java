/*
 *   *= , /=
 *     int a=10;
 *     a*=20; ====> a = a*20; ==> a = 10*20 ==> 200
 *     
 *     int a=10;
 *     a/=3; ====> a = a/3; ==> a = 10/3; ==> 3
 */
public class 복합대입연산자_1 {
	public static void main(String[] args) {
		int a=10;
		a*=20;
		System.out.println("a="+a);
		// a = 200
		// a=10; 으로 변수 a 값을 다시 10으로 바꿔줄 수도 있다
		a/=3;  // ==> 200 / 3 = 66 (int 이기에 소수점은 x )
		System.out.println("a="+a);
		// final int A=10; << 앞에 final 쓰면 상수됨. 상수는 연산 안된다.
		//          (상수는 대문자)
		
	}
}
