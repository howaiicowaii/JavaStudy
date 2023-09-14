package 연산자응용문제;

public class 응용문제01_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch = 'z'; 
//		System.out.println((int)'a'); // 97
//		System.out.println((int)'z'); // 122
//		System.out.println((int)'A'); // 65
//		System.out.println((int)'Z'); // 90
//	    boolean b = (ch>=97 && ch<=122 || ch>=65 && ch<=90 || ch>=0 ? true : false );
		boolean b = (ch>='A' && ch<='Z' || ch>='a' && ch<='z' || ch>=0 ? true : false);
	    System.out.println(b); 

	}

}
