
public class 자바데이터형변경 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int _int=(int)100.934590; // (int) => 소수점이하를 제거
		System.out.println("_int:"+_int);
		
		byte _byte=(byte)300;
		
		System.out.println("_byte"+_byte); // byte는 127까지만 가능
		                                   // 00101100 
		                                   //(2진법 해서 뒤 8자리만 남아서 32+8+4 = 44)
		System.out.println(0b00101100);
	}

}
