import java.util.*;
public class 제어문_반복문3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int kor,eng,math;
		int total;
		double avg;
		Scanner sc = new Scanner(System.in);
		/*
		 * 	for(int i=1;i<=3;i++)
		 * 	{
		 * 		while(true) // 무한루프 
				{
				System.out.print("국어 점수 입력:");
				kor = sc.nextInt();
				if(kor>=0 && kor<100)
				{
				break; // 종료 
				}
				}
		 * 	}
		 */
		while(true) // 무한루프 ==> 반드시 종료 조건 있어야 한다
		{
			System.out.print("국어 점수 입력:");
			kor = sc.nextInt();
			if(kor>=0 && kor<100)
			{
				break; // 종료 
			}
		}
		while(true) // 무한루프 
		{
			System.out.print("영어 점수 입력:");
			eng = sc.nextInt();
			if(eng>=0 && eng<100)
			{
				break; // 종료 
			}
		}
		while(true) // 무한루프 
		{
			System.out.print("수학 점수 입력:");
			math = sc.nextInt();
			if(math>=0 && math<100)
			{
				break; // 종료 
			}
		}
		total=kor+eng+math;
		avg=total/3.0;
		System.out.println("국어:"+kor);
		System.out.println("영어:"+eng);
		System.out.println("수학:"+math);
		System.out.println("총점:"+total);
		System.out.printf("평균:%.2f",avg);
	}

}
