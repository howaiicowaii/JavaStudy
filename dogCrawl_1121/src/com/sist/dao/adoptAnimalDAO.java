package com.sist.dao;
import java.util.*;

import com.sist.vo.adoptAnimalVO;

import java.sql.*;
public class adoptAnimalDAO {
	private Connection conn;
	private PreparedStatement ps;
	private final String URL="jdbc:oracle:thin:@211.238.142.102:1521:XE";
	private static adoptAnimalDAO dao; // 싱글턴 만들 때 쓰는 방식 
	// 드라이버 등록 => 한번만 생성 (생성자에서 생성)
	public adoptAnimalDAO()
	{
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
		}catch(Exception ex) {}
	}
	// 오라클 연결 
	public void getConnection()
	{
		try
		{
			conn=DriverManager.getConnection(URL,"hr","happy");
		}catch(Exception ex) {} // dbcp 에선 계정명,암호 숨길 수 있다
//		                     DBCP => 웹에서만 사용 가능, jdbc 대신 쓸 것
	}
	// 오라클 닫기 
	public void disConnection()
	{
		try
		{
			if(ps!=null) ps.close();
			if(conn!=null) conn.close();
		}catch(Exception ex) {}
	}
	// 싱글턴 패턴 => 메모리 공간 1개 생성
	public static adoptAnimalDAO newInstance()
	{
		// 라이브러리 => newInstance(),getInstance() =>싱글턴 
		if(dao==null) // 한번만 생성한다 
			dao=new adoptAnimalDAO();
		return dao;
	}
	// 기능 설정 
	// => 목록(table) => 인라인뷰 로 페이지 설정
	public List<adoptAnimalVO> adoptAnimalListData(int page)
	{
		List<adoptAnimalVO> list=new ArrayList<adoptAnimalVO>();
		// FoodVO = ROW
		try
		{
			getConnection();
			// 페이지마다 데이터 읽기
			int rowSize=10;// 한 페이지당 10개 출력 
			// num BETWEEN ? AND ? => 1page 1 ~ 20
			//                        2page 21 ~ 40
			int start=(rowSize*page)-(rowSize-1);
			int end=rowSize*page;
//			String sql="SELECT aano,sub,image,content,num "
//					+ "FROM (SELECT aano,sub,image,content,rownum as num "
//					+ "FROM (SELECT /*+ INDEX_ASC(loseAni adoptAnimal_aano_pk)*/aano,sub,image,content "
//					+ "WHERE num BETWEEN ? AND ?";
			String sql="SELECT aano,adoptStatus,adoptTitle,adoptWriter,"
					+ "adoptRegDate,adoptImage,adoptContent "
					+ "FROM adoptAnimal";
//			ps=conn.prepareStatement(sql);
			ps.setInt(1, start);
			ps.setInt(2, end);
			// INDEX_ASC(테이블명 인덱스명,PK,UK) , INDEX_DESC() , INDEX()
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				adoptAnimalVO vo=new adoptAnimalVO();
				vo.setAano(rs.getInt(1));
				vo.setAdoptLoc(rs.getString(2));
				vo.setAdoptStatus(rs.getString(3));
				vo.setAdoptTitle(rs.getString(4));
				vo.setAdoptWriter(rs.getString(5));
				vo.setAdoptRegdate(rs.getString(6));
				vo.setAdoptImage(rs.getString(7));
				vo.setAdoptContent(rs.getString(8));
				
				list.add(vo);
			}
			rs.close();
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
		finally
		{
			disConnection();
		}
		return list;
	}
	// 총페이지 
	public int adoptAnimalTotalPage()
	{
		int total=0;
		try
		{
			getConnection();
			String sql="SELECT CEIL(COUNT(*)/10.0) FROM adoptAnimal";
			ps=conn.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			rs.next();
			total=rs.getInt(1);
			rs.close();
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
		finally
		{
			disConnection();
		}
		return total;
	}
	public void adoptAnimalInsert(adoptAnimalVO vo)
	{
		try
		{
		getConnection();
		String sql="INSERT INTO adoptAnimal VALUES(adoptAnimal_aano_seq.nextval,?,?,?,?,?,?,?)";
		ps=conn.prepareStatement(sql);
		ps.setString(1, vo.getAdoptLoc());
		ps.setString(2, vo.getAdoptStatus());
		ps.setString(3, vo.getAdoptTitle());
		ps.setString(4, vo.getAdoptWriter());
		ps.setString(5, vo.getAdoptRegdate());
		ps.setString(6, vo.getAdoptImage());
		ps.setString(7, vo.getAdoptContent());

		ps.executeUpdate();
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
		finally
		{
			disConnection();
		}
	}
	// 상세보기(table)
	
}