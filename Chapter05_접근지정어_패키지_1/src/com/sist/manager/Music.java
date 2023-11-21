package com.sist.manager;

import lombok.Getter;
import lombok.Setter;

// 캡슐화 
@Getter
@Setter

public class Music {
	// 변수 => 메모리에 값 저장 / 메모리의 값 읽기
//	         => 메소드 (setXxx,getXxx)
	private int mno;
	private String title;
	/*
		public void setTitle(STring title)
		{
			this.title=title; // 이 과정을 @Getter/Setter 로 대체 
		}
	*/
	private String singer;
	private String album;
	private int idcrement;
	private String state;
	// 은닉화 => 클라이언트가 볼 수 있게 만든다
	// 변수 => 메모리에 저장 / 메모리에서 데이터 읽기 
	//        읽기 / 쓰기 => 변수에 기능 추가 ==> getter/setter
	
	
}
