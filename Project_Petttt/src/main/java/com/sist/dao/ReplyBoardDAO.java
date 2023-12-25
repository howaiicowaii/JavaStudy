package com.sist.dao;
import java.util.*;

import com.sist.dbcp.CreateDBCPconnection;
import com.sist.vo.ReplyBoardVO;

import java.sql.*;
public class ReplyBoardDAO {
	private Connection conn;
	private PreparedStatement ps;
	private CreateDBCPconnection dbconn
				=new CreateDBCPconnection();
	private static ReplyBoardDAO dao;
	
	public static ReplyBoardDAO newInstance() // 싱글턴 
	{
		if(dao==null)
			dao=new ReplyBoardDAO();
		return dao;
	}

	public List<ReplyBoardVO> replyBoardListData(int page)
	{
		List<ReplyBoardVO> list=new ArrayList<ReplyBoardVO>();
		try
		{
			conn=dbconn.getConnection();
			String sql="SELECT no,subject,name,TO_CHAR(regdate,'YYYY-MM-DD'),"
					 + "hit,group_tab,num "
					 + "FROM (SELECT no,subject,name,regdate,hit,group_tab,rownum as num "
					 + "FROM (SELECT no,subject,name,regdate,hit,group_tab "
					 + "FROM replyboard ORDER BY group_id DESC,group_step ASC)) "
					 + "WHERE num BETWEEN ? AND ?";
			ps=conn.prepareStatement(sql);
			
			int rowSize=10;
			int start=(rowSize*page)-(rowSize-1);
			int end=rowSize*page;
			
			ps.setInt(1, start);
			ps.setInt(2, end);
			
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				ReplyBoardVO vo=new ReplyBoardVO();
				vo.setNo(rs.getInt(1));
				vo.setSubject(rs.getString(2));
				vo.setName(rs.getString(3));
				vo.setDbday(rs.getString(4));
				vo.setHit(rs.getInt(5));
				vo.setGroup_tab(rs.getInt(6));
				list.add(vo);
			}
			rs.close();
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
		finally
		{
			dbconn.disConnection(conn, ps);
		}
		return list;
	}
	
