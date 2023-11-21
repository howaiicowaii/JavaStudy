// '사용자 정의 클래스_1010' 파일 
import java.text.DecimalFormat;
public class MainClass_2_문제들 {

	class 영화{
		int movieId; // 고유번호 => 상세보기, 찾기
		String poster,nameKr,nameEn;
		int startDay;
		String regdate;
		String genre;
		String nation;
		String grade;
		String time;
		double score;
		int showUser;
		int boxoffice;
	}
	
	class 뉴스{
		int news_no;
		String poster;
		String title;
		String content;
		String regdate;
		String author;
	}
	
	class 맛집_카테고리{
		int food_cate_no;
		String poster;
		String title;
		String subtitle;
	}
	
	class 맛집{
		int fno;
		String name;
		double score; // 0.0 => 초기값
		String address;
		String number;
		String type;
		String price;
		String parking;
		String time;
		String menu;
	}
	
	class 레시피{
		int recipe_no;
		String poster;
		String title;
		String chef;
		int score;
		int hit;
		int showUser;
	}
	
	class 뮤직{
		int music_no;
		int rank;
		String state; // 유지 , 상승 , 하강
//	                    -     ^     /
		int idcrement; // 등폭 
		String poster;
		String title;
		String singer;
		String album;
		int like;
	}
	
	class 상품{
		int goods_no; // 구분자 
		String goods_discount;
		String goods_poster;
		String goods_name;
		int goods_price;
	} 
	
	// new => 새로운 메모리 공간 생성 
	class 연극{
		int pno;
		String poster;
		String title;
		String genre;
		String regdate;
		String location;
		String actor;
		String grade;
		String time;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

int like=323457;
		DecimalFormat df=new DecimalFormat("###,###");
		System.out.println("^"+df.format(like));
	}

}
