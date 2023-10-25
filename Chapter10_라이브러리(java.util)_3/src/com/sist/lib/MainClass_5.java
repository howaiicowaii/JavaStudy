package com.sist.lib;
/*
	=> 메소드 (340p)
	=> 검색 => 
*/
import java.util.*;
public class MainClass_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list=
				new ArrayList<Integer>(); 
		// 정수값만 메모리에 저장해서 관리 => <Integer>
		/*
			Wrapper => 기본형을 클래스형  int -> Integer
			           => 기능을 부여 
			           => 제네릭을 사용 
		    => 장점은 Wrapper 클래스와 기본형 호환이 된다는 것 
		    Integer => 10,20,30... (= 오토박싱)
		    Integer i=10; ==> 리턴형이 Integer 지만 int 로 받을 수도 있다 (= 언박싱)
		*/
		// 추가 => add()
		list.add(10); // 0 => 인덱스는 add 하는 순서대로 
		list.add(20); // 1
		list.add(30); // 2 
		list.add(40); // 3
		list.add(50); // 4 
		
		for(int i=0;i<list.size();i++)
		{
			int val=list.get(i); 
			// 리턴형이 Integer 지만 int 로도 받을 수 있다 => 형변환 이 필요없다는 장점
			System.out.println(i+":"+val);
		}
		System.out.println("======");
		
		list.add(3,60); // 가급적이면 사용하지 않는다 (인덱스 밀려서 속도 저하된다)
		// 원래 3번째 인덱스인 40이 4번 인덱스로 밀린다 
		for(int i=0;i<list.size();i++)
		{
			int val=list.get(i); 
			// 리턴형이 Integer 지만 int 로도 받을 수 있다 => 형변환 이 필요없다는 장점
			System.out.println(i+":"+val);
		}
		System.out.println("======");
		
		list.remove(3); // 인덱스 3번째에 있는 60 이 삭제되면서 40이 3번째 인덱스로 온다
		for(int i=0;i<list.size();i++)
		{
			int val=list.get(i); 
			// 리턴형이 Integer 지만 int 로도 받을 수 있다 => 형변환 이 필요없다는 장점
			System.out.println(i+":"+val);
		}
		// 인덱스 번호는 0번 부터 ==> size() : 갯수  i<list.size()
		// 인덱스를 초과하면 오류 발생 
		// for-each 로 출력하는 게 좋다 
		System.out.println("======");
		for(int i:list)
		{
			System.out.println(i);
		}
		System.out.println("======");
		System.out.println("데이터 저장 갯수:"+list.size());
		// list.size()==0 => 장바구니가 비어있습니다
		System.out.println("데이터가 없는지:"+list.isEmpty()); // 있으니 false
		// 라이브러리 => 메소드 isXxx() => boolean
		// setXxx => void (값만 설정) (값 넣기)
		// getXxx => 리턴형이 있다 (가져오니깐)
		System.out.println("======");
		list.clear();
		System.out.println("데이터 저장 갯수:"+list.size()); // 0
		System.out.println("데이터가 없는지:"+list.isEmpty()); // 없으니 true
		/*
			setXxx
			getXxx
			isXxx
			remove
			delete
		*/
	}

}
