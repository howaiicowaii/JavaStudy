package com.sist.music;
// Music 을 제어하는 프로그램 
import java.io.*;
import java.util.*;
public class MusicManager {
	private static Music[] musics=new Music[48]; // 사용자가 많으니 하나로 공유 !
	// 접속하는 모든 유저에게 공유 => 목록 => static 
	// 초기화 해서 값을 집어 넣는다 ==> 클래스 블록에서는 초기화가 불가 
	/*
		1) 인스턴스 블록 : 인스턴스 변수, static 
		2) static 블록 : 가능. static 변수만 초기화 가능 => 인스턴스 초기화 하려면 객체 생성
		3) 생성자 : 가능. 인스턴스, static // default -> public 누구든 접근 가능해야함
	*/
	// [4] 자바 표준 예외만 프로그램에서 처리할 수 있다.
	//     => 사용자 정의 예외처리 
	// 예외처리 종류 (예외: java.io,java.net,java.sql)
/*
	                           ------------------
	                            | 웹(네트워크)
	       = 예외 복구 
	         try
	         {
	           => 정상 수행 , 예외가 발생되는 소스 
	              -------
           }catch(예외클래스)
	         {
	            예외발생시 복구 
	            => 예외의 위치 
	               => getMessage()
	               => printStackTrace()
	               => 디버깅 확인 ==> 수정 
	         } 
	       = 예외 회피(예외 떠맡기기)
	         => 라이브러리에서 많이 사용 => 개발자 
	         => 예상되는 에러를 선언 => 컴파일러가 확인을 안하고 동작 
	            method() throws 예외... (순서가 없다)
	         => 처리 방법은 throws 이용 , try ~ catch 
	       = 임의의 발생 
	         => throw new 예외처리생성자()
	       = 사용자 정의 예외처리 
	         => class MyException extends Exception
	            {
	            }
	            
	    try-catch-finally 블록에 대한 설명 중 틀린 것은 무엇입니까? 3번)

		① try { } 블록에는 예외가 발생할 수 있는 코드를 작성한다. (O)
		                 --------------------------
		                  사용자 입력.. / 실수 
		
		② catch { } 블록은 try { } 블록에서 발생한 예외를 처리하는 블록이다.
		
		③ try { } 블록에서 return문을 사용하면 finally { } 블록은 실행되지 않는다. (X)
		    => 무조건 수행 (finally)
		
		④ catch { } 블록은 예외의 종류별로 여러 개를 작성할 수 있다.
*/
	public MusicManager()
	{
		
		FileReader fr=null;
		try
		{
			fr=new FileReader("/Users/maclovin/git/geine.txt"); // FileNotFoundException
			int i=0;
			String music_data="";
			while((i=fr.read())!=-1) // EOF (End Of File) 파일 끝까지 다 읽어라 
			{
				music_data+=(char)i;
			}
			
			// 1. 
			String[] mds=music_data.split("\r\n"); // 한줄씩 잘라서 배열 저장 
			i=0;
			for(String s:mds)
			{
				StringTokenizer st=new StringTokenizer(s,"|");
				musics[i]=new Music();
				musics[i].setRank(Integer.parseInt(st.nextToken()));
				// int rank="10"; => 안들어가니깐 Integer.parseInt 로 형변환 
				musics[i].setTitle(st.nextToken());
				musics[i].setSinger(st.nextToken());
				musics[i].setAlbum(st.nextToken());
				musics[i].setKey(st.nextToken());
				i++;
			}
		}catch(Exception ex) 
		{
			// 에러 확인 
			ex.printStackTrace();
		}
		finally
		{
			// 파일 닫기 or 서버 닫기 하는 영역 => finally 
			try
			{
				fr.close();
			}catch(Exception ex) {}
		}
	}
	public Music[] musicAllData()
	{
		return musics;
	}
//	public static void main(String[] args) {
//		String[] strArray = { "10" , "2a" };
//        int value = 0;
//        for(int i = 0; i <= 2; i++ ){
//        	try{
//            	value = Integer.parseInt(strArray[i]); // value=10 => 오류 ㅇ
//            } catch(ArrayIndexOutOfBoundsException e){
//            	System.out.println("인덱스를 초과했음");
//            } catch(NumberFormatException e) {
//            	System.out.println("숫자로 변환할 수 없음");
//            } finally {
//            	System.out.println(value); //  -> 10
//            }
//
//        }
//	}
}
