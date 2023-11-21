/*
	3명의 학생 => 국어, 영어, 수학 : 총점 , 평균 , 학점 , 등수
	                                             --- 
	                                             
*/
import java.util.Scanner;
public class 배열_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 변수 설정
		int[] kor=new int[3];
		int[] eng=new int[3];
		int[] math=new int[3];
		int[] total=new int[3];
		int[] rank=new int[3];
		
		double[] avg=new double[3];
		char[] score=new char[3];
		
		// 1명 => index번호가 같은 것
		// 초기화
		// ---- 국어,영어,수학
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<kor.length;i++) // i<=kor.length 로 하면 3까지 총 4개된다
		{
			System.out.print((i+1)+"번째 학생 국어 점수:");
			kor[i] = sc.nextInt();
			
			System.out.print((i+1)+"번째 학생 영어 점수:");
			eng[i] = sc.nextInt();
			
			System.out.print((i+1)+"번째 학생 수학 점수:");
			math[i] = sc.nextInt();
			
			total[i]=kor[i]+eng[i]+math[i];
			avg[i]=total[i]/3.0;
		}
		// 학점 출력 
		for(int i=0;i<kor.length;i++)
		{
			switch((int)(avg[i]/10))
			{
			case 10:
			case 9:
				score[i]='A';
				break;
			case 8:
				score[i]='B';
				break;
			case 7:
				score[i]='C';
				break;
			case 6:
				score[i]='D';
				break;
			default:
				score[i]='F';
			}
		}
		// 등수 구하기
		for(int i=0;i<kor.length;i++) // 1차 
		{
			rank[i]=1;
			for(int j=0;j<kor.length;j++) // 2차
			{
				if(total[i]<total[j])
				{
					rank[i]++;
				}
			}
		}
		// 출력 for-each 는 하나만 가져올 때 사용할 수 있다. 일반 for문이 여러개 가져올 때
		for(int i=0;i<kor.length;i++)
		{
			System.out.printf("%-5d%-5d%-5d%-7d%-7.2f%-5c%-5d\n",
					kor[i],eng[i],math[i],total[i],avg[i],score[i],rank[i]);
		}
		
	}

}
