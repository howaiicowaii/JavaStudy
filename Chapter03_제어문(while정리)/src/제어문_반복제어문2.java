// break 공부 많이 해둬야한다 => while , for => System.exit(0) = 프로그램 종료해버린다
public class 제어문_반복제어문2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=3;i++)
		{
			for(int j=1;j<=3;j++)
			{
				if(j==2)
					break;
				System.out.println("i="+i+",j="+j);
			}
		}
		
		System.out.println("====== continue ======");
		
		for(int i=1;i<=3;i++)
		{
			for(int j=1;j<=3;j++)
			{
				if(j==2)
					continue; // => j++ 증감식으로 이동 
				System.out.println("i="+i+",j="+j);
			}
		}
		
		System.out.println("====== 이름있는 break ======");
		
		outer:for(int i=1;i<=3;i++)
		{
			for(int j=1;j<=3;j++)
			{
				if(j==2)
					break outer; // 이름은 마음대로 해도 상관없다
				System.out.println("i="+i+",j="+j);
			}
		}
	}

}
