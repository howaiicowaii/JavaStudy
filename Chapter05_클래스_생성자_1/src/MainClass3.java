class Member{
	// 우선 순위는 명시적인 초기화 (이게 불가능할 때 생성자나 초기화 블록 사용)
	// 1 
	int mno=1;
	String id="admin";
	String pwd="1234";
	String name="홍길동"; // 명시적 초기화
	// Member(){} // 생성자 없을 경우 자동으로 생성
	
	//2 
	{ // 초기화 블록 
		mno=3;
		id="park";
		pwd="1234";
		name="심청이";
		// 파일 읽어서 값 대입 // 생성자나 초기화 블록은 자주 사용X 기본에 값 대입
		// 초기화 블록 or 생성자 둘 중 하나만 쓴다 같이 쓰지는 않는다
	}
	// 3
//	Member(){ // 생성자 
//		mno=2;
//		id="hong";
//		pwd="1234";
//		name="박문수";
//	}
}
public class MainClass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member m1=new Member(); // 메모리 저장 => 생성자 호출 
		System.out.println("번호:"+m1.mno);
		System.out.println("ID:"+m1.id);
		System.out.println("PWD:"+m1.pwd);
		System.out.println("Name:"+m1.name);
		System.out.println("==========");
		Member m2=new Member();
		System.out.println("번호:"+m2.mno);
		System.out.println("ID:"+m2.id);
		System.out.println("PWD:"+m2.pwd);
		System.out.println("Name:"+m2.name);
	}

}
