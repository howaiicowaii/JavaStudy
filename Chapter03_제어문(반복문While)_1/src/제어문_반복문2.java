/*
	  while
	  -----
	    => 10개의 난수 => 1~100 
	    => 최대값 / 최소값 
*/
public class 제어문_반복문2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int max = 1,min = 100; // max 를 100 으로 하면 바로 100 나와버리니 1로 선언
		int i=1; // 루프변수 => 1~10까지 10번
		while(i<=10)
		{
			int rand = (int)(Math.random()*100)+1;
			System.out.print(rand+" ");
			// 최대값, 최소값 구하기
			if(max<rand)
				max = rand;
			if(min>rand)
				min = rand;
			i++;
		}
		System.out.println("\n최대값 : "+max);
		System.out.println("최소값 : "+min);
		
		
	}

}
