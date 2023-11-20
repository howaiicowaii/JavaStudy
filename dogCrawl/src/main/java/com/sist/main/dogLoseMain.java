package com.sist.main;

import java.util.ArrayList;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import com.sist.vo.dogLoseVO;

public class dogLoseMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list=new ArrayList<String>();

		for(int k=2;k<=4;k++) // 도스창에 제한이 있는지 15페이지만 출력되서 혹시 몰라 2~16페이지만
		{
		try
		{
			Document doc=Jsoup.connect("http://www.angel.or.kr/index.php?code=dog&page="+k+"&ski=&sci=&sco=&sgu=&q=").get();
//			Elements link=doc.select("div.wrapper div.gallery a"); // 2~38p 상세보기들
//			System.out.println(link);
			
			// 첫번째 칸 (실종)
			Elements sub=doc.select("div.wrap h3");
//			System.out.println(sub);
			
			// 두번째칸 내용 
			Elements content=doc.select("p.para");
//			System.out.println(content);
			
			// 목록 사진 ( <img.src 만 출력하는 법.. )
			Elements image=doc.select("div.gallery img");
//			System.out.println(image);
			
			for(int i=0;i<sub.size();i++)
			{
				dogLoseVO vo=new dogLoseVO();
				vo.setSub(sub.get(i+1).text());
				vo.setContent(content.get(i).text());
				vo.setImage(image.get(i).attr("src")); // poster 가 진짜 사진 링
//				System.out.println(vo.getSub()); // 맨 앞꺼 빼야한다 => i+1로 뺐다
//				System.out.println(vo.getContent());
//				System.out.println(vo.getImage());

				
				String poster="http://www.angel.or.kr"+vo.getImage().substring(1);
//				System.out.println(poster);
				vo.setPoster(poster);
				

			}

			
		}catch(Exception ex) {}
		}
		
		try
		{
			Document doc2=Jsoup.connect("http://www.angel.or.kr/index.php?code=dog").get();
			Elements link=doc2.select("div.wrap div.gallery a");

			for(int j=3;j<link.size();j++) // 1페이지 전용
	 // j=3 으로 해놓으면 당장 1페이지에서는 20개의 상세주소 가져올 수 있다
			{
				String sublink=link.get(j).attr("href");
//				System.out.println(sublink);
				String sublink2="http://www.angel.or.kr/"+sublink;
//				System.out.println(sublink2); // sublink2 가 상세주소
				
				Document doc1page=Jsoup.connect(sublink2).get();
				// 제목 
				Elements titleDet=doc1page.select("div.main h2.style");
//				System.out.println(posterDet);
				String posterr=titleDet.text();
				String title2=posterr.substring(posterr.indexOf("("));
//				System.out.println(title2); // title2 이 title
				
				// 글 정보 
				Elements infoo=doc1page.select("div.main div.about-info p.para");
//				System.out.println(infoo);
				String info=infoo.text();
				System.out.println(info);

				
				
				
			}
		}catch(Exception ex) {}
	}

}