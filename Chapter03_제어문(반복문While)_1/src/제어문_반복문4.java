// 사용자로부터 정수 1개 => 구구단 해당 단만 출력 
import java.util.*;
public class 제어문_반복문4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("단 입력 : ");
		int dan = sc.nextInt();
		
		int i=1;
		while(i<=9)
		{
			System.out.printf("%d * %d = %d\n",dan,i,dan*i);
			i++;
		}
		
	}

}
