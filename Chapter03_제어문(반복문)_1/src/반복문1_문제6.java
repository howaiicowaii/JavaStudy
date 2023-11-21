// 1-2+3-4+5-6+7-8+9-10 계산 값을 for문을 이용하여 출력하라 
// ex) "1-2+3..-10까지의 합:-5"
// 다시 풀기
public class 반복문1_문제6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		for(int i=1;i<=10;i++)
		{
			if(i%2==0)
			{
				sum-=i;
			}
			else
			{
				sum+=i;
			}
		}
		System.out.print("1-2+3..-10까지의 합:"+sum);
	}

}
