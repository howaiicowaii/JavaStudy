/*
문제4. 사용자로부터 세 개의 정수를 입력받아, 그 수들의 최대값과 최소값, 
         합계와 평균을 구해보자.
*/
package 제어문의종류;

public class 단일조건문_문제4_강사님버전 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    int a = (int)(Math.random()*100)+1;
	    int b = (int)(Math.random()*100)+1;
	    int c = (int)(Math.random()*100)+1;
	    System.out.println(a+","+b+","+c);
	    System.out.println("합계 : "+(a+b+c));
	    System.out.printf("평균 : "+(a+b+c)/3.0);
	    System.out.println(" ");
	    int max = a;
	    if(max<b)
	    	max = b;
	    if(max<c)
	    	max = c;
	    System.out.println("최대값 : "+max);
	    int min = a;
	    if(min>b)
	    	min = b;
	    if(min>c)
	    	min = c;
	    System.out.println("최소값 : "+min);
	}

}
