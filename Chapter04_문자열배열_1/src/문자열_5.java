/*
	split => String[] 
*/
public class 문자열_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String actor="하정우,임시완,배성우,김상호";
//		String[] movie=actor.split(",");
//		System.out.println(movie[0]);
		
//		String actor="하정우|임시완|배성우|김상호";
//		String[] movie=actor.split("\\|"); // | 는 연산자로 쓰여서 앞에 \\ 붙여야 한다
//		System.out.println(movie[0]);
		
		String name="    Hello Java    ";
		System.out.println(name.trim()); // 입력시
		//						  ㄴ 좌우 공백 제거
		
		// replace => 원하는 문자를 변경
		String s="Hello Java";
		System.out.println(s.replace('a', 'b')); // a를 b로 대체
		System.out.println(s.replace("Java", "Oracle")); // Java를 Oracle로 대체
//		System.out.println(s=s.replace("Java", "Oracle")); => 이렇게 하면 s 값 바뀜
		System.out.println(s); // s= 처럼 대입하지 않았기 때문에 저장은 안됐다
		
		// 문자열 결합
		String msg="나라가 독립을 했으면 당연히 우리 기록도 독립이 되어야지!";
		if(msg.length()>20)
		{
			msg=msg.substring(0,20)+"...";
//			msg=msg.substring(0,20).concat("..."); // concat()는 + 와 같다
		}
		System.out.println(msg);
	}

}
