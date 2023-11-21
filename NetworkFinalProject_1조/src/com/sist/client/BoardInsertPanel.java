package com.sist.client;

import java.awt.Color;
import java.awt.Font;
import java.awt.TextField;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import com.sist.manager.BoardManager;
import com.sist.vo.BoardVO;

import java.awt.*;
import java.awt.event.*;
import java.util.Date;

public class BoardInsertPanel extends JPanel
implements ActionListener{ // 버튼 눌렀을 때 처리해주는 것
	ControllPanel cp;
	JLabel la;
	JLabel la1,la2,la3,la4;
	JTextField tf1,tf2,tf3;
	JTextArea ta;
	JButton b1,b2;
	public BoardInsertPanel(ControllPanel cp)
	{
		this.cp=cp;
		la=new JLabel("자유게시판");
		setLayout(null); // 사용자 정의 배치 
		la.setHorizontalAlignment(JLabel.CENTER);
		la.setFont(new Font("굴림체",Font.BOLD,40));
		la.setBounds(610, 15, 700, 50);
		add(la);
		
		la1=new JLabel("이름");
		la2=new JLabel("제목");
		la3=new JLabel("내용");
		la4=new JLabel("비밀번호");
		
		tf1=new JTextField();
		tf2=new JTextField();
		tf3=new JTextField();
		
		ta=new JTextArea();
		JScrollPane js=new JScrollPane(ta);
		
		b1=new JButton("        글쓰기        ");
		b2=new JButton("        취소        ");
		
		// 배치
		la1.setBounds(320, 125, 70, 30); // 이름 
		la1.setFont(new Font("맑은 고딕",Font.BOLD,14));
		tf1.setBounds(400, 125, 1180, 30); // 이름 입력창 
		add(la1); add(tf1);
		
		la2.setBounds(320, 165, 450, 30); // 제목 
		la2.setFont(new Font("맑은 고딕",Font.BOLD,14));
		tf2.setBounds(400, 165, 1180, 30); // 제목 입력창 
		add(la2); add(tf2);
		
		la3.setBounds(320, 205, 70, 30); // 내용 
		la3.setFont(new Font("맑은 고딕",Font.BOLD,14));
		js.setBounds(400, 205, 1180, 500); // 내용 입력창
		add(la3); add(js);
		
		la4.setBounds(320, 715, 70, 30); // 비밀번호 
		la4.setFont(new Font("맑은 고딕",Font.BOLD,14));
		tf3.setBounds(400, 715, 1180, 30); // 비밀번호 입력창 
		add(la4); add(tf3);
		
		JPanel p=new JPanel(); // 정가운데 배치하기 위해 JPanel 쓴 것 
		b1.setFont(new Font("맑은 고딕",Font.BOLD,15));
		b2.setFont(new Font("맑은 고딕",Font.BOLD,15));
		p.setLayout(new FlowLayout(FlowLayout.CENTER,30,5));
		p.add(b1);p.add(b2);
		p.setBounds(0, 755, 1920, 35);
		add(p);
		
		b1.addActionListener(this);
		b2.addActionListener(this); // 버튼 기능 추가 
	}
	@Override
	public void actionPerformed(ActionEvent e) { // 버튼 눌렀을 때 처리 
		// TODO Auto-generated method stub
		if(e.getSource()==b2)
		{
			cp.card.show(cp, "board");
		}
		else if(e.getSource()==b1)
		{
			String name=tf1.getText();
			if(name.trim().length()<1) // 값이 입력이 안됐다면 
			{
				tf1.requestFocus(); // 이름 입력창에 포커스 
				return;
			}
			
			String subject=tf2.getText();
			if(subject.trim().length()<1) // 값이 입력이 안됐다면 
			{
				tf2.requestFocus(); // 제목 입력창에 포커스 
				return;
			}
			
			String content=ta.getText();
			if(content.trim().length()<1) // 값이 입력이 안됐다면 
			{
				ta.requestFocus(); // 내용 입력창에 포커스 
				return;
			}
			
			String pwd=tf3.getText();
			if(pwd.trim().length()<1) // 값이 입력이 안됐다면 
			{
				tf3.requestFocus(); // 비밀번호 입력창에 포커스 
				return;
			}
			
			BoardManager bm=new BoardManager();
			BoardVO vo=new BoardVO();
			vo.setNo(bm.boardSequence());
			vo.setName(name);
			vo.setSubject(subject);
			vo.setContent(content);
			vo.setPwd(pwd);
			vo.setHit(0);
			vo.setRegdate(new Date());
			bm.boardInsert(vo);
			
			// 화면 이동 
			cp.card.show(cp, "board");
			cp.blp.boardList();
		}
	}
}
