/*
	2차 for문
	--------
	for(초기값;조건식;증감식) ==> 줄의 수 (row)
	{
		for(초기값;조건식;증감식) ==> 실제 출력물
		{        ----- 설정 (수열=방정식) => 수와 수의 관계
							--------- 분석 (넘파이,판다스)
							   MatPlotLib => 시각화 
							   R => 자바에서 연동 (Rserve)
			반복 수행 문장
		}
		System.out.println();
	}
	
	==> 등수 구하기 , 빈도 구하기 , 정렬(선택,버블) ... 
	
	  *
	 **
	***
   ****
    
   i(줄수) j(공백)       k(별수)
   	 1		3  =  4      1
   	 2		2  =  4      2
   	 3		1  =  4      3
   	 4		0  =  4      4
   	 i+j=4 j=4-i
*/

// ****
//  ***
//   **
//    *
/*
 *    
 *  i(줄수) j(공백)       k(별수)
   	 1		0            4
   	 2		1            3
   	 3		2            2
   	 4		3            1
   	 i=j+1 j=i-1
*/
public class 제어문_반복문_정리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
//		for(int i=1;i<=4;i++)
//		{
//			for(int j=1;j<=4-i;j++)
//			{
//				System.out.print(" ");
//			}
//			for(int k=1;k<=i;k++)
//			{
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i-1;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=5-i;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
