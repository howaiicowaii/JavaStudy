package com.sist.main;

import java.util.ArrayList;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import com.sist.vo.anoLoseVO;

public class anoLoseMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list=new ArrayList<String>();
		for(int k=2;k<=3;k++)
		{
		try
		{
			Document doc=Jsoup.connect("http://www.angel.or.kr/index.php?code=other&page="+k+"&ski=&sci=&sco=&sgu=&q=").get();
			
			// 첫번째 칸 (제목)
			Elements sub=doc.select("div.wrap h3");
//			System.out.println(sub);
			
			// 두번째 칸 (내용)
			Elements content=doc.select("div.wrap p.para");
//			System.out.println(content);
			
			// 목록 사진 
			Elements image=doc.select("div.wrap div.gallery img");
//			System.out.println(image);
			
			for(int i=0;i<sub.size();i++)
			{
				anoLoseVO vo=new anoLoseVO();
				vo.setSub(sub.get(i+1).text());
//				System.out.println(vo.getSub());
				vo.setContent(content.get(i).text());
//				System.out.println(vo.getContent());
				
				vo.setImage(image.get(i).attr("src"));
				String poster="http://www.angel.or.kr"+vo.getImage().substring(1);
				System.out.println(poster);
			}
			
		}catch(Exception ex) {}
		}
	}

}