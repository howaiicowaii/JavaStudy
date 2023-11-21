
public class MainClass_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object o="홍길동";
		// Object 클래스는 데이터형중에 가장 큰 데이터형이다
		/*
			Object i=1;
			i=10.5;
			i='A';
			i=new A();
		*/
//		String s=o; // 오류 발생. Object 보다 작은 String 에 Object를 넘길 수 없다
		String s=o.toString(); // toString() 으로 불러오면 된다 (가장 많이 사용)
//		String s=(String)o; // 이렇게 형변환도 가능 
//		String s=String.valueOf(o); // 이렇게 문자열로 변환도 가능 
		System.out.println(s);
	}

}
