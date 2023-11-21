import java.util.*;
public class 배열_13 {

	public static void main(String[] args) {

		int[] arr=new int[10];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=(int)(Math.random()*100)+1;
		}
		System.out.println(Arrays.toString(arr));
		
		Scanner sc = new Scanner(System.in);
		int sum = 0; // Scope => 사용 범위 
		while(true)
		{
			System.out.println("===== 메뉴 =====");
			System.out.println("1.최대값,최소값 출력");
			System.out.println("2.총합");
			System.out.println("3.평균");
			System.out.println("4.종료");
			System.out.println("============");
			System.out.print("메뉴 선택:");
			int menu=sc.nextInt();
			
			if(menu==4)
				break;
			else if(menu==1)
			{
				int max=arr[0];
				int min=arr[0];
				
				for(int i:arr)
				{
					if(max<i)
						max=i;
					if(min>i)
						min=i;
				} // i 는 이 블럭 안에만 존재했다가 블럭 밖에선 사라지는 값
				System.out.println("최대값:"+max);
				System.out.println("최소값:"+min);
			} // max, min 은 이 블럭 안에만 존재하고 블럭 밖에선 사라지는 값
			else if(menu==2)
			{
				sum=0;
				for(int i:arr)
				{
					sum+=i;
				}
				System.out.println("총합:"+sum);
			}
			else if(menu==3)
			{
				System.out.printf("평균:%.2f\n",sum/10.0);
				
			}
			else
				System.out.println("잘못된 입력값입니다.");
			
		}
	}

}
