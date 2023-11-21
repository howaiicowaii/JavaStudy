package com.sist.dao;
import java.util.*;
import java.sql.*;
// 핵심! DAO => 오라클로 전송 
// JDBC => DBCP => ORM (MyBatis(2차) / JPA(3차))
/*
	return selectList(SQL) => MyBatis : 코드가 간결해진다
*/
public class MovieDAO {
	private Connection conn;
	private PreparedStatement ps;
	private final String URL="jdbc:oracle:thin:@211.238.142.102:1521:XE";
	// 에러 => output : 오류를 볼 줄 알아야 잡기 쉽다
	// 에러 => this.conn NULL => String URL 값 틀려서 오라클 연결 안된 것
	public MovieDAO()
	{
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
		}catch(Exception ex) {}
	}
	public void getConnection()
	{
		try
		{
			conn=DriverManager.getConnection(URL,"hr","happy");
		}catch(Exception ex) {}
	}
	public void disConnection()
	{
		try
		{
			if(ps!=null) ps.close();
			if(conn!=null) conn.close();
		}catch(Exception ex) {}
	}
	public List<MovieVO> movieListData(int page)
	{
		// rownum => 페이징 기법 때 사용
		// 목록 => List / 상세보기 => VO
		List<MovieVO> list=new ArrayList<MovieVO>();
		try
		{
			getConnection();
			int rowSize=12; // 한페이지에 12개
			int start=(rowSize*page)-(rowSize-1);
			int end=rowSize*page;
			String sql="SELECT mno,title,poster,num "
					+ "FROM (SELECT mno,title,poster,rownum AS num "
					+ "FROM (SELECT mno,title,poster "
					+ "FROM movie ORDER BY mno ASC)) "
					+ "WHERE num BETWEEN ? AND ?";
			ps=conn.prepareStatement(sql);
			ps.setInt(1, start);
			ps.setInt(2, end);
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				MovieVO vo=new MovieVO();
				vo.setMno(rs.getInt(1));
				vo.setTitle(rs.getString(2));
				vo.setPoster(rs.getString(3));
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
	public int movieTotalPage()
	{
		int total=0;
		try
		{
			getConnection();
			String sql="SELECT CEIL(COUNT(*)/12.0) FROM movie";
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
	public MovieVO movieDetailData(int mno)
	{
		MovieVO vo=new MovieVO();
		try
		{
			getConnection();
			String sql="SELECT mno,title,actor,poster,"
					+ "genre,grade,director "
					+ "FROM movie "
					+ "WHERE mno="+mno;
			ps=conn.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			rs.next();
			vo.setMno(rs.getInt(1));
			vo.setTitle(rs.getString(2));
			vo.setActor(rs.getString(3));
			vo.setPoster(rs.getString(4));
			vo.setGenre(rs.getString(5));
			vo.setGrade(rs.getString(6));
			vo.setDirector(rs.getString(7));
			rs.close();
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
		finally
		{
			disConnection();
		}
		return vo;
	}
	// 검색 => Ajax => Vue/React(Ajax를 포함)
	public void empDeptData()
	{
		try
		{
			getConnection();
			String sql="SELECT empno,ename,job,dname,loc,grade "
					+ "FROM emp JOIN dept "
					+ "ON emp.deptno=dept.deptno "
					+ "JOIN salgrade "
					+ "ON sal BETWEEN losal AND hisal";
			ps=conn.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+" "
						+rs.getString(2)+" "
						+rs.getString(3)+" "
						+rs.getString(4)+" "
						+rs.getString(5)+" "
						+rs.getInt(6));
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
	}
	public void empDeptView()
	{
		try
		{
			getConnection();
			String sql="SELECT empno,ename,job,dname,loc,grade "
					+ "FROM empdeptgrade";
			ps=conn.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+" "
						+rs.getString(2)+" "
						+rs.getString(3)+" "
						+rs.getString(4)+" "
						+rs.getString(5)+" "
						+rs.getInt(6));
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
	}
	public static void main(String[] args) {
		MovieDAO dao=new MovieDAO();
		dao.empDeptData();
//		dao.empDeptView();
	}
}
