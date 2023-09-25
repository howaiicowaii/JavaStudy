import java.util.*;
public class 배열_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("년도 입력:");
		int year=sc.nextInt();
		
		System.out.print("월 입력:");
		int month=sc.nextInt();
		
		System.out.print("일 입력:");
		int day=sc.nextInt();
		// API
		Calendar cal=Calendar.getInstance();
		// 메모리 할당 => 싱글턴 (한개만 생성)
		cal.set(Calendar.YEAR, year);
		cal.set(Calendar.MONTH, month-1); // 0 을 1월로 하기 때문에 -1 해주기 
		cal.set(Calendar.DATE, day);
		
		char[] strWeek= {'일','월','화','수','목','금','토'};
		int week=cal.get(Calendar.DAY_OF_WEEK); // 요일 읽기 
		System.out.println(year+"년도 "+month+"월 "
				+day+"일은 "+strWeek[week-1]+"요일입니다"); 
		// week은 1번부터 저장해서 -1 해주기 or '일' 앞에 ' ' 공백 하나 추가해서 한개 버리기
	}

}
