// 
//다시 풀기 
public class 반복문1_문제7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int sum = 0;
//		for(int i=1;i<=10;i++)
//		{
//
//			if(i%3==0)
//			{
//				i = 0; // << 여기 처리하면 될듯 ?
//				continue;
//			}
//			else
//			{
//				System.out.println(i);
//				sum+=i;
//			}
//			System.exit(0);
//			
//		}
//		---------------------------------------------
		for(int i=1;i<=10;i++)
		{
			if(i%3==0)
				continue; // i++ 이동 (증가식으로 이동)
			System.out.print(i+" ");
		}
		
	}

}
