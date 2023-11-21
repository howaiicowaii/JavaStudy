
public class 제어문_문제6_강사님버전 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int kor = (int)(Math.random()*51)+50; // 0~100 => *101 일때 
		int eng = (int)(Math.random()*51)+50;
		int math = (int)(Math.random()*51)+50;
		System.out.println("국어 점수 : "+kor);
		System.out.println("영어 점수 : "+eng);
		System.out.println("수학 점수 : "+math);
		System.out.println("총점 : "+(kor+eng+math));
		double avg = (kor+eng+math)/3.0;
		System.out.printf("평균 : %.2f\n",avg);
		
		//학점 
		char score = 'A';
		int temp = (int)(avg/10);
		switch(temp) // 정수, 문자, 문자열  case 1 , case '+' , case "+"
		{
		case 10: case 9:
			score='A';
			break;
		case 8:
			score='B';
			break;
		case 7:
			score='C';
			break;
		case 6:
			score='D';
			break;
		default:
			score='F';
		}
		System.out.println("학점 : "+score+"학점");
	}

}
