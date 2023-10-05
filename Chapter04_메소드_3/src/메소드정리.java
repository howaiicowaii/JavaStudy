/*
    * 프로그램의 유형 
      = 네트워크 : 게임 , 화상채팅 ...
      = 데이터베이스 : 웹
	1. 리턴형 
	   = 요청 처리에 대한 결과값 전송 (= 넘겨줄 값)
	                  --------
	                    = 한개 (기본형) => 정수,실수,문자,논리
	                    = 여러개 (배열,클래스)
	  리턴형은 2가지                    ----- 상세보기 , 목록...
	   = 결과값이 없는 경우 : 수정, 추가, 삭제 ==> void
	   			     void ==> 출력
	   = 결과값이 있는 경우 : 목록, 상세보기, 검색 ... ==> 해당 데이터형
	2. 매개변수 
	   = 사용자가 요청값을 받을 경우 (= 받을 값)
	   = 여러개 사용이 가능 => 3개이상은 배열/클래스로 처리
	   = 가변 매개변수
	3. 메소드명 
	   = 식별자 => 문자갯수(제한은 없지만) : 10글자 이내로 (나중에 호출 어렵다)
	   = 두개의 단어가 있는 경우 
	     userInput() , user_input()
	     aaa() => delete() -> 이 방식이 가독성이 좋다
	     bbb() => board_insert() -> 가독성 
	4. return 문
	   => 가급적이면 메소드 마지막에 설정 
	   => void 일 경우 생략이 가능하다
	5. 형식 
	   리턴형 메소드명(매개변수...)
	   {
	   	  return 값; (리턴형과 return 값의 데이터형 일치해야한다)
	   }
	6. 메소드 유형 
	   리턴형 / 매개변수 
	     O      O
	     O      X
	     ----------- 출력 내용이 있는 경우 
	     X      O
	     X      X
	     ----------- 메소드 자체 처리
	7. 사용 목적
	   = 다른 클래스와 연결 (메세지) => 메소드 호출 
	   = 재사용 
	   = 반복 제거
	   = 수정이 편리하게 
	   = 에러 처리가 쉽게 
	 -----------------------------
	8. 메소드 형태 
	   = static
	   = instance : 교재 
*/
public class 메소드정리 {
//	static void data(String s)
//	{
//		System.out.println(s);
//	}
	static void data(String...s) // 가변 매개변수(...)
	{
		for(String ss:s)
		{
			System.out.println(ss);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		data("aaa");
		data("aaa","bbb");
		data("aaa","bbb","ccc");
	}

}
