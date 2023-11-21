package com.sist.client;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import com.sist.manager.*;
import com.sist.vo.*;

public class BoardUpdatePanel extends JPanel implements ActionListener{
	ControllPanel cp;
    JLabel titleLa;
    JLabel la1,la2,la3,la4,la5;
    JTextField tf1,tf2;
    JPasswordField pf;
    JTextArea ta;
    JButton b1,b2;
    BoardManager bm=new BoardManager();
    public BoardUpdatePanel(ControllPanel cp)
    {
    	 this.cp=cp;
   	     titleLa=new JLabel("수정하기");
    	 titleLa.setFont(new Font("맑은 고딕",Font.BOLD,35));
    	 titleLa.setHorizontalAlignment(JLabel.CENTER);
    	 
    	 la1=new JLabel("이름");//<label for="name">이름</label>
    	 la2=new JLabel("제목");
    	 la3=new JLabel("내용");
    	 la4=new JLabel("비밀번호");
    	 la5=new JLabel("");
    	 la5.setVisible(false); // 게시물 번호
    	 tf1=new JTextField();//<input type=text>
    	 tf2=new JTextField();
    	 ta=new JTextArea();//<textarea></textarea>
    	 JScrollPane js=new JScrollPane(ta);
    	 pf=new JPasswordField();//<input type=password>
    	 
    	 b1=new JButton("     수정     ");//<input type=button>
    	 b2=new JButton("     취소     ");
    	 
    	 // 배치 
    	 setLayout(null);// css
    	 titleLa.setBounds(0, 15, 1260, 50);
	   	 add(titleLa);
	   	 
	   	 la1.setBounds(0, 125, 70, 30);
		 la1.setFont(new Font("맑은 고딕",Font.BOLD,14));
		 tf1.setBounds(80, 125, 1180, 30); // 이름입력칸
	   	 
		 la2.setBounds(0, 165, 450, 30);
		 la2.setFont(new Font("맑은 고딕",Font.BOLD,14));
		 tf2.setBounds(80, 165, 1180, 30); // 제목입력칸
	   	 
		 la3.setBounds(0, 205, 70, 30);
		 la3.setFont(new Font("맑은 고딕",Font.BOLD,14));
		 js.setBounds(80, 205, 1180, 500); // 글쓰기창
	   	 
		 la4.setBounds(0, 715, 70, 30);
		 la4.setFont(new Font("맑은 고딕",Font.BOLD,14));
		 pf.setBounds(80, 715, 1180, 30); // 비번입력칸
	   	 
	   	 JPanel p=new JPanel();
	     b1.setFont(new Font("맑은 고딕",Font.PLAIN,15));
		 b2.setFont(new Font("맑은 고딕",Font.PLAIN,15));
	     p.setLayout(new FlowLayout(FlowLayout.CENTER,30,5));
	   	 p.add(b1);
	   	 p.add(b2);
	     p.setBounds(0, 765, 1260, 35);
	   	 add(la5);
	   	 // 추가
	   	 add(la1);add(tf1);
	   	 add(la2);add(tf2);
	   	 add(la3);add(js);
	   	 add(la4);add(pf);
	   	 add(p);
	   	 
	   	 b1.addActionListener(this);
	   	 b2.addActionListener(this);
    }
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b2) {
			cp.card.show(cp, "detail");
		}
		else if(e.getSource()==b1) {
			String name=tf1.getText();
			String subject=tf2.getText();
			String content=ta.getText();
			String pwd=String.valueOf(pf.getPassword());
			if(pwd.trim().length()<1) { // 입력이 안된 상태
				JOptionPane.showMessageDialog(this, "비밀번호를 입력하세요!!");
				// 사용자 오류 발생 => 예외처리 
				// Oracle => 공백을주면 로그인 해버림
				pf.requestFocus();
				return; // 입력하지 않으면 종료
			}
			String no=la5.getText();
			BoardVO vo=new BoardVO();
			vo.setName(name);
			vo.setSubject(subject);
			vo.setContent(content);
			vo.setPwd(pwd);
			vo.setNo(Integer.parseInt(no));
			
			// BoardManger 연결 => 흐름(무슨화면을 보여줄것인지)
			String res=bm.boardUpdate(vo);
			if(res.equals("YES")) {
				pf.setText("");
				cp.card.show(cp, "board");
				cp.blp.boardList();
			}
			else {
				JOptionPane.showMessageDialog(this, "비밀번호가 다릅니다!!");
				pf.setText("");
				pf.requestFocus();
			}
			// sendRedirect("detatil.jsp")
			
		}
	}
}