/*
 *   국어,영어,수학 점수를 받아서 총점과 평균을 구하는 프로그램을 작성
 *   => 학점을 출력
 */
public class 자바변수연습 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int 국어=99, 영어=77, 수학=66;
		int 총점=국어+영어+수학;
		double 평균=총점/3;
		char 학점='A';
		
		System.out.println(평균);
		System.out.println(학점);
	}

}
