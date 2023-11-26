package com.sist.main;

import java.util.ArrayList;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

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
//		Elements link=doc.select("");
		
		// 지역 (버리기..?)
		Elements aloc=doc.select("tbody tr td.m_no");
		System.out.println(aloc);
		
		// 상태 (버리기..?)
		
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
			adoptAnimalVO vo=new adoptAnimalVO();
		}
		
		}catch(Exception ex) {}
		}
	}

}
