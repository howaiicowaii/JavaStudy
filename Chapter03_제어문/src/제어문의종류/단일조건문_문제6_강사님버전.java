/*
 * 문제6. 임의의 문자를 추출하여 대문자인지 소문자인지 확인하는 프로그램 작성
 * => 다시 풀어보기 
 */
package 제어문의종류;

public class 단일조건문_문제6_강사님버전 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 대문자 : 65~90  , 소문자 : 97~122
		char c = ' ';
		int a = (int)(Math.random()*2); // 0,1,2
		if(a==0) // 대문자
		{
			c = (char)((Math.random()*26)+65);
			// A=>65       0+65
		}
		if(a==1) // 소문자
		{
			c = (char)((Math.random()*26)+97);
		}
//		System.out.println("c = "+c);
		// 대소문자 확인
		if(c>='A' && c<='Z')
			System.out.println(c+"는(은) 대문자입니다");
		if(c>='a' && c<='z')
			System.out.println(c+"는(은) 소문자입니다");
	}

}
