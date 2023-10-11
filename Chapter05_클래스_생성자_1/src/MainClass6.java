class B
{
	int a=10;
	B(){ // 생성자는 리턴형이 붙어있으면 안된다
		System.out.println("B클래스의 디폴트 생성자 호출");
	}
	/*
		생성자 => 초기화가 필요하다 (명시적인 초기화가 불가능할 때)
		        제어문 / 파일 읽기 할 때
		     => 시작과 동시에 처리를 해야할 때 => 가장 먼저 호출(생성자)
		        --------------
		              |
		           자동 로그인 
		           윈도우 화면 설정
		           서버 연결 
		           데이터베이스 연결 
	*/
}
public class MainClass6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		B();
//		new B(); // 생성자 호출 : 생성자는 호출할 때 앞에 new 붙여야 한다 
//		new B().a=100; // 새로운 메모리에 100 을 넣었기 때문에 아래서 불러도 10
		B b=new B(); 
//		b.B();
//		b.a=100;
//		new B().a=1000; // 새로운 주소에 저장했기 때문에 기존 a값은 변경 X
//		System.out.println(b.a);
	}

}
