package com.sist.vo;

import java.io.Serializable;

/*
		1|얼큰한 칼국수 맛집 베스트 20곳|"한국인 맞춤 얼큰칼칼 칼국수 다모여!"|https://mp-seoul-image-production-s3.mangoplate.com/keyword_search/meta/pictures/rpvuj1tpaueafi4l.jpg?fit=around|600:400&crop=600:400;*,*&output-format=jpg&output-quality=80
		1|1|가양칼국수버섯매운탕|4.3|서울특별시 영등포구 국제금융로 78 홍우빌딩 B1 지번 서울시 영등포구 여의도동 43-3 홍우빌딩 B1|02-784-0409|국수 / 면 요리|만원-2만원|유료주차 가능|11:30 - 21:30|가양칼국수버섯매운탕 12,000원 샤브 소고기 (200g) 12,000원|https://mp-seoul-image-production-s3.mangoplate.com/52481_1621066187997112.jpg?fit=around|512:512&crop=512:512;*,*&output-format=jpg&output-quality=80^https://mp-seoul-image-production-s3.mangoplate.com/673960_1689725902210805.jpg?fit=around|512:512&crop=512:512;*,*&output-format=jpg&output-quality=80^https://mp-seoul-image-production-s3.mangoplate.com/673960_1689725904425496.jpg?fit=around|512:512&crop=512:512;*,*&output-format=jpg&output-quality=80^https://mp-seoul-image-production-s3.mangoplate.com/24979_1686491189261172.jpg?fit=around|512:512&crop=512:512;*,*&output-format=jpg&output-quality=80^https://mp-seoul-image-production-s3.mangoplate.com/24979_1686491193055171.jpg?fit=around|512:512&crop=512:512;*,*&output-format=jpg&output-quality=80
 */
public class FoodCategoryVO implements Serializable{
	private int cno;
	private String title;
	private String subject;
	private String poster;
	
	public int getCno() {
		return cno;
	}
	public void setCno(int cno) {
		this.cno = cno;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getPoster() {
		return poster;
	}
	public void setPoster(String poster) {
		this.poster = poster;
	}
	
	
}