import java.util.Scanner;
public class 배열_생성1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] kor=new int[3]; // int kor1,kor2,kor3
		// 0 1 2  kor[0] kor[1] kor[2]
		int[] eng=new int[3];
		int[] math=new int[3];
		int[] total=new int[3];
		double[] avg=new double[3];
		
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<3;i++)
		{
			System.out.print((i+1)+"번째 학생 국어:");
			kor[i]=sc.nextInt();

			System.out.print((i+1)+"번째 학생 영어:");
			eng[i]=sc.nextInt();
			
			System.out.print((i+1)+"번째 학생 수학:");
			math[i]=sc.nextInt();
			
			total[i]=kor[i]+eng[i]+math[i];
			avg[i]=total[i]/3.0;
		}
		
		for(int i=0;i<3;i++)
		{
			System.out.printf("%-5d%-5d%-5d%-7d%-5.2f\n", // %-5d 5칸중 왼쪽부터
					kor[i],eng[i],math[i],total[i],avg[i]);
		}
	}

}
