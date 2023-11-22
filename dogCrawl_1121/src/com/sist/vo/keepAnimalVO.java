package com.sist.vo;

public class keepAnimalVO {
	private int kano;
	// 목록 : 분류(지역),제목,글쓴이,작성날짜,조회수
	// 상세보기 : 발견장소,발견날짜,보호자연락처,사진,내용,
	private String keepListSido,keepListTitle,keepListWriter,
		keepListDate,keepListHit,keepFoundLoc,keepFoundDate,keepFoundTel,
		keepPoster,keepContent;
	public int getKano() {
		return kano;
	}
	public void setKano(int kano) {
		this.kano = kano;
	}
	public String getKeepListSido() {
		return keepListSido;
	}
	public void setKeepListSido(String keepListSido) {
		this.keepListSido = keepListSido;
	}
	public String getKeepListTitle() {
		return keepListTitle;
	}
	public void setKeepListTitle(String keepListTitle) {
		this.keepListTitle = keepListTitle;
	}
	public String getKeepListWriter() {
		return keepListWriter;
	}
	public void setKeepListWriter(String keepListWriter) {
		this.keepListWriter = keepListWriter;
	}
	public String getKeepListDate() {
		return keepListDate;
	}
	public void setKeepListDate(String keepListDate) {
		this.keepListDate = keepListDate;
	}
	public String getKeepListHit() {
		return keepListHit;
	}
	public void setKeepListHit(String keepListHit) {
		this.keepListHit = keepListHit;
	}
	public String getKeepFoundDate() {
		return keepFoundDate;
	}
	public void setKeepFoundDate(String keepFoundDate) {
		this.keepFoundDate = keepFoundDate;
	}
	public String getKeepPoster() {
		return keepPoster;
	}
	public void setKeepPoster(String keepPoster) {
		this.keepPoster = keepPoster;
	}
	public String getKeepContent() {
		return keepContent;
	}
	public void setKeepContent(String keepContent) {
		this.keepContent = keepContent;
	}
	public String getKeepFoundLoc() {
		return keepFoundLoc;
	}
	public void setKeepFoundLoc(String keepFoundLoc) {
		this.keepFoundLoc = keepFoundLoc;
	}
	public String getKeepFoundTel() {
		return keepFoundTel;
	}
	public void setKeepFoundTel(String keepFoundTel) {
		this.keepFoundTel = keepFoundTel;
	}
	
	
	
	
}
