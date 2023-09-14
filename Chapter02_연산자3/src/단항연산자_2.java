// 형변환 연산자
/*
 *  (int)값
 *  
 *  ==> 크기
 *  byte < char < int < long < float < double
 */
public class 단항연산자_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 65;
		double d = (double)a; // UpCasting
		// 생략이 가능
		char c = (char)a;  // DownCasting
		// 특수한 경우 => 생략이 가능(실제 값 대입한 경우) (char 와 int 는 서로 생략가능)
		// char c=65; < 가능
		// 연산처리가 되면 생략할 수 없다
	    System.out.println("a = "+a);
	    System.out.println("d = "+d);
	    System.out.println("c = "+c);
	    c = '0';
	    System.out.println("c = "+(int)c);

	    
	}

}
