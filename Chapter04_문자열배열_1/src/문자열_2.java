import java.util.*;
/*
	사용자로부터 입력값(문자열) => 좌우대칭 여부 확인
	ABBA => 문자갯수 => length()
*/
public class 문자열_2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String msg=""; // char 는 붙어있으면 안된다 => ' ' 띄어쓰기 필수
		// 오류 처리 
		while(true)
		{
			System.out.print("문자열 입력:");
			msg = sc.next();
			if(msg.length()%2==0)
			{
				break;
			}
		}
		// 좌우 대칭 확인 
		boolean bCheck = true; // true 면 좌우대칭
		/*
				ABBA
				-  -
				 --
		*/
		// ABCA
		// AA
		// BC
		for(int i=0;i<msg.length()/2;i++)
		{
			int j=msg.length()-1-i;
			char c=msg.charAt(i);
			char c1=msg.charAt(j);
			System.out.println(c+","+c1);
			if(c!=c1)
			{
				bCheck=false;
				break;
			}
			// 여기서 else 주고 bCheck=true; break; 해버리면 (break; 빼면 OK)
			// ABBA 중 AA 만 해버리고 맞아서 break;로 나가버려서 BB는 수행안하게 된다
			j--;
		}
		if(bCheck==false)
		{
			System.out.println(msg+"는(은) 대칭 구조가 아닙니다");
		}
		else
		{
			System.out.println(msg+"는(은) 좌우 대칭입니다!!");
		}
	}

}
