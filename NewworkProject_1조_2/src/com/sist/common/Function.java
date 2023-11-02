package com.sist.common;
// 웹 => 구분자를 파일명으로 사용 => 웹주소에는 파일명이 있다
// 내부 프로토콜 => 200|park => 숫자는 가독성이 낮아서 LOGIN처럼 표현 
// 서버에서 지시 => 클라이언트가 수행 => 같은 내용(공유)
public class Function {
	// 서버에 요청 => 구분
	public static final int LOGIN=100;
	public static final int MYLOG=110;
	public static final int WAITCHAT=200;
	public static final int MSGSEND=300;
	public static final int INFO=400;
	public static final int EXIT=900;
	public static final int MYEXIT=910;
	// MYXXX => 먼저 로그인한사람, 늦게 로그인한사람, 종료시에 모두종료, 종료시에 나만 종료 구분
}