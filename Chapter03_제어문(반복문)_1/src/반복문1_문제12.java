
public class 반복문1_문제12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum7 = 0;
		int sum9 = 0; // sum7=sum9=0; 로 대체 가능
		for(int i=1;i<=1000;i++)
		{
			if(i%7==0)
			{
				sum7+=i;
			}
			if(i%9==0)
			{
				sum9+=i;
			}
		}
		System.out.println("7의 배수:"+sum7);
		System.out.println("9의 배수:"+sum9);
		System.out.println("7의 배수+9의 배수:"+(sum7+sum9));
	}

}
