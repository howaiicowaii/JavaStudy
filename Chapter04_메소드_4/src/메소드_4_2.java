/*
	리턴형(O) , 매개변수(X)
	=> 아이디 중복체크 
*/
import java.util.Scanner;
public class 메소드_4_2 {
	static String idInput()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("ID 입력:");
//		String id = sc.next(); // 이렇게 하고 return id; 하는 것은 비효율적
		return sc.next(); 
	}
	// 아이디 중복체크 
	static boolean idCheck(String id)
	{
		boolean bCheck = false;
		// 오라클 
		String[] ids= {
				"hong","admin","lee","park","shim"
		};
		for(String i:ids)
		{
			if(id.equals(i))
			{
				bCheck = true;
				break;
			}
		}
		return bCheck;
	}
	// 모든 메소드를 조립하는 메소드 (기본)
	static void process()
	{
		// 사용자가 입력한 값 
		String id = idInput();
		boolean bCheck = idCheck(id);
		
		if(bCheck)
			System.out.println(id+"는 이미 사용중인 아이디입니다");
		else
			System.out.println(id+"는 사용 가능한 아이디입니다");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process();
	}

}
