package com.sist.manager;
import java.util.*;
import java.io.*;

import com.sist.vo.FoodCategoryVO;
import com.sist.vo.MovieNetflixVO;
import com.sist.vo.MovieReservationVO;
import com.sist.vo.MovieReservationVO.*;
//1|1|가양칼국수버섯매운탕|4.3|서울특별시 영등포구 국제금융로 78 홍우빌딩 B1 지번 서울시 영등포구 여의도동 43-3 홍우빌딩 B1|02-784-0409|국수 / 면 요리|만원-2만원|유료주차 가능|11:30 - 21:30|가양칼국수버섯매운탕 12,000원 샤브 소고기 (200g) 12,000원|https://mp-seoul-image-production-s3.mangoplate.com/52481_1621066187997112.jpg?fit=around|512:512&crop=512:512;*,*&output-format=jpg&output-quality=80^https://mp-seoul-image-production-s3.mangoplate.com/673960_1689725902210805.jpg?fit=around|512:512&crop=512:512;*,*&output-format=jpg&output-quality=80^https://mp-seoul-image-production-s3.mangoplate.com/673960_1689725904425496.jpg?fit=around|512:512&crop=512:512;*,*&output-format=jpg&output-quality=80^https://mp-seoul-image-production-s3.mangoplate.com/24979_1686491189261172.jpg?fit=around|512:512&crop=512:512;*,*&output-format=jpg&output-quality=80^https://mp-seoul-image-production-s3.mangoplate.com/24979_1686491193055171.jpg?fit=around|512:512&crop=512:512;*,*&output-format=jpg&output-quality=80
public class MovieManager2 {
		private static ArrayList<MovieReservationVO> mList=new ArrayList<MovieReservationVO>();
//		private static ArrayList<MovieNetflixVO> nList=new ArrayList<MovieNetflixVO>();
		static {
			//FileReader fr=null;
			BufferedReader br=null;
			ObjectInputStream ois=null;
			FileInputStream fis=null;
			StringBuffer sb=new StringBuffer();
			try {
				fis=new FileInputStream("c:\\java_data\\movie_cate.txt");
				br=new BufferedReader(new InputStreamReader(fis));
				while(true) {
					String data=br.readLine();
					if(data==null) // 전체 데이터 다 읽은 경우
						break;
					sb.append(data);
				}
				fis.close();
				br.close();
				
				String food_data=sb.toString();
				String[] fd=food_data.split("\n");
				
				System.out.println(sb.toString());
				for(String s:fd) {
					StringTokenizer st=new StringTokenizer(s,"|");
					MovieReservationVO vo=new MovieReservationVO();
					vo.setTitle(st.nextToken());
					vo.setImage(st.nextToken());
					vo.setRegdate(st.nextToken());
					vo.setGenre(st.nextToken());
					vo.setNation(st.nextToken());
					vo.setGrade(st.nextToken());
					vo.setTime(st.nextToken());
					vo.setScore(st.nextToken());
					vo.setMake_share(st.nextToken());
					
				}
			}catch(Exception ex) {
				ex.printStackTrace();
			}finally {
				try {
					fis.close();	// 에러안나면 try절에서 닫고, 에러나면 finally에서 닫음
					br.close();
				}catch(Exception ex) {}
			}
//			FileReader fr=null;
//			ObjectOutputStream ois=null;
//			FileOutputStream fis=null;
//			try {
//				
//			}catch(Exception ex) {
//				
//			}finally {
//				
//			}
//			try {
//				fr=new FileReader("c:\\java_data\\movie_cate.txt");
//				String data="";
//				int i=0;
//				while((i=fr.read())!=-1) {
//					data+=(char)i;
//				}
//				fr.close();
//				
//				String[] cates=data.split("\n");
//				for(String s:cates) {
//					StringTokenizer st=new StringTokenizer(s,"|"); // 파일의 인코딩이 UTF-8일때 오류가 남 ==> 다른이름으로 저장=> ANSI로 저장 => 해결
//					MovieReservationVO vo=new MovieReservationVO();
//					vo.setTitle(st.nextToken());
//					vo.setImage(st.nextToken());
//					vo.setRegdate(st.nextToken());
//					vo.setGenre(st.nextToken());
//					vo.setNation(st.nextToken());
//					vo.setGrade(st.nextToken());
//					vo.setTime(st.nextToken());
//					vo.setScore(st.nextToken());
//					vo.setMake_share(st.nextToken());
////					String[] ss=s.split("\\|");
////					FoodCategoryVO 
//					mList.add(vo);
//				}
//				
//				fis=new FileOutputStream("c:\\java_data\\aac.txt");
//				ois=new ObjectOutputStream(fis);
//				ois.writeObject(mList);
//				
//			}catch(Exception ex){
//				ex.printStackTrace();
//			}finally {
//				try {
//					fis.close();
//					ois.close();
//				}catch(Exception ex) {}
//			}
//		}
////		static {
//			FileReader fr=null;
//			ObjectOutputStream ois=null;
//			FileOutputStream fis=null;
//			try {
//				fr=new FileReader("c:\\java_data\\movie_netflix.txt");
//				String data="";
//				int i=0;
//				while((i=fr.read())!=-1) {
//					data+=(char)i;
//				}
//				fr.close();
//				
//				String[] cates=data.split("\n");
//				for(String s:cates) {
//					StringTokenizer st=new StringTokenizer(s,"|"); // 파일의 인코딩이 UTF-8일때 오류가 남 ==> 다른이름으로 저장=> ANSI로 저장 => 해결
//					MovieNetflixVO vo=new MovieNetflixVO();
//					vo.setTitle(st.nextToken());
//					vo.setImage(st.nextToken());
//					vo.setRegdate(st.nextToken());
//					vo.setGenre(st.nextToken());
//					vo.setNation(st.nextToken());
//					vo.setGrade(st.nextToken());
//					vo.setTime(st.nextToken());
//					vo.setScore(st.nextToken());
//					vo.setMake_share(st.nextToken());
////					String[] ss=s.split("\\|");
////					FoodCategoryVO 
//					nList.add(vo);
//				}
//				
//				fis=new FileOutputStream("c:\\java_data\\nc.txt");
//				ois=new ObjectOutputStream(fis);
//				ois.writeObject(nList);
//				
//			}catch(Exception ex){
//				ex.printStackTrace();
//			}finally {
//				try {
//					fis.close();
//					ois.close();
//				}catch(Exception ex) {}
//			}
		}
		public ArrayList<MovieReservationVO> MovieReservationData(int no){
			ArrayList<MovieReservationVO> list=new ArrayList<MovieReservationVO>();
			int start=0;
			int end=0;
			if(no==1) {
				start=0;
				end=9;
			}
			else if(no==2) {
				start=10;
				end=19;
			}
			else if(no==3) {
				start=20;
				end=29;
			}
			else if(no==4) {
				start=30;
				end=39;
			}
			else if(no==5) {
				start=40;
				end=49;
			}
			for(int i=start;i<=end;i++) {
				list.add(mList.get(i));
			}
			return list;
		}
		public static void main(String[] args) {
			MovieManager2 mm2=new MovieManager2();
		}
}