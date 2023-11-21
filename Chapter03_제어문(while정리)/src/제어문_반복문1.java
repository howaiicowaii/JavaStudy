/*
		제어문 : 프로그램을 제어 => 반복수행 , 선택한 부분만 출력
				사용자 요청 처리...
		for		: 반복 횟수가 존재 => 화면 UI
					=> 웹 프로그램 (Front)
					형식)
							  1    2    4  => 2번으로 다시 이동 반복
					 	for(초기값;조건식;증감식)
					 		반복 수행문장 3
					 	1-2-3-4
					 	  2-3-4
					 	    ... 2(조건식)이 false면 종료
					 	초기값 => 조건 검색	
					 			=> true => 반복문장 수행  => 초기값을 증가
					 			=> false => 종료
					 	-------------------------------------------
					 	=> 2차 for문 (중첩조건문)
					 	=> 알고리즘 (정보처리)
					 	   정렬 , 검색 ...
					 	=> 형식)
					 	          1    2    7
					 		for(초기값;조건식;증감식) => 줄의 수 
					 		{
					 		    ---------------------
					 		          3    4    6
					 			for(초기값;조건식;증감식)
					 			{
					 				한줄에 출력 내용 5
					 			}
					 			---------------------
					 		}
		while	: 반복 횟수가 없는 경우 => 서버(Back)
					=> 크롤링 , 데이터베이스 , 파일 읽기
					   -------------------------- 
					=> 선조건 (수행을 못할 수도 있다)
					형식)
						초기값 ---------- 1
						while(조건식) --- 2 => true/false (false면 종료)
						{
							반복수행문장 -- 3 
							증감식 ------ 4
						}
						==> while(true) => 무한루프
		do~while: 무조건 한번 이상 수행
				  	=> 웹 (사용빈도 거의 없다)
				  	=> 후조건 (한번은 반드시 수행)
				  	형식)
				  		초기값 -----------1
				  		do{
				  			반복수행문장----2
				  			증감식--------3
				  		}while(조건식);---4 => 증가된 값을 조건 검색 
				  		
				  	int i=1;
				  	do{
				  		System.out.println(i); 1,2...10
				  		i++; => i=1, i=2 ... i=10, i=11
				  	}while(i<=10)
		----------- 반복문 
*/
public class 제어문_반복문1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("===== for =====");
		for(int i=1;i<=10;i++)
		{
			System.out.print(i+" ");
		}
		System.out.println("\n====== while =====");
		int i=1;
		while(i<=10)
		{
			System.out.print(i+" ");
			i++;
		}
		System.out.println("\n===== do~while =====");
		i=1;
		do {
			System.out.print(i+" ");
			i++;
		}while(i<=10);
	}

}
