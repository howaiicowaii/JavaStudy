/*
	프로그램을 짜려면...
	벤치마킹 ===> 요구사항 분석 ===> 데이터 저장 ===> 구현 
	------ 
	 사이트 한페이지  클래스   ==> new    ==> method
	 ----
	  |
	상세보기   ---------------> new ------- 동작 (메뉴,버튼,클릭..)
	클래스 => 114p ~ 115p
	---- 
	 ***명사적 특징 : 멤버변수 (= new)
	 동사적 특징 : 메소드 
	 ------------------ + 
	 
	 ex) 
	 	학생 
	 	학교이름 , 전공 , 학년 , 성별 , 이름 ... => 멤버변수 (명사적 특징)
	 	수업을 듣는다, 시험을 본다, 게임한다, 걷는다 => 메소드 (동사적 특징)
	 객체 => 현실세계 / 비현실세계 를 특성화한 것이다
	                           ----- 공통적인 내용을 포함
	                                 ----------
	                                   추상화 => 단순화
	 ------------------------------------------------
	 형식 
	 class ClassName
	 {
	 	---------------
	 	 멤버변수 => 클래스 전체 사용 가능 (전역변수) (클래스변수, 인스턴스변수)
	 	 new를 이용할 때 따로 생성되는 변수 : 객체변수, 인스턴스 변수
	 	 ---
	 	 컴파일시에 자동으로 생성되는 변수 : 공유변수 , 정적변수 (=클래스 변수)
	 	 ------------------------- static 
	 	 => 메모리 공간이 1개만 생긴다
	 	---------------
	 	 생성자 => 필요시마다 사용
	 	---------------
	 	 메소드
	 	---------------
	 	  => 기본형식 
	 	  => 순서는 상관없다
	 }
	 
*/
// 클래스 설계
class Recipe{
	// 멤버변수 => 자동 초기화 (처음부터 초기값을 갖고 있는 상태)
	/*
		String  => null (주소를 갖고 있지 않은 상태)
		int     =>  0
		double  => 0.0
		boolean => false
		char    => '\0'
	*/
	String poster;
	String title;
	String chef;
	int score;
	String hit;
	int showUser;
}
public class MainClass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Recipe r1 = new Recipe();
//		System.out.println(r1.poster);
//		System.out.println(r1.title);
//		System.out.println(r1.score);
		
		r1.poster="https://recipe1.ezmember.co.kr/cache/recipe/2016/03/22/34653c3f0b81699d266dcfc1418365c01_m.jpg";
		r1.title="소고기무국 황금레시피, 재료는 간단! 맛은 최고!";
		r1.chef="쑤이";
		r1.score=5;
		r1.hit="215.9만";
		r1.showUser=828;
		
		System.out.println("====== 레시피 정보 ======");
		System.out.println("Poster:"+r1.poster);
		System.out.println("Title:"+r1.title);
		System.out.println("Chef:"+r1.chef);
		System.out.println("조회수:"+r1.hit);
		System.out.println("사용자:"+r1.showUser);
		System.out.println("평점:*****");
		
		Recipe r2 = new Recipe();
		
		r2.poster="https://recipe1.ezmember.co.kr/cache/recipe/2015/08/25/a01d013a6b6f9d526c43f4659db2cd61_m.jpg";
		r2.title="돼지고기 김치찌개 맛내는 비법";
		r2.chef="완소연홍";
		r2.score=5;
		r2.hit="246.2만";
		r2.showUser=969;
		
		System.out.println("====== 레시피 정보 ======");
		System.out.println("Poster:"+r2.poster);
		System.out.println("Title:"+r2.title);
		System.out.println("Chef:"+r2.chef);
		System.out.println("조회수:"+r2.hit);
		System.out.println("사용자:"+r2.showUser);
		System.out.println("평점:*****");
	}

}
