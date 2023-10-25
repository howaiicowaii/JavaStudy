package com.sist.seoul;
import java.io.*;
import java.util.*;
public class SeoulManager {
	public Seoul[] seoulAllData(int i)
	{
		Seoul[] seoul=null;
		String path="/Users/maclovin/git/";
		if(i==1)
			path+="seoul_location.txt";
		else
			path+="seoul_nature.txt";
		
		FileReader fr=null;
		try
		{
			fr=new FileReader(path);
			String data="";
			int j=0;
			while((j=fr.read())!=-1) // EOF(End Of File) 파일 끝날 때 까지 읽어라
			{
				// read() => 한글자씩 읽기 => 정수로 읽는다 
				// A => 65 
				data+=(char)j;
			}
			
			StringTokenizer st=new StringTokenizer(data, "\n"); // 줄마다 자르기
			seoul=new Seoul[st.countTokens()]; // 273 , 110 
			
			// 분리 => 데이터를 Seoul[] 에 첨부 
			i=0;
			// 분리 
			String[] seouls=data.split("\n"); // 한줄마다 자르기 
			
			for(String s:seouls)
			{
				st=new StringTokenizer(s,"|"); // 한줄마다 자른 거 | 로 또 자르기 
				seoul[i]=new Seoul();
				// token(문자열)을 정수형으로 변경 
				// token (단어) => String st.nextToken() 
				seoul[i].setNo(Integer.parseInt(st.nextToken()));
				seoul[i].setName(st.nextToken());
				seoul[i].setContent(st.nextToken());
				seoul[i].setAddress(st.nextToken());
				i++;
			}
			
		}catch(Exception ex) 
		{
			ex.printStackTrace(); // 예외발생시 메소드에 있던 정보+예외 메세지 출력 
		}
		finally
		{
			try
			{
				fr.close();
			}catch(Exception ex) {}
		}
		
		return seoul;
	}

}
