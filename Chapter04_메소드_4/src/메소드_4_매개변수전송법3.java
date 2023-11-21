import java.util.*;
public class 메소드_4_매개변수전송법3 {
	static void change2(String s) // 기본형으로 취급 
	{
		s="Hello Method";
	}
	static void change(int[] arr)
	{
		// arr = temp
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=(int)(Math.random()*100)+1;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] temp = new int[5];
		System.out.println("적용전:");
		System.out.println(Arrays.toString(temp));
		System.out.println("적용후:");
		change(temp);
		System.out.println(Arrays.toString(temp));
		
		String ss="";
		change2(ss);
		System.out.println("ss="+ss);
		// 주소 같은 경우에는 저장ㄱ밧을 언제든 제어할 수 있다
		int[] a= {1,2,3};
		int[] b=a;
		int[] c=a;
		int[] d=a; // 다 같은 메모리 주소이기 때문에 다 같은 값 
		d[0]=10;
		System.out.println("a[0]="+a[0]);
	}

}
