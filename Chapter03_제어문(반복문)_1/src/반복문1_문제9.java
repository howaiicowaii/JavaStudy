
public class 반복문1_문제9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		int count = 0; // sum=count=0; 으로 쓸 수도 있다
		for(int i=100;i<=999;i++)
		{
			if(i%4!=0)
			{
				sum+=i;
				count+=1; // count++; 로 대체 가능
			}
		}
		System.out.println("갯수:"+count);
		System.out.println("합:"+sum);
	}

}
