import java.util.Scanner;
// equals (==) : 대소문자 구분 
// equalsIgnoreCase : 대소문자 구분 X (검색기능에서 필요)
public class 문자열8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final String MID="admin",MPWD="1234";
		Scanner sc = new Scanner(System.in);
		System.out.print("아이디 입력:");
		String id=sc.next();
		System.out.print("비밀번호 입력:");
		String pw=sc.next();
		// equals => 대소문자 구분 
		if(id.equalsIgnoreCase(MID) && pw.equals(MPWD)) // equalsIgnoreCase
														//   ㄴ 대소문자 구분 X
		{
			System.out.println(id+"님 로그인되었습니다.");
		}
		else
		{
			System.out.println("ID나 Password가 틀립니다.");
		}

	}

}
