package com.sist.lib;

import java.text.MessageFormat;

public class MainClass_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="홍길동";
		String sex="남자";
		int age=20;
		String addr="서울";
		String phone="010-1111-1111";
      //오라클  INSERT => 문자열 : '', 정수는 그대로 (오라클은 문자열 작은 따옴표 필요)
		String sql="INSERT INTO member VALUES('"
				+name+"','"+sex+"',"+age
				+",'"+addr+"','"+phone+"')";
		// 하지만 위의 방식할 때 정보가 너무 많으면 너무 힘들다 
		System.out.println(sql);
		
		System.out.println("===== 변환 이용 =====");
		sql="INSERT INTO member VALUES(''{0}'',''{1}'',"
				+"{2},''{3}'',''{4}'')";
		Object[] obj= {name,sex,age,addr,phone};
		System.out.println(MessageFormat.format(sql, obj));
		// ?,?,?,?,? 
	}
	// *** DecimalFormat , *** SimpleDateFormat , MessageFormat 
	// 출력 형식으로 변환 => java.text (책에 나오지 않는 부분)

}
