import java.util.Arrays;
import java.util.*;

public class 문자열_배열문제_0927 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	// 1. 5명의 학생의 국어점수를 받아서 등수를 출력하는 프로그램 작성
//		int[] kor=new int[5];
//		int[] rank=new int[5];
//		
//		// 국어 점수 등록 
//		for(int i=0;i<kor.length;i++)
//		{
//			kor[i]=(int)(Math.random()*50)+50;
//		}
//		System.out.println("국어 점수 출력 :");
//		System.out.println(Arrays.toString(kor));
//		// 등수 구하기
//		for(int i=0;i<rank.length;i++)
//		{
//			rank[i]=1;
//			for(int j=0;j<kor.length;j++)
//			{
//				if(kor[i]<kor[j])
//				{
//					rank[i]++;
//				}
//			}
//		}
//		// 결과 출력 
//		for(int i=0;i<kor.length;i++)
//		{
//			System.out.println(kor[i]+" "+rank[i]);
//		}
		
	// 2. 10개의 임의의 정수를 받아서 최대값,최소값(난수)  구하는 프로그램 작성
		
//		int[] arr=new int[10];
//		int max=0;
//		int min=100;
//		for(int i=0;i<arr.length;i++)
//		{
//			arr[i]=(int)(Math.random()*100)+1;
//			if(max<arr[i])
//				max=arr[i];
//			if(min>arr[i])
//				min=arr[i]; // 이렇게도 가능 for-each 로도 가능
//		}
//		System.out.println("배열 저장된 값");
//		System.out.println(Arrays.toString(arr));
//		System.out.println("최대값:"+max);
//		System.out.println("최소값:"+min);
		
		
	// 3. 100 개의 난수(0~9)를 발생하여 빈도수를 구하는 프로그램을 작성하시오

//		int[] arr=new int[100];
//		for(int i=0;i<arr.length;i++)
//		{
//			arr[i]=(int)(Math.random()*10);
//		}
//		
//		int[] count=new int[10];
//		for(int i=0;i<arr.length;i++)
//		{
//			count[arr[i]]++;
//		}
//		for(int i=0;i<count.length;i++)
//		{
//			System.out.println(i+":"+count[i]);
//		}
//		----------------------------------------
		// word count 
//		int[] arr=new int[100];
//		int[] count=new int[10];
//		
//		// 초기값 
//		for(int i=0;i<arr.length;i++)
//		{
//			arr[i]=(int)(Math.random()*10);
//		}
//		System.out.println(Arrays.toString(arr));
//		// 빈도수 구하기
//		for(int i:arr)
//		{
//			count[i]++; // 인덱스 번호 (0~9) 이용
//		}
//		
//		for(int i=0;i<count.length;i++)
//		{
//			System.out.printf("count[%d]=%d\n",i,count[i]);
//		}
		
	// 4. 10개의 난수를 발생하여 배열에 저장한 후에 인덱스가 1인 곳의 값을 출력하시오.	
		
//		int[] arr=new int[10];
//		int max=0;
//		int index=0;
//		for(int i=0;i<arr.length;i++)
//		{
//			arr[i]=(int)(Math.random()*100)+1;
//			System.out.print(arr[i]+" ");
//			if(max<arr[i])
//			{
//				max=arr[i];
//				index=i;
//			}
//		}
//		System.out.println("\n=========");
//		System.out.println("인덱스 1 :"+arr[1]);
//		System.out.println("최대값 : "+max);
//		System.out.println("최대값의 인덱스 번호 : "+index);
		
//		------------------------------------------
//		int[] arr=new int[10];
//		// 초기값 
//		for(int i=0;i<arr.length;i++)
//		{
//			arr[i]=(int)(Math.random()*100)+1;
//			// double random() => 0.0 ~ 0.99
//			// Random r=new Random() => r.nextInt(100) => 0~100 발생
//		}
//		System.out.println(Arrays.toString(arr));
//		System.out.println("인덱스가 1인 곳의 값:"+arr[1]);
		
	// 5. 위 문제 배열 중에서 최대값의 인덱스를 출력하시오. 
		

	// 6. 10개의 난수를 배열 안의 모든 값을 더하고, 총합과 평균을 출력하시오.

