/* 
 *  &&(직렬연산자) , ||(병렬연산자)
 *  AND            OR
 *  
 *    사용처
 *    -----
 *     && => 기간이나 범위안에 포함
       || => 기간이나 범위가 아닌 경우
      사용법
      ----
       ==> 조건에 사용할 수 있는 연산자 (부정연산자 , 비교연산자)
        (조건) && (조건)    (조건) || (조건)
        ----      ----
          |        |
          ----------
              |
            결과값
            
       경우의 수           &&         ||
       true  true  ===> true  ===> true
       true  false ===> false ===> true
       false true  ==> false  ===> true
       false false ==> false  ===> false
       
       && , ||는 효율적인 연산을 수행한다
       -----------------------------
       && => 앞이 false면 뒤에 있는 조건은 수행하지 않는다
       || => 앞이 true면 뒤에 있는 조건은 수행하지 않는다
            
*/
public class 논리연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int a=10;
//		int b=9;
//		
//		boolean bCheck = a<b && ++b==a;
//		System.out.println(bCheck);
//		System.out.println("b="+b); 
//&&일 경우 => 효율적 연산으로 인해 앞 (a<b)이 false 이므로 ++b 가 실행되지 않아서 b=9
//||일 경우 => 앞 (a<b)이 false지만, ||이므로 뒤도 실행 -> ++b = 10 
		
		int a=10;
		int b=21;
		
		boolean bCheck = (a%2==0) && (b%2!=0); // =(b%2==1)
		/*
		 *     조건    &&    조건
		 *     true        true  ==> true
		 *     true        false ==> false
		 *     false       true  ==> false
		 *     false       false ==> false
		 *     
		 *     조건    ||    조건
		 *     true        true  ==> true
		 *     true        false ==> true
		 *     false       true  ==> true
		 *     false       false ==> false
		 */
//		bCheck = (a%2==0) || (b%2==0);
		System.out.println(bCheck);
		
	}

}
