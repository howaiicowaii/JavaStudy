package com.sist.lib;
/*
	335p => 자바의 컬렉션 
	        ---------- 자료구조 (데이터 관리)
	        => 데이터를 모아서 관리하는 클래스의 집합 
	           --------------- CRUD 
	           Create / Read / Upload / Delete
	            추가      읽기     수정      삭제 
	           => 메모리에서 => 영구적으로 저장이 안된다 
	           => 영구적인 저장 장치 : 파일 / 오라클 
       Collection => 인터페이스 를 이용한다 (표준화)
           |
      ----------------------------
      |            |             |
    List          Set           Map   => 인터페이스 (표준화) (메소드동일)
	
	List : 순서를 가지고 있다 (인덱스) => 배열을 보완하는 클래스 
	       데이터의 중복을 허용          배열의 단점 : 고정적, 같은 데이터형만 모을 수 있다
	       => *** ArrayList         컬렉션 = 가변형(크기를 지정하지 않는다)
	       => Vector 
	       => LinkedList
	       
	 Set : 순서가 없다 (일반 데이터명으로 찾는다)
	       데이터의 중복을 허용하지 않는다 
	       => *** HashSet 
	       => TreeSet
	       
	 Map : 순서가 없다 
	       데이터 중복이 가능 
	       Key , value => 쌍으로 만들어진다 (key 를 갖고 value 데이터를 찾는다)
	       --- key 는 중복될 수 없다
	       => *** HashMap
	       => Hashtable 
	       
	 335p
	   Collection => 데이터를 일정 공간에 모아서 관리할 목적 
	   ---------- => 웹에서 목록 출력 (모아서 => 브라우저)
	     1) 배열의 단점을 보완 (저장 크기를 결정해야한다 = 배열) => 고정적
	        => 컬렉션 => 크기 결정을 하지 않는다 (가변형)
	     2) 인터페이스를 이용한다 
	        ------- 표준화 (모든 개발자가 동일한 메소드를 이용)
	     => 프레임워크 : Spring/MyBatis/JQuery/VueJS/ReactJS(만드는 형태를 동일하게 만든 것)
	         | 일정 기본 틀 => 쉽게 다른 개발자의 코딩을 분석 
	           --------- 유지 보수 
	    Collection
	        |
	 ----------------------
	 |         |          |
    List      Set        Map
     |         |          |
     |     --------       ---------
     |     |      |       |       |
     |  HashSet TreeSet  HashMap Hashtable
  ------------------
  |         |      |
 ArrayList Vector LinkedList 
 
	List : 가장 많이 사용되는 컬렉션 
	    ***ArrayList : Vector 를 보완 => 비동기적으로 처리 => 데이터베이스 연동에 사용 
	       Vector : 동기적 => 네트워크에서 접속자 정보 저장할 때 
	       LinkedList : C언어 개발자 겨냥 => C언어와 호환 
	----------------------------------------------------
	 컬렉션       읽기(접근시간)    추가/삭제      비고 
	----------------------------------------------------
	 ArrayList   속도가 빠르다      느리다    순차적으로 추가/삭제 빠르다 
	                                     비효율적인 메모리 사용 
	             => 웹 => 자체에서 추가/삭제를 하지 않는다 
	                      오라클를 이용해 추가/삭제 
	----------------------------------------------------
	 LinkedList  속도가 느리다      빠르다    데이터가 많을수록 접근성이 떨어진다 
	             => 윈도우를 이용하면 LinkedList 가 더 빠르다 (웹은 ArrayList가 빠르다)
	----------------------------------------------------
	
	 Set : 중복이 없는 데이터를 만들 때 
	       ---------------------- HashSet
	       검색 최적화 : TreeSet
	 
	 Map => Hashtable 의 단점을 보완한 것 => HashMap (key, value 쌍으로 이루어졌다)
	        HashMap => 웹에서 가장 많이 사용 
	                  1) 관련된 클래스 관리 => Spring, MyBatis
	                  2) 웹소켓 (웹 네트워크) => sessionId
	                  
     List
     ----
      1. ArrayList
        = 장점 
          배열형식으로 만들어져 있다 => 인덱스를 이용해서 처리 
                                 접근 속도가 빠르다 
        = 단점 
          중간에 추가 / 삭제 => 속도가 저하된다 (인덱스 번호 바뀌면서)
        = 항상 인덱스 번호는 순차적으로 유지 => 속도 저하 원인 
          0 1 2 3 4 5
          => 3 삭제 
          0 1 2 3 4 => 자동으로 처리 
          0 1 2 3 4 5
               |
              추가 (추가된 게 3번이 되고 뒷번호들 밀린다)
        = 사용처 
          데이터의 양이 일관적이고 추가 , 삭제가 없는 경우 주로 사용 
          => 데이터베이스 
          데이터의 접속 속도를 중요시할 때 (웹)
          
          --------------- ArrayList
            10 20 30 40 
          ---------------
            0  1  2  3
            
          ---  ---  ---  --- LinkedList 
           10 --20 --30 --40
          ---  ---  ---  ---
          
          => 주요 메소드 ==> 웹의 핵심 : 데이터를 어떻게 공유할 것이냐 
             --------- 
         *** 1) 추가 
                 add(데이터)
                 add(int index,데이터) => 속도가 느려진다 (인덱스 번호바뀌어야 해서)
             2) 수정 
                 set(int index,데이터) 
             3) 삭제 
                 remove(int index)
         *** 4) 읽기 
                 get(int index)
         *** 5) 저장 갯수 확인 
                 size()
             6) 전체 지우기 
                 clear()
             -------------
*/
import java.util.*;
public class MainClass_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list=new ArrayList(); // Object. 어떠한 데이터든 들어갈 수 있다
		// 가급적이면 같은 데이터를 첨부하는 것이 유리하다 
		// 추가 : 가급적이면 이 방식을 쓰는 것이 편하다. 아래 방식은 밀려나기 때문
		list.add("홍길동"); // 0 (인덱스) 추가하는 순서대로 
		list.add("심청이"); // 1 
		list.add("이순신"); // 2 
		list.add("강감찬"); // 3 
		list.add("춘향이"); // 4
		
		// 출력 
		for(int i=0;i<list.size();i++) // size() 저장 갯수만큼 
		{
			Object name=list.get(i); // 데이터 읽기 (인덱스 번호줘야 읽어온다)
			System.out.println(i+"."+name);
		}
		
		System.out.println("=========");
		
		// 추가 : 인덱스 밀려나기 때문에 가급적이면 위 방식을 쓰는 게 편하다 
		list.add(2,"을지문덕"); // 원래 2번인 이순신 을 밀어내고 을지문덕이 2번이 된다
		
		for(int i=0;i<list.size();i++) // size() 저장 갯수만큼 
		{
			Object name=list.get(i); // 데이터 읽기 (인덱스 번호줘야 읽어온다)
			System.out.println(i+"."+name);
		}
		
		// 삭제 remove(int index) 
		System.out.println("=========");
		list.remove(3); // 인덱스 3번째 꺼 삭제 
		for(int i=0;i<list.size();i++) // size() 저장 갯수만큼 
		{
			Object name=list.get(i); // 데이터 읽기 (인덱스 번호줘야 읽어온다)
			System.out.println(i+"."+name);
		}
		
		// 수정 set(int index,데이터)
		System.out.println("=========");
		list.set(2, "박문수"); // 2번 을지문덕 이 박문수 로 바뀐다
		for(int i=0;i<list.size();i++) // size() 저장 갯수만큼 
		{
			Object name=list.get(i); // 데이터 읽기 (인덱스 번호줘야 읽어온다)
			System.out.println(i+"."+name);
		}
		System.out.println("=========");
		System.out.println("현재 인원:"+list.size()); // 데이터 개수 확인 size()
		System.out.println("=========");
		
		// 전체 삭제 => clear()
		list.clear(); // 데이터 전체 삭제 
		System.out.println("현재 인원:"+list.size()); // 0명 
		/*
			add() => 데이터 추가
			size() => 저장된 갯수
			get() => 읽기 
			remove() => 삭제 
			set() => 수정 
			clear() => 전체 데이터 삭제 
		*/
	}

}
