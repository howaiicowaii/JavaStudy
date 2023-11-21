// 알파벳 10개 => 버블 정렬 

import java.util.Arrays;

public class 배열_6 {

	public static void main(String[] args) {
		
		char[] arr=new char[10];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=(char)((Math.random()*26)+65);
		}
		System.out.println("===== 정렬전 =====");
		System.out.println(Arrays.toString(arr));
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length-1-i;j++)
			{
				if(arr[j]>arr[i])
				{
					char temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.println("===== 정렬후 =====");
		System.out.println(Arrays.toString(arr));
	}

}
