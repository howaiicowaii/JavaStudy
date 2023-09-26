/*
	substring() => 문자를 자른다
	
		"Hello Java"
		 0123456789
		 
		 substring(6) => "Java"
		 substring(0,5) => "Hello"
		             -- 제외
*/
public class 문자열_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String s="Hello Java";
//		String s1=s.substring(0, 5); // Hello
//		String s1=s.substring(6); // Java
//		System.out.println(s1);
		String address="서울특별시 강남구 도산대로51길 36 지번 서울시 강남구 신사동 655";
//		String s1=address.substring(0, 20);
//		System.out.println(s1);
//		String addr=address.substring(0,address.indexOf("지번"));
//		System.out.println(addr);
//		String addr2=address.substring(address.indexOf("지번")+3); // '지번 '을 삭제
//		System.out.println(addr2);
//		int a = address.lastIndexOf(" ");
//		String addr3=address.substring(a-3,a);
//		System.out.println(addr3);
		String ext="Hello.Java.java";
		String s=ext.substring(ext.lastIndexOf(".")+1); // java
		System.out.println(s);
	}

}
