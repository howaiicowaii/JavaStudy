package com.sist.main;

import java.util.ArrayList;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import com.sist.vo.catLoseVO;

public class catLoseMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list=new ArrayList<String>();
		for(int k=2;k<=30;k++)
		{
		try
		{
			Document doc=Jsoup.connect("http://www.angel.or.kr/index.php?code=cat&page="+k+"&ski=&sci=&sco=&sgu=&q=").get();
			
			// 첫번째 칸 (제목)
			Elements sub=doc.select("div.wrap h3");
			
			
			// 두번째 칸 (내용)
			Elements content=doc.select("div.wrap p.para");
//			System.out.println(content);
			
			// 목록 사진 
			Elements image=doc.select("div.gallery img");
//			System.out.println(image);
			
			for(int i=0;i<=sub.size();i++)
			{
				catLoseVO vo=new catLoseVO();
				vo.setSub(sub.get(i+1).text());
				vo.setContent(content.get(i).text());
				
				vo.setImage(image.get(i).attr("src"));
//				System.out.println(vo.getImage());
				String poster="http://www.angel.or.kr"+vo.getImage().substring(1);
				vo.setPoster(poster);
//				System.out.println(vo.getPoster());
				
			}
		}catch(Exception ex) {}
		}
	}

}
