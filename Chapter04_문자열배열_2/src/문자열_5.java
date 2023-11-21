import java.io.*; // 파일 입출력
import java.util.*; 
/*
	라이브러리
	-------
	  java.lang : object , String , StringBuffer , Math
	              Wrapper 
	  java.util : List , Set , Map
	  java.io   : 
	  java.net
	  java.text
*/
public class 문자열_5 {
    static String movie;
    static
    {
    	try
    	{
    		FileReader fr=new FileReader("/Users/maclovin/git/movie.txt");
    		int i=0;
    		StringBuffer data=new StringBuffer();
    		while((i=fr.read())!=-1) // -1 (EOF) 파일 끝날 때 까지 읽어온다
    		{
    			data.append((char)i);
    		}
    		movie=data.toString();

    	}catch(Exception ex){}
    }
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		// 파일 읽기 
//		System.out.println(movie);
		String[] movieData=movie.split("\n");
//		System.out.println("영화 갯수:"+movieData.length);
//		System.out.println(movieData[0]);
		System.out.println("====== 영화 목록 ======");
		// 검색
		// 송강호가 출연한 영화를 출력하시오
		Scanner sc = new Scanner(System.in);
//		System.out.print("이름 입력:");
//		String name = sc.next();
		// 1990년에 개봉한 영화 
		// 12세 이상 영화 
		System.out.print("등급 입력:");
		int grade=sc.nextInt();
		for(String movie:movieData)
		{
			String[] detail=movie.split("\\|");
//			if(detail[5].contains("1990"))
//			if(detail[6].contains("12"))
			if(detail[6].contains(String.valueOf(grade))) // 정수를 문자열로 변경
			{
				System.out.println("순위:"+detail[0]);
				System.out.println("영화명:"+detail[1]);
				System.out.println("장르:"+detail[2]);
				System.out.println("출연:"+detail[4]);
				System.out.println("개봉일:"+detail[5]);
				System.out.println("등급:"+detail[6]);
				System.out.println("감독:"+detail[7]);
				System.out.println("-----------------------");
			}
		}
	}

}
