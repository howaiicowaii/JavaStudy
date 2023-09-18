/*
 * 		단일 조건문 = true일 경우에만 처리 => false는 건너뛴다 
 * 		선택 조건문 = true일때 처리 , false일때 처리를 나눠서 작업 
 * 		--------   ex) 아이디 중복체크 
 * 					   중복일 경우	=> 이미 사용중인 ID입니다 
 * 					   중복이 아닌 경우 => 사용이 가능한 ID입니다 
 * 		형식)
 * 			if(조건문)
 * 			{
 * 				조건문이 true일 경우 
 * 			}
 * 			else
 * 			{
 * 				조건문이 false일때 처리 
 * 			}
 * 			==> 간결하게 처리하기 위해 삼항연산자 (웹,게임)
 * 
 * 			=> 짝수 / 홀수 
 * 			=> 대문자 / 소문자 
 * 			=> 웹 => 페이지 
 */
public class 제어문_조건문2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c = 'A';
		// 대문자인지 소문자인지 확인 
//		if(c >='A' && c <='Z') // 대문자 여부 확인 조건문 
//		{
//			System.out.println(c+"는(은) 대문자입니다.");
//		}
//		if(c >='a' && c <='z') // 소문자 여부 확인 조건문 
//		{
//			System.out.println(c+"는(은) 소문자입니다.");
//		}
		if(c >='A' && c <='Z') // 대문자 여부 확인 조건문 
		{
			System.out.println(c+"는(은) 대문자입니다.");
		}
		else // if~else = 선택조건문 
		{
			System.out.println(c+"는(은) 소문자입니다.");
		}
		// else 문장은 독립적으로 사용 불가능 => if문과 같이 사용
		// else 문장을 바로 위에 있는 if만 지원한다
		/*
		 * 		if()
		 * 		{
		 * 		}
		 * 		---------
		 * 		if()
		 * 		{
		 * 		}
		 * 		---------
		 * 		if()
		 * 		{
		 * 		}
		 * 		else
		 * 		{
		 * 		}
		 * 	
		 */
		int a = 10;
		if(a % 2 == 0)
		{
			System.out.println(a+"는(은) 짝수입니다.");
		}
		else
		{
			System.out.println(a+"는(은) 홀수입니다.");
		}
	}

}
