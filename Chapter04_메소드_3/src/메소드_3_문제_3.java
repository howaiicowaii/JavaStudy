// 국어,영어,수학 점수 입력 => 총점,평균 출력
// process() 제외하고 4개의 메소드 나올듯 (입력, 총점, 평균, 출력)
import java.util.*;
public class 메소드_3_문제_3 {
	static int userInput(String msg)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print(msg+" 입력:");
		int num = sc.nextInt();
		return num;
		
	}
	static int total(int kor,int eng,int math)
	{
		return kor+eng+math;
	}
	static double avg(int total)
	{
		return total/3.0;
	}
	static void print(int kor,int eng,int math,int total,double avg,
			char c)
	{
		System.out.printf("%-5d%-5d%-5d%-7d%-7.2f%-3c\n",
				kor,eng,math,total,avg,c);
	}
	static char score(int avg)
	{
		char c='A';
		switch(avg)
		{
		case 10:
		case 9:
			c='A';
			break;
		case 8:
			c='B';
			break;
		case 7:
			c='C';
			break;
		case 6:
			c='D';
			break;
		default:
			c='F';
		}
		return c;
	}
	static void process()
	{
		int kor=userInput("국어");
		int eng=userInput("영어");
		int math=userInput("수학");
		int total=total(kor,eng,math);
		double avg=avg(total);
		char c=score((int)(avg/10));
		print(kor,eng,math,total,avg,c);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int kor=userInput("국어");
//		int eng=userInput("영어");
//		int math=userInput("수학");
		
// //		Scanner sc = new Scanner(System.in); // 위 3줄로 대체 
// //		System.out.print("국어 입력:");
// //		int kor = sc.nextInt();
// //		System.out.print("영어 입력:");
// //		int eng = sc.nextInt();
// //		System.out.print("수학 입력:");
// //		int math = sc.nextInt();
		
//		int total = kor+eng+math;
//		double avg = total/3.0;
//		
//		System.out.printf("%-5d%-5d%-5d%-7d%-7.2f\n",
//				kor,eng,math,total,avg);
		
		process();
	}

}