//		int[] arr=new int[10];
//		int sum = 0;
//		for(int i=0;i<arr.length;i++)
//		{
//			arr[i]=(int)(Math.random()*100)+1;
//			sum+=arr[i];
//		}
//		System.out.println("총합 : "+sum);
//		System.out.printf("평균 : %.2f\n",(sum/10.0));
//		-----------------------------------------------
//		int[] arr=new int[10];
//		// 초기값 
//		for(int i=0;i<arr.length;i++)
//		{
//			arr[i]=(int)(Math.random()*100)+1;
//		}
//		System.out.println(Arrays.toString(arr));
//		// 총합 / 평균 
//		int sum = 0;
//		for(int i:arr)
//		{
//			sum+=i;
//		}
//		System.out.println("총합 : "+sum);
//		System.out.printf("평균 : %.2f\n",sum/10.0);
		
	// 7. 10개의 난수를 배열에 저장 후에 배열의 인덱스가 3인 곳은 출력하지 말고, 나머지만 출력하시오
		
//		int[] arr=new int[10];
//		for(int i=0;i<arr.length;i++)
//		{
//			arr[i]=(int)(Math.random()*100)+1;
//			if(arr[3]==arr[i])
//			{
//				continue;
//			}
//			System.out.println(i+" 번째 : "+arr[i]+" ");
//		}
//		-------------------------------------------------
//		int[] arr=new int[10];
//		// 초기값 
//		for(int i=0;i<arr.length;i++)
//		{
//			arr[i]=(int)(Math.random()*100)+1;
//		}
//		System.out.println(Arrays.toString(arr));
//		
//		for(int i=0;i<arr.length;i++)
//		{
//			if(i==3)
//			{
//				continue; // 인덱스가 3인 것은 제외 => 증가식으로 이동
//			}
//			System.out.println(arr[i]+" ");
//		}
		
	// 8. 5개의 난수를 배열에 저장한 후에 인덱스번호 두개를 받아서 값을 교환하는 프로그램을 작성하시오
		
//		-----------------------------------------
//		int[] arr=new int[5];
//		for(int i=0;i<arr.length;i++)
//		{
//			arr[i]=(int)(Math.random()*100)+1;
//		}
//		System.out.println(Arrays.toString(arr));
//		Scanner sc = new Scanner(System.in);
//		System.out.print("첫번째 인덱스 입력 : ");
//		int index1 = sc.nextInt();
//		System.out.print("두번째 인덱스 입력 : ");
//		int index2 = sc.nextInt();
//		
//		// 교환 => 임시 변수 
//		int temp=arr[index1];
//		arr[index1]=arr[index2];
//		arr[index2]=temp;
//		
//		System.out.println(Arrays.toString(arr));
		
	// 9,10. char 배열을 생성하여, 알파벳 A~Z까지 대입 후, 출력하시오
//		     위문제를 역순으로 출력하시오		
		
//		char[] arr=new char[26];
//		char c='A';
//		for(int i=0;i<arr.length;i++)
//		{
//			arr[i]=c++;
//		}
//		for(char i:arr)
//		{
//			System.out.print(i);
//		}
//		System.out.println();
//		for(int i=arr.length-1;i>=0;i--) // 역순으로
//		{
//			System.out.print(arr[i]);
//		}
	// 11. 정수 10개를 입력받아 배열에 저장하고, 배열에 있는 정수 중에서 3의 배수만 출력하시오	
		
//		int[] arr=new int[10];
//		// 초기값 
//		for(int i=0;i<arr.length;i++)
//		{
//			arr[i]=(int)(Math.random()*100)+1;
//		}
//		System.out.println(Arrays.toString(arr));
//		
//		for(int i:arr)
//		{
//			if(i%3==0)
//				System.out.print(i+" ");
//		}
	// 12. 10개의 정수를 입력받아서 짝수의 최대값,홀수의 최대값을 출력하는 프로그램을 작성하시오
		
		
		
	// 13. 3명의 학생에 대한 국어,영어,수학 점수를 입력받아서 저장후에 총점,평균,등수를 구하고 
//		국어점수 총점,영어점수 총점,수학점수의 총점을 구해서 출력하는 프로그램을 작성하시오
		

	}

}
