// 20개의 정수 난수 발생 => 짝수 , 홀수의 갯수 
public class 제어문_반복문11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int even = 0, odd = 0;
		for(int i=0;i<20;i++)
		{
			int rand = (int)(Math.random()*10)+1;
			System.out.print(rand+" ");
			if(rand%2==0)
				even++;
			else
				odd++;
		}
		System.out.println("\n======== 결과값 =========");
		System.out.println("짝수의 갯수:"+even);
		System.out.println("홀수의 갯수:"+odd);
		
	}

}
