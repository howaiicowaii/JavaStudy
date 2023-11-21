package com.sist.client;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.*;
import java.io.*;
import java.net.URL;

import com.sist.vo.*;
import com.sist.common.ImageChange;
import com.sist.manager.*;

public class MovieDetailPanel extends JPanel implements ActionListener {
	JLabel imageLa;
	JLabel titleLa, scoreLa;
	JLabel regdateLa, genreLa, nationLa, gradeLa;
	JLabel timeLa, make_shareLa;
	JButton b;
	ControllPanel cp;
	JLabel la1,la2,la3,la4,la5,la6,la7; // 항목명
	MovieManager mm=new MovieManager();
	
	public MovieDetailPanel(ControllPanel cp) {
		this.cp=cp;
		imageLa=new JLabel();
		titleLa=new JLabel();
		regdateLa=new JLabel();
		genreLa=new JLabel();
		nationLa=new JLabel();
		gradeLa=new JLabel();
		timeLa=new JLabel();
		scoreLa=new JLabel();
		make_shareLa=new JLabel();
		
		b=new JButton("목록");
		la1=new JLabel("개봉일");
		la2=new JLabel("장르");
		la3=new JLabel("국가");
		la4=new JLabel("등급");
		la5=new JLabel("러닝타임");
		la6=new JLabel("평점");
		la7=new JLabel("누적관객");
		
		// 배치
		setLayout(null);
		imageLa.setBounds(0, 125, 300, 400);
		add(imageLa);
		
		// 제목
		titleLa.setBounds(400, 125, 700, 45);
		titleLa.setFont(new Font("맑은 고딕",Font.BOLD,30));
		add(titleLa);
		
		// 개봉일
		la1.setBounds(400, 200, 70, 35);
		la1.setFont(new Font("맑은 고딕",Font.BOLD,13));
	  	la1.setForeground(Color.gray);
		regdateLa.setBounds(470, 200, 400, 35);
		regdateLa.setFont(new Font("맑은 고딕",Font.PLAIN,13));
		add(la1);
		add(regdateLa);

		// 장르
		la2.setBounds(400, 240, 70, 35);
		la2.setFont(new Font("맑은 고딕",Font.BOLD,13));
		la2.setForeground(Color.gray);
		genreLa.setBounds(470, 240, 400, 35);
		genreLa.setFont(new Font("맑은 고딕",Font.PLAIN,13));
		add(la2);
		add(genreLa);

		// 국가
		la3.setBounds(400, 280, 70, 35);
	  	la3.setFont(new Font("맑은 고딕",Font.BOLD,13));
		la3.setForeground(Color.gray);
		nationLa.setBounds(470, 280, 400, 35);
		nationLa.setFont(new Font("맑은 고딕",Font.PLAIN,13));
		add(la3);
		add(nationLa);
		
		// 등급
		la4.setBounds(400, 320, 70, 35);
	    la4.setFont(new Font("맑은 고딕",Font.BOLD,13));
		la4.setForeground(Color.gray);
		gradeLa.setBounds(470, 320, 400, 35);
		gradeLa.setFont(new Font("맑은 고딕",Font.PLAIN,13));
		add(la4);
		add(gradeLa);
		
		// 러닝타임
		la5.setBounds(800, 240, 70, 35);
	  	la5.setFont(new Font("맑은 고딕",Font.BOLD,13));
		la5.setForeground(Color.gray);
		timeLa.setBounds(900, 240, 400, 35);
		timeLa.setFont(new Font("맑은 고딕",Font.PLAIN,13));
		add(la5);
		add(timeLa);
		
		// 평점
		la6.setBounds(800, 200, 70, 35);
		la6.setFont(new Font("맑은 고딕",Font.BOLD,13));
		la6.setForeground(Color.gray);
		scoreLa.setBounds(900, 200, 100, 35);
	  	scoreLa.setFont(new Font("맑은 고딕",Font.PLAIN,13));
		add(la6);
		add(scoreLa);
		
		// 누적 관객
		la7.setBounds(800, 280, 70, 35);
		la7.setFont(new Font("맑은 고딕",Font.BOLD,13));
		la7.setForeground(Color.gray);
		make_shareLa.setBounds(900,280, 400, 35);
		make_shareLa.setFont(new Font("맑은 고딕",Font.PLAIN,13));
		add(la7);
		add(make_shareLa);
		
		b.setBounds(0, 480, 100, 35);
		b.setHorizontalAlignment(JLabel.CENTER);
		add(b);
		
		b.addActionListener(this);
	}
	public void MoviePrint(MovieReservationVO vo) {
		try {
			titleLa.setText(vo.getTitle());
			scoreLa.setText(String.valueOf(vo.getScore()));
			regdateLa.setText(vo.getRegdate());
			genreLa.setText(vo.getGenre());
			nationLa.setText(vo.getNation());
			timeLa.setText(vo.getTime());
			gradeLa.setText(vo.getGrade());
			make_shareLa.setText(vo.getMake_share());
			
			URL url=new URL(vo.getImage());
			Image image=ImageChange.getImage(new ImageIcon(url), 300, 400);
			imageLa.setIcon(new ImageIcon(image));
		}catch(Exception ex) {}
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b) {
			cp.card.show(cp, "home"); // 목록누르면 목록화면으로 
		}
	}


}