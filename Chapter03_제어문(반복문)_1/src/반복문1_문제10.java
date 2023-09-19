
public class 반복문1_문제10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int evensum = 0;
		int oddsum = 0;
		for(int i=1;i<=30;i++)
		{
			if(i%2==0)
			{
				evensum+=i;
			}
			else
			{
				oddsum+=i;
			}
		}
		System.out.println("짝수합:"+evensum);
		System.out.println("홀수합:"+oddsum);
	}

}
