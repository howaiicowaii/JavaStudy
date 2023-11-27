package com.sist.main;

import java.util.ArrayList;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import com.sist.dao.adoptAnimalDAO;
import com.sist.vo.adoptAnimalVO;

public class adoptAnimalMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list=new ArrayList<String>();
		
		for(int k=1;k<=3;k++)
		{
		try
		{
		Document doc=Jsoup.connect("https://singlesumer.com/parcel/page/"+k).get();
		Elements link=doc.select("td.title a.hx");
//		System.out.println(link);
		
		// 지역 (버리기..?)
//		Elements aloc=doc.select("tbody tr td.m_no");
//		System.out.println(aloc);

		
		// 상태 (버리기..?)
		Elements astatus=doc.select("tbody td.cate span");
//		System.out.println(astatus);
		
		// 제목 
		Elements atitle=doc.select("tbody td.title a.hx");
//		System.out.println(atitle);
		
		// 글쓴이 (i+1 해야한다)
		Elements aw=doc.select("tbody td.author a");
//		System.out.println(aw);
		
		// 날짜 (i+1 해야한다)
		Elements adate=doc.select("tbody td.time");
//		System.out.println(adate);
		
		for(int i=0;i<atitle.size();i++)
		{
			adoptAnimalVO avo=new adoptAnimalVO();
			
			avo.setAdoptStatus(astatus.get(i).text()); // 상태 VO
//			System.out.println(avo.getAdoptStatus());
			avo.setAdoptTitle(atitle.get(i).text()); // 제목 VO
//			System.out.println(avo.getAdoptTitle());
			avo.setAdoptWriter(aw.get(i+1).text()); // 글쓴이 VO
//			System.out.println(avo.getAdoptWriter());
			avo.setAdoptRegdate(adate.get(i+1).text()); // 날짜 VO
//			System.out.println(avo.getAdoptRegdate());
			
			String sublink=link.get(i).attr("href");
			String link2="https://singlesumer.com"+sublink;
//			System.out.println(link2); // 상세보기 링크
			Document doc2=Jsoup.connect(link2).get();
			
			// 지역 (상세에서 가져오기)
			Elements aloc=doc2.select("tr.bg0 td").eq(0);
//			System.out.println(aloc);
			String aloc2=aloc.text();
//			System.out.println(aloc2);
			avo.setAdoptLoc(aloc2); // 지역 VO
//			System.out.println(avo.getAdoptLoc());

			
			// 사진 (상세)
			Elements aimage=doc2.select("div.rd_body.clear img").eq(0);
//			System.out.println(aimage);
			String aimg="https://singlesumer.com"+aimage.attr("src");
//			System.out.println(aimg);
			avo.setAdoptImage(aimg); // 사진 VO
//			System.out.println(avo.getAdoptImage());
			
			// 내용 (상세)
			Elements acontent=doc2.select("div.rd_body.clear article");
//			System.out.println(acontent);
			String acontent2=acontent.text(); // 내용 VO
//			System.out.println(acontent2);

			adoptAnimalDAO dao=new adoptAnimalDAO();
			
			dao.adoptAnimalInsert(avo);
			
		}
		System.out.println("Save end...");
		}catch(Exception ex) {}
		}
	}

}
