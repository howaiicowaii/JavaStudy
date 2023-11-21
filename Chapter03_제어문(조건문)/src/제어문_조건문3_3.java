// 정수 1개를 입력받는다 
// 1 => 메모장 , 2 => 그림판 , 3 => 브라우저 
// => 메뉴 클릭 / 버튼 클릭 
import java.util.*;
public class 제어문_조건문3_3 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("번호 선택(1,2,3):");
		int no = sc.nextInt();
		
		if(no==1)
		{
			System.out.println("메모장을 선택하셨습니다!!");
		}
		else if(no==2)
		{
			System.out.println("그림판을 선택하셨습니다!!");
		}
		else if(no==3)
		{
			System.out.println("브라우저를 선택하셨습니다!!");
			// Runtime.getRuntime().exec(" ")
			// 크롬 우클릭 - 속성 - '대상'을 복사한 뒤 " " 안에 넣어주고 뒤 \ 빼주면 된다
			/*
			 *  \n
			 *  \t
			 *  \"  => " 으로 출력 
			 *  \\  => \ 으로 출력 
			 */
		}
		else
			System.out.println("메뉴가 존재하지 않습니다!!");
	}

}
