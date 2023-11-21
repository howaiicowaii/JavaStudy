/*
	1. equals : (==) => boolean
					    ------- if문에서 사용
					    equals() ==
					   !equals() !=
	2. contains : 포함된 단어 찾기 => boolean
	3. startsWith : 시작 문자열이 같은 경우 => boolean
	4. endsWith : 끝나는 문자열이 같은 경우 => boolean
	--------------------------------- 검색
*/
import java.util.*;

//import javax.lang.model.element.Element;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
public class 지니뮤직 {

	public static void main(String[] args) throws Exception{
		
		Scanner sc = new Scanner(System.in);
		String url="";
		while(true)
		{
			System.out.println("===== 메뉴 =====");
			System.out.println("1. Top50");
			System.out.println("2. 가요");
			System.out.println("3. POP");
			System.out.println("4. OST");
			System.out.println("5. 트롯");
			System.out.println("6. JAZZ");
			System.out.println("7. CLASSIC");
			System.out.println("8. CONTAINS");
			System.out.println("9. StartsWith");
			System.out.println("10. EndsWith");
			System.out.println("11. Exit");
			System.out.println("===============");
			System.out.print("메뉴 선택:");
			int menu=sc.nextInt();
			if(menu==11)
			{
				System.out.println("프로그램 종료!!");
				break; // while문 종료 
			}
			else if(menu==1)
			{
				url="https://www.genie.co.kr/chart/top200";
			}
			else if(menu==2)
			{
				url="https://www.genie.co.kr/chart/genre?ditc=D&ymd=20230925&genrecode=M0100";
			}
			else if(menu==3)
			{
				url="https://www.genie.co.kr/chart/genre?ditc=D&ymd=20230925&genrecode=M0200";
			}
			else if(menu==4)
			{
				url="https://www.genie.co.kr/chart/genre?ditc=D&ymd=20230925&genrecode=M0300";
			}
			else if(menu==5)
			{
				url="https://www.genie.co.kr/chart/genre?ditc=D&ymd=20230925&genrecode=M0107";
			}
			else if(menu==6)
			{
				url="https://www.genie.co.kr/chart/genre?ditc=D&ymd=20230925&genrecode=M0500";
			}
			else if(menu==7)
			{
				url="https://www.genie.co.kr/chart/genre?ditc=D&ymd=20230925&genrecode=M0600";
			}
			
			System.out.print("검색어 입력:");
			String msg=sc.next();
			
			Document doc=Jsoup.connect(url).get(); //url 을 저장해두는 도큐멘트
			Elements title=doc.select("table.list-wrap a.title"); // 태그를 모아놓은 걸 가져온다
			for(int i=0;i<title.size();i++)
			{
				String name=title.get(i).text();
//				if(name.contains(msg)) // 검색어가 포함된 값을 가져온다
//				if(name.startsWith(msg)) // 검색어가 시작문자열에 있는 값을 가져온다
//				if(name.endsWith(msg)) // 검색어가 끝문자열에 있는 값을 가져온다
//				if(name.equals(msg)) // == => 대소문자 구분
				if(name.equalsIgnoreCase(msg)) // 대소문자 구분없이
				{
					System.out.println((i+1)+"."+name);
					Thread.sleep(500);
				}
			}
			
		}
	}

}



