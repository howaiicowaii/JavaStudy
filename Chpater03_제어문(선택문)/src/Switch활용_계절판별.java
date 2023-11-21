import java.util.Scanner;

public class Switch활용_계절판별 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("계절 입력 : ");
		int a = sc.nextInt();
		
		switch(a)
		{
		case 12: case 1: case 2: 
			System.out.println(a+"월은 겨울입니다.");
			break;
		case 3: case 4: case 5: 
			System.out.println(a+"월은 봄입니다.");
			break;
		case 6: case 7: case 8: 
			System.out.println(a+"월은 여름입니다.");
			break;
		case 9: case 10: case 11: 
			System.out.println(a+"월은 가을입니다.");
			break;
		default:
			System.out.println("잘못된 입력값입니다.");
		}
	}

}
