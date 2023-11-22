package com.sist.main;

import java.util.ArrayList;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import com.sist.vo.keepAnimalVO;

public class keepAnimalMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list=new ArrayList<String>();
		
		for(int k=1;k<=3;k++) // 59페이지 까지 있다 
		{
		try
		{
		Document doc=Jsoup.connect("https://singlesumer.com/protect/page/"+k).get();
		Elements link=doc.select("td.title a:eq(0)"); // 상세주소 미완성 주소
//		System.out.println(link);
		
		// 목록 : 분류(지역),제목,글쓴이,날짜,조회수
		// 상세.기 : 발견장소,발견날짜,보호자연락처,사진,내용,
		
		Elements kls=doc.select("td.cate");
//		System.out.println(kls);
		
		Elements klt=doc.select("td.title");
//		System.out.println(klt);
		
		Elements klw=doc.select("td.author");
//		System.out.println(klw);
		
		Elements kld=doc.select("td.time");
//		System.out.println(kld);
		
		Elements klh=doc.select("td.m_no");
//		System.out.println(klh);
		
		for(int i=0;i<kls.size();i++)
		{
			keepAnimalVO kavo=new keepAnimalVO();
			
			// 목록 5개 //
			// 분류(지역)
			kavo.setKeepListSido(kls.get(i+1).text());
//			System.out.println(kavo.getKeepListSido()); // 목록 : 분류(지역)
			
			// 제목 
			kavo.setKeepListTitle(klt.get(i+1).text());
//			System.out.println(kavo.getKeepListTitle()); // 목록 : 제목
			
			// 글쓴이 
			kavo.setKeepListWriter(klw.get(i+1).text());
//			System.out.println(kavo.getKeepListWriter()); // 목록 : 글쓴이 
			
			// 날짜 
			kavo.setKeepListDate(kld.get(i+1).text());
//			System.out.println(kavo.getKeepListDate()); // 목록 : 날짜
			
			// 조회수 
			kavo.setKeepListHit(klh.get(i+1).text());
//			System.out.println(kavo.getKeepListHit()); // 목록 : 조회수 
			
			// 상세보기 링크 
			String linkk="https://singlesumer.com"+link.get(i+1).attr("href");
//			System.out.println(linkk);
			Document doc2=Jsoup.connect(linkk).get();

			// 상세보기 5개 // 
			// 발견장소 + 보호자 연락처
			Elements kfl=doc2.select("tr.bg1:eq(0) td"); // td만 치면 발견장소+연락처 나온다
//			System.out.println(kfl);
			kavo.setKeepFoundLoc(kfl.get(i).text());
//			System.out.println(kavo.getKeepFoundLoc());
			
			// 발견날짜 
			Elements kfd=doc2.select("");
			
			// 보호자 연락처 
			Elements kft=doc2.select("tr.bg1 td");
			kavo.setKeepFoundTel(kft.get(i).text());
//			System.out.println(kavo.getKeepFoundTel());
			
		}
		
		}catch(Exception ex) {}
		}
	}

}
