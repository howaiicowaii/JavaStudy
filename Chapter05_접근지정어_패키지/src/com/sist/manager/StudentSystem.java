package com.sist.manager;
// 같은 패키지상에 있는 경우 => default / public / protected 
// import 를 사용하지 않는다
// => 프렌들리 
import java.util.*;
/*
	캡슐화 / 오버라이딩 / 상속 / 포함 
	----   -------         ----
	                   | POJO(상속이 없는 클래스)
	  ***1) 결합성
	  2) 응집성 
	  ***3) 가독성 
	  4) 최적화(퍼포먼스)
*/
public class StudentSystem {
	public Student[] students=new Student[3];
	// 입력 
	// 메소드 => 1) 멤버메소드 2) static 메소드 3) 생성자 
	// 접근 지정어 => public 이어야 한다
	public void input()
	{
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<students.length;i++)
		{
			students[i]=new Student();
			System.out.print("학번 입력:");
			students[i].hakbun=sc.nextInt(); // public (라이브러리)
			
			System.out.print("이름 입력:");
			students[i].name=sc.next();

			System.out.print("국어 입력:");
			students[i].kor=sc.nextInt();
			
			System.out.print("영어 입력:");
			students[i].eng=sc.nextInt();
			
			System.out.print("수학 입력:");
			students[i].math=sc.nextInt();
		}
	}
}
