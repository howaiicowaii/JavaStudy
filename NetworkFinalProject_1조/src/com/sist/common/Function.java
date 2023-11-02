package com.sist.common;
/*
	웹 에서는 구분자없이 사용 => 파일명  200|aaa 
	내부 프로토콜 
	80 21 => 서버에서 지시 => 클라이언트가 수행 => 그래야 같은 내용이 출력(공유)
	서버 => Master
	클라이언트 => Slave
*/
public class Function {
	// 서버에 요청 => 구분 
	public static final int LOGIN=100; // 상수형 => 가독성 좋게 하기 위해 
	public static final int MYLOG=110;
	public static final int WAITCHAT=200;
	public static final int EXIT=900;
	public static final int MYEXIT=910;
}
