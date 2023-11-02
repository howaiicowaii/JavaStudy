package com.sist.client;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import com.sist.vo.*;
import com.sist.manager.*;

public class BoardDeletePanel extends JPanel implements ActionListener{
	ControllPanel cp;// 화면 변경 
    JLabel titleLa;
    JLabel la,la1;
    JPasswordField pf;
    JButton b1,b2;
    BoardManager bm=new BoardManager();
    public BoardDeletePanel(ControllPanel cp)
    {
    	this.cp=cp;
    	titleLa=new JLabel("삭제하기");
    	titleLa.setFont(new Font("맑은 고딕",Font.BOLD,35));
    	titleLa.setHorizontalAlignment(JLabel.CENTER);
    	
    	la=new JLabel("비밀번호");
    	pf=new JPasswordField();
    	la1=new JLabel();
    	la1.setVisible(false);
    	b1=new JButton("     삭제     ");
    	b2=new JButton("     취소     ");
    	b1.setFont(new Font("맑은 고딕",Font.PLAIN,15));
		b2.setFont(new Font("맑은 고딕",Font.PLAIN,15));
    	setLayout(null);
    	titleLa.setBounds(0, 20, 1260, 50);
  	    add(titleLa);
  	    add(la1);
  	    la.setBounds(450, 150, 80, 30);
  	    pf.setBounds(530, 150, 240, 30);
  	    add(la);add(pf);
  	    
  	    JPanel p=new JPanel();
  	    p.setLayout(new FlowLayout(FlowLayout.CENTER,30,5));
  	    p.add(b1);
  	    p.add(b2);
  	    p.setBounds(0, 270, 1260, 35);
  	    add(p);
  	    
  	    b1.addActionListener(this);
  	    b2.addActionListener(this);
    }
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b2) {
			cp.card.show(cp, "detail"); // 취소버튼을 클릭하면 이전화면(디테일화면)으로 이동
										// history.back()
		}
		else if(e.getSource()==b1) {
			// 1. 번호 => la1
			String no=la1.getText(); // 설정은 setText()
			// 2. 비밀번호 => pf
			String pwd=String.valueOf(pf.getPassword()); // getPassword는 char[] 리턴이라 String으로 변환
			if(pwd.trim().length()<1) { // 입력이 안된 상태
				// 유효성 검사 => HTML (JavaScript)
				JOptionPane.showMessageDialog(this, "비밀번호를 입력하세요");
				// alert() 
				pf.requestFocus();
				return;
			}
			// => 비밀번호를 확인
			String res=bm.boardDelete(Integer.parseInt(no), pwd);
			// 웹 => 출력시에는 문자열, 처리시에는 정수형
			// 		String.valueOf(), Integer.parseInt()
			// 웹에서 3대 클래스 => ArrayList, Integer, String
			if(res.equals("YES")) {
				// 목록으로 이동 
				JOptionPane.showMessageDialog(this, "삭제되었습니다");
				cp.blp.boardList(); // 변경된 내용을 다시 읽어온다
				cp.card.show(cp, "board");
			}
			else if(res.equals("NO")){
				// 비밀번호를 다시 입력 요청
				JOptionPane.showMessageDialog(this, "비밀번호가 다릅니다!!!");
				pf.setText("");
				pf.requestFocus();
			}
		}
	}
}