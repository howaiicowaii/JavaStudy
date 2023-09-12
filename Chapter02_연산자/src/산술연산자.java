/*
 *   가장 기본이 되는 연산자 : 산술연산자 (38p)
 *   
 *     산술연사자 : + , - , * , / , %(나누고 나머지값)
 *     ------- 이항연산자 (피연산자 (연산 대상) 2개)
 */
public class 산술연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// + (산술)
		// 국어,영어,수학점수의 총점을 구한다
		int kor=89;
		int eng=90;
		int math=87;
		int total=kor+eng+math;
		double avg=total/3.0;
		System.out.println("국어점수:"+kor);
		System.out.println("영어점수:"+eng);
		System.out.println("수학점수:"+math);
		System.out.println("총점:"+total);
		// 평균
		System.out.println("평균:"+avg);
		System.out.printf("평균:%.2f\n",avg); // %.2f < 소수점 2자리 출력
		
		System.out.println("======== % ========");
		int a=5;
		int b=2;
		System.out.println(a+"%"+b+"="+(5%2));
		System.out.println(-a+"%"+b+"="+(-5%2));
		System.out.println(a+"%"+-b+"="+(5%-2));
		System.out.println(-a+"%"+-b+"="+(-5%-2)); // 앞의 부호 따라감
		System.out.println("======== 형변환 ========");
		/*
		 *  자동 형변환
		 *    작은 데이터형 => 큰 데이터형
		 *  강제 형변환
		 *    큰 데이터형 => 작은 데이터형
		 *    (데이터형)값
		 *       ===============================> 자동 형변환
		 *  byte < char < int < long < float < double
		 *       <=============================== 강제 형변환
		 *       
		 *  자동 형변환
		 *  int a='A';
		 *    => a=65
		 *  double d=100;
		 *           ---- int
		 *    => d=100.0
		 */
		int aa='A';
		System.out.println("aa="+aa);
		double dd=100;
		System.out.println("dd="+dd);
		
		System.out.println(100+10.5+10.5F+'A'); // double형이 나옴
		//         100.0 + 10.5 + 10.5 + 65.0 = 186.0
		// 자동 형변환이 있는 경우 => 연산은 같은 데이터형끼리만 연산
		/*
		 *  'A'+10
		 *  --- -- int
		 *   char => 65 + 10 => 75
		 */
		System.out.println('A'+'B'); // 65+66 = 131
		// int 이하 (byte,char,short) 연산 => 결과값은 int 로 나온다
		// 25p, 26p, 28p, 30p, 38p => 핵심부분
	}

}
