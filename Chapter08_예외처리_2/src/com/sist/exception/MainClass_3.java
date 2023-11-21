package com.sist.exception;

public class MainClass_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 선택적인 부분 ==> 오류 발생시 제외 ==> 크롤링할 때 사용 (안맞는 데이터가 많기 때문)
		//try
		//{
			for(int i=1;i<=10;i++)
			{
				try // for 문 안에 try~catch 문 
				{
				int j=(int)(Math.random()*3);
				System.out.println("j="+j);
				System.out.println("i="+i+","+"i/j="+(i/j));
				// 제외 => coutinue; 와 같은 효과
				}catch(Exception ex) {}
			}
		//}catch(Exception ex) {}

	}

}
