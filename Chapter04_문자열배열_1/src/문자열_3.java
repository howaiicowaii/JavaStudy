/*
		String toUpperCase() => 대문자 변환 
		String toLowerCase() => 소문자 변환
*/
public class 문자열_3 {

	public static void main(String[] args) {
		
		String msg="Hello Java";
		msg = msg.toUpperCase(); // msg.toUpperCase(); 만 입력하면 msg 변경 X
//									msg=msg.toUpperCase(); 로 저장해줘야한다
		System.out.println(msg);
//		msg=msg.toLowerCase();
		System.out.println(msg.toUpperCase()); // 대문자로 출력 but, no 저장
		System.out.println(msg.toLowerCase()); // 소문자로 출력 but, no 저장
//		msg=msg.toLowerCase(); // msg를 소문자로 변환 후 저장
		System.out.println(msg);
		// => msg= 안했으니 처리는 됐지만 저장은 안되서 원본을 유지한다
		// 대문자로 변환하는 것은 가끔
		// 오라클에서 대소문자 구분
	}

}
