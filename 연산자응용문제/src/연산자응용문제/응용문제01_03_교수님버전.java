/*
 *  다음은 대문자를 소문자로 변경하는 코드인데, 
 *  문자 ch에 저장된 문자가 대문자인 경우에만 소문자로 변경한다. 
 *  문자코드는 소문자가 대문자보다 32만큼 더 크다. 
 *  예를 들어 'A'의 코드는 65이고, 'a'의 코드는 97이다. 
 *  알맞은 코드를 넣으세요.
 */
package 연산자응용문제;
import java.util.Scanner;
public class 응용문제01_03_교수님버전 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner scan = new Scanner(System.in);
//		System.out.println("문자 입력:");
//		char ch=scan.next().charAt(0);
//		System.out.println("ch="+ch);
//		char lowerCase=(ch>='A' && ch<='Z'?(char)(ch+32):ch);
//		System.out.println("변경된 값:"+lowerCase);
		
		Scanner scan = new Scanner(System.in);
		System.out.println("문자 입력:");
		char ch=scan.next().charAt(0);
		System.out.println("ch="+ch);
		char lowerCase=(ch>='A' && ch<='Z'?(char)(ch+32):(char)(ch-32));
		System.out.println("변경된 값:"+lowerCase);
		
	}

}