	public int replyboardRowCount()
	{
		int count=0;
		try
		{
			conn=dbconn.getConnection();
			String sql="SELECT COUNT(*) FROM replyBoard";
			ps=conn.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			rs.next();
			count=rs.getInt(1);
			rs.close();
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
		finally
		{
			dbconn.disConnection(conn, ps);
		}
		return count;
	}
	
	public void replyBoardInsert(ReplyBoardVO vo)
	{
		try
		{
			conn=dbconn.getConnection();
			String sql="INSERT INTO replyBoard("
					+ "no,name,subject,,content,pwd,,group_id) "
					+ "VALUES(rb_no_seq.nextval,?,?,?,?,"
					+ "(SELECT NVL(MAX(group_id)+1,1) FROM replyBoard))";
			ps=conn.prepareStatement(sql);
			ps.setString(1, vo.getName());
			ps.setString(2, vo.getSubject());
			ps.setString(3, vo.getContent());
			ps.setString(4, vo.getPwd());
			ps.executeUpdate();
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
		finally
		{
			dbconn.disConnection(conn, ps);
		}
	}
	
	// 상세보기 => 기능처리 (모든 메소드에 SQL문장이 1개가 아니다)
	public ReplyBoardVO replyBoardDetailData(int no)
	{
		ReplyBoardVO vo=new ReplyBoardVO();
		try
		{
			conn=dbconn.getConnection();
			// 조회수 증가 
			String sql="UPDATE replyBoard SET "
					 + "hit=hit+1 "
					 + "WHERE no="+no;
			ps=conn.prepareStatement(sql);
			ps.executeUpdate();
			
			sql="SELECT no,name,subject,content,TO_CHAR(regdate,'YYYY-MM-DD HH24:MI:SS'),hit "
			  + "FROM replyBoard "
			  + "WHERE no="+no;
			ps=conn.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			rs.next();
			vo.setNo(rs.getInt(1));
			vo.setName(rs.getString(2));
			vo.setSubject(rs.getString(3));
			vo.setContent(rs.getString(4));
			vo.setDbday(rs.getString(5));
			vo.setHit(rs.getInt(6));
			rs.close();
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
		finally
		{
			dbconn.disConnection(conn, ps);
		}
		return vo;
	}
	
	// 수정 데이터 읽기(수정은 메소드 2개로 이루어져 있다. 읽기/실제수정)
	public ReplyBoardVO replyBoardUpdateData(int no)
	{
		ReplyBoardVO vo=new ReplyBoardVO();
		try
		{
			conn=dbconn.getConnection();
			String sql="SELECT no,name,subject,content "
					+ "FROM replyBoard "
					+ "WHERE no="+no;
			ps=conn.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			rs.next();
			vo.setNo(rs.getInt(1));
			vo.setName(rs.getString(2));
			vo.setSubject(rs.getString(3));
			vo.setContent(rs.getString(4));
			rs.close();
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
		finally
		{
			dbconn.disConnection(conn, ps);
		}
		return vo;
	}
	
	// 실제 수정 => request,response => Ajax (70%)
	public boolean replyBoardUpdate(ReplyBoardVO vo)
	{
		boolean bCheck=false;
		try
		{
			conn=dbconn.getConnection();
			String sql="SELECT pwd FROM replyBoard "
					+ "WHERE no="+vo.getNo();
			ps=conn.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			rs.next();
			String db_pwd=rs.getString(1);
			rs.close();
			
			if(db_pwd.equals(vo.getPwd()))
			{
				// 수정 (비밀번호가 맞게 입력된 상태)
				bCheck=true;
				sql="UPDATE replyBoard SET "
				  + "name=?,subject=?,content=? "
				  + "WHERE no=?";
				ps=conn.prepareStatement(sql);
				ps.setString(1, vo.getName());
				ps.setString(2, vo.getSubject());
				ps.setString(3, vo.getContent());
				ps.setInt(4, vo.getNo());
				
				ps.executeUpdate();
			}
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
		finally
		{
			dbconn.disConnection(conn, ps);
		}
		return bCheck;
	}
	
	// 답변 
	public void replyBoardReplyInsert(int pno,ReplyBoardVO vo)
	{
		// 1. pno가 가지고 있는 group_id,step,tab 가지고 온다 
		// 2. => 답변형의 핵심 
		// 3. 실제 INSERT
		// 4. depth 증가시키기 (답글이 몇개 달렸냐)
		try
		{
			conn=dbconn.getConnection();
			String sql="SELECT group_id,group_step,group_tab "
					+ "FROM replyBoard "
					+ "WHERE no="+pno;
			ps=conn.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			rs.next();
			int group_id=rs.getInt(1);
			int group_step=rs.getInt(2);
			int group_tab=rs.getInt(3);
			rs.close();
			
			// 위치 조정 (새로 달린 답변이 다답변 그룹보다 위로 올라와서 번호가 안꼬이게)
			sql="UPDATE replyBoard SET "
					+ "group_step=group_step+1 "
					+ "WHERE group_id=? AND group_step>?";
			ps=conn.prepareStatement(sql);
			ps.setInt(1, group_id);
			ps.setInt(2, group_tab);
			ps.executeUpdate();
			
			// 실제 답변 저장 
			sql="INSERT INTO replyBoard(no,name,subject,content,pwd,"
					+ "group_id,group_step,group_tab,root) "
					+ "VALUES(rb_no_seq.nextval,?,?,?,?,?,?,?,?)";
			ps=conn.prepareStatement(sql);
			ps.setString(1, vo.getName());
			ps.setString(2, vo.getSubject());
			ps.setString(3, vo.getContent());
			ps.setInt(4, group_id);
			ps.setInt(5, group_step);
			ps.setInt(6, group_tab);
			ps.setInt(8, pno); // root 가 pno => 상위 번호 
			ps.executeUpdate();
			
			// depth 증가 
			sql="UPDATE replyBoard SET "
					+ "depth=depth+1 "
					+ "WHERE no="+pno;
			ps=conn.prepareStatement(sql);
			ps.executeUpdate();
		}catch(Exception ex)
		{
			ex.printStackTrace();	
		}
		finally
		{
			dbconn.disConnection(conn, ps);
		}
	}
	
	// 삭제 처리 => 90%
	public boolean replyBoardDelete(int no,String pwd)
	{
		boolean bCheck=false;
		try
		{
			conn=dbconn.getConnection();
			String sql="SELECT pwd,root,depth "
					+ "FROm replyBoard "
					+ "WHERE no="+no;
			ps=conn.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			rs.next();
			String db_pwd=rs.getString(1);
			int root=rs.getInt(2);
			int depth=rs.getInt(3);
			rs.close();
			if(db_pwd.equals(pwd)) // 삭제 조
			{
				bCheck=true;
				if(depth==0) // 답변이 없다면 
				{
					sql="DELETE FROM replyBoard "
							+ "WHERE no="+no;
					ps=conn.prepareStatement(sql);
					ps.executeUpdate();
				}
				else // 답변이 있는 경우 
				{
					String msg="관리자가 삭제한 게시물입니다";
					sql="UPDATE replyBoard SET "
							+ "subject=?,content=? "
							+ "WHERE no="+no;
					ps=conn.prepareStatement(sql);
					ps.setString(1, msg);
					ps.setString(2, msg);
					ps.setInt(3, no);
					ps.executeUpdate();
				}
				
				sql="UPDATE replyBoard SET "
						+ "depth=depth-1 "
						+ "WHERE no="+root;
			}
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
		finally
		{
			dbconn.disConnection(conn, ps);
		}
		return bCheck;
	}
}








