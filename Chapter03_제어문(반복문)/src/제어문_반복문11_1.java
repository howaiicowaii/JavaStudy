
public class 제어문_반복문11_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a3=0,b5=0,c7=0;
		
		for(int i=1;i<=10;i++)
		{
			int rand = (int)(Math.random()*10)+1;
			System.out.print(rand+" ");
			if(rand%3==0)
			{
				a3++;
			}
			if(rand%5==0)
			{
				b5++;
			}
			if(rand%7==0)
			{
				c7++;
			}
		}
			System.out.println("\n=====결과값=====");
			System.out.println("3의 배수:"+a3);
			System.out.println("5의 배수:"+b5);
			System.out.println("7의 배수:"+c7);
			
			System.out.println("===========================");
			// 1-2+3-4+5-6+7-8+9-10
			int sum = 0;
			for(int i=1;i<=10;i++)
			{
				if(i%2==0)
				{
					sum-=i;
				}
				else
					sum+=i;
			}
			// BDFHJLN
			for(char c='B';c<='N';c+=2)
			{
				System.out.print(c+" ");
			}
	/*
	 * 		for문 수행시에 => 수열 (숫자마다 패턴을 가지고 있어야 반복문이 수행된다)
	 * 		1-2+3-4+5-6+7-8+9-10
	 */

	}
}
