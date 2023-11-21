package com.sist.lib;
/*
	= 중복 데이터 ==> ArrayList
	= 중복이 없는 데이터 => HashSet 
	= 두개를 저장해서 찾는다 => HashMap : 클래스 찾기 , SQL 찾기 
	                      -------- Annotation
	-------------------------------
	
	Map => 인터페이스 (349p)
	--- 
	 | 
	----------------
	|              |
  Hashtable      HashMap => Hashtable 을 보완 
                            => 동기 / 비동기 (속도 빠른 건 비동기)
                            => Ajax
    특징 
     = 두개를 동시에 저장 (key,value) => Map
     = key 는 중복할 수 없다 , value 는 중복이 가능 
       ex) ("id","hong")
           ("id","shim") ==> get("id") 뭘 가져올지 모르기 때문에 key 중복되면 안된다
     = 사용처 
       웹에서 제공하는 90% 클래스 => Map 을 이용하고 있다
       => 데이터 전송 
          HttpServletRequest
          ------------------ 서버에서 브라우저로 값 전송
          setAttribute("id","hong")
          setAttribute("pwd","1234")
          => session / cookie
                       ------ 최신 방문 
       => 라이브러리
          Spring ==> HashMap => key , 클래스 객체 
           => 클래스 관리 => 클래스 찾기 (DL)
                          -------- getBean("key")
              객체의 생명주기 => 생성 ~ 소멸 (= Spring)
              => WEB (라이브러리 일부)
          MyBatis ==> 데이터베이스와 관련 => ORM
           => SQL 문장을 관리 => key 
          -----------> 등록 (XML,Annotation)
        => 주요메소드 
           1) 저장 => put("key",value)
                         ----- 반드시 문자로 시작 
           2) 읽기 => get(key)
           ----------------------------------
           프로그램 : 데이터가 많이 있다 
             => 구분할 줄 알아야 한다 
             ArrayList => 인덱스 (구분자)
             Set => 데이터 중복 없다 
             Map => key (구분자)
             오라클 => Primary Key
             ------------------------- 정형화 데이터 
             비정형화 데이터 => 분석 => 시각화 
                            ------------ 정형화된 데이터로 변경
                               |
                             빅데이터 => 예측 (AI)
             Application => exe
             웹/모바일 => java 
                         |
                        kotlin (Java 가 무거워서 코틀린으로 살짝 넘어가는 추세)
             분석 => Python
             실시간 = 스칼라 	
             
             ISBN / 책이름 
             국가 : ko , en ...
             -----------------
  
*/
import java.util.*;
public class MainClass_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,String> map=new HashMap<String,String>();
		map.put("id", "hong");
		map.put("pwd", "1234");
		map.put("name", "홍길동");
		map.put("sex", "남자");
		map.put("addr", "서울");
		map.put("phone", "010-1111-1111");
		
//		System.out.println("ID:"+map.get("id"));
//		System.out.println("PWD:"+map.get("pwd"));
//		System.out.println("NAME:"+map.get("name"));
//		System.out.println("SEX:"+map.get("sex"));
//		System.out.println("ADDR:"+map.get("addr"));
//		System.out.println("PHONE:"+map.get("phone"));
		Set<String> set=map.keySet(); // key 를 모았다 
		System.out.println(set);
		for(String key:set)
		{
			System.out.println(key.toUpperCase()+":"+
		map.get(key));
		}
		// 읽는 순서는 저장된 순이 아니다 
		for(String s:map.values())
		{
			System.out.println(s);
		}
		/*
			clear() : 전체 삭제 ==> TRUNCATE (오라클)
			get() : 실제 데이터를 읽어온다 
			put() : 데이터를 저장할 때 사용 
			isEmpty() : 데이터가 있는지 여부 확인 
			size() : 데이터 저장 갯수 
			keySet() : key 만 가지고 온다 
			values() : 실제 저장된 값을 읽는 경우 
		*/
		
	}

}
