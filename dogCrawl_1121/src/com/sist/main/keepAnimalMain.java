package com.sist.main;

import java.util.ArrayList;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import com.sist.vo.keepAniVO;
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
		// 한개VO => 고유번호,지역,제목,글쓴이,날짜,사진,내용 (댓글기능)
		
		// 지역 
		Elements kloc=doc.select("td.cate");
//		System.out.println(kloc);
		
		// 제목 
		Elements klt=doc.select("td.title");
//		System.out.println(klt);
		
		// 작성자 
		Elements klw=doc.select("td.author");
//		System.out.println(klw);
		
		// 날짜 
		Elements kld=doc.select("td.time");
//		System.out.println(kld);
		
		// 
		Elements klh=doc.select("td.m_no");
//		System.out.println(klh);
		
		for(int i=0;i<kloc.size();i++)
		{
//			keepAnimalVO kavo=new keepAnimalVO();
			keepAniVO kavo=new keepAniVO();
			
			// 목록 5개 //
			// 분류(지역)
			kavo.setKeepLoc(kloc.get(i+1).text());
//			kavo.setKeep(kloc.get(i+1).text());
//			System.out.println(kavo.getKeepLoc()); // 목록 : 분류(지역)
			
			// 제목 
			kavo.setKeepTitle(klt.get(i+1).text());
//			kavo.setKeepListTitle(klt.get(i+1).text());
//			System.out.println(kavo.getKeepTitle()); // 목록 : 제목
			
			// 글쓴이 
			kavo.setKeepWriter(klw.get(i+1).text());
//			kavo.setKeepListWriter(klw.get(i+1).text());
//			System.out.println(kavo.getKeepWriter()); // 목록 : 글쓴이 
			
			// 날짜 
			kavo.setKeepRegDate(kld.get(i+1).text());
//			kavo.setKeepListDate(kld.get(i+1).text());
//			System.out.println(kavo.getKeepRegDate()); // 목록 : 날짜
			
			// 상세보기 다시 
			String linkd=link.get(i+1).attr("href");
//			System.out.println(linkd);
			String link2="https://singlesumer.com"+linkd;
//			System.out.println(link2);
			Document doc2=Jsoup.connect(link2).get();
			
////			// 상세보기 링크 -> 안되는 버전 
//			String linkk=link.get(i+1).attr("href");
////			System.out.println(linkk);
//			//  "https://singlesumer.com"
//			String link2="https://singlesumer.com"+linkk;
////			System.out.println(link2);
//			Document doc2=Jsoup.connect(link2).get(); // 
////			System.out.println(doc2);

			// 발견장소 , 사진 , 내용 
			// 발견장소
			Elements kfl=doc2.select("tr.bg1:eq(0) td");
//			System.out.println(kfl);
			kavo.setKeepFoundLoc(kfl.get(i).text());
			System.out.println(kavo.getKeepFoundLoc());

			
			////// 11/24 link2 는 문제 없는 듯한데 상세 데이터들 못긁어오는 중ㅠㅠ 
			
			
//			// 상세보기 5개 // 
//			// 발견장소 + 보호자 연락처
//			Elements kfl=doc2.select("tr.bg1:eq(0) td"); // td만 치면 발견장소+연락처 나온다
////			System.out.println(kfl);
//			kavo.setKeepFoundLoc(kfl.get(i).text());
////			System.out.println(kavo.getKeepFoundLoc());
			
			// 발견날짜 
//			Elements kfd=doc2.select("");
			
//			// 보호자 연락처 
//			Elements kft=doc2.select("tr.bg1 td");
//			kavo.setKeepFoundTel(kft.get(i).text());
////			System.out.println(kavo.getKeepFoundTel());
			
		}
		
		}catch(Exception ex) {}
		}
	}

}
