/*
	접근지정어 : 사용범위 지정 
	-----------------------------------------------------------
	     자신의 클래스   같은 폴더에서만 사용   같은 폴더        모든 클래스 
	     에서만 사용     (패키지)          상속이 있는 경우
	     	                           다른 폴더로 접근 
	-----------------------------------------------------------
 private    O               X             X               X
=> 데이터 은닉화
=> 캡슐화
 default    O               O             X               X
 protected  O               O             O               X
 public     O               O             O               O
 
 => 클래스 , 멤버변수 , 멤버메소드 => 지역변수에서는 접근지정어가 없다
 
    클래스
     [접근지정어] class 클래스명 => 기본이 public : 모든 클래스에서 연결
     --------- public 
    멤버변수 
     [접근지정어] 데이터형 변수명 
     --------- 데이터 보호 (은닉화) private ==> 시쿼어 코딩
    멤버메소드 : 다른 클래스와 통신할 때 사용 => public
     [접근지정어] 리턴형 메소드명(매개변수 목록){}
     --------- public 
    생성자
     [접근지정어] 클래스명()
     --------- public 
     
   ---------------------------------------
   클래스 저장위치 설정 => 폴더안에 저장 
                      ---------- 패키지
*/
public class MainClass {
	public MainClass() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
