// 1~100까지 => 3의 배수의 합 , 5의 배수의 합 , 7의 배수의 합 => 출력
public class 제어문_반복문5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int three = 0;
		int five = 0;
		int seven = 0;
		for(int i=1;i<=100;i++)
		{
			if(i%3==0)
			{
				three+=i;
			}
			if(i%5==0)
			{
				five+=i;
			}
			if(i%7==0)
			{
				seven+=i;
			}
			
		}
		System.out.println("1~100까지 3의 배수의 합:"+three);
		System.out.println("1~100까지 5의 배수의 합:"+five);
		System.out.println("1~100까지 7의 배수의 합:"+seven);
	}

}
