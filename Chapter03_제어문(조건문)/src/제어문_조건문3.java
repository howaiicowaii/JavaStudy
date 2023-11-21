/*
 * 		다중 조건문 => 결과값이 1개만 도출
 * 		형식)
 * 			if(조건문)
 * 			{
 * 				조건이 true일 때 수행되는 문장 ====> 수행 후 종료된다
 * 				|
 * 			}   |  << false일 때 아래 else if(조건문) 으로 넘어간다
 * 			else if(조건문)
 * 			{
 * 				조건이 true일 때 수행되는 문장 ====> 수행 후 종료된다
 * 			    |
 * 			}   |  << false일 때 아래 else if(조건문) 으로 넘어간다
 *			else if(조건문)
 *			{
 *			
 *			}
 *			...
 *			...
 *			else // 생략 가능 => 해당 조건이 없는 경우에 처리 
 *			{
 *			}
 *			// 한개의 문장만 수행 (= 다중 조건문)
 *			// 게임 , 네트워크 서버 (자바(X) , C/C++)
 * 
 */
// 국어,영어,수학 점수를 입력받아서 => 총점,평균,학점,합격/불합격 출
import java.util.*;
public class 제어문_조건문3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 데이터를 저장할 공건 => 변수
		int kor,eng,math,total;
		double avg;
		char score = ' '; // 명시적인 초기화
		// 입력값을 받는다
		
		Scanner sc = new Scanner(System.in);
		System.out.print("국어점수 : ");
		kor = sc.nextInt();
		System.out.print("영어점수 : ");
		eng = sc.nextInt();
		System.out.print("수학점수 : ");
		math = sc.nextInt();
		
		// 초기화 
		total = kor+eng+math;
		avg = total/3.0;
		// 학점 => 평균 => >=90 A , >= 80 B , >= 70 C , >= 60 D , 60< F
		if(avg>=90)
			score='A';
		else if(avg>=80)
			score='B';
		else if(avg>=70)
			score='C';
		else if(avg>=60)
			score='D';
		else if(avg<60)
			score='F';
		
		System.out.println("====== 결과값 ======");
		System.out.println("국어 : "+kor);
		System.out.println("영어 : "+eng);
		System.out.println("수학 : "+math);
		System.out.println("총점 : "+total);
		System.out.printf("평균 :%.2f\n", avg);
		System.out.println("학점 : "+score);

		// 결과값을 출력 => 제어문 , 연산자 ==> DOS, 브라우저, 모바일
		
		
	}

}
