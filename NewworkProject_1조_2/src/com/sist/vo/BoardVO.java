package com.sist.vo;
import java.io.Serializable;
import java.util.*;
// 게시판 => 파일 입출력 
// VO => Value Object => 변수 (사용자 정의 데이터형)
// 캡슐화를 이용해서 => 데이터 보호 => 웹에서도 동일한 코딩
// 한개의 게시물에 대한 정보
public class BoardVO implements Serializable{ // ObjectInputStream 쓸때사용
	private int no; // 게시물 번호(구분자) => 중복X => 찾아서 수정삭제등 처리할때 사용
	private String name; // 작성자
	private String subject; // 제목
	private String content; // 내용
	private Date regdate; // 등록일
	private String pwd; // 비밀번호 => 수정, 삭제시에 이용 => 본인 여부 확인
	private int hit; // 조회수
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getRegdate() {
		return regdate;
	}
	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public int getHit() {
		return hit;
	}
	public void setHit(int hit) {
		this.hit = hit;
	}
	
	
}