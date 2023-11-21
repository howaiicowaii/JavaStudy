/*
	알파벳 ==> 문자열은 안된다
	         ----------- 비교연산자를 사용할 수 없다
	         compare() 음수/양수/0 
	         String s="H";
	         String s1="K";
	         
	         s.compare(s1);
	         -         --	H I J K
	         H          K   ==> -2  => s1(=K)가 더 크다 / 0이면 같은 것
	         
	         D, F, D, S, Y => ASC / DESC : > , < 차이 
	        -- --
	         D  F
	        --     --
	         D     D
	        --        --
	         D        S
	        --          --
	         D           Y
	        -------------- 1Round
	         D  F  D  S  Y
	           -- --
	            D  F
	           --    --
	            D     S
	           --        --
	            D        Y
	        -------------- 2Round
	         D  D  F  S  Y
	               -  -
	               F  S
	               -     -
	               F     Y
	        -------------- 3Round
	         D  D  F  S  Y
	         -------  -  -
	                  S  Y
	        -------------- 4Round
*/
import java.util.*;
public class 배열_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] alpha=new char[10];
		for(int i=0;i<alpha.length;i++)
		{
			alpha[i]=(char)((Math.random()*26)+65);
		}
		System.out.println("===== 정렬전 =====");
		System.out.println(Arrays.toString(alpha));
		
		System.out.println("===== 정렬후 =====");
		for(int i=0;i<alpha.length-1;i++) // *** 첫번째꺼랑 첫번째꺼를 비교할 필요는 없기 때문 
		{
			for(int j=i+1;j<alpha.length;j++)
			{
				if(alpha[i]>alpha[j])
				{
					char temp=alpha[i];
					alpha[i]=alpha[j];
					alpha[j]=temp;
				}
			}
			System.out.println((i+1)+"Round==>"+alpha[i]);
			System.out.println(Arrays.toString(alpha));
		}
		System.out.println(Arrays.toString(alpha));
	}

}
