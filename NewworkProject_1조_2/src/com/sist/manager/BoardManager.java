package com.sist.manager;
// 파일 입출력
import java.util.*; // ArrayList, Date

import com.sist.vo.BoardVO;

import java.text.*; // SimpleDateFormat
import java.io.*; // File관련 => ObjectInputStream / ObjectOutputStream

public class BoardManager {
	// 게시물 목록 => 모아서 관리
	private static ArrayList<BoardVO> bList=new ArrayList<BoardVO>();
	// 값 채우기
	static {
		FileInputStream fis=null;
		ObjectInputStream ois=null;
		try {
			fis=new FileInputStream("c:\\java_data\\board.txt"); // 파일저장
			ois=new ObjectInputStream(fis); // 파일읽기 // ObjectInputStream 쓰려면 데이터에 직렬화 인터페이스 구현!!
			bList=(ArrayList<BoardVO>)ois.readObject();
		} catch(Exception ex) {
			// 에러 위치 체크
			ex.printStackTrace();
		} finally {
			try {
				fis.close();
				ois.close();
			}catch(Exception ex) {}
		}
	}
	// 목록 출력 => 리스트로 받아서 처리
	public ArrayList<BoardVO> boardListData(int page){
		ArrayList<BoardVO> list=new ArrayList<BoardVO>();
		int j=0;
		int rowSize=10; // 한페이지에 10개씩 출력한다
		int pagecnt=(page*rowSize)-rowSize;
		/*
			1page => 0~9
			2page => 10~19
			3page => 20~29 => 0,10,20,30 일때 페이지이동
			...		==> 3page 요청시 앞페이지들 버리고 20부터 호출 (for문은 0부터 돌아서 중간페이지 출력시에 앞페이지 스킵하기 위함)
		 */
		// 웹에서는 오라클 => 인라인뷰
		// MySQL => LIMIT
		ArrayList<BoardVO> temp=new ArrayList<BoardVO>();
		for(int i=bList.size()-1;i>=0;i--) {
			temp.add(bList.get(i));
		}
		
		for(int i=0;i<temp.size();i++) {
			if(j<10 && i>=pagecnt) { // 각 페이지별로 pagecnt부터 출력 
				BoardVO vo=temp.get(i);
				list.add(vo);
				j++; // 10개씩 저장
			}
		}
		return list;
	}
	public int boardTotalPage() {
		return (int)(Math.ceil(bList.size()/10.0));
		// ceil => 올림함수 (소수점이하 0제외 올림)
	}
	// 데이터 추가 ===
	public void boardInsert(BoardVO vo) {
		bList.add(vo); // 메모리 => 프로그램 종료시 사라짐 => 방지 : 파일저장
		fileSave(); // 추가후 파일에 저장한다
	}
	public void fileSave() { // 추가,삭제,수정에 공통으로 들어가는 코딩
		FileOutputStream fos=null;
		ObjectOutputStream oos=null;
		try {
			fos=new FileOutputStream("c:\\java_data\\board.txt");
			oos=new ObjectOutputStream(fos);
			oos.writeObject(bList); // 덮어쓰기
		}catch(Exception ex) {
			// 에러 위치 확인
			ex.printStackTrace();
		}finally{
			try {
				fos.close();
				oos.close();
			}catch(Exception ex) {}
		}
	}
	// 상세보기
	public BoardVO boardDetailData(int no) {
		BoardVO vo=new BoardVO();
		for(int i=0;i<bList.size();i++) {
			BoardVO bVO=bList.get(i);
			if(bVO.getNo()==no) {
				bVO.setHit(bVO.getHit()+1); // 한번누르면 조회수 1증가
				vo=bVO;
				fileSave(); // 파일과 ArrayList가 동일
				break;
				// 다음주부터 => 파일 / 오라클
				// UPDATE board SET hit=hit+1 WHERE no=1;
				// 오라클 (웹 핵심) => SQL
				// SQL (CRUD => SELECT,INSERT,UPDATE,DELETE)
			}
		}
		return vo;
	}
	// 수정하기 ===
	public BoardVO boardUpdateData(int no) {
		BoardVO vo=new BoardVO();
		// 오라클 SELECT * FROM board WHERE no=1
		for(BoardVO bVO:bList) {
			if(bVO.getNo()==no) {
				vo=bVO; // 수정할 게시물 찾아서 해당게시물내용 전부 가져오기 위함
				break;  
			}
		}
		return vo;
	}
	// 실제 수정
	public String boardUpdate(BoardVO vo) {
		String result=""; // YES / NO
		for(int i=0;i<bList.size();i++) {
			// remove(index), set(index) => 수정, 삭제시 인덱스번호 필요 => 인덱스필요하지 않은 기능은 for-each 사용
			BoardVO pVO=bList.get(i);
			if(pVO.getNo()==vo.getNo()) { // 서버에저장된 값(pVO)과 사용자가 보내준 값(vo)이 같을때
				if(pVO.getPwd().equals(vo.getPwd())) {
					// 수정 가능한 상태 (비밀번호 일치)
					result="YES";
					//bList.set(i, vo); // 메모리 상에서 수정
					pVO.setContent(vo.getContent());
					pVO.setName(vo.getName());
					pVO.setSubject(vo.getSubject());
					
					fileSave(); 	// 메모리는 날아가므로 수정된 내용 파일에 저장
				}
				else {
					// 비밀번호 다름 
					result="NO";
				}
				break;
			}
		}
		return result;
	}
	// 삭제하기 === 동일코딩 ==> 파일에 저장 
	// ArrayList 제어 / 파일 제어 => 웹 => Manager
	// 웹 => 파일 대신 오라클로 변경
	public String boardDelete(int no, String pwd) {
		String result=""; // NO, YES
		for(int i=0;i<bList.size();i++) { // 삭제할때 arrayList의 인덱스번호가 필요
			BoardVO vo=bList.get(i);
			if(vo.getNo()==no) {
				if(vo.getPwd().equals(pwd)) {
					// 삭제 대상 => 비밀번호가 일치
					result="YES";
					bList.remove(i);
					fileSave(); // 삭제후 저장까지해서 파일에도 삭제가 되도록
				}
				else {
					// 비밀번호가 틀린 상태
					result="NO";
				}
				break;
			}
		}
		return result;
	}
	// 검색하기
	// 자동 증가번호 만들기 => 시퀀스 
	public int boardSequence() {
		int max=0;
		for(BoardVO vo:bList) {
			if(vo.getNo()>max) {
				max=vo.getNo();
			}
		}
		return max+1; // 최대 번호보다 +1로 새로운 게시물 추가
	}
	// 공통 => 파일 저장
}