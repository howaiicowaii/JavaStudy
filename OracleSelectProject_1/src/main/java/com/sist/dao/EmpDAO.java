package com.sist.dao;
/*
	연동 => 마지막(은퇴하는 날까지 사용할 내용) => 웹 프로그래머의 핵심 
	=> 90%
	브라우저  =====  자바  =====  오라클 
	         요청       SQL 전송   | SQL 문장 실행 
	         전송  =====  결과값 받기 
	   | 결과값을 받아서 화면 출력 (HTML)
	** 오라클 SQL 문장과 자바에서 전송하는 SQL 문장이 다른 것이 있다
	                    95%는 동일 => 5%가 다르다 
	                    => LIKE 가 약간 다르다 
	                    => 오라클 / MySQL
	1) 연결(송수신) => 드라이버 설정
	                ------- 클래스로 만들어져 있다   
	   Class.forName("oracle.jdbc.driver.OracleDriver")
	                  -------------------------------
	                   ojdbc8.jar 안에 들어있다 (연동시 필수)
	2) 오라클 연결 
	   Connection conn=DriverManager.
	              getConnection(URL,username,password)
	                                   hr     happy
	   URL : jdbc:업체명:드라이버타입:@IP:PORT:데이터베이스명
	         jdbc:oracle:thin:@localhost:1521:XE
	         => SQLPlus 가 열리는 것과 동일 
	3) SQL 문장을 전송 
	   PreparedStatement ps=
	           conn.preparedStatement(SQL문장);
	   SQL문장 => SELECT...
	4) 오라클에서 실행된 데이터를 받는다 
	   ResultSet rs=ps.executeQuery()
	   =>        -- 실행된 결과를 메모리에 저장 
	   SELECT ename,job
	   ResultSet
		   ENAME                JOB
	-------------------- ------------------
	KING                 PRESIDENT  | 커서 이동 => next()
	BLAKE                MANAGER
	CLARK                MANAGER
	JONES                MANAGER
	MARTIN               SALESMAN
	ALLEN                SALESMAN
	TURNER               SALESMAN
	JAMES                CLERK
	WARD                 SALESMAN
	FORD                 ANALYST
	SMITH                CLERK
	SCOTT                ANALYST
	ADAMS                CLERK
	MILLER               CLERK | 커서 이동 => previous() 
	| 커서가 여기에 존재 
	
	==> Order by를 이용해서 데이터를 읽어 온다 => next()
		while(rs.next()) => 계속 다음 줄로 내려준다 
		{
			=> VO에 값을 채운다 
		}
		=> 읽을 데이터가 없는 상태 
		rs.close();
		ps.close();
		conn.close(); ==> 종료 
		---------- 코딩하는 패턴이 1개 뿐이다 
		---------- SQL 문장을 정상수행하게 제작
		           ------- 오라클 
		---------- DML,DQL => CRUD
	
	==> 반복 구간 => 연결 / 닫기 => 메소드화 시켜놓을 예정 
	
	SELECT : 데이터 읽기 (검색)
	 => 형식
	    SELECT * | column1,column2...
	    FROM table_name
	    [
	    	WHERE 조건문 (연산자)
	    	GROUP BY 컬럼|함수 => 그룹
	    	HAVING 그룹에 대한 조건 => 반드시 GROUP BY가 있어야 실행가능 
	    	ORDER BY 컬럼(정렬대상),번호 => ASC|DESC;
	    	                            --- ASC 생략 가능 
	    ]
	   
	
	
*/
import java.util.*; // Date
import java.sql.*; // Connection / PreparedStatement / ResultSet
public class EmpDAO {
	// 네트워크 => 자바응용프로그램(클라이언트) <===> 오라클 (서버)
	// 요청(SQL) <===> 응답(실제 출력 결과값을 받는다) 
	// 연결 객체 선언 => Connection 
	private Connection conn; // conn 연결만.
	// SQL 문장 송수신 
	private PreparedStatement ps; // read/write 가 이뤄지는 곳 
	//오라클 연결하려면 오라클 주소 필요 
	private final String URL="jdbc:oracle:thin:@localhost:1521:XE";
	
	// 드라이버 등록 => 한번만 수행 => 보통 (생성자) 에서 사용 
	public EmpDAO()
	{
		try
		{
			// 대소문자 구분 
			Class.forName("oracle.jdbc.driver.OracleDriver"); // 패키지명...클래스명
			// 메모리 할당 => 클래스명으로 메모리 할당이 가능 => 리플렉션 
		}catch(Exception ex) {}
	}
	// 연결 => SQL Plus 연결 과 같은 단계 
	public void getConnection()
	{
		try
		{
			conn=DriverManager.getConnection(URL,"hr","happy");
			// conn hr/happy 수행
		}catch(Exception ex) {}
	}
	// 해제 
	public void disConnection()
	{
		try
		{
			if(ps!=null) ps.close();
			if(conn!=null) conn.close();
			
			// exit
		}catch(Exception ex) {}
	}
	// 기능 수행 => 메소드 => 테이블 1개당 => VO,DAO
	// SQL 문장 전송 
	// emp 에서 데이터를 출력 => 사번,이름,입사일,직위,급여 출력 
	public void empListData()
	{
		try
		{
			// 1. 오라클 연결 
			getConnection();
			// 2. SQL 문장 제작 
			String sql="SELECT empno,ename,job,hiredate,sal "
					 + "FROM emp";
			// 3. SQL 문장을 오라클로 전송 
			ps=conn.prepareStatement(sql); 
			// 4. 결과값을 받는다 
			ResultSet rs=ps.executeQuery();
			// 5. 결과값을 출력 
			/*
				no   name   sex   regdate
				-------------------------
				1    홍길동   남자   23/11/13
				-    ----    --   ---------
				                  | rs.getDate(4)
				             | rs.getString(3)
				     | rs.getString(2)
				| rs.getInt(1) 
			*/
			while(rs.next()) // 한줄 읽어오기 
			{
				System.out.println(rs.getInt(1)+" "
						+rs.getString(2)+" "
						+rs.getString(3)+" "
						+rs.getDate(4)+" "
						+rs.getInt(5));
			}
			rs.close();
		}catch(Exception ex) 
		{
			// 오류 위치 확인
			ex.printStackTrace();
		}
		finally
		{
			// 닫기 
			disConnection();
		}
	}
	
}
