/*
	로또 => 6개 정수 중복없이 추출 (1~45) => 출력 
	       -------------               --- 메소드는 2개면 될듯 (입력 없다)
*/
public class 메소드_3_4 {
	static int[] getRand(int count)
	{
		int[] lotto=new int[count];
		for(int i=0;i<lotto.length;i++)
		{
			lotto[i]=(int)(Math.random()*45)+1;
			for(int j=0;j<i;j++)
			{
				if(lotto[i]==lotto[j])
				{
					i--; // 중복인 경우 난수 i번째 다시 받아오기
					break;
				}
			}
		}
		return lotto;
	}
	static void print(int[] lotto)
	{
		for(int i:lotto)
		{
			System.out.print(i+" ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] lotto=new int[6];
//		for(int i=0;i<lotto.length;i++)
//		{
//			lotto[i]=(int)(Math.random()*45)+1;
//			for(int j=0;j<i;j++)
//			{
//				if(lotto[i]==lotto[j])
//				{
//					i--; // 중복인 경우 난수 i번째 다시 받아오기
//					break;
//				}
//			}
//		}
//		for(int i:lotto)
//		{
//			System.out.print(i+" ");
//		}
		int[] lotto=getRand(6);
		print(lotto);
	}

}
