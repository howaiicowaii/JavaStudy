/*
 *  41p => 증감 (원하는 갯수만큼) => 복합 대입 연산자
 *    
 *     op=
 *     +=(o)
 *     -=(o) // 나머지는 덤. 두개만 알면 됨
 *     *=
 *     /=
 *     &=
 *     ^=
 *     |=
 *     >>=
 *     <<=
 *     
 *     한개 증가
 *     -------
 *     int a=10;
 *     a++ , ++a , a=a+1 ==> a+=1
 *     ----------
 *     두개 증가
 *     a++;
 *     a++;
 *     
 *     a=a+2 ==> a+=2
 *     
 *     a-- , --a
 *     a=a-a ==> a-=1 ===> 문자열 누적, 숫자 누적시에 주로 사용
 */
public class 복합대입연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		// a를 100증가
		a+=100;
		System.out.println(a);
		a-=50;
		System.out.println(a);
		
		/*
		 *   변수 수정
		 *   int a=10;
		 *   a=50; ==> 앞에다 int 또 붙이면 안된다 int는 선언
		 */
	}

}
